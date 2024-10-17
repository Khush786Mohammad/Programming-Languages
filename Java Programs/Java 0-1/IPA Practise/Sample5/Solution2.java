import java.util.Scanner;

class Student{
    private int rollNo;
    private String name;
    private String branch;
    private double score;
    private boolean dayScholor;

    public Student(int rollNo, String name, String branch, double score, boolean dayScholor){
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.score = score;
        this.dayScholor = dayScholor;
    }

    public int getRollNo(){
        return this.rollNo;
    }
    public String getName(){
        return this.name;
    }
    public String getBranch(){
        return this.branch;
    }
    public double getScore(){
        return this.score;
    }
    public boolean isDayScholor(){
        return this.dayScholor;
    }
}

public class Solution2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for(int i = 0 ; i<n ; i++){
            int rNo = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String branch = sc.nextLine();
            double score = sc.nextDouble();
            sc.nextLine();
            boolean dayScholor = sc.nextBoolean();
            sc.nextLine();

            students[i] = new Student(rNo, name, branch, score, dayScholor);
        }

        int count = findCountOfDayscholarStudents(students);
        Student obj = findStudentwithSecondHighestScore(students);

        if(count != 0){
            System.out.println(count);
        }
        else{
            System.out.println("There are no such dayscholor students");
        }

        if(obj != null){
            System.out.println(obj.getRollNo()+"#"+obj.getName()+"#"+obj.getScore());
        }
        else{
            System.out.println("No non dayscholor students with second highest score");
        }

        sc.close();
    }

    public static int findCountOfDayscholarStudents(Student[] students){
        int count = 0;
        for(Student std : students){
            if(std.isDayScholor() && std.getScore() > 80){
                count++;
            }
        }
        return count;
    }

    public static Student findStudentwithSecondHighestScore(Student[] students){
        double maxi = Integer.MIN_VALUE;
        double secondMaxi = Integer.MIN_VALUE;

        Student maxiObj = null;
        Student secondMaxiObj = null;

        for(Student std : students){
            if(!std.isDayScholor()){
                double score = std.getScore();
                if(score > maxi){
                    secondMaxi = maxi;
                    secondMaxiObj = maxiObj;

                    maxi = score;
                    maxiObj = std;
                }
                else if(score > secondMaxi && score != maxi){
                    secondMaxi = score;
                    secondMaxiObj = std;
                }
            }
        }
        return secondMaxiObj;
    }
}
