import java.time.LocalDate;
import java.time.LocalTime;

public class DataTypesRhymeWithDate  {
    public static void main(String[] args) {
        String me = "Florita, Ralph Felix C.";
        byte Age = 25;
        short lucky = 8;
        int steps = 2;
        long star = 2000000000L;
        float height = 5.5f;
        double savings = 5.75;
        char sec = 'A';
        boolean love = true;
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();

   
        System.out.println(
            "My name is " + me + ", shining bright," +
            "\nAt " + Age + " years old, I code day and night." +
            "\nWith lucky number " + lucky + " in my way," +
            "\nI take " + steps + " steps each day." +
            "\n\nI gaze at " + star + " stars above," +
            "\nWith height " + height + " meters, I move." +
            "\nMy savings of " + savings + " are my pride," +
            "\nIn section " + sec + ", I learn with stride." +
            "\n\nIt is " + love + " that I love to code," +
            "\nToday is " + today + " at " + time+ ", on this road!"
        );
    }
}