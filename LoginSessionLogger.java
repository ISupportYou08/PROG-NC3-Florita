import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class LoginSessionLogger {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm a");
        LocalDateTime date = LocalDateTime.now();

        System.out.print("Enter your username: ");
        String username = scan.nextLine();
        String time = date.format(format);


        System.out.println(username+"\nLogin Date and Time: "+time);
        scan.close();
    }
}