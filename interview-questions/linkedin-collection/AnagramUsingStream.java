public class AnagramUsingStream {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean isAnagram = str1.chars()
                .sorted()
                .boxed()
                .toList()
                .equals(
                        str2.chars()
                                .sorted()
                                .boxed()
                                .toList()
                );

        System.out.println("Are the two strings anagrams? " + isAnagram);
    }
}
