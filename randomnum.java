    import java.util.*;    
    public class randomnum {
    public static void main(String[]args){
        int guess;
        int randomnum;
        int attempts = 0;

        Random randomnumber=new Random();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to the number guessing game");
        System.out.println("The sample numbers are between 1 to a 100");
        //Menu
        while(true){
        System.out.println("Enter your choice: ");
        System.out.println("1) Easy");
        System.out.println("2) Medium");
        System.out.println("3) Hard");
         System.out.println("4) Exit");
        int choice=scanner.nextInt();
        switch(choice){
            case 1:System.out.println("You have chosen the easy level");
            break;
            case 2:System.out.println("You have chosen the Medium level");
            break;
            case 3:System.out.println("You have chosen the Hard level");
            break;
            case 4:System.out.println("Exiting the random numbers game thank you for playing!");
            return;
            
        }
        System.out.println("Now lets get ready to play");
        randomnum=randomnumber.nextInt(1,101);
        do{
            System.out.println("Enter a number of your choice: ");
            guess=scanner.nextInt();
                    attempts++;

                    if(guess<randomnum){
                        System.out.println("TOO LOW");
                    }
                    else if(guess>randomnum){
                        System.out.println("TOO HIGH");
                    }
                    

                    
        }while(guess !=randomnum);
            System.out.println("You have won congratulations");
            System.out.println("The number of guesses you have taken is: "+attempts);
            System.out.println("Thank you for playing my first ever game");
    }   
}
}
