public class TimeTest
{
    public static void main (String[] args)
    {
        Time4 t1 = new Time4 (11, 0);
        Time4 t2 = new Time4 (8, 54, 42);
        Time4 t3 = new Time4 (27000);
        
        System.out.println (" Created three times: \n" +
            t1 + "\n" +
            t2 + "\n" +
            t3);
    }
        
}