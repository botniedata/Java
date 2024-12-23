class StringWorld {

    public static void main(String[] args) {
        // Create a string variable to hold "HelloWorld"
        String helloWorld = "HelloWorld";
        String itsABeautifulWorld = "It's a beautiful world";

        // Get the length of itsABeautifulWorld
        int numberOfChars = itsABeautifulWorld.length();
        System.out.println(numberOfChars);

        // Check if helloWorld are equal
        System.out.println(helloWorld.equals(itsABeautifulWorld));

        // Get the 4 letter in itsBeautifulWorld
        char letter4 = itsABeautifulWorld.charAt(3);
        System.out.println(letter4);
    }
}
