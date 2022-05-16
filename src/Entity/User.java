package Entity;

import java.util.ArrayList;
import java.util.Arrays;

public class User {

    private String f_name;
    private String l_name;
    private String email;
    private String dob;
    private String password;
    private String[] allergens;
    private String referral_code;
    //private String ArrayList<meal> orderList;
    private ArrayList<User> allUsersList;

    public User() {}

    public User(String f_name, String l_name, String email, String dob, String password, String [] allergens, String referral_code) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.email = email;
        this.dob = dob;
        this.password = password;
        this.allergens = allergens;
        this.referral_code = referral_code;
    }

    public String getReferral_code() {
        return referral_code;
    }

    public void setReferral_code(String referral_code) {
        this.referral_code = referral_code;
    }

    public String getEmail() {
        return email;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {this.password = password;}

    public ArrayList<User> getAllUserList() {return allUsersList; }

    public String[] getAllergens() {
        return allergens;
    }

    public void setAllergens(String[] allergens) {
        this.allergens = allergens;
    }

    @Override
    public String toString() {
        return "User{" +
                "f_name='" + f_name + '\'' +
                ", l_name='" + l_name + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                ", password='" + password + '\'' +
                ", allergens=" + Arrays.toString(allergens) +
                ", referral_code='" + referral_code + '\'' +
                ", allUsersList=" + allUsersList +
                '}';
    }


//    public boolean checkEmail(String inputEmail){
//        boolean res = false;
//        int index = inputEmail.lastIndexOf('@');
//
//        if (index != -1 && inputEmail.charAt(index + 1) == 's' && inputEmail.charAt(index + 2) == 't' && inputEmail.charAt(index + 3) == 'u'
//                && inputEmail.charAt(index + 4) == 'd' && inputEmail.charAt(index + 5) == 'e' && inputEmail.charAt(index + 6) == 'n'
//                && inputEmail.charAt(index + 7) == 't' && inputEmail.charAt(index + 8) == '.' && inputEmail.charAt(index + 9) == 'm'
//                && inputEmail.charAt(index + 10) == 'o' && inputEmail.charAt(index + 11) == 'n' && inputEmail.charAt(index + 12) == 'a'
//                && inputEmail.charAt(index + 13) == 's' && inputEmail.charAt(index + 14) == 'h' && inputEmail.charAt(index + 15) == '.'
//                && inputEmail.charAt(index + 16) == 'e' && inputEmail.charAt(index + 17) == 'd' && inputEmail.charAt(index + 18) == 'u'
//                && inputEmail.indexOf('@') != 1 && inputEmail.indexOf('.') > inputEmail.indexOf('@')) {
//            res = true;
//        }
//
//        else {
//            System.out.println("invalid email, please enter again!!");
//        }
//        return res;
//    }
//
//    public boolean checkUserId(String password, String email) {
//        boolean res = false;
//        if (password.equals("Monash1234") && email.equals("customer@student.monash.edu")) {
//            this.password = password;
//            this.email = email;
//            System.out.println("login successfully!!");
//            res = true;
//        }
//        else {
//            System.out.println("email or password is wrong, please enter again!!");
//        }
//        return res;
//    }

}
