package chapter8datatypes_and_strings;

import java.util.Scanner;

public class PasswordValidator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Insert username: ");
        var username = getUsername();
        System.out.println("Insert old password: ");
        var oldPassword = getOldPassword();
        System.out.println("Insert new password: ");
        var newPassword = getNewPassword();
        validatePassword(username,oldPassword,newPassword);
        scanner.close();
    }
    public static String getUsername(){
        String username = scanner.next();
        return username;
    }
    public static String getOldPassword(){
        String oldPassword = scanner.next();
        return oldPassword;
    }
    public static String getNewPassword(){
        String newPassword = scanner.next();
        return newPassword;
    }
    public static void validatePassword(String username,String oldPassword,String newPassword) {
        /* Regras de validação:
            1 - pelo menos 8 caracteres;
            2 - pelo menos 1 letra maiuscula(uppercase)
            3 - pelo menos 1 caracter especial
            4 - nao pode conter o username
            5 - a newPassword nao pode ser igual á oldPassword
            */

        //Criar variavel de controlo
        boolean isValid = true;
        //Criar variavel que vai ser atualizada com os erros
        String errorMessage = "";

        //ponto1
        if(newPassword.length()<8){
            isValid = false;
            errorMessage += "Password must have more than 8 characters.\n";
        }
        //ponto2
        boolean isUpperCase = false;
        for(int i=0; i < newPassword.length(); i++){
            if(Character.isUpperCase(newPassword.charAt(i))){
                isUpperCase = true;
                break;
            }
        }
        if(isUpperCase == false){
            isValid = false;
            errorMessage += "Password must contain at least 1 uppercase letter.\n";
        }
        //ponto3
        boolean isSpecialCharacter = false;
        for(int i=0; i<newPassword.length(); i++){
            if(!Character.isLetterOrDigit(newPassword.charAt(i))){
                isSpecialCharacter = true;
                break;
            }
        }
        if(isSpecialCharacter == false){
            isValid = false;
            errorMessage += "Password must contain at least 1 special character!\n";
        }
        //ponto4
        if(newPassword.contains(username)){
            isValid = false;
            errorMessage += "Password cannot contain username!\n";
        }
        //ponto5
        if(newPassword.equals(oldPassword)){
            isValid = false;
            errorMessage += "New password must be different from the old one!";
        }

        if(isValid == false){
            System.out.println(errorMessage);
        }
        else{
            System.out.println("Password is valid!");
        }
    }
}
