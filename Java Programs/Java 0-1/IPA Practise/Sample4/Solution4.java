import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Course{
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

    public Course(int courseId, String courseName, String courseAdmin, int quiz, int handson){
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    public int getCourseId(){
        return this.courseId;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public String getCourseAdmin(){
        return this.courseAdmin;
    }

    public int getQuiz(){
        return this.quiz;
    }

    public int getHandson(){
        return this.handson;
    }
}

class sortByHandson implements Comparator<Course>{
    @Override
    public int compare(Course obj1, Course obj2){
        return Integer.compare(obj1.getHandson(), obj2.getHandson());
    }
}

public class Solution4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Courses: ");
        int size = sc.nextInt();
        sc.nextLine();

        Course[] courses = new Course[size];
        for(int i = 0 ; i<size ; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String courseName = sc.nextLine();
            String courseAdmin = sc.nextLine();
            int quiz = sc.nextInt();
            sc.nextLine();
            int handson = sc.nextInt();
            sc.nextLine();

            courses[i] = new Course(id,courseName,courseAdmin,quiz,handson);
        }

        System.out.println("Enter the admin name to search: ");
        String searchAdmin = sc.nextLine();
        System.out.println("Enter the given handson to search: ");
        int givenHandson = sc.nextInt();


        int avg = findAvgOfQuizByAdmin(courses, searchAdmin);
        Course[] vals = sortCourseByHandsOn(courses,givenHandson);

        System.out.println(avg);
        if(vals.length != 0){
            Arrays.sort(vals, new sortByHandson());
            for(Course crs: vals){
                System.out.println(crs.getCourseName());
            }
        }
        else{
            System.out.println("NULL");
        }

        sc.close();
    }

    public static int findAvgOfQuizByAdmin(Course[] courses, String searchAdmin){
        int avg = 0;
        int cnt = 0;
        for(Course crs: courses){
            String admin = crs.getCourseAdmin();
            if(admin.compareToIgnoreCase(searchAdmin) == 0){
                avg += crs.getQuiz();
                cnt++;
            }
        }
        if(cnt == 0)
        return 0;
        return avg/cnt;
    }

    public static Course[] sortCourseByHandsOn(Course[] courses, int givenHandson){
        Course[] ans = new Course[0];
        for(Course crs: courses){
            if(crs.getHandson() < givenHandson){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = crs;
            }
        }
        return ans;
    }
}