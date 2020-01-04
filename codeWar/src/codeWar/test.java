package codeWar;
import java.util.Arrays;

//  @Test
//  public void basicTests() {
//    assertArrayEquals(new double []{0,1,1,2,3,5,8,13,21,34}, variabonacci.xbonacci(new double []{0,1},10));
//    assertArrayEquals(new double []{1,1,2,3,5,8,13,21,34,55}, variabonacci.xbonacci(new double []{1,1},10));
//    assertArrayEquals(new double []{0,0,0,0,1,1,2,4,8,16}, variabonacci.xbonacci(new double []{0,0,0,0,1},10));    
//    assertArrayEquals(new double []{1,0,0,0,0,0,1,2,3,6}, variabonacci.xbonacci(new double []{1,0,0,0,0,0,1},10));   
//  }
  

public class test {
	public static void main(String[] args) {
		xbonacci(new double []{0,1},10);
		xbonacci(new double []{1,1},10);
		xbonacci(new double []{0,0,0,0,1},10);
		xbonacci(new double []{1,0,0,0,0,0,1},10);
	}

	public static double[] xbonacci(double[] signature, int n) {
	      // hackonacci me
		int roop = signature.length;
		double[] result = new double[n];
		for(int i=0; i<roop; i++) result[i]=signature[i];

		for(int i= roop; i<n ; i++) {
			
		}
		System.out.print(Arrays.toString(result)+"\n");
		return result;
	}
}
