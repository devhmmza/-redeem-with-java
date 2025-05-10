//random 
import java.util.Scanner;
public class websitesignup{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi do you have account or you want to signup?");
        System.out.println("(type Y(If you have account)or N(if you don't have account))");
        char decision = scanner.next().charAt(0);
        if (decision == 'Y'){
            System.out.println("Sure type in your mail");
            String mail = scanner.next();
        }else if (decision == 'N'){
            System.out.println("Okay let's make your account first (:)");
        }else{
            System.out.println("Sorry typein valid command");
        }
        scanner.close();
    }

}
