import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		double[] arr2 = new double[n];
		System.out.println("Enter integers one by one");
		for(int i = 0; i<n; i++){
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter double values one by one");
		for(int i = 0; i<n; i++){
			arr2[i] = sc.nextDouble();
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println("Printing Integer Array");
		for(Integer i: arr1){
			System.out.println(i);
		}
		System.out.println("Printing Double Array");
		for(Double i: arr2){
			System.out.println(i);
		}
	}
}

