package nesne;
interface IWorker{
    void work();
}
class worker implements IWorker,Eatable,Payable{
    @Override
    public void work() {
    }
    @Override
    public void eat() {
    }
    @Override
    public void pay(){
    }
}
class outsourceWorker implements IWorker{
    @Override
    public void work() {
    }
}
class robot implements IWorker{
    @Override
    public void work(){        
    }
}
interface Eatable{
    void eat();
}
interface Payable{
    void pay();
} 
    

public class interfaceDemo {
    public static void main(String[] args) {
        
    }
}
