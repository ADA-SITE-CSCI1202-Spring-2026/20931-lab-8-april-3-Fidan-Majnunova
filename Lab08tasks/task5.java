import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
public class task5{
    public static void main(String[] args) {
        HashMap <String,Double> students = new HashMap<>();
        students.put("Fidan",3.67);
        students.put("Nihat",3.38);
        students.put("Daniz",4.0);
        students.put("Xeyale",3.5);
        students.put("Leyla",3.91);
        double maxGpa = Collections.max(students.values());
        System.out.println("Highest gpa is "+ maxGpa);

        System.out.println("Student with highest GPA:");
        for (Map.Entry<String, Double> entry : students.entrySet()) {
            if (entry.getValue() == maxGpa) {
                System.out.println(entry.getKey());
            }
        }
        double sum = 0;
        for (double gpa : students.values()) {
            sum += gpa;
        }
        double average = sum / students.size();
        System.out.println("Average GPA: " + average);

        int count = 0;
        for (double gpa : students.values()) {
            if (gpa < average) {
                count++;
            }
        }
        System.out.println("Students below average: " + count);
    }
}


    