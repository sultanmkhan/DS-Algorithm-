import java.util.Scanner;
public class Algo {
    public static void main(String []args)
    {
        int  x,y,u,k;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a value for X _____");
        x=s.nextInt();
        System.out.print("Enter a value for Y______ ");         
        y=s.nextInt();
        
        while(x!=y)
        {
            if(x<y)        
                u=x;
            else
                u=y;
            if(x>y)
                k=x;
            else
                k=y;
            x=u;
            y=k-u;
        
        }
        
        System.out.println("X vlaue "+x);
        
    }
}
