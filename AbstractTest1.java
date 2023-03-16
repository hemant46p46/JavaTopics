abstract class Bike{
    int limit;
    abstract void run();
    void changeGear(){
        System.out.println("Changing Gears ... ");
    }
    abstract void stop();
}
class Honda extends Bike{
    @Override
    void run() {
        System.out.println("Honda Bike is Running");
    }
    @Override
    void stop(){
        System.out.println("Bike stopped");
    }
}
public class AbstractTest1 {
    public static void main(String[] args) {
        Bike bike = new Bike() {
            @Override
            void run() {
                System.out.println("Anonymous Bike Running");
            }

            @Override
            void stop() {
                System.out.println("Anonymous Bike is Stopped");
            }
        };
        bike.run();
        bike.stop();

        Honda honda = new Honda();
        honda.changeGear();
    }

}
