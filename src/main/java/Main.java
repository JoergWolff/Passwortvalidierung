public class Main {
    public static void main(String[] args) {
        System.out.println("Passwortvalidierung:");
    }

    public static boolean validateUpperCase(String pswd) {
        return pswd.matches(".*[A-Z].*");
    }
    public  static boolean validateDigits(String pswd){
        return  pswd.matches(".*\\d.*");
    }

    public  static boolean validateLength(String pswd){
        return pswd.length() >= 8;
    }
}