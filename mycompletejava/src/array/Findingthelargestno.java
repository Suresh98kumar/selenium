
package array;
public class Findingthelargestno {
	public static void main(String[]args) {
		int arr[]= {55,66,77,88,44,};
		int sv=arr[0];
		for(int v:arr) {
			System.out.println(v);
			if(v<sv) {
				sv=v;
			}
		}
		System.out.println("highest value is"+sv);
		
	}

}
