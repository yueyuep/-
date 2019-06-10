package dataStructure;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
public class TwoSum {
	public int [] solution(int[] num,int target) {
		HashMap<Integer, Integer> m=new HashMap<Integer,Integer>();
		int temp[]=new int[2];
		for(int i=0;i<num.length;i++) {
			if(m.containsKey(target-num[i])) {
				temp[0]=i;
				temp[1]=m.get(target-num[i]);
				break;
			}
			else {
				m.put(num[i], i);
			}
		}
		return temp;
		
	}
	public void solution2(int[] num,int target) {
		
		//基于排序和二分查找的算法，来进行求解，降低了时间复杂度。
		Arrays.sort(num);
		int low=0;
		int high=num.length-1;
		while(low<high)
			if(num[low]+num[high]>target) {high--;}
		else if (num[low]+num[high]<target) {
			low++;
		}
		else {
			System.out.printf("%d\t%d\n",num[low],num[high]);
			low++;
			high--;
		}
		
		
	}
	
	public int [] irgodic(int n) {
		Random random=new Random(n);
		random.setSeed(30);
		int [] num=new int[n];
		for(int i=0;i<n;i++) {
			
			int temp=random.nextInt(100);
			System.out.println(temp);
			num[i]=temp;
		}
		return num;

	}
	
	public static void main(String [] args) {
		TwoSum t=new TwoSum();
		int [] test=new int[]{2,7,3,6,11,15};
		int target=9;
		t.solution2(test, target);
//		int [] temp=t.solution(test, target);
//		 System.out.printf("the index is %d %d",temp[0],temp[1]);
		
//		
//		TwoSum t=new TwoSum();
//		int n=20;
//		t.irgodic(n);
	}

}
