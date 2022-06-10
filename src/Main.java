import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = new int[15];
        int max = myArray[0];
        int min = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 40) - 20;
                    max =Math.max(max,myArray[i]);
                    min= Math.min(min,myArray[i]);
                }
            System.out.println("Max value: "+ max);
        System.out.println("Min values:" +min);
        int absmax1=Math.abs(max);
        int absmin2=Math.abs(min);
        Integer max1=absmax1;
        Integer min2=absmin2;
        int result;
        int less=0;
        int larger=0;
        result = min2.compareTo(max1);
        if (result==1){
            larger=min2;
            less=max1;
        } else if (result==-1) {
            larger=max1;
            less=min2;

        }
        System.out.println("Big: "+ larger);
        System.out.println("Less: " +less);


        }
            }













