import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt(); //length of s
            int m=sc.nextInt(); //length of t
            String s = sc.next();
            String t = sc.next();
            StringBuilder sb = new StringBuilder(s);
            //StringBuilder tb = new StringBuilder(t);
            int count=0;
            int found=0;
            while(sb.length()<150 && found==0){
                if(sb.indexOf(t)==-1){
                    count++;
                    sb.append(sb);
                }
                else found=1;
            }
            if(found==1) System.out.println(count);
            else System.out.println(-1);
        }
    }
}