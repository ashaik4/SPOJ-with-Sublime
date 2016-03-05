/**
 * Created by arshadshaik on 3/5/16.
 */
import java.util.*;
class FASHION{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;++i){
            int N = sc.nextInt();
            int[] hotnessLevelOfMen = new int[N];
            int[] hotnessLevelOfWomen = new int[N];
            for(int j = 0; j<hotnessLevelOfMen.length;j++){
                hotnessLevelOfMen[j] = sc.nextInt();

            }
            for (int k=0;k<hotnessLevelOfWomen.length ;k++ ) {
                hotnessLevelOfWomen[k] = sc.nextInt();
            }
            int sum=0;
            Arrays.sort(hotnessLevelOfMen);
            Arrays.sort(hotnessLevelOfWomen);
            for(int l=0;l<N;l++){
                sum = sum + hotnessLevelOfMen[l]*hotnessLevelOfWomen[l];


            }
            System.out.println(sum);
			

        }
        
    }
}