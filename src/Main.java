import com.example.strategy.pattern.Duck;
import com.example.strategy.pattern.FlyNoWay;
import com.example.strategy.pattern.MallardDuck;
import com.example.strategy.pattern.ModelDuck;

public class Main {
    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.display();
        mallardDuck.performFly();

        System.out.println("===============");


        Duck modelDuck2 = new ModelDuck();
        modelDuck2.performFly();
        modelDuck2.performQuack();
        modelDuck2.display();


    }
}