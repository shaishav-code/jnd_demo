import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
    	Scanner sc= new Scanner(System.in);    
		System.out.println("Enter Which Day is In number:-");
		int a= sc.nextInt();
		int day = a;
		if(day <= 7)
		{
			switch (day)
			{
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			}
		}
		else if(day > 7)
		{
			switch(day)
			{
			case 8:
				System.out.println("Welcome to your new dream world");
				break;
			case 9:
				System.out.println("Kon Hai ye log Kaha se ate hai ye log");
				break;
			case 10:
				System.out.println("rehn de beta tere se na ho paye");
				break;
				default:
					System.out.println("Please Enter Correct Value");
					
			}
		}
    }
}

/*class Person {
    private String firstName;
    private String lastName;
    
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}*/
