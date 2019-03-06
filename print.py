#coding:utf-8
from idaapi import *
danger_funcs = ["IsProcessorFeaturePresent"]  # 需要寻找的函数名
for func in danger_funcs:
    addr = LocByName( func ) 
    if addr != BADADDR:
       #找到交叉引用的地址
        cross_refs = CodeRefsTo( addr, 0 )
        print "Cross References to %s" % func 
        print "-------------------------------"
        for ref in cross_refs: 
            print "%08x" % ref
             # 函数的颜色为红色
            SetColor( ref, CIC_ITEM, 0x0000ff)