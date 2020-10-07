package leetcode;
import java.util.Arrays;

public class SquaresofaSortedArray {

	public static void insert(int val,int[] arr){
	      int i;
	      for(i=0;i<arr.length-1;i++){
	        if(arr[i]>val)
	          break;
	      }
	      for(int k=arr.length-2; k>=i; k--){
	        arr[k+1]=arr[k];            
	      }
	      arr[i]=val;
	      System.out.println(Arrays.toString(arr));

	    }
	
	public int[] sortedSquares(int[] array) {

		int[] retorno = new int[10000];

		for (int i = 0; i < retorno.length; i++) {
			
			int sqrt = (int) Math.pow(array[i], 2);
			
			retorno[i] = sqrt;

		}
		Arrays.sort(retorno);
		
		return retorno;
	}

	public static void main(int[] args) {
		SquaresofaSortedArray soasa = new SquaresofaSortedArray();
		System.out.println(soasa.sortedSquares(args));
	}
}
