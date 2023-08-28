public class Main {
    public static void main(String[] args) {
        System.out.println("Password Validation:");
        System.out.println("----");
        System.out.println("Generated: " + generatePassword(16));
    }

    public static String generatePassword(int length) {
        String character = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!§$%&/()=?*+#";
        char[] chars = character.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int counter = (int) (Math.random() * chars.length);
            sb.append(chars[counter]);
        }
        return sb.toString();
    }

    public static boolean validateSpecialCharacter(String pswd, char[] specialCharacters) {
        boolean returnBoolean = false;
        for (char sign : pswd.toCharArray()) {
            for (char specialCharacter : specialCharacters) {
                if (sign == specialCharacter) {
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