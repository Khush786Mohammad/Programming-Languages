import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Books{
    private int id;
    private String name;
    private int pages;

    public Books(int id, String name, int pages){
        this.id = id;
        this.name = name;
        this.pages = pages;
    }

    public int getId(){
        return this.id;
    }
    public String getBookName(){
        return this.name;
    }
    public int getPages(){
        return this.pages;
    }

    public String toString(){
        return id+ " "+name+" "+pages;
    }
}

public class Comparatorss {
    public static void main(String[] args){
        Comparator<Integer> customs1 = (s1,s2) -> s2.compareTo(s1);
        Comparator<Integer> customs2 = (s1,s2) -> Integer.compare(s2, s1);
        Comparator<Integer> customs3 = Comparator.reverseOrder();
        // Comparator<Books> booksById = Comparator.comparingInt(Books::getId).thenComparing(Books::getPages);
        Comparator<Books> booksByIdThenByHighestPages = Comparator.comparingInt(Books::getId).thenComparing(Comparator.comparingInt(Books::getPages).reversed());

    
        List<Integer> list = new ArrayList<Integer>();
        list.add(9);
        list.add(19);
        list.add(4);
        list.add(1);
        list.add(12);
        list.add(6);
        List<Integer> list2 = new ArrayList<Integer>(list);
        List<Integer> list3 = new ArrayList<Integer>(list);        

        System.out.println("Before Sorting");
        for(Integer vals: list){
            System.out.println(vals);
        }

        Collections.sort(list, customs1);
        System.out.println("\nAfter Sorting");

        for(Integer vals: list){
            System.out.println(vals);
        }

        Collections.sort(list2, customs2);
        System.out.println("\n List2");

        for(Integer vals: list2){
            System.out.println(vals);
        }

        Collections.sort(list3,customs3);

        System.out.println("\n List3");

        for(Integer vals: list3){
            System.out.println(vals);
        }

        List<Books> books = new ArrayList<Books>();

        books.add(new Books(1, "C++", 220));
        books.add(new Books(9, "Automata", 20));
        books.add(new Books(1, "C", 180));
        books.add(new Books(5, "Java", 50));
        books.add(new Books(2, "JavaScript", 520));
        books.add(new Books(7, "Python", 100));
        books.add(new Books(8, "Go", 90));
        books.add(new Books(2, "Angular", 150));

        System.out.println("\n Books objects");
        for(Books objs: books){
            System.out.println(objs.toString());
        }

        // Collections.sort(books , booksById);
        Collections.sort(books,booksByIdThenByHighestPages);
        System.out.println("\n Books objects after Sorting");
        for(Books objs: books){
            System.out.println(objs.toString());
        }
    }
}
