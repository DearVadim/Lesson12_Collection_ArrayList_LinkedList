import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        long StartTimeLinkedList = System.currentTimeMillis();

        LinkedList<Integer> LLI = new LinkedList<Integer>();

        for(int i = 1; i <= 500000; i++){
            LLI.add(i);
        }

        System.out.printf("В LinkedList типа Integer добавлено %d записей без предв. объявления размера, потрачено времени, наносекунд: %d \n", LLI.size(), System.currentTimeMillis() - StartTimeLinkedList);

        System.out.println("-----------------");

        long StartTimeArrayList = System.currentTimeMillis();

        ArrayList<Integer> ALI = new ArrayList<Integer>();
        ALI.ensureCapacity(500000);

        for(int i = 1; i <= 500000; i++){
            ALI.add(i);
        }

        System.out.printf("В ArrayList типа Integer добавлено %d записей с предв. объявлением размера, потрачено времени, наносекунд: %d \n", ALI.size(), System.currentTimeMillis() - StartTimeArrayList);

        System.out.println("-----------------");

        StartTimeArrayList = System.currentTimeMillis();

        ArrayList<Integer> ALI2 = new ArrayList<Integer>();

        for(int i = 1; i <= 500000; i++){
            ALI2.add(i);
        }

        System.out.printf("В ArrayList типа Integer добавлено %d записей без предв. объявления размера, потрачено времени, наносекунд: %d \n", ALI2.size(), System.currentTimeMillis() - StartTimeArrayList);

        System.out.println("-----------------");

        StartTimeLinkedList = System.currentTimeMillis();

        LinkedList<String> LLS = new LinkedList<>();

        for(int i = 1; i <= 500000; i++){
            LLS.add(" " + i);
        }

        System.out.printf("В LinkedList типа String добавлено %d записей без предв. объявления размера, потрачено времени, наносекунд: %d \n", LLS.size(), System.currentTimeMillis() - StartTimeLinkedList);

        System.out.println("-----------------");

        StartTimeArrayList = System.currentTimeMillis();

        ArrayList<String> ALS = new ArrayList<>();
        ALS.ensureCapacity(500000);

        for(int i = 1; i <= 500000; i++){
            ALS.add(" " + i);
        }

        System.out.printf("В ArrayList типа String добавлено %d записей с предв. объявлением размера, потрачено времени, наносекунд: %d \n", ALS.size(), System.currentTimeMillis() - StartTimeArrayList);

        System.out.println("-----------------");

        StartTimeArrayList = System.currentTimeMillis();

        ArrayList<String> ALS2 = new ArrayList<>();

        for(int i = 1; i <= 500000; i++){
            ALS2.add(" " + i);
        }

        System.out.printf("В ArrayList типа String добавлено %d записей без предв. объявления размера, потрачено времени, наносекунд: %d \n", ALS2.size(), System.currentTimeMillis() - StartTimeArrayList);
    }
}