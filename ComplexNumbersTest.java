import java.util.Scanner;

public class ComplexNumbersTest {
    public static void main(String[] args) {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt(), i1 = sc.nextInt(), r2 = sc.nextInt(), i2 = sc.nextInt();

        int choice = sc.nextInt();

        ComplexNumbers c1 = new ComplexNumbers(r1, i1);

        ComplexNumbers c2 = new ComplexNumbers(r2, i2);

        if(choice==1){
            c1.plus(c2);
            c1.print();
        }
        else if(choice==2){
            c1.multiply(c2);
            c1.print();
        }

    }
}
class ComplexNumbers {

    // Write your code here
    int R, I;
    ComplexNumbers(int r, int i){
        this.R = r;
        this.I = i;
    }
    public void plus(ComplexNumbers c2){
        this.R = this.R + c2.R;
        this.I = this.I + c2.I;
    }
    public void multiply(ComplexNumbers c2){
        int r = ((this.R*c2.R) - (this.I*c2.I));
        int i = this.R*c2.I + this.I*c2.R;

        this.R = r;
        this.I = i;
    }
    public void print(){
        System.out.print(this.R + " + i" + this.I);
    }

}

