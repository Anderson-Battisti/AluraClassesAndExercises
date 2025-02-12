public class Main
{
    public static void main( String[] args )
    {
        double originalPrice = 50.45;
        double discountPercent = 10;
        double discountPrice = 0;

        discountPrice -= ( originalPrice * discountPercent ) / 100;

        System.out.println( discountPrice );
    }
}