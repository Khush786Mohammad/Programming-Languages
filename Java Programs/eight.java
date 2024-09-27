class student
{
    int roll_no;
    String name;
    static String college = "Graphic Era Hill University";

    void getdata(int no , String name)
    {
        this.roll_no = no;
        this.name = name;
    }
    void showdata()
    {
        System.out.println("Name = "+name);
        System.out.println("Rollno = "+roll_no);
        System.out.println("College = "+college);
    }
}

public class eight
{
    public static void main(String[] args)
    {
        student st = new student();
        st.getdata(10,"khush");
        st.showdata();
        st.getdata(11,"Unknown");
        st.showdata();
    }
}