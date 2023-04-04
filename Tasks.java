// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.Random;

// Задача 1. Пусть дан произвольный список целых чисел, удалить из него чётные числа.

// public class Tasks {
//     public static void main(String[] args) {
//         ArrayList<Integer> numbers = new ArrayList<>();
//         Random random = new Random();
//         for (int i = 0; i < 20; i++) {
//             numbers.add(random.nextInt(1, 20));
//         }
//         System.out.printf("Список целых чисел %s" + "\n", numbers);
//         Iterator<Integer> iterator = numbers.iterator();
//         while(iterator.hasNext()){
//             if(iterator.next()%2 == 0){
//                 iterator.remove();
//             }
//         }
//         System.out.printf("Список с удаленными чётными числами %s", numbers);
//     }
// }

// Задача 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и 
// среднее ариф. из этого списка. 

// public class Tasks {
//     public static void main(String[] args) {
//         ArrayList<Integer> numbers = new ArrayList<>();
//         Random random = new Random();
//         for (int i = 0; i < 15; i++) {
//             numbers.add(random.nextInt(20));
//         }
//         System.out.printf("Целочисленный список %s" + "\n", numbers);
//         numbers.sort(null);
//         System.out.printf("Минимальное число: %s" + "\n", numbers.get(0));
//         System.out.printf("Максимальное число: %s" + "\n", numbers.get(numbers.size() - 1));
//         double sum = numbers.stream().mapToInt(Integer::intValue).sum();
//         double arg = sum / numbers.size();
//         System.out.printf("Среднее арифметическое: %s", arg);
//     }
// }
