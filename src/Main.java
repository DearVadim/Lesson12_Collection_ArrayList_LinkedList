import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        long StartTimeLLI = System.currentTimeMillis();

        LinkedList<Integer> LLI = new LinkedList<>();

        for(int i = 1; i <= 500000; i++){
            LLI.add(i);
        }

        long ElapsedTimeLLI = System.currentTimeMillis() - StartTimeLLI;
        System.out.printf("В LinkedList типа Integer добавлено %d записей без предв. объявления размера, потрачено времени, наносекунд: %d \n", LLI.size(), ElapsedTimeLLI);

        System.out.println("-----------------");

        long StartTimeALIC = System.currentTimeMillis();

        ArrayList<Integer> ALIC = new ArrayList<>();
        ALIC.ensureCapacity(500000);

        for(int i = 1; i <= 500000; i++){
            ALIC.add(i);
        }

        long ElapsedTimeALIC = System.currentTimeMillis() - StartTimeALIC;
        System.out.printf("В ArrayList типа Integer добавлено %d записей с предв. объявлением размера, потрачено времени, наносекунд: %d \n", ALIC.size(), ElapsedTimeALIC);

        System.out.println("-----------------");

        long StartTimeALI = System.currentTimeMillis();

        ArrayList<Integer> ALI = new ArrayList<>();

        for(int i = 1; i <= 500000; i++){
            ALI.add(i);
        }

        long ElapsedTimeALI = System.currentTimeMillis() - StartTimeALI;
        System.out.printf("В ArrayList типа Integer добавлено %d записей без предв. объявления размера, потрачено времени, наносекунд: %d \n", ALI.size(), ElapsedTimeALI);

        System.out.println("---------------------------------------");

        long StartTimeLLS = System.currentTimeMillis();

        LinkedList<String> LLS = new LinkedList<>();

        for(int i = 1; i <= 500000; i++){
            LLS.add(" " + i);
        }

        long ElapsedTimeLLS = System.currentTimeMillis() - StartTimeLLS;
        System.out.printf("В LinkedList типа String добавлено %d записей без предв. объявления размера, потрачено времени, наносекунд: %d \n", LLS.size(), ElapsedTimeLLS);

        System.out.println("-----------------");

        long StartTimeALSC = System.currentTimeMillis();

        ArrayList<String> ALSC = new ArrayList<>();
        ALSC.ensureCapacity(500000);

        for(int i = 1; i <= 500000; i++){
            ALSC.add(" " + i);
        }

        long ElapsedTimeALSC = System.currentTimeMillis() - StartTimeALSC;
        System.out.printf("В ArrayList типа String добавлено %d записей с предв. объявлением размера, потрачено времени, наносекунд: %d \n", ALSC.size(), ElapsedTimeALSC);

        System.out.println("-----------------");

        long StartTimeALS = System.currentTimeMillis();

        ArrayList<String> ALS = new ArrayList<>();

        for(int i = 1; i <= 500000; i++){
            ALS.add(" " + i);
        }

        long ElapsedTimeALS = System.currentTimeMillis() - StartTimeALS;
        System.out.printf("В ArrayList типа String добавлено %d записей без предв. объявления размера, потрачено времени, наносекунд: %d \n", ALS.size(), ElapsedTimeALS);

        System.out.println("---------------------------------------");

        Object obj = new Object();

        long StartTimeLLO = System.currentTimeMillis();

        LinkedList<Object> LLO = new LinkedList<>();

        for(int i = 1; i <= 500000; i++){
            LLO.add(obj);
        }

        long ElapsedTimeLLO = System.currentTimeMillis() - StartTimeLLO;
        System.out.printf("В LinkedList типа Object добавлено %d записей без предв. объявления размера, потрачено времени, наносекунд: %d \n", LLO.size(), ElapsedTimeLLO);

        System.out.println("-----------------");

        long StartTimeALOC = System.currentTimeMillis();

        ArrayList<Object> ALOC = new ArrayList<>();
        ALS.ensureCapacity(500000);

        for(int i = 1; i <= 500000; i++){
            ALOC.add(obj);
        }

        long ElapsedTimeALOC = System.currentTimeMillis() - StartTimeALOC;
        System.out.printf("В ArrayList типа Object добавлено %d записей с предв. объявлением размера, потрачено времени, наносекунд: %d \n", ALOC.size(), ElapsedTimeALOC);

        System.out.println("-----------------");

        long StartTimeALO = System.currentTimeMillis();

        ArrayList<Object> ALO = new ArrayList<>();

        for(int i = 1; i <= 500000; i++){
            ALO.add(obj);
        }

        long ElapsedTimeALO = System.currentTimeMillis() - StartTimeALO;
        System.out.printf("В ArrayList типа Object добавлено %d записей без предв. объявления размера, потрачено времени, наносекунд: %d \n", ALO.size(), ElapsedTimeALO);

    }
}