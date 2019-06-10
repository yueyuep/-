#coding:utf-8
from idaapi import *
def judgeAduit(addr):
    '''
    not safe function handler
    '''
    MakeComm(addr,"### AUDIT HERE ###")#相当于在汇编行加一条注释
    SetColor(addr,CIC_ITEM,0x0000ff)  #set backgroud to red
    pass
def flagCalls(danger_funcs):
    '''
    not safe function finder
    '''
    count = 0
    for func in danger_funcs:      
        faddr = LocByName( func )  #通过函数名字找到函数的地址  
        if faddr != BADADDR: 
            # Grab the cross-references to this address         
            cross_refs = CodeRefsTo( faddr, 0 )                       
            for addr in cross_refs:
                count += 1 
                Message("%s[%d] calls 0x%08x\n"%(func,count,addr))  
                judgeAduit(addr)
                    
if __name__ == '__main__':
    '''
    handle all not safe functions
    '''
    print "-------------------------------"
    # 列表存储需要识别的函数
    danger_funcs = ["main","start","heap_term"]
    flagCalls(danger_funcs)
    print "-------------------------------"

