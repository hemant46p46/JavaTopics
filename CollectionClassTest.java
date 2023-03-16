import java.util.*;

class Student implements Comparable<Student>{
    int roll;
    String name;
    double grade;

    Student(int r, String n, double g){
        this.roll = r;
        this.name = n;
        this.grade = g;
    }

    @Override
    public int compareTo(Student o) {
//        return Integer.compare((int) this.grade, (int) o.grade);

        return Integer.compare(this.roll, o.roll);


        /*
        if(this.roll < o.roll){
            return 1;
        } else if (this.roll > o.roll) {
            return -1;
        }else {
            return 0;
        }
        **/
    }
}
public class CollectionClassTest {
    public static void main(String[] args) {


        sortingStudentObject();
        /*
        sortingStringObjects();
        collectionAddAllTest();
        **/
    }
    public static void sortingStudentObject(){
        /*Creating Object*/
        Student s1 = new Student(16, "Hemant", 7.2);
        Student s2 = new Student(1, "Shivam", 6.3);
        Student s3 = new Student(48, "Brijesh", 8.9);
        Student s4 = new Student(29, "Ashutosh", 9.6);
        Student s5 = new Student(32, "Deepak", 7.9);
        /*Creating List of Student Type*/
        List<Student> studentList = new ArrayList<>();
        /*Adding Student Object to the list*/
        boolean b = Collections.addAll(studentList, s1, s2, s3, s5, s4);
        for(Student s : studentList){
            System.out.println(s.roll + " : " + s.name + " : " + s.grade);
        }


        /*Sorting Student on basis of roll Number */
        System.out.println("\nAfter Sorting ..");
        Collections.sort(studentList);
        for(Student s : studentList){
            System.out.println(s.roll + " : " + s.name + " : " + s.grade);
        }

    }
    public static void sortingStringObjects(){
        ArrayList<String> names = new ArrayList<>();
        boolean b = Collections.addAll(names,
                "Hemant", "Viru", "Saurav", "Tahir", "Mukesh");
        System.out.println(names);

        Collections.sort(names);
        System.out.println("After Sorting");
        System.out.println(names);

        Collections.reverse(names);
        System.out.println("After Sorting in Reverse");
        System.out.println(names);
    }
    public static void collectionAddAllTest(){
        Set<Integer> set = new HashSet<>();
        boolean b = Collections.addAll(set, 1, 5, 7, 8);
        System.out.println("Boolean " + b);
        System.out.println(set);


        List<String> list = new ArrayList<>();
        list.add("Rahul");
        list.add("Jai");
        list.add("Rajendra");
        System.out.println(list);
        boolean b1 = Collections.addAll(list, "Hemant", "Deepak");
        System.out.println(b1);
        System.out.println(list);
    }
}
