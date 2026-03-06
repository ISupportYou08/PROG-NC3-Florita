import java.util.Scanner;

public class inputAnddisplay {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = scan.nextLine();
        
        System.out.print("Enter Your course:: ");
        String course = scan.nextLine();
        
        System.out.print("Enter Your Birthday: ");
        String bday = scan.nextLine();


        System.out.println("\nWelcome "+ name+ 
            "\nWelcome to Programming " + course + 
            "\nWe will be recording you as our birth month celebrant. Your birthday is " + bday+
            "\nThank you for registering your personal information! Have a nice day");
    }
}
