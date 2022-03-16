package lesson15;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApiRunner {

    public static void main(String[] args) {

        String text = ("Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Sed sodales consectetur purus at faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. " +
                "Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. " +
                "Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Integer vel odio nec mi tempor dignissim.");

        // максимум в stream получилось дойти до Map, где ключи слова, а значения их количество
        Map<String, Integer> mappedWords = Arrays.stream(text.split(" ")).
                map(a -> a.replace(",", "")).
                map(a -> a.replace(".", "")).
                map(String::toLowerCase).
                collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum)); // собираем в

        // чтобы отсортировать приводим мэп к списку
        List<Map.Entry<String, Integer>> listMappedWords = new ArrayList<>(mappedWords.entrySet());
        listMappedWords.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // дальше можно вывести либо в виде key - value,
        System.out.println(listMappedWords);

        // либо только key
        for (Map.Entry<String, Integer> value : listMappedWords) {
            System.out.println(value.getKey());
        }
    }
}
