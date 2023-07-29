import java.util.*;


public class ArrayListReview {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Oleh"));
        students.add(new Student(2, "Tony"));
        students.add(new Student(3, "Viky"));
        students.add(new Student(4, "Pablo"));
        students.add(new Student(5, "John"));
        System.out.println(students);
        System.out.println("=================================================================");

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println("=================================================================");

        for (int i = students.size() - 1; i >= 0; i--) {
            System.out.println(students.get(i));
        }
        System.out.println("=================================================================");

        Iterator iterator = students.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=================================================================");

        while (((ListIterator<?>) iterator).hasPrevious()) {
            System.out.println(((ListIterator<?>) iterator).previous());
        }
        System.out.println("=================================================================");

        students.forEach(p -> System.out.println(p));
        System.out.println("=================================================================");

        SortByIdDescending sortByIdDescending = new SortByIdDescending();
        students.sort(sortByIdDescending);
        System.out.println(students);

        SortByIdAscending sortByIdAscending = new SortByIdAscending();
        students.sort(sortByIdAscending);
        System.out.println(students);
        System.out.println("=================================================================");

        SortByNameAscending sortByNameAscending =new SortByNameAscending();
        Collections.sort(students,sortByNameAscending);
        System.out.println(students);

        ArrayListReview test=new ArrayListReview();
        System.out.println(test);


    }

    private static class SortByIdDescending implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return Integer.compare(o2.id, o1.id);
        }
    }

    private static class SortByIdAscending implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return Integer.compare(o1.id, o2.id);
        }
    }

    private static class SortByNameAscending implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareToIgnoreCase(o2.name);
        }
    }

}
