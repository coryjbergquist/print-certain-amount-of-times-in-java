import java.util.*;

public class HelloWorld {



  public static void main(String[] args) {
        // Prints "Hello, World" a specific number of times
	System.out.println("How many times would you like to print?");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	System.out.println(num);


	for (int i = 0; i <= num; i++) {
		System.out.println("Bears Beets and Battlestar Galactica: " + 		i);
	}
    }

}
