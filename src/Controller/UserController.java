package Controller;

import Entity.User;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UserController {

    private ArrayList<User> usersList = new ArrayList<User>();
    public UserController() {}

    public ArrayList<User> readUserFile (String userFileName) throws IOException {
        Scanner sc = null;
        try
        {
            FileReader inputFile = new FileReader(userFileName);
            sc = new Scanner(inputFile);
            while (sc.hasNextLine())
            {
                String line = sc.nextLine();
                String [] values = line.split(",");
                String [] allergens = new String[3];
                if (values.length == 9)
                {
                    String f_name = values[0];
                    String l_name = values[1];
                    String email = values[2];
                    String dob = values[3];
                    String password = values[4];
                    allergens[0] = values[5];
                    allergens[1] = values[6];
                    allergens[2] = values[7];
                    String referral_code = values[8];
                    User user = new User(f_name, l_name, email, dob, password, allergens, referral_code);
                    usersList.add(user);
                }
            }
            //System.out.println(usersList);
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e);
        }
        finally
        {
            if (sc != null)
                sc.close();
        }
        return usersList;
    }

    public User searchUserByEmail (String email) {
        User resultUser = null;
        if (usersList.isEmpty()) {
            return null;
        }
        for (User u : usersList) {
            if (u.getEmail().equals(email)) {
                resultUser = u;
                break;
            }
        }
        return resultUser;
    }

    public boolean checkUserLogin(String email, String password) throws IOException {
        String file = "C:\\Users\\ROG\\IdeaProjects\\FIT5136_Ass3\\src\\Controller\\UserInfo.txt";
        boolean flag = false;
        ArrayList<User> allUser = readUserFile(file);
        for (User user : allUser) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                //System.out.println("Login successful! ");
                flag = true;
                System.out.println("Your allergens are: " + Arrays.toString(user.getAllergens()) + "\n" + "Your referral code is: " + user.getReferral_code());
                break;
            }
            else {
                //System.out.println("User password or email is wrong! Please enter again!");
            }
        }
        return flag;
    }

    public static void main(String[] args) throws IOException {
        String userFileName = "C:\\Users\\ROG\\IdeaProjects\\FIT5136_Ass3\\src\\Controller\\UserInfo.txt";
        UserController userController = new UserController();
        userController.readUserFile(userFileName);
    }
}

