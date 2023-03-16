public class ThisKeywords {

    public static void main(String[] arg){
        BThis bThis = new BThis();
    }
}
class AThis{
    AThis(){
        System.out.println("Constructor a");
    }
    int aVar=10;
    public void aMethod(){

    }
    public void method(){

    }
}

class BThis extends AThis{
    BThis(){

        System.out.println("Constructor b");
    }
    int bVar = 20;
    public void bMethod(){
        this.method();
        super.method();
    }
    public void method(){

    }
}
