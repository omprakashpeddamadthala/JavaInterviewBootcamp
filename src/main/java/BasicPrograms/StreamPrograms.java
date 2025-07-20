package BasicPrograms;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPrograms {

    public static void main(String[] args) {

        findDuplicateElements();

        countOfCharacters();

        sortHashMapByValue();

        mergeTwoArrays();

        thridHighestSalary();

    }

    private static void thridHighestSalary() {

        List<Employee> lstEmp = Arrays.asList(
                new Employee(1, "Alice", 90000),
                new Employee(2, "Bob", 120000),
                new Employee(3, "Charlie", 85000),
                new Employee(4, "David", 120000),
                new Employee(5, "Eve", 95000)
        );

        // Find the third highest salary using sorted, skip, and findFirst
        Optional<Employee> thirdHighestSalary = lstEmp.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                // Sort by salary in descending order
                .skip(2) // Skip the first two (highest and second highest) salaries
                .findFirst(); // Get the first element after skipping the top two

        thirdHighestSalary.ifPresent(emp ->
                System.out.println("Third Highest Salary: " + emp.getSalary() + " by " + emp.getName()));
    }

    private static void mergeTwoArrays() {
        Integer[] arr1 = {4,2,1,2,4,7,1};
        Integer[] arr2 = {2,3,3,5,6,7,8};

        Integer[] result = Stream.concat(Arrays.stream(arr1 ), Arrays.stream(arr2))
                .distinct()
                .sorted()
                .toArray(Integer[]::new);

        System.out.println("Merged and sorted distinct elements: " + Arrays.toString(result));
    }

    private static void sortHashMapByValue() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "c");
        map.put(2, "b");
        map.put(3, "a");

        Map<Integer, String> sortedMap =map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap
                        (Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new) );

        System.out.println(sortedMap);

    }

    private static void countOfCharacters() {
        //1.String s = "abcdcaf".
        // Write java program to find count of characters. e.g. a=2, b=1, c=2, d=1, f=1
        String s = "abcdcaf";
        char[] charArray = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(Character c : charArray) {
            map.put( c, map.getOrDefault(c, 0) + 1 );
        }
        System.out.println(map);


        Map<Character, Long> map2 = s.chars()
                .mapToObj( c -> (char)c )
                .collect( Collectors.groupingBy( Function.identity(), Collectors.counting() ) );

        System.out.println(map2);

    }

    private static void findDuplicateElements() {
        Integer[] arr = {1,3,5,1,4,5,3,5,2,7,8};

       /* Set<Integer> seen = new HashSet<>();

       List duplcateList = Arrays.stream( arr )
                .filter( integer -> !seen.add( integer ) )
                .collect( Collectors.toList() );*/
     List<Integer> duplcateList =  Arrays.stream( arr ).collect( Collectors.groupingBy( e->e,Collectors.counting() ) )
                        .entrySet().stream()
                        .filter(e -> e.getValue() > 1)
                                .map( Map.Entry::getKey)
                                        .collect( Collectors.toList() );



        System.out.println( duplcateList );


    }
}
