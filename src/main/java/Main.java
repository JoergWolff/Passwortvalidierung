public class Main {
    public static void main(String[] args) {
        System.out.println("Passwortvalidierung:");
    }

    public static boolean validateSpecialCharacter(String pswd, char[] specialCharacters) {
        boolean returnBoolean = false;
        for(char sign : pswd.toCharArray()){
            for(char specialCharacter : specialCharacters){
                if (sign == specialCharacter){
                    returnBoolean = true;
                    break;
                }
            }
        }
        return returnBoolean;
    }

    public static boolean validateBadPassword(String pswd, String[] badpswds) {
        boolean returnBoolean = false;
        for (String badpswd : badpswds) {
            if (pswd.equals(badpswd)) {
                returnBoolean = true;
                break;
            }
        }
        return returnBoolean;
    }

    public static boolean validateLowerCase(String pswd) {
        return pswd.matches(".*[a-z].*");
    }

    public static boolean validateUpperCase(String pswd) {
        return pswd.matches(".*[A-Z].*");
    }

    public static boolean validateDigits(String pswd) {
        return pswd.matches(".*\\d.*");
    }

    public static boolean validateLength(String pswd) {
        return pswd.length() >= 8;
    }
}