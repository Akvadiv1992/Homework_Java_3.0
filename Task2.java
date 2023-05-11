//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            array.add(random.nextInt(0,10));
        }
        System.out.println(array.toString());
        int max = array.get(0);
        int min = array.get(0);
        int sum = 0;
        for(int i = 0; i < array.size(); i++){
            if (array.get(i) > max) max = array.get(i);
            if (array.get(i) < min) min = array.get(i);
            sum = sum + array.get(i);
        }
        System.out.printf("Максимальный элемент: %d\n",max);
        System.out.printf("Минимальный элемент: %d\n",min);
        System.out.printf("Среднее арифметическое: %.1f\n",((float)sum/array.size()));
    }
}