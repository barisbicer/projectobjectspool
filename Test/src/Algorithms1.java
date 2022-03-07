import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Algorithms1 {
	public static boolean isAtEvenIndex(String s,char item) {
		for(int i=0;i < s.length() / 2 + 1;i=i+2) {
			if(s.charAt(i)==item) {
				return true;
			}
		}
		return false;
	}
	
	public static OptionalInt LinearSearch2(int[] arr,int item) {
		return Arrays.stream(arr).filter(x-> x==item).findFirst();
	}

	
	public static boolean BinarySearch2(int[] arr,int item) {

		int start=0;
		int end =arr.length-1;
		
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==item) 
				return true;
			if(arr[mid]>item) {
				end=mid-1;
			}
			else {
			    start=mid+1;
			}
		}
		return false;

		
	}
	
	
	
	public static void findEven(int[] arr1,int[] arr2) {
		
		IntPredicate isEven=x->x % 2 == 0;
		
		//return Stream.of(arr1,arr2).toArray();
		
	}
	
	public static void reversePlace(int[] arr) {
		
		for(int i=0;i< arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
					
		}
		//Arrays.stream(arr).forEach(System.out::println);
		
	}
	
	
   public static void reverseStepPlace(int[] arr,int step) {
	
				int temp=arr[0];
	   for(int i=0;i< arr.length-1 ;i++)
		{
		
			arr[i]=arr[i+1];
			
					
		}
	   arr[arr.length-1]=temp;
		
		//Arrays.stream(arr).forEach(System.out::println);
		
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println(isAtEvenIndex("barisdefn", 'f'));
		
		String d="fgfgdgdgdfgdfgd";
		for(int i=0;i < d.length() / 2+1 ;i=i+2) {
			//System.out.println("i:"+i);
			//System.out.println(d.charAt(i));
		
		}
		
		
		StringBuilder reverse =new StringBuilder();
		String e="defneTurkizBicer";
		for(int i=e.length()-1; i>=0 ;i--) {
			//System.out.println("i:"+e.charAt(i));
			System.out.println(i+"--"+"--"+e.length());
			reverse.append(e.charAt(i));
		
		}
		
		System.out.println(reverse.toString());
		
		int[] arr = {1,2,3,4,5,6};
		int item=5;
		
		//System.out.println("---:"+Algorithms1.BinarySearch2(arr,item));
		//System.out.println(LinearSearch2(arr,item));
		//LinearSearch2(arr,item).ifPresent(System.out::println);
		
		reversePlace(arr);
		reversePlace(arr);
		//Arrays.stream(arr).forEach(System.out::println);
		
		reverseStepPlace(arr,2);

		Arrays.stream(arr).forEach(System.out::println);
		
		}
	}
	
	


