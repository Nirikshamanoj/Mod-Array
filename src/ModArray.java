import java.util.Scanner;
public class ModArray {
    static int findModArray(int[] A,int p,int n)
    {
        int power=1,result=0;
        for(int i=n-1;i>=0;i--)
        {
            result=(result+ ((A[i]%p)*power) )%p;
            power=(power*10)%p;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] A=new int[n];
        for (int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();
        }
        int B=scanner.nextInt();
        int mod=findModArray(A,B,n);
        System.out.println(mod);
    }
}
