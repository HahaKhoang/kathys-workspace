public class TimerService {

    /**
     * Return a string containing numbers from 0 - 'number'
     * Eg: When number is 5, return
     * 0 1 2 3 4 5
     * @param number
     * @return
     */

    public String count(int number){
        String buildingString = "";
        /*
         * My for loop created a variable named i that is of value 0 when the loop is encountered
         * for the first time
         * The for loop runs the code contained within as long as the condition i < number is true
         * At the end of every iteration of the for loop, i is incremented
         */

        for(int i = 0; i <= number; i++){
            buildingString = buildingString + i + " ";
            // System.out.println(buildingString);
        }
        return buildingString;
    }

    public String count(int start, int end){
        String buildingString = "";
        for(int i = start; i <= end; i++) {
            buildingString = buildingString + i + " ";
        } return buildingString;
    }   

    /**
     * Method will count from start to end, checking every number within if the value is even,
     * and only if it is even, it will append the value to a string that is returned at the end
     * @param start
     * @param end
     * @return all even numbers from start to end, inclusive
     */

    public String countEvenNumbers(int start, int end){
        String buildingString = "";
        for(int i = start; i <= end; i++){
            if(i %2 == 0){
                buildingString = buildingString + i + " ";
            }
        } return buildingString;
    }
}
