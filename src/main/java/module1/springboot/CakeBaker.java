package module1.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {
    private Forcasting forcasting;
    private Syrup syrup;

    @Autowired
    public  CakeBaker(@Qualifier("chocolateFrosting")Forcasting forcasting,
                      @Qualifier("strawberrySyrup")Syrup syryp){
        this.forcasting=forcasting;
        this.syrup=syrup;
    }
    public void bakecake()
    {
        System.out.println("Cake is baked");
        System.out.println(forcasting.getforcasting());
        System.out.println(syrup.getSyrupType());

    }
}
