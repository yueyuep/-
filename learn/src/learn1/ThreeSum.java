package learn1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class ThreeSum {
	
	public void solution(int[] num) {
		HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
		ArrayList<int[]> list=new ArrayList<int[]>();
		Arrays.sort(num);
		for(int t=0;t<num.length;t++) {
			map.put(num[t], t);
		}
		for(int i=0;i<num.length;i++) {
			int temp=num[i];
			for(int j=i+1;j<num.length;j++) {
				int tp=(-temp)-(num[j]);
				if (map.containsKey(tp)&&map.get(tp)>j){
					//线性查找是否在hashmap中包含对应的键值对
					int[] tq=new int[3];
					tq[0]=temp;
					tq[1]=tp;
					tq[2]=num[j];
					list.add(tq);
					
				}
				
			}
			
		}
		System.out.println(list.);
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//我们可以扩充2sum地思想，简化成2sum地问题。
		
		int[] s=new int[] {-1,0,1,2,-1,-4};
		
		ThreeSum tm=new ThreeSum();
		tm.solution(s);

	}

}
