/*Name of the programmer: Nikhila
 *Name of the program: Online Examination
 */
import java.util.Scanner;
public class OnlineExamSystem 
{
    private static String username;
    private static String password;
    private static int score;
    private static int timeRemaining;
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Online Exam!");
        
        // Login functionality
        System.out.print("Enter your username: ");
        username = scanner.nextLine();
        System.out.print("Enter your password: ");
        password = scanner.nextLine();
        if (authenticate(username, password))
        {
            System.out.println("Login successful!");
        }
        else 
        {
            System.out.println("Invalid username or password!!");
            System.exit(0);
        }
        // Update profile and password functionality
        System.out.print("Would you like to update your profile or password? (yes/no)");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("yes")) 
        {
            updateProfile();
            updatePassword();
        }
		// MCQ functionality
		System.out.println("Please answer the following multiple choice questions:");
		System.out.println("1. Which city is called as Pink city of India?");
		System.out.println("a) Jaipur");
		System.out.println("b) Banglore");
		System.out.println("c) Udaipur");
		System.out.print("Enter your choice (a/b/c): ");
		String answer1 = scanner.nextLine();
		if (answer1.equalsIgnoreCase("a")) 
        {
			score++;
		}
		System.out.println("2. Which temple is called as 'Black Pagoda'?");
		System.out.println("a) Golden temple");
		System.out.println("b) Iskcon temple");
		System.out.println("c) Sun temple");
		System.out.print("Enter your choice (a/b/c): ");
		String answer2 = scanner.nextLine();
		if (answer2.equalsIgnoreCase("c")) 
        {
			score++;
		}
		System.out.println("3. Who is the prime minister of India?");
		System.out.println("a) Narendra Modi");
		System.out.println("b) Joe Biden");
		System.out.println("c) Vladimir Putin");
		System.out.print("Enter your choice (a/b/c): ");
		String answer3 = scanner.nextLine();
		if (answer3.equalsIgnoreCase("a")) 
        {
			score++;
		}
		System.out.println("4. Which song won oscar under Best original song category?");
		System.out.println("a) Lift me up");
		System.out.println("b) Natu Natu");
		System.out.println("c) Hold my hand");
		System.out.print("Enter your choice (a/b/c): ");
		String answer4 = scanner.nextLine();
		if (answer4.equalsIgnoreCase("b")) 
        {
			score++;
		}
		System.out.println("5. Who is the father of Green revolution in india?");
		System.out.println("a) Norman Borlaug");
		System.out.println("b) Swaminathan");
		System.out.println("c) Verghese Kurien");
		System.out.print("Enter your choice (a/b/c): ");
		String answer5 = scanner.nextLine();
		if (answer5.equalsIgnoreCase("b")) 
        {
			score++;
		}
        System.out.print("Press any key to submit the exam");
        scanner.nextLine();
        timeRemaining = 1 * 2;
        while (timeRemaining > 0) 
        {
            try 
            {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
            timeRemaining--;
        }
        System.out.println("Submitting exam...");
        submitExam();
        
        // Closing session and logout functionality
        System.out.println("Thank you for using the Online Exam System!");
        logout();
    }
    
    private static boolean authenticate(String username, String password) 
    {
        return true; 
    }
    
    private static void updateProfile() 
    {
        System.out.println("Profile updated successfully!");
    }
    
    private static void updatePassword() 
    {
        System.out.println("Password updated successfully!");
    }
    
    private static void submitExam() 
    {
        System.out.println("Exam submitted successfully! Your score is: " + score);
    }
    
    private static void logout() 
    {
        System.out.println("Logged out successfully!");
    }
}
