import java.util.*;
class Loopwithoutloop
{  static int n;
    static int i=1;
    private static void input(int x)
    {
        n=x;
    }
   static private  void factor()
    {
        if(n%i==0)
            System.out.println(i);
        if(i<(n/2))
        {
            i++;
            factor();
        }
        else
            System.out.println(n+"\nThe loop stops here");
    }
    public static void main(String param[])
    {Scanner sc=new Scanner(System.in);
        System.out.println("ntr number");
        input(sc.nextInt());
        System.out.println("\n\nThe factors are:");
        factor();
    }
    
}

    