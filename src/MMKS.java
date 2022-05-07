import java.util.Scanner;

public class MMKS {

    public static void main(String[] args) {
        MainMenu mm = new MainMenu();
        User user = new User();
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter your email.");
        String inputEmail = sc.next();
        if (user.checkEmail(inputEmail)) {

            System.out.println("please enter your password.");
            String inputPassword = sc.next();
            if (user.checkUserId(inputPassword, inputEmail)) {
                //System.out.println("This is your information.");
                //user.toString();
            }
            /*else {
                System.out.println("");
            }*/
        }
        /*else {
            System.out.println("");
        }*/


    public void showMenu() {
        boolean flag = false;
        while (!flag)
        {
            mm.menu();
            sc = new Scanner(System.in);
            String choice = sc.next();
            switch (choice)
            {
                case "1":
                    System.out.print("Please enter your name: ");
                    sc = new Scanner(System.in);
                    // get the inputName as a String type and use trim method of String class to remove enter at the first and at the end.
                    String inputName = sc.nextLine().trim();
                    // check the name is empty, if not, create a new Customer and use setter method.
                    if (inputName.isEmpty())
                    {
                        System.out.println("Please enter a name!!!");
                        break;
                    }
                    else
                    {
                        customer = new Customer();
                        customer.setName(inputName);
                    }

                    // same as input a name
                    System.out.print("Please enter the money: ");
                    sc = new Scanner(System.in);
                    int userInput = sc.nextInt();
                    // check input money if > 0 or not, if not, clear the customer.
                    if (userInput > 0)
                        setBalance(userInput);
                    else
                    {
                        System.out.println("Please input a correct money!");
                        customer = null;
                    }
                    break; // every case in switch should have a break in the end.

                case "2":
                    // check the customer if is null
                    if (customer != null)
                    {
                        System.out.print("Please insert money "); // same as the if in case 1
                        int userInput1 = sc.nextInt();
                        if (getBalance() >= 0 && userInput1 > 0)
                            balance += userInput1;
                        else
                            System.out.println("Please enter a correct money!");
                        System.out.println("Credit balance: $" + getBalance());
                        break;
                    }
                    else
                    {
                        System.out.print("You should create a new order first."); break;
                    }


                case "3":
                    if (customer != null)
                    {
                        option3(); break; // make the code more clear
                    }
                    else
                    {
                        System.out.print("You should create a new order first."); break;
                    }

                case "4":
                    if (customer != null)
                    {
                        option4(); break;
                    }
                    else
                    {
                        System.out.print("You should create a new order first."); break;
                    }

                case "5":
                    if (customer != null)
                    {
                        option4();
                        System.out.println("Thank you for shopping with us. Please collect your goods (and your balance) \n" +
                                "at the front desk.");
                        customer = null; // if user input 5, then clear balance and customer
                        balance = 0;break;
                    }
                    else
                    {
                        System.out.print("You should create a new order first.");break;
                    }

                case "6":
                    option6(); break;

                case "7":
                    System.out.print("Thanks for using, goodbye!");
                    flag = true; // if user input 7, let the flag = true and finish this loop
                    customer = null; // clear balance and customer
                    balance = 0; break;

                default:
                    System.out.print("Please enter a correct number"); break;
            }
        }
    }

    }
}
