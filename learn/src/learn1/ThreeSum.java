package learn1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class ThreeSum {
	
	public void solution1(int[] num) {
		HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
		//ArrayList动态数组，下面的是个泛型的表达方式，注意这个数组列表里面存的是数据类型的数据
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
							System.out.printf("%d\t%d\t%d\t\n",temp,tp,num[j]);
							//因为我们对数据已经进行例如排序 -4，-1，-1，0，1，2
							//相等的两个元素一定是排在一起，那么第一次出现-1位置所得接一定是包含
							//了第二个-1的解，所以为了避免重复，我们需要跳过该位置
							if(num[i]==num[j]) {i++;}
					
					}
				
				
			}
			
		}
		
		
		
		
	}
	
	public void solution2(int[] num) {
		//基于排序的思想，基于二分排序的思想
		Arrays.sort(num);
		for(int t=0;t<num.length;t++) {
			int temp=num[t];
		
				int low=0;
				int high=num.length-1;
				while(low<high) {
					if(num[low]+num[high]<(0-temp)) {
						low++;
					}
					else if(num[low]+num[high]>(0-temp)) {
						high--;
					}
					else {
						System.out.printf("%d\t%d\t%d\n",temp,num[low],num[high]);
					    low++;
						high--;
					}
				}
				
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//我们可以扩充2sum地思想，简化成2sum地问题。
		//注意这种问题其实就是利用排序的思想，从而减少时间复杂度
		
		int[] s=new int[] {-1,0,1,2,-1,-4,5};
		
		ThreeSum tm=new ThreeSum();
		tm.solution1(s);

	}

}
