/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes

*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input*/
        //Scanner
        Scanner s = new Scanner(System.in);
        int no = Integer.parseInt(s.nextLine());
        int[] x=new int[no];
        int t=0;
        for(int i=0;i<no;i++)                 // Reading input from STDIN
        {
            x[i]=Integer.parseInt(s.nextLine());
            t=x[i];
            getNo(t);
        }
        //getNo(x);
       // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        

        // Write your code h
    }
    static public void getNo(int t){
        int c=0;
        int sof=0;
        for(int i=1;i<=t;i++)
            {c=0;
                for(int j=1;j<=i;j++)
                    {
                        sof=sof+i;
                        if(sof>t)
                          {
                            i=1;
                          }
                        c++;
                      //  System.out.println(sof);

                    }
                // System.out.println(sof);
            }
            System.out.println(c);
    }
}
