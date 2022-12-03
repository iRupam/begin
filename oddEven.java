// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;  
class oddEven {
    public static void main(String[] args) {
        int num;
        System.out.println("This is an Odd-Even Finder Program");
        boolean ans;
        Scanner sc=new Scanner(System.in); 
        int num=in.nextInt();
        ans=(int)isOddEven(num);
        if(ans==1){
            System.out.println(num+ " is an even number");
        }
        else{
            Sstem.out.println(num+" is an odd number");    
        }
        
    }
}
public static boolean isOddEven(int x){
    if(x%2==0){
        return true;
    }
    else{
        return false;
    }
}
