package learn1;
import java.util.HashMap;
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
//		TwoSum t=new TwoSum();
//		int [] test=new int[]{2,7,11,15};
//		int target=9;
//		int [] temp=t.solution(test, target);
//		 System.out.printf("the index is %d %d",temp[0],temp[1]);
		
		
		TwoSum t=new TwoSum();
		int n=20;
		t.irgodic(n);
	}

}
