public class exception
{
    public static void main(String[] args)
    {
        int arr[] = new int[5];
        try{
            System.out.println(arr[6]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Trying to print out of size ");
            System.out.println(e.getLocalizedMessage());
        }
    }
}
