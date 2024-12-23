class Laureates {

    public static void main(String[] args) {
        // Create nobelLaureates to be a String array of size 3
        String[] nobelLaureates = new String[3];
        // Fill the nobelLaureates array with the names of Einstein, Curie and Sartre
        nobelLaureates[0] = "Einstein";     // 1st Nobel Laureate
        nobelLaureates[1] = "Curie";        // 2nd Nobel Laureate
        nobelLaureates[2] = "Sartre";       // 3rd Nobel Laureate
        
        // Print out the length of the String array
        System.out.println(nobelLaureates.length);
        // Print out the length of the 2nd Nobel Laureate in the array
        System.out.println(nobelLaureates[1].length());
    }    
}