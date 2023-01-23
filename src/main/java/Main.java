public class Main {


    public String startWord(String str, String word) {
        if (word == null || str == null) {
            return null;
        }
        if (word.length() > str.length()) {
            return "";
        }
        if (str.substring(1, word.length()).equals(word.substring(1))) {
            return str.substring(0, word.length());
        }
        if (word.length() == 1) {
            return str.substring(0, 1);
        } else return "";
    }


    public String makeAbba(String a, String b) {
        if (a == null || b == null) {
            return null;
        }
        return a + b + b + a;

    }


    public String withoutX(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() < 1) {
            return null;
        }
        if (str.length() == 1 && str.charAt(0) == 'x') {
            return "";
        }

        if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') {
            return str.substring(1, str.length() - 1);
        }
        if (str.charAt(0) == 'x') {
            return str.substring(1);
        }
        if (str.charAt(str.length() - 1) == 'x') {
            return str.substring(0, str.length() - 1);
        } else return str;
    }


    public boolean has22(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == 2 && nums[i] == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean more14(int[] nums) {
        int numberOfOne = 0;
        int numberOfFour = 0;

        if (nums.length == 0) {
            return false;
        }

        for (int num : nums) {
            if (num == 1) {
                numberOfOne++;
            }
            if (num == 4) {
                numberOfFour++;
            }


        }
        return numberOfOne > numberOfFour;
    }

}


