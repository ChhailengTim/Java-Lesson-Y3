package number.read;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Input the number: ");
        int n=in.nextInt();
        if (n<1)
        {
            System.out.println("Wrong Input,Sorry");
        }
        else
        {
            int u=n%10;//last digit
            int tt=n/10;
            int t=tt%10;//second digit
            int h=n/100;//first digit
            int th=n/1000; //A Thousand
            String uw[]={" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
            String tw[]={" ","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
            String hw[]={" ","Hundred"};
            String ts[]={" ","Thousand"};
            if(n<20)//till 19
                System.out.println(uw[n]);
            else if(n<100)//till 99
                System.out.println(tw[t]+" "+uw[u]);
            else //from 100 to 999
                System.out.println(uw[h]+hw+tw[t]+" "+uw[u]);
            if (n<1000) //from 100 to 1000
            {
                System.out.println(uw[h]+ts+tw[t]+" "+uw[u]);
            }
        }
    }
}
