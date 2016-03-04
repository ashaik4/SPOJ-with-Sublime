import java.util.*;
import java.io.*;
public class NSTEPS{

	public static void main(String[] args)throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] in;
		int x,y;
		for(int i = 0;i<N;++i){
			in = br.readLine().split(" ");
			
			x = Integer.parseInt(in[0]);
			y = Integer.parseInt(in[1]);
			int res =0;
			if(x ==y){
				if(x%y==0){
					res = x+y;
					System.out.println(res);
				}
				else{
					res = y+(x-1);
					System.out.println(res);
				}
			}
			else if((x-2) ==y){
				if(x%y == 0){
					res = x +y;
					System.out.println(res);
				}
				else{
					res = x + (y-1);
					System.out.println(res);
				}

			}
			else{
				System.out.println("No Number");
			}
		
		}
		return 0;
	}
}