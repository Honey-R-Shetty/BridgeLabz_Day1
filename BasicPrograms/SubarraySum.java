package BasicPrograms;

public class SubarraySum {
	public static void main(String[] args) {
		int sum=12;
		int[] arr = {1, 2, 3, 7, 5};
		for(int i=0;i<arr.length-3;i++) {
			int j=i;
			if(arr[j]+arr[j+1]+arr[j+2]==sum)
				System.out.println("["+arr[i]+","+arr[i+1]+","+arr[i+2]+"]");
		}
	}
}
