import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {


        LinkedList<Integer> LLI = new LinkedList<>();

        long StartTimeLLI = System.currentTimeMillis();
        for(int i = 1; i <= 500000; i++){
            LLI.add(i);
        }
        long ElapsedTimeLLI = System.currentTimeMillis() - StartTimeLLI;

        System.out.printf("В LinkedList типа Integer добавлено %d записей без предв. объявления размера, потрачено времени, наносекунд: %d \n", LLI.size(), ElapsedTimeLLI);
        System.out.println("-----------------");


        ArrayList<Integer> ALIC = new ArrayList<>();
        ALIC.ensureCapacity(500000);

        long StartTimeALIC = System.currentTimeMillis();
        for(int i = 1; i <= 500000; i++){
            ALIC.add(i);
        }
        long ElapsedTimeALIC = System.currentTimeMillis() - StartTimeALIC;

        System.out.printf("В ArrayList типа Integer добавлено %d записей с предв. объявлением размера, потрачено времени, наносекунд: %d \n", ALIC.size(), ElapsedTimeALIC);
        System.out.println("-----------------");


        ArrayList<Integer> ALI = new ArrayList<>();

        long StartTimeALI = System.currentTimeMillis();
        for(int i = 1; i <= 500000; i++){
            ALI.add(i);
        }
        long ElapsedTimeALI = System.currentTimeMillis() - StartTimeALI;

        System.out.printf("В ArrayList типа Integer добавлено %d записей без предв. объявления размера, потрачено времени, наносекунд: %d \n", ALI.size(), ElapsedTimeALI);
        System.out.println("---------------------------------------");

        LinkedList<String> LLS = new LinkedList<>();

        long StartTimeLLS = System.currentTimeMillis();
        for(int i = 1; i <= 500000; i++){
            LLS.add(" " + i);
        }
        long ElapsedTimeLLS = System.currentTimeMillis() - StartTimeLLS;

        System.out.printf("В LinkedList типа String добавлено %d записей без предв. объявления размера, потрачено времени, наносекунд: %d \n", LLS.size(), ElapsedTimeLLS);
        System.out.println("-----------------");

        ArrayList<String> ALSC = new ArrayList<>();
        ALSC.ensureCapacity(500000);

        long StartTimeALSC = System.currentTimeMillis();
        for(int i = 1; i <= 500000; i++){
            ALSC.add(" " + i);
        }
        long ElapsedTimeALSC = System.currentTimeMillis() - StartTimeALSC;

        System.out.printf("В ArrayList типа String добавлено %d записей с предв. объявлением размера, потрачено времени, наносекунд: %d \n", ALSC.size(), ElapsedTimeALSC);
        System.out.println("-----------------");

        ArrayList<String> ALS = new ArrayList<>();

        long StartTimeALS = System.currentTimeMillis();
        for(int i = 1; i <= 500000; i++){
            ALS.add(" " + i);
        }
        long ElapsedTimeALS = System.currentTimeMillis() - StartTimeALS;

        System.out.printf("В ArrayList типа String добавлено %d записей без предв. объявления размера, потрачено времени, наносекунд: %d \n", ALS.size(), ElapsedTimeALS);
        System.out.println("---------------------------------------");

        Object obj = new Object();

        LinkedList<Object> LLO = new LinkedList<>();

        long StartTimeLLO = System.currentTimeMillis();
        for(int i = 1; i <= 500000; i++){
            LLO.add(obj);
        }
        long ElapsedTimeLLO = System.currentTimeMillis() - StartTimeLLO;

        System.out.printf("В LinkedList типа Object добавлено %d записей без предв. объявления размера, потрачено времени, наносекунд: %d \n", LLO.size(), ElapsedTimeLLO);
        System.out.println("-----------------");

        ArrayList<Object> ALOC = new ArrayList<>();
        ALS.ensureCapacity(500000);

        long StartTimeALOC = System.currentTimeMillis();
        for(int i = 1; i <= 500000; i++){
            ALOC.add(obj);
        }
        long ElapsedTimeALOC = System.currentTimeMillis() - StartTimeALOC;

        System.out.printf("В ArrayList типа Object добавлено %d записей с предв. объявлением размера, потрачено времени, наносекунд: %d \n", ALOC.size(), ElapsedTimeALOC);
        System.out.println("-----------------");

        ArrayList<Object> ALO = new ArrayList<>();

        long StartTimeALO = System.currentTimeMillis();
        for(int i = 1; i <= 500000; i++){
            ALO.add(obj);
        }
        long ElapsedTimeALO = System.currentTimeMillis() - StartTimeALO;

        System.out.printf("В ArrayList типа Object добавлено %d записей без предв. объявления размера, потрачено времени, наносекунд: %d \n", ALO.size(), ElapsedTimeALO);
    }
}