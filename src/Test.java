import java.util.*;
import java.io.*;


public class Test {


    public static String FindIntersection(String[] strArr) {
        String [] a =strArr[0].split(", ");
        String [] b =strArr[1].split(", ");
        String s="";
        for(int i=0; i<a.length; i++)
            for(int j=0; j<b.length;j++)
                if(a[i].equals(b[j]))
                    s=s+a[i]+",";
        if(s.length()>1)
            return s.substring(0, s.length()-1);
        else
            return"false";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        //System.out.print(FindIntersection(s.nextLine()));
    }

}
