import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), x=sc.nextInt();
        int a[]=new int[n];
        int even=0, odd=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            even++;
            else odd++;
        }
        if(x>n || (odd==0 && x%2==1) || (even==0 && x%2==0 && x!=1))
        System.out.println("No");
        else System.out.println("Yes");
    }
}