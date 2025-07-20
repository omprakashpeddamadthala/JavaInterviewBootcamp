package BasicPrograms;

public class Permutation {
    public static void main(String[] args) {
        permutation("", "ABC");
    }

    public static void permutation(String prefix, String str) {
        if (str.isEmpty()) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1));
            }
        }
    }
}
