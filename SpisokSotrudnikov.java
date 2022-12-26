// Пусть дан список сотрудников:Иван Иванов ( и остальные, полный текст дз будет на платформе)
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
package DZ5;
import java.util.*;
import java.util.List;
import java.io.*;

public class SpisokSotrudnikov {
    public static List<String> fillTheArray(List<String> array) {
                array.add("Иван Иванов");
                array.add("Иван Петров");
                array.add("Петр Иванов");
                array.add("Анастасия Павлова");
                array.add("Петр Сидоров");
                array.add("Мария Иванова");
                array.add("Дмитрий Колесников");
                array.add("Мария Степанова");
                array.add("Роман Летунов");
                array.add("Кирилл Победов");
                return array;
            }
    public static List<String> fillTheArrayFromFile(List<String> array, String fileName) throws IOException {
        StringBuffer buffer = new StringBuffer();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.ready()) {
                buffer.append(reader.readLine() + "\n");
            }
        }
        if(buffer.length() > 0) {
            String[] tempArr = buffer.toString().split(" ");
            for (String temp : tempArr) {
                array.add(temp);
            }
        }
        return array;
    }
        
    public static void printUniqueWords(List<String> array) {
        Set<String> tempArray = new LinkedHashSet<>();
        for (String arr : array) {
            String a = arr.toLowerCase();
            tempArray.add(a);
        }
        for (String tempArr : tempArray) {
            int count = 0;
            for (String arr : array) {
                String a = arr.toLowerCase();
                if(tempArr.equals(a)) count++;
            }
            System.out.println("\"" + tempArr + "\"" + " repeated in the list = " + count);
        }
        System.out.println();
    }
}
            
        