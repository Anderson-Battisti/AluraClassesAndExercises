public class Main
{
    public static void main( String[] args )
    {
        Person person = new Person();
        person.printMessage();

        Student student = new Student();
        student.setName( "John" );
        student.setAge( 22 );
        student.showStudentInformation();
    }
}