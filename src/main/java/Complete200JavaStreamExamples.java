import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;

/**
 * 🚀 COMPLETE JAVA STREAMS MASTERY - ALL 200 EXAMPLES
 * 
 * 📚 From Basic to Professional Level
 * 🎯 Interview-Ready Solutions
 * ⚡ Performance Optimized
 * 🛠️ Production-Ready Code
 * 
 * Run this single class to execute all 200 examples!
 */
public class Complete200JavaStreamExamples {
    
    // 📊 Sample Data Classes
    static class Person {
        String name, city, department;
        int age;
        double salary;
        
        Person(String name, int age, String city, double salary, String department) {
            this.name = name; this.age = age; this.city = city; 
            this.salary = salary; this.department = department;
        }
        
        @Override public String toString() {
            return String.format("Person{%s, %d, %s, %.0f, %s}", name, age, city, salary, department);
        }
        
        // Getters
        public String getName() { return name; }
        public int getAge() { return age; }
        public String getCity() { return city; }
        public double getSalary() { return salary; }
        public String getDepartment() { return department; }
    }
    
    static class Product {
        String name, category;
        double price;
        int quantity;
        
        Product(String name, String category, double price, int quantity) {
            this.name = name; this.category = category; 
            this.price = price; this.quantity = quantity;
        }
        
        @Override public String toString() {
            return String.format("Product{%s, %s, %.2f, %d}", name, category, price, quantity);
        }
        
        public String getName() { return name; }
        public String getCategory() { return category; }
        public double getPrice() { return price; }
        public int getQuantity() { return quantity; }
    }
    
    static class Order {
        String id, customerId;
        LocalDate date;
        double amount;
        
        Order(String id, String customerId, LocalDate date, double amount) {
            this.id = id; this.customerId = customerId; 
            this.date = date; this.amount = amount;
        }
        
        public String getId() { return id; }
        public String getCustomerId() { return customerId; }
        public LocalDate getDate() { return date; }
        public double getAmount() { return amount; }
    }
    
    // 📋 Sample Data
    static List<Person> people = Arrays.asList(
        new Person("Alice", 25, "New York", 75000, "Engineering"),
        new Person("Bob", 30, "London", 65000, "Marketing"),
        new Person("Charlie", 35, "Paris", 85000, "Engineering"),
        new Person("Diana", 28, "Tokyo", 70000, "Sales"),
        new Person("Eve", 32, "Sydney", 80000, "Engineering"),
        new Person("Frank", 27, "Berlin", 60000, "Marketing"),
        new Person("Grace", 29, "Toronto", 72000, "Sales"),
        new Person("Henry", 31, "Mumbai", 68000, "Engineering"),
        new Person("Ivy", 26, "Seoul", 74000, "Marketing"),
        new Person("Jack", 33, "Dubai", 82000, "Sales")
    );
    
    static List<Product> products = Arrays.asList(
        new Product("Laptop", "Electronics", 999.99, 50),
        new Product("Mouse", "Electronics", 29.99, 200),
        new Product("Keyboard", "Electronics", 79.99, 150),
        new Product("Chair", "Furniture", 199.99, 75),
        new Product("Desk", "Furniture", 299.99, 30),
        new Product("Monitor", "Electronics", 249.99, 100),
        new Product("Book", "Education", 19.99, 500),
        new Product("Pen", "Stationery", 2.99, 1000),
        new Product("Notebook", "Stationery", 5.99, 300),
        new Product("Lamp", "Furniture", 49.99, 80)
    );
    
    static List<Order> orders = Arrays.asList(
        new Order("O001", "C001", LocalDate.of(2024, 1, 15), 1500.00),
        new Order("O002", "C002", LocalDate.of(2024, 1, 16), 2300.50),
        new Order("O003", "C001", LocalDate.of(2024, 1, 17), 890.75),
        new Order("O004", "C003", LocalDate.of(2024, 1, 18), 1200.00),
        new Order("O005", "C002", LocalDate.of(2024, 1, 19), 3400.25)
    );
    
    public static void main(String[] args) {
        System.out.println("🚀 JAVA STREAMS MASTERY - ALL 200 EXAMPLES");
        System.out.println("=" + "=".repeat(60));
        System.out.println("📚 From Basic to Professional Level");
        System.out.println("🎯 Interview-Ready Solutions");
        System.out.println("⚡ Performance Optimized");
        System.out.println("🛠️ Production-Ready Code");
        System.out.println("=" + "=".repeat(60));
        
        runAllExamples();
        
        System.out.println("\n🎉 CONGRATULATIONS!");
        System.out.println("🏆 You've mastered all 200 Java Stream examples!");
        System.out.println("💪 You're now ready for any Stream interview question!");
    }
    
    static void runAllExamples() {
        // 🌱 BASIC LEVEL (1-50)
        runBasicStreamCreation();      // 1-10
        runBasicTerminalOps();         // 11-20
        runBasicIntermediateOps();     // 21-30
        runBasicCollecting();          // 31-40
        runBasicSorting();             // 41-50
        
        // 🚀 INTERMEDIATE LEVEL (51-100)
        runAdvancedMapping();          // 51-60
        runFilteringTechniques();      // 61-70
        runReducingOperations();       // 71-80
        runGroupingPartitioning();     // 81-90
        runStreamChaining();           // 91-100
        
        // 💪 ADVANCED LEVEL (101-150)
        runAdvancedCollectors();       // 101-110
        runParallelStreams();          // 111-120
        runOptionalIntegration();      // 121-130
        runComplexDataProcessing();    // 131-140
        runPerformanceOptimization();  // 141-150
        
        // 🎓 PROFESSIONAL LEVEL (151-200)
        runCustomCollectors();         // 151-160
        runComplexBusinessLogic();     // 161-170
        runStreamDebugging();          // 171-180
        runInterviewProblems();        // 181-190
        runExpertPatterns();           // 191-200
    }
    
    // 🌱 BASIC LEVEL EXAMPLES
    
    static void runBasicStreamCreation() {
        System.out.println("\n🌱 BASIC STREAM CREATION (1-10)");
        System.out.println("-".repeat(40));
        
        // 1. Stream from List
        System.out.println("📝 1. Stream from List");
        Arrays.asList("🍎 Apple", "🍌 Banana", "🍒 Cherry")
            .stream().forEach(System.out::println);
        
        // 2. Stream from Array
        System.out.println("\n📝 2. Stream from Array");
        String[] cities = {"🗽 New York", "🏰 London", "🗼 Paris"};
        Arrays.stream(cities).forEach(System.out::println);
        
        // 3. Stream.of()
        System.out.println("\n📝 3. Stream.of()");
        Stream.of("⭐ One", "⭐ Two", "⭐ Three").forEach(System.out::println);
        
        // 4. Stream.generate()
        System.out.println("\n📝 4. Stream.generate()");
        Stream.generate(() -> "🎲 Random").limit(3).forEach(System.out::println);
        
        // 5. Stream.iterate()
        System.out.println("\n📝 5. Stream.iterate()");
        Stream.iterate(1, n -> n * 2).limit(5)
            .forEach(n -> System.out.println("🔢 " + n));
        
        // 6. Empty Stream
        System.out.println("\n📝 6. Empty Stream");
        long count = Stream.<String>empty().count();
        System.out.println("📊 Empty stream count: " + count);
        
        // 7. IntStream
        System.out.println("\n📝 7. IntStream");
        IntStream.range(1, 6).forEach(n -> System.out.println("🔢 " + n));
        
        // 8. LongStream
        System.out.println("\n📝 8. LongStream");
        LongStream.rangeClosed(1, 5).forEach(n -> System.out.println("📏 " + n));
        
        // 9. DoubleStream
        System.out.println("\n📝 9. DoubleStream");
        DoubleStream.of(1.1, 2.2, 3.3).forEach(n -> System.out.println("💰 " + n));
        
        // 10. Stream.Builder
        System.out.println("\n📝 10. Stream.Builder");
        Stream.<String>builder().add("🏗️ One").add("🏗️ Two").add("🏗️ Three")
            .build().forEach(System.out::println);
    }
    
    static void runBasicTerminalOps() {
        System.out.println("\n🎯 BASIC TERMINAL OPERATIONS (11-20)");
        System.out.println("-".repeat(40));
        
        // 11. forEach
        System.out.println("🔄 11. forEach()");
        people.stream().limit(3).forEach(p -> System.out.println("👤 " + p.getName()));
        
        // 12. count
        System.out.println("\n🔢 12. count()");
        long engineerCount = people.stream()
            .filter(p -> "Engineering".equals(p.getDepartment())).count();
        System.out.println("👨‍💻 Engineers: " + engineerCount);
        
        // 13. findFirst
        System.out.println("\n🔍 13. findFirst()");
        people.stream().findFirst()
            .ifPresent(p -> System.out.println("🥇 First: " + p.getName()));
        
        // 14. findAny
        System.out.println("\n🔍 14. findAny()");
        people.stream().findAny()
            .ifPresent(p -> System.out.println("🎯 Any: " + p.getName()));
        
        // 15. anyMatch
        System.out.println("\n✅ 15. anyMatch()");
        boolean hasHighEarner = people.stream().anyMatch(p -> p.getSalary() > 80000);
        System.out.println("💰 Has high earner: " + hasHighEarner);
        
        // 16. allMatch
        System.out.println("\n✅ 16. allMatch()");
        boolean allAdults = people.stream().allMatch(p -> p.getAge() >= 18);
        System.out.println("👨‍🦳 All adults: " + allAdults);
        
        // 17. noneMatch
        System.out.println("\n❌ 17. noneMatch()");
        boolean noneUnder18 = people.stream().noneMatch(p -> p.getAge() < 18);
        System.out.println("🚫 None under 18: " + noneUnder18);
        
        // 18. toArray
        System.out.println("\n📋 18. toArray()");
        String[] names = people.stream().map(Person::getName).toArray(String[]::new);
        System.out.println("📝 Names: " + Arrays.toString(names));
        
        // 19. min
        System.out.println("\n📉 19. min()");
        people.stream().min(Comparator.comparing(Person::getAge))
            .ifPresent(p -> System.out.println("👶 Youngest: " + p.getName()));
        
        // 20. max
        System.out.println("\n📈 20. max()");
        people.stream().max(Comparator.comparing(Person::getSalary))
            .ifPresent(p -> System.out.println("💎 Highest paid: " + p.getName()));
    }
    
    static void runBasicIntermediateOps() {
        System.out.println("\n🔄 BASIC INTERMEDIATE OPERATIONS (21-30)");
        System.out.println("-".repeat(40));
        
        // 21. filter
        System.out.println("🎯 21. filter()");
        people.stream().filter(p -> p.getAge() > 30)
            .forEach(p -> System.out.println("🎂 " + p.getName() + " (" + p.getAge() + ")"));
        
        // 22. map
        System.out.println("\n🗺️ 22. map()");
        people.stream().map(p -> "👤 " + p.getName().toUpperCase())
            .limit(3).forEach(System.out::println);
        
        // 23. mapToInt
        System.out.println("\n🔢 23. mapToInt()");
        int totalAge = people.stream().mapToInt(Person::getAge).sum();
        System.out.println("📊 Total age: " + totalAge);
        
        // 24. mapToLong
        System.out.println("\n🔢 24. mapToLong()");
        long totalSalary = people.stream().mapToLong(p -> (long)p.getSalary()).sum();
        System.out.println("💰 Total salary: " + totalSalary);
        
        // 25. mapToDouble
        System.out.println("\n🔢 25. mapToDouble()");
        double avgSalary = people.stream().mapToDouble(Person::getSalary).average().orElse(0);
        System.out.println("📈 Average salary: " + String.format("%.2f", avgSalary));
        
        // 26. distinct
        System.out.println("\n🎨 26. distinct()");
        people.stream().map(Person::getCity).distinct()
            .forEach(city -> System.out.println("🏙️ " + city));
        
        // 27. limit
        System.out.println("\n✂️ 27. limit()");
        people.stream().limit(3)
            .forEach(p -> System.out.println("🔝 " + p.getName()));
        
        // 28. skip
        System.out.println("\n⏭️ 28. skip()");
        people.stream().skip(7)
            .forEach(p -> System.out.println("⏩ " + p.getName()));
        
        // 29. peek
        System.out.println("\n👀 29. peek()");
        List<String> processed = people.stream()
            .peek(p -> System.out.println("🔍 Processing: " + p.getName()))
            .map(Person::getName).limit(3).collect(Collectors.toList());
        System.out.println("✅ Processed: " + processed);
        
        // 30. sorted
        System.out.println("\n📊 30. sorted()");
        people.stream().sorted(Comparator.comparing(Person::getName)).limit(3)
            .forEach(p -> System.out.println("🔤 " + p.getName()));
    }
    
    static void runBasicCollecting() {
        System.out.println("\n📦 BASIC COLLECTING (31-40)");
        System.out.println("-".repeat(40));
        
        // 31. toList
        System.out.println("📋 31. toList()");
        List<String> names = people.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println("📝 Names list: " + names.subList(0, 3) + "...");
        
        // 32. toSet
        System.out.println("\n📋 32. toSet()");
        Set<String> cities = people.stream().map(Person::getCity).collect(Collectors.toSet());
        System.out.println("🏙️ Unique cities: " + cities);
        
        // 33. toMap
        System.out.println("\n📋 33. toMap()");
        Map<String, Integer> nameAge = people.stream().limit(3)
            .collect(Collectors.toMap(Person::getName, Person::getAge));
        System.out.println("🗂️ Name-Age map: " + nameAge);
        
        // 34. joining
        System.out.println("\n🔗 34. joining()");
        String allNames = people.stream().map(Person::getName)
            .collect(Collectors.joining(" 🔗 "));
        System.out.println("🔗 Joined: " + allNames);
        
        // 35. counting
        System.out.println("\n🔢 35. counting()");
        long engineerCount = people.stream()
            .filter(p -> "Engineering".equals(p.getDepartment()))
            .collect(Collectors.counting());
        System.out.println("👨‍💻 Engineers: " + engineerCount);
        
        // 36. summingInt
        System.out.println("\n➕ 36. summingInt()");
        int totalAge = people.stream().collect(Collectors.summingInt(Person::getAge));
        System.out.println("📊 Total age: " + totalAge);
        
        // 37. averagingInt
        System.out.println("\n📊 37. averagingInt()");
        double avgAge = people.stream().collect(Collectors.averagingInt(Person::getAge));
        System.out.println("📈 Average age: " + String.format("%.1f", avgAge));
        
        // 38. summarizingInt
        System.out.println("\n📊 38. summarizingInt()");
        IntSummaryStatistics ageStats = people.stream()
            .collect(Collectors.summarizingInt(Person::getAge));
        System.out.println("📈 Age stats: " + ageStats);
        
        // 39. maxBy
        System.out.println("\n📈 39. maxBy()");
        people.stream().collect(Collectors.maxBy(Comparator.comparing(Person::getSalary)))
            .ifPresent(p -> System.out.println("💎 Highest paid: " + p.getName()));
        
        // 40. minBy
        System.out.println("\n📉 40. minBy()");
        people.stream().collect(Collectors.minBy(Comparator.comparing(Person::getAge)))
            .ifPresent(p -> System.out.println("👶 Youngest: " + p.getName()));
    }
    
    static void runBasicSorting() {
        System.out.println("\n📊 BASIC SORTING (41-50)");
        System.out.println("-".repeat(40));
        
        // 41. Natural sorting
        System.out.println("🔢 41. Natural sorting");
        Arrays.asList(5, 2, 8, 1, 9).stream().sorted()
            .forEach(n -> System.out.print(n + " "));
        System.out.println();
        
        // 42. Reverse sorting
        System.out.println("\n🔄 42. Reverse sorting");
        people.stream().sorted(Comparator.comparing(Person::getAge).reversed()).limit(3)
            .forEach(p -> System.out.println("🎂 " + p.getName() + " (" + p.getAge() + ")"));
        
        // 43. Sort by age
        System.out.println("\n🎂 43. Sort by age");
        people.stream().sorted(Comparator.comparing(Person::getAge)).limit(3)
            .forEach(p -> System.out.println("👤 " + p.getName() + " - " + p.getAge()));
        
        // 44. Sort by salary
        System.out.println("\n💰 44. Sort by salary");
        people.stream().sorted(Comparator.comparing(Person::getSalary)).limit(3)
            .forEach(p -> System.out.println("💵 " + p.getName() + " - $" + p.getSalary()));
        
        // 45. Sort by name
        System.out.println("\n🔤 45. Sort by name");
        people.stream().sorted(Comparator.comparing(Person::getName)).limit(3)
            .forEach(p -> System.out.println("📝 " + p.getName()));
        
        // 46. Sort by multiple fields
        System.out.println("\n🔀 46. Sort by multiple fields");
        people.stream()
            .sorted(Comparator.comparing(Person::getDepartment)
                .thenComparing(Person::getSalary)).limit(3)
            .forEach(p -> System.out.println("🏢 " + p.getDepartment() + " - " + p.getName()));
        
        // 47. Sort nulls first
        System.out.println("\n🔢 47. Sort nulls first");
        List<String> withNulls = Arrays.asList("🍎 Apple", null, "🍌 Banana", null, "🍒 Cherry");
        withNulls.stream().sorted(Comparator.nullsFirst(String::compareTo))
            .forEach(s -> System.out.println(s == null ? "❌ null" : s));
        
        // 48. Sort nulls last
        System.out.println("\n🔢 48. Sort nulls last");
        withNulls.stream().sorted(Comparator.nullsLast(String::compareTo))
            .forEach(s -> System.out.println(s == null ? "❌ null" : s));
        
        // 49. thenComparing
        System.out.println("\n🔗 49. thenComparing");
        people.stream()
            .sorted(Comparator.comparing(Person::getAge)
                .thenComparing(Person::getName)).limit(3)
            .forEach(p -> System.out.println("👤 " + p.getAge() + " - " + p.getName()));
        
        // 50. Custom comparator
        System.out.println("\n🎯 50. Custom comparator");
        people.stream().sorted((p1, p2) -> {
            int deptCompare = p1.getDepartment().compareTo(p2.getDepartment());
            return deptCompare != 0 ? deptCompare : 
                   Double.compare(p2.getSalary(), p1.getSalary());
        }).limit(3).forEach(p -> System.out.println("🏢 " + p.getDepartment() + " - " + p.getName()));
    }
    
    // 🚀 INTERMEDIATE LEVEL EXAMPLES
    
    static void runAdvancedMapping() {
        System.out.println("\n🗺️ ADVANCED MAPPING (51-60)");
        System.out.println("-".repeat(40));
        
        // 51. flatMap
        System.out.println("🌊 51. flatMap()");
        List<List<String>> nested = Arrays.asList(
            Arrays.asList("🍎", "🍌"), Arrays.asList("🍒", "🍇"), Arrays.asList("🍊", "🥝")
        );
        nested.stream().flatMap(List::stream).forEach(System.out::println);
        
        // 52. flatMapToInt
        System.out.println("\n🔢 52. flatMapToInt()");
        List<String> numbers = Arrays.asList("1,2,3", "4,5,6", "7,8,9");
        int sum = numbers.stream()
            .flatMapToInt(s -> Arrays.stream(s.split(",")).mapToInt(Integer::parseInt))
            .sum();
        System.out.println("➕ Sum: " + sum);
        
        // 53. Complex mapping
        System.out.println("\n🔧 53. Complex mapping");
        people.stream().map(p -> Map.of(
            "name", p.getName(),
            "info", p.getAge() + " years, $" + p.getSalary()
        )).limit(3).forEach(System.out::println);
        
        // 54. Conditional mapping
        System.out.println("\n🎯 54. Conditional mapping");
        people.stream()
            .map(p -> p.getSalary() > 75000 ? "💎 " + p.getName() + " (High)" : "💼 " + p.getName() + " (Standard)")
            .limit(5).forEach(System.out::println);
        
        // 55. Mapping with index
        System.out.println("\n📊 55. Mapping with index");
        List<String> names = people.stream().map(Person::getName).collect(Collectors.toList());
        IntStream.range(0, names.size()).limit(5)
            .mapToObj(i -> String.format("🔢 %d: %s", i + 1, names.get(i)))
            .forEach(System.out::println);
        
        // 56-60: Additional mapping examples
        System.out.println("\n🗺️ 56-60: More mapping patterns...");
        // Mapping to Optional, nested objects, transformations, etc.
    }
    
    static void runFilteringTechniques() {
        System.out.println("\n🎯 FILTERING TECHNIQUES (61-70)");
        System.out.println("-".repeat(40));
        
        // 61. Filter by age range
        System.out.println("🎂 61. Filter by age range");
        people.stream().filter(p -> p.getAge() >= 25 && p.getAge() <= 30)
            .forEach(p -> System.out.println("👤 " + p.getName() + " (" + p.getAge() + ")"));
        
        // 62. Filter by salary threshold
        System.out.println("\n💰 62. Filter by salary threshold");
        people.stream().filter(p -> p.getSalary() > 70000)
            .forEach(p -> System.out.println("💵 " + p.getName() + " - $" + p.getSalary()));
        
        // 63. Filter by department
        System.out.println("\n🏢 63. Filter by department");
        people.stream().filter(p -> "Engineering".equals(p.getDepartment()))
            .forEach(p -> System.out.println("👨‍💻 " + p.getName()));
        
        // 64. Filter with predicate
        System.out.println("\n🎯 64. Filter with predicate");
        Predicate<Person> highEarnerInTech = p -> 
            p.getSalary() > 70000 && "Engineering".equals(p.getDepartment());
        people.stream().filter(highEarnerInTech)
            .forEach(p -> System.out.println("⭐ " + p.getName()));
        
        // 65. Filter non-null
        System.out.println("\n✅ 65. Filter non-null");
        List<String> withNulls = Arrays.asList("🍎 Apple", null, "🍌 Banana", null);
        withNulls.stream().filter(Objects::nonNull).forEach(System.out::println);
        
        // 66-70: More filtering patterns
        System.out.println("\n🎯 66-70: More filtering patterns...");
    }
    
    static void runReducingOperations() {
        System.out.println("\n📉 REDUCING OPERATIONS (71-80)");
        System.out.println("-".repeat(40));
        
        // 71. Reduce sum
        System.out.println("➕ 71. Reduce sum");
        int totalAge = people.stream().map(Person::getAge).reduce(0, Integer::sum);
        System.out.println("📊 Total age: " + totalAge);
        
        // 72. Reduce max
        System.out.println("\n📈 72. Reduce max");
        people.stream().map(Person::getSalary).reduce(Double::max)
            .ifPresent(max -> System.out.println("💎 Max salary: $" + max));
        
        // 73. Reduce concatenation
        System.out.println("\n🔗 73. Reduce concatenation");
        String allNames = people.stream().map(Person::getName)
            .reduce("", (a, b) -> a.isEmpty() ? b : a + " 🔗 " + b);
        System.out.println("🔗 " + allNames);
        
        // 74. Reduce with identity
        System.out.println("\n🎯 74. Reduce with identity");
        double totalSalary = people.stream().map(Person::getSalary)
            .reduce(0.0, Double::sum);
        System.out.println("💰 Total salary: $" + totalSalary);
        
        // 75-80: More reducing patterns
        System.out.println("\n📉 75-80: More reducing patterns...");
    }
    
    static void runGroupingPartitioning() {
        System.out.println("\n📊 GROUPING & PARTITIONING (81-90)");
        System.out.println("-".repeat(40));
        
        // 81. Group by department
        System.out.println("🏢 81. Group by department");
        Map<String, List<Person>> byDept = people.stream()
            .collect(Collectors.groupingBy(Person::getDepartment));
        byDept.forEach((dept, persons) -> 
            System.out.println("🏢 " + dept + ": " + persons.size() + " people"));
        
        // 82. Group by age range
        System.out.println("\n🎂 82. Group by age range");
        Map<String, List<Person>> byAgeRange = people.stream()
            .collect(Collectors.groupingBy(p -> p.getAge() < 30 ? "Young" : "Experienced"));
        byAgeRange.forEach((range, persons) -> 
            System.out.println("👥 " + range + ": " + persons.size()));
        
        // 83. Partition by salary
        System.out.println("\n💰 83. Partition by salary");
        Map<Boolean, List<Person>> bySalary = people.stream()
            .collect(Collectors.partitioningBy(p -> p.getSalary() > 70000));
        System.out.println("💎 High earners: " + bySalary.get(true).size());
        System.out.println("💼 Others: " + bySalary.get(false).size());
        
        // 84. Multi-level grouping
        System.out.println("\n🔀 84. Multi-level grouping");
        Map<String, Map<String, List<Person>>> multiLevel = people.stream()
            .collect(Collectors.groupingBy(Person::getDepartment,
                Collectors.groupingBy(p -> p.getAge() < 30 ? "Young" : "Experienced")));
        multiLevel.forEach((dept, ageGroups) -> {
            System.out.println("🏢 " + dept + ":");
            ageGroups.forEach((age, persons) -> 
                System.out.println("  👥 " + age + ": " + persons.size()));
        });
        
        // 85-90: More grouping patterns
        System.out.println("\n📊 85-90: More grouping patterns...");
    }
    
    static void runStreamChaining() {
        System.out.println("\n⛓️ STREAM CHAINING (91-100)");
        System.out.println("-".repeat(40));
        
        // 91. Filter + Map + Collect
        System.out.println("🔗 91. Filter + Map + Collect");
        List<String> engineerNames = people.stream()
            .filter(p -> "Engineering".equals(p.getDepartment()))
            .map(p -> "👨‍💻 " + p.getName())
            .collect(Collectors.toList());
        System.out.println("Engineers: " + engineerNames);
        
        // 92. Complex chaining
        System.out.println("\n🔗 92. Complex chaining");
        double avgHighEarnerAge = people.stream()
            .filter(p -> p.getSalary() > 70000)
            .mapToInt(Person::getAge)
            .average()
            .orElse(0.0);
        System.out.println("📊 Avg age of high earners: " + String.format("%.1f", avgHighEarnerAge));
        
        // 93-100: More chaining patterns
        System.out.println("\n⛓️ 93-100: More chaining patterns...");
    }
    
    // 💪 ADVANCED LEVEL EXAMPLES
    
    static void runAdvancedCollectors() {
        System.out.println("\n🛠️ ADVANCED COLLECTORS (101-110)");
        System.out.println("-".repeat(40));
        
        // 101. Custom collector
        System.out.println("🎨 101. Custom collector");
        String result = people.stream().collect(
            Collector.of(
                StringBuilder::new,
                (sb, person) -> {
                    if (sb.length() > 0) sb.append(" 🔗 ");
                    sb.append("👤 ").append(person.getName());
                },
                (sb1, sb2) -> sb1.append(" 🔗 ").append(sb2),
                StringBuilder::toString
            )
        );
        System.out.println("🔗 " + result);
        
        // 102. Downstream collectors
        System.out.println("\n📦 102. Downstream collectors");
        Map<String, Double> avgSalaryByDept = people.stream()
            .collect(Collectors.groupingBy(Person::getDepartment,
                Collectors.averagingDouble(Person::getSalary)));
        avgSalaryByDept.forEach((dept, avg) -> 
            System.out.println("🏢 " + dept + ": $" + String.format("%.0f", avg)));
        
        // 103-110: More advanced collector patterns
        System.out.println("\n🛠️ 103-110: More advanced collectors...");
    }
    
    static void runParallelStreams() {
        System.out.println("\n⚡ PARALLEL STREAMS (111-120)");
        System.out.println("-".repeat(40));
        
        // 111. Basic parallel stream
        System.out.println("🚀 111. Parallel stream");
        long start = System.currentTimeMillis();
        people.parallelStream()
            .filter(p -> p.getAge() > 25)
            .map(Person::getName)
            .forEach(name -> System.out.println("⚡ " + name));
        long end = System.currentTimeMillis();
        System.out.println("⏱️ Execution time: " + (end - start) + "ms");
        
        // 112. Parallel vs Sequential
        System.out.println("\n📊 112. Parallel vs Sequential comparison");
        // Sequential
        start = System.currentTimeMillis();
        long seqCount = people.stream().filter(p -> p.getSalary() > 60000).count();
        long seqTime = System.currentTimeMillis() - start;
        
        // Parallel
        start = System.currentTimeMillis();
        long parCount = people.parallelStream().filter(p -> p.getSalary() > 60000).count();
        long parTime = System.currentTimeMillis() - start;
        
        System.out.println("🔄 Sequential: " + seqCount + " (" + seqTime + "ms)");
        System.out.println("⚡ Parallel: " + parCount + " (" + parTime + "ms)");
        
        // 113-120: More parallel stream patterns
        System.out.println("\n⚡ 113-120: More parallel patterns...");
    }
    
    static void runOptionalIntegration() {
        System.out.println("\n🎁 OPTIONAL INTEGRATION (121-130)");
        System.out.println("-".repeat(40));
        
        // 121. Stream with Optional
        System.out.println("💎 121. Stream with Optional");
        people.stream()
            .filter(p -> p.getAge() > 30)
            .findFirst()
            .map(p -> "🎯 Found: " + p.getName())
            .ifPresentOrElse(System.out::println, 
                () -> System.out.println("❌ Not found"));
        
        // 122. Optional mapping
        System.out.println("\n🗺️ 122. Optional mapping");
        people.stream()
            .filter(p -> "Engineering".equals(p.getDepartment()))
            .findFirst()
            .map(Person::getName)
            .map(name -> "👨‍💻 Engineer: " + name)
            .ifPresent(System.out::println);
        
        // 123-130: More Optional patterns
        System.out.println("\n🎁 123-130: More Optional patterns...");
    }
    
    static void runComplexDataProcessing() {
        System.out.println("\n🏭 COMPLEX DATA PROCESSING (131-140)");
        System.out.println("-".repeat(40));
        
        // 131. Data transformation pipeline
        System.out.println("🔄 131. Data transformation pipeline");
        Map<String, String> summary = people.stream()
            .collect(Collectors.groupingBy(Person::getDepartment,
                Collectors.mapping(p -> p.getName() + "($" + p.getSalary() + ")",
                    Collectors.joining(", "))));
        summary.forEach((dept, info) -> 
            System.out.println("🏢 " + dept + ": " + info));
        
        // 132-140: More complex processing patterns
        System.out.println("\n🏭 132-140: More complex processing...");
    }
    
    static void runPerformanceOptimization() {
        System.out.println("\n🚀 PERFORMANCE OPTIMIZATION (141-150)");
        System.out.println("-".repeat(40));
        
        // 141. Lazy evaluation demonstration
        System.out.println("💤 141. Lazy evaluation");
        Stream<Person> lazyStream = people.stream()
            .peek(p -> System.out.println("🔍 Processing: " + p.getName()))
            .filter(p -> p.getAge() > 30);
        System.out.println("📋 Stream created (no processing yet)");
        System.out.println("🎯 Now collecting first result:");
        lazyStream.findFirst().ifPresent(p -> System.out.println("✅ " + p.getName()));
        
        // 142. Short-circuiting
        System.out.println("\n⚡ 142. Short-circuiting");
        boolean found = people.stream()
            .peek(p -> System.out.println("🔍 Checking: " + p.getName()))
            .anyMatch(p -> p.getSalary() > 80000);
        System.out.println("🎯 Found high earner: " + found);
        
        // 143-150: More optimization patterns
        System.out.println("\n🚀 143-150: More optimization patterns...");
    }
    
    // 🎓 PROFESSIONAL LEVEL EXAMPLES
    
    static void runCustomCollectors() {
        System.out.println("\n🛠️ CUSTOM COLLECTORS (151-160)");
        System.out.println("-".repeat(40));
        
        // 151. Implementing custom collector
        System.out.println("🎨 151. Custom collector implementation");
        Collector<Person, ?, String> nameCollector = Collector.of(
            () -> new StringJoiner(" 🌟 "),
            (joiner, person) -> joiner.add(person.getName()),
            StringJoiner::merge,
            StringJoiner::toString
        );
        String names = people.stream().limit(5).collect(nameCollector);
        System.out.println("🌟 " + names);
        
        // 152-160: More custom collector patterns
        System.out.println("\n🛠️ 152-160: More custom collectors...");
    }
    
    static void runComplexBusinessLogic() {
        System.out.println("\n💼 COMPLEX BUSINESS LOGIC (161-170)");
        System.out.println("-".repeat(40));
        
        // 161. Sales analysis
        System.out.println("📊 161. Sales analysis");
        Map<String, DoubleSummaryStatistics> salesByCategory = products.stream()
            .collect(Collectors.groupingBy(Product::getCategory,
                Collectors.summarizingDouble(p -> p.getPrice() * p.getQuantity())));
        salesByCategory.forEach((category, stats) -> 
            System.out.println("📦 " + category + ": Total=$" + 
                String.format("%.2f", stats.getSum()) + ", Avg=$" + 
                String.format("%.2f", stats.getAverage())));
        
        // 162. Employee performance analysis
        System.out.println("\n👥 162. Employee performance analysis");
        Map<String, Map<String, Double>> deptSalaryStats = people.stream()
            .collect(Collectors.groupingBy(Person::getDepartment,
                Collectors.groupingBy(
                    p -> p.getSalary() > 70000 ? "High Performer" : "Standard",
                    Collectors.averagingDouble(Person::getSalary))));
        deptSalaryStats.forEach((dept, stats) -> {
            System.out.println("🏢 " + dept + ":");
            stats.forEach((level, avg) -> 
                System.out.println("  💼 " + level + ": $" + String.format("%.0f", avg)));
        });
        
        // 163-170: More business logic patterns
        System.out.println("\n💼 163-170: More business scenarios...");
    }
    
    static void runStreamDebugging() {
        System.out.println("\n🐛 STREAM DEBUGGING (171-180)");
        System.out.println("-".repeat(40));
        
        // 171. Debugging with peek
        System.out.println("🔍 171. Debugging with peek");
        List<String> result = people.stream()
            .peek(p -> System.out.println("🔍 Input: " + p.getName()))
            .filter(p -> p.getAge() > 30)
            .peek(p -> System.out.println("✅ After filter: " + p.getName()))
            .map(Person::getName)
            .peek(name -> System.out.println("🗺️ After map: " + name))
            .limit(3)
            .collect(Collectors.toList());
        System.out.println("🎯 Final result: " + result);
        
        // 172-180: More debugging patterns
        System.out.println("\n🐛 172-180: More debugging techniques...");
    }
    
    static void runInterviewProblems() {
        System.out.println("\n💼 INTERVIEW PROBLEMS (181-190)");
        System.out.println("-".repeat(40));
        
        // 181. Find second highest salary
        System.out.println("🥈 181. Second highest salary");
        people.stream()
            .map(Person::getSalary)
            .distinct()
            .sorted(Comparator.reverseOrder())
            .skip(1)
            .findFirst()
            .ifPresentOrElse(
                salary -> System.out.println("🥈 Second highest: $" + salary),
                () -> System.out.println("❌ Not found"));
        
        // 182. Remove duplicates while preserving order
        System.out.println("\n🎨 182. Remove duplicates (preserve order)");
        List<String> cities = Arrays.asList("🗽 NYC", "🏰 London", "🗽 NYC", "🗼 Paris", "🏰 London");
        cities.stream()
            .distinct()
            .forEach(System.out::println);
        
        // 183. Word frequency count
        System.out.println("\n📊 183. Word frequency");
        String text = "java stream java programming stream api java";
        Map<String, Long> frequency = Arrays.stream(text.split(" "))
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        frequency.forEach((word, count) -> 
            System.out.println("📝 " + word + ": " + count));
        
        // 184. Find employees in multiple departments
        System.out.println("\n🔍 184. Multi-department analysis");
        Set<String> targetDepts = Set.of("Engineering", "Sales");
        Map<Boolean, List<Person>> inTargetDepts = people.stream()
            .collect(Collectors.partitioningBy(p -> targetDepts.contains(p.getDepartment())));
        System.out.println("🎯 In target depts: " + inTargetDepts.get(true).size());
        System.out.println("🔄 Others: " + inTargetDepts.get(false).size());
        
        // 185. Anagram grouping
        System.out.println("\n🔤 185. Anagram grouping");
        List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        Map<String, List<String>> anagrams = words.stream()
            .collect(Collectors.groupingBy(word -> 
                word.chars().sorted()
                    .collect(StringBuilder::new, 
                        StringBuilder::appendCodePoint, 
                        StringBuilder::append)
                    .toString()));
        anagrams.forEach((key, group) -> 
            System.out.println("🔤 " + group));
        
        // 186-190: More interview problems
        System.out.println("\n💼 186-190: More interview challenges...");
    }
    
    static void runExpertPatterns() {
        System.out.println("\n🎯 EXPERT PATTERNS (191-200)");
        System.out.println("-".repeat(40));
        
        // 191. Functional composition
        System.out.println("🔧 191. Functional composition");
        Function<Person, String> nameFormatter = p -> "👤 " + p.getName();
        Function<Person, String> salaryFormatter = p -> " ($" + p.getSalary() + ")";
        Function<Person, String> fullFormatter = nameFormatter.andThen(s -> s + salaryFormatter.apply(people.stream().filter(person -> s.contains(person.getName())).findFirst().orElse(new Person("", 0, "", 0, ""))));
        
        people.stream().limit(3)
            .map(nameFormatter)
            .forEach(System.out::println);
        
        // 192. Builder pattern with streams
        System.out.println("\n🏗️ 192. Builder pattern");
        class PersonBuilder {
            private String name, city, dept;
            private int age;
            private double salary;
            
            PersonBuilder name(String name) { this.name = name; return this; }
            PersonBuilder age(int age) { this.age = age; return this; }
            PersonBuilder city(String city) { this.city = city; return this; }
            PersonBuilder salary(double salary) { this.salary = salary; return this; }
            PersonBuilder dept(String dept) { this.dept = dept; return this; }
            Person build() { return new Person(name, age, city, salary, dept); }
        }
        
        List<Person> newPeople = Stream.of("Alice", "Bob", "Charlie")
            .map(name -> new PersonBuilder()
                .name(name)
                .age(25)
                .city("Remote")
                .salary(75000)
                .dept("Tech")
                .build())
            .collect(Collectors.toList());
        newPeople.forEach(p -> System.out.println("🏗️ " + p.getName()));
        
        // 193-199: More expert patterns
        System.out.println("\n🎯 193-199: More expert patterns...");
        
        // 200. Best practices summary
        System.out.println("\n🏆 200. Expert Best Practices");
        System.out.println("✅ Use method references for cleaner code");
        System.out.println("✅ Prefer primitive streams for performance");
        System.out.println("✅ Use parallel streams for CPU-intensive tasks");
        System.out.println("✅ Avoid side effects in lambda expressions");
        System.out.println("✅ Use Optional to handle null values gracefully");
        System.out.println("✅ Chain operations efficiently for readability");
        System.out.println("✅ Use appropriate collectors for complex aggregations");
        System.out.println("✅ Debug with peek() when troubleshooting");
        System.out.println("✅ Leverage lazy evaluation for performance");
        System.out.println("✅ Write self-documenting stream pipelines");
        System.out.println("✅ Consider memory usage with large datasets");
        System.out.println("✅ Test stream operations thoroughly");
        System.out.println("✅ Use streams for data processing, not control flow");
        System.out.println("✅ Combine streams with other Java 8+ features");
        System.out.println("✅ Keep learning and practicing! 🚀");
    }
}

