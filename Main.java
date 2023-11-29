/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int[] list = {15,2,45,56,32,45,3};
        double average = 0.0;
        double sum = 0.0;

        for(int i = 0; i < list.length; i++) {
            sum += list[i];
        }

        average = sum / list.length;
        System.out.println(average);
//----------------------------------------HARMONİK SERİ--------------------------------------
        int[] list2 = {1,2,3,4,5};
        double harmonicSum = 0.0;
        double harmonicAverage = 0.0;
        
        for(int i = 0; i < list2.length; i++) {
            harmonicSum += 1.0/list2[i];
        }

        harmonicAverage = list2.length / harmonicSum;
        System.out.println(harmonicAverage);
    }
}