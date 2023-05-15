package Programs;

	import java.util.Scanner;

	public class chatbot {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String input = "";
	        
	        System.out.println("Hi, I'm a chatbot. What's your name?");
	        input = scanner.nextLine();
	        System.out.println("Nice to meet you, " + input + ". How can I assist you today?");
	        
	        while (!input.equalsIgnoreCase("exit")) {
	            input = scanner.nextLine();
	            
	            // Add your responses here based on user input
	            if (input.contains("hello") || input.contains("hi")) {
	                System.out.println("Hi there!");
	            } else if (input.contains("how are you")) {
	                System.out.println("I'm doing well, thank you.");
	            } else if (input.contains("weather")) {
	                System.out.println("I'm sorry, I am not capable of checking the weather at this moment.");
	            } else {
	                System.out.println("I'm sorry, I don't understand. Please try again or type 'exit' to end the chat.");
	            }
	        }
	        
	        System.out.println("Thank you for chatting with me. Goodbye!");
	        scanner.close();
	    }
	}

//test