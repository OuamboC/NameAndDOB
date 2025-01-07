import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        //Define the name
            String name = "Canis Breal Ouambo";
            System.out.println(name);

            //Define the Date of Birth
            LocalDate dateOfBirth = LocalDate.of(2000, 01, 31);
            //Define the Formatter to display the date in a readable format
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/DD/YYYY");
            //Format the date of Birth
            String formattedDate = dateOfBirth.format(formatter);
            //Display the dateOfBirth
            System.out.println(formattedDate);
    }
}