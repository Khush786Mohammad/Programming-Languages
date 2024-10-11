import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String obj1, String obj2){
            int len1 = obj1.length();
            int len2 = obj2.length();

            return Integer.compare(len2, len1);
            // if(len1 < len2)
            // return -1;
            // else if(len1 > len2)
            // return 1;
            // else
            // return 0;
    }
}

class Student{
    private int id;
    private String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return id+" : "+name;
    }
}

class SortByStudentId implements Comparator<Student>{
    @Override
    public int compare(Student obj1, Student obj2){
        // sorting student based on their student id by ascending order
        return Integer.compare(obj1.getId(),obj2.getId());
    }
}

class SortByStudentName implements Comparator<Student>{
    @Override
    public int compare(Student obj1 , Student obj2){
        return obj1.getName().compareTo(obj2.getName());
    }
}

public class ComparatorSort {
    public static void main(String[] args){
        List<String> animals = new ArrayList<String>();
        animals.add("Elephant");
        animals.add("Cow");
        animals.add("Peacock");
        animals.add("Monkey");
        animals.add("Dinasours");
        animals.add("Antilope");

        System.out.println("Before Sorting:\n");
        for(String str : animals){
            System.out.println(str);
        }

        Collections.sort(animals, new StringLengthComparator());

        System.out.println("\nAfter Sorting:\n");
        for(String str : animals){
            System.out.println(str);
        }

        List<Student> students = new ArrayList<Student>();

        students.add(new Student(2,"Don"));
        students.add(new Student(4, "Khush"));
        students.add(new Student(1,"Mohammad"));
        students.add(new Student(5,"Michael"));
        students.add(new Student(3,"Ninja"));

        System.out.println("\nStudents List");

        for(Student stds : students){
            System.out.println(stds.toString());
        }
        
        Collections.sort(students, new SortByStudentId());

        System.out.println("\nStudents List After their Sorted ids");

        for(Student stds : students){
            System.out.println(stds.toString());
        }

        Collections.sort(students, new SortByStudentName());
        System.out.println("\nSorting Students by their first Name lexographically");

        for(Student stds : students){
            System.out.println(stds.toString());
        }
    }
}
