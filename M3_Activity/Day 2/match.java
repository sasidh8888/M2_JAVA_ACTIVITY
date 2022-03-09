import java.util.*;
import java.io.*;
import java.util.Scanner;
class test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String p=sc.next();
        String r=sc.next();
        int len_x=p.length();
        int len_y=r.length();
        System.out.println(((" "+ p.substring(0,1)).toUpperCase()+(p.substring(1,len_x).toLowerCase()))+" "+ ((r.toUpperCase())));
    }

}