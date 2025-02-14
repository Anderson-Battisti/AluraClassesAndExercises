public class Student
{
    String name;
    Integer age;

    public void showStudentInformation()
    {
        System.out.println( "The student name is: " + this.name );
        System.out.println( "The student age is: " + this.age );
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public void setAge( Integer age )
    {
        this.age = age;
    }
}
