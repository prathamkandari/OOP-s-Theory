import java.util.*;
class John
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of rocks present");
        int N=sc.nextInt();
        String str;
        int a[]=new int[26];
        int b[];
        int i=0;
        for(i=0;i<N;i++)
        {
            b=new int[26];
            str=sc.next();
            for(char c: str.toCharArray())
            {
                b[c-97]+=1;
                if(b[c-97]==1)
                    a[c-97]+=1;
            }
            b=null;
        }
        int sum=0;
        for(i=0;i<26;i++)
        {
            if(a[i]==N)
                sum=sum+1;
        }
        a=null;     //Garbage Collector
        System.out.println(sum);
    }
}