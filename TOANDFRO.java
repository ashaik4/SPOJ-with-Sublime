import java.io.BufferedReader;
import java.io.InputStreamReader;


/*
* Algorithm for this problem:
* calculate rows = string_length / columns

* generate the matrix table[rows][columns] as follows: 
		* if row number is even,
			*then print out the element as it is
		*else,
			* then print out the element in reverse fashion

* print out the elements columnwise
*
* */

public class TOANDFRO{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int columns = Integer.parseInt(br.readLine());
        while(columns!=0){
            String encryptedString = br.readLine();
            int rows = encryptedString.length()/columns;
            char[][] table = new char[rows][columns];
            int k = 0;
            for (int i = 0; i < rows; i++) {
                if (i%2==0){
                    for (int j = 0; j <columns ; j++) {
                        table[i][j] = encryptedString.charAt(k++);
                    }

                    }
                else{
                    for (int j = columns -1; j >=0 ; --j) {
                        table[i][j] = encryptedString.charAt(k++);
                    }

                }

                }
            for (int i = 0; i < columns; i++) {
                for (int j = 0; j < rows; j++) {
                    System.out.print(table[j][i]);
                }

            }
            System.out.println();
            columns = Integer.parseInt(br.readLine());
            }


        }

    }


