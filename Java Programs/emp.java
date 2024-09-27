class emp
{
    int id;
    String name;
    int salary;

    emp(int i , String s)
    {
        id = i;
        name = s;
    }

    emp(int i , String n , int s)
    {
        id = i;
        name = n;
        salary = s;
    }
    emp()
    {
        System.out.println("I am an employee");
    }
    void show()
    {
        System.out.printf("Id = "+id+ "name = "+name+"salary = "+salary);
    }
    public static void main(String[] args)
    {
        emp e1 = new emp();
        emp e2 = new emp(32 , "khush");
        emp e3 = new emp(450 , "khush" , 900000);

        e1.show();
        e2.show();
        e3.show();
    }
}