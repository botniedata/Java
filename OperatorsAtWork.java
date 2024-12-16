class OperatorsAtWork {

    public static void main(String[] args) {
        int scoreTest1 = 78;
        int scoreTest2 = 98;

        // Assign testTotal the sum of scores
        int testTotal = scoreTest1 + scoreTest2;        // the sum of 78 and 98 is 172

        // Assign avg the average
        int avg = testTotal / 2;                        // 172 divided by 2 is 86
        int passingScore = 65;

        // Incrementor passingScore
        passingScore +=1;                               // passScore of 65 increate by 1 is 66

        // Assign the isPassing variable
        boolean isPassing = avg >= passingScore;        // is 88 is greater than or equal to 66, the answer is true
        System.out.println(testTotal);                  // 172
        System.out.println(avg);                        // 86
        System.out.println(passingScore);               // 66
        System.out.println(isPassing);                  // true
    }
}