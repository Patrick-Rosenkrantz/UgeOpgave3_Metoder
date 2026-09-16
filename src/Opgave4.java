public class Opgave4 {

    public static double calculateAverage(int[] numbers){
        double sum = 0;
        for(int number : numbers){
            sum = sum + number;
        }
        double average = sum / numbers.length;
        return average;
    }

    public static int finaMax(int[] numbers){
        int maxNumber = 0;
        for (int number : numbers){
            if (number > maxNumber){
                maxNumber = number;
            }
        }
        return maxNumber;
    }

    public static int finaMin(int[] numbers){
        int minNumber = 1000;
        for (int number : numbers){
            if (number < minNumber){
                minNumber = number;
            }
        }
        return minNumber;
    }


    public static double countAboveAverage(int[] numbers){
        double average = calculateAverage(numbers);;
        int aboveAverage = 0;
        for (int number : numbers){
            if (number > average){
                aboveAverage ++;
            }
        } return aboveAverage;
    }

    public static void printAll(int[] array){
        System.out.println(calculateAverage(array));
        System.out.println(finaMax(array));
        System.out.println(finaMin(array));
        System.out.println(countAboveAverage(array));
    }

    public static void main(){
        int[] array = {45,67,23,89,34,56,78};
        printAll(array);
    }
}
