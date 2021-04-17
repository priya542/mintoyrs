# mintoyrs
import java.util.Scanner;

public class Mintodays {
     
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.println("enter the number of minutes");
int minutes = input.nextInt();
int year = minutes / 525600;
int days = minutes / 1440;
int remainingdays = (minutes - (year * 525600)) / 1440;
System.out.println(minutes  +  " minutes is " +  year  +  " years and "  +  remainingdays + " remainingdays ");

}

}
