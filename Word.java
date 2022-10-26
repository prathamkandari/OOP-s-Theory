import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Word
{
    public static void check(char str[])
    {
        int i=0,flag=0;
        loop:
        for(i=str.length-1;i>0;i--)
        {
            if(str[i]>str[i-1])
            {
                int j = str.length-1;
                while(flag==0 && j!=i-1)
                {
                    if(str[i-1]<str[j])
                    {
                        char t = str[j];
                        str[j]=str[i-1];
                        str[i-1]=t;
                        flag=1;
                        break loop;
                    }
                    j--;
                }
            }
        }

    Arrays.sort(str,i,str.length);
        if(flag==0)
        {
            System.out.println("no answer");
        }
        else 
        {
            System.out.println(str);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of test cases");
        int T=sc.nextInt();
        char word[];
        int i=0;
        for(i=0;i<T;i++)
        {
            word=sc.next().toCharArray();
            check(word);
        }
    }
}
           