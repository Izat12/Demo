import java.util.Arrays;
import java.util.stream.IntStream;

public class Code {
    public static void main(String[] args) {

        int[] sortedArray2 = ss(new int[]{7, 8, 4, 1, 3, 9});
        System.out.println(Arrays.toString(sortedArray2));


        // Выводим результат
        int [] qwe = {1, 100, 99, 100};
        boolean b = scores100(qwe);
        System.out.println(b);




    }


    public static boolean scoresIncreasing(int[] scores) {
        return IntStream.range(0, scores.length - 1) // Создаём поток индексов от 0 до длины массива минус 1
                .allMatch(i -> scores[i] <= scores[i + 1]); // Проверяем, что каждый элемент меньше или равен следующему
    }

    public  static boolean scores100(int[] scores) {
        return IntStream.range(0,scores.length -1)
                .anyMatch(i -> scores[i]==100 && scores[i+1]==100);


//        boolean b = false;
//        for(int i = 0; i < scores.length-1; i++){
//            if(scores[i]==100 && scores[i+1]==100  ){
//                b=true;
//            }
//        }return b;
    }






    public static int[] ss(int[] a) {
        int s;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    s = a[i];
                    a[i] = a[j];
                    a[j] = s;
                }
            }
        }
        return a;
    }
}
