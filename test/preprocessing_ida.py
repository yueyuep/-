from func import *
from raw_graphs import *
from idc import *
import os,io
import argparse
import json
import time

def parse_command():
	parser = argparse.ArgumentParser(description='Process some integers.')
	parser.add_argument("--path", type=str, default='D:\\IDA 6.5\\cryptgrep\\test\\crypto++\\x64', help="The directory where to store the generated .ida file")
	args = parser.parse_args()
	return args

if __name__ == '__main__':
	start=time.time()
	args = parse_command()
	path = args.path
	analysis_flags = idc.GetShortPrm(idc.INF_START_AF)
	analysis_flags &= ~idc.AF_IMMOFF
	# turn off "automatically make offset" heuristic
	idc.SetShortPrm(idc.INF_START_AF, analysis_flags)
	idaapi.autoWait()
	# cfgs is all acfg of this PE.
	cfgs = get_func_cfgs_c(FirstSeg())
	print(cfgs)
	binary_name = idc.GetInputFile() + '.ida'
	fullpath = os.path.join(path, binary_name)
	pickle.dump(cfgs, open(fullpath,'w'))
	# f=open('F:\\work now\\data\\example.exe.ida','r')
	# bb=pickle.load(f)
	# f.close()
	
#change
	# graph.g is one func's acfg
	data = []
	for graph in cfgs.raw_graph_list:
		nodes_succs = []
		nodes_features = []
		func_inf = {}
		for i in range(len(graph.g)):
			nodes_succs.append(list(graph.g.successors(i)))
			nodes_features.append(graph.g.node[i]['v'])
		func_inf['src'] = fullpath
		func_inf['n_num'] = len(graph.g.node)
		func_inf['succs'] = nodes_succs
		func_inf['features'] = nodes_features
		func_inf['fname'] = graph.funcname
		data.append(func_inf)
		

		# print "==================================="
		# print "nodes",graph.g.node
		# print "nodes_succs",nodes_succs
		# print "funcname",graph.funcname
		# print "old_g successors",list(graph.old_g.successors(0))
		# print "old",graph.old_g
		# print "g0",graph.g[0]
		
		# print "g",list(graph.g.successors(0))
		# print "g.node.vectors",graph.g.node[0]['v']
	#print(bb.__dict__)
	#print(dir(bb))


  	json_dir = os.path.join(path,idc.GetInputFile()+'.json')
  	#os.mknod(json_dir)
  	end=time.time()
  	last_time=round(end-start,3)
  	with io.open(json_dir,'w',encoding="utf-8") as outfile:
  		for da in data:
  			outfile.write(unicode(json.dumps(da, ensure_ascii=False))+'\n')
  		
  	# with io.open(json_dir,'w',encoding="utf-8") as outfile:
  		
  	# 		outfile.writelines(unicode(json.dumps(data, ensure_ascii=False)))

	print binary_name
	print last_time
	#idc.Exit(0)
	
	