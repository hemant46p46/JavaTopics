public class CloneTest {
    public static void main(String[] args) {

    }
}
class Student implements Cloneable{
    int roll;
    String name;
    Student(int r, String n){
        this.roll = r;
        this.name = n;
    }
    @Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
