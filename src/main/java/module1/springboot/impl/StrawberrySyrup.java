package module1.springboot.impl;

import module1.springboot.Syrup;
import org.springframework.stereotype.Component;

@Component
public class StrawberrySyrup  implements Syrup {
    @Override
    public String getSyrupType() {
        return "Chocolate Syrup";
    }
}
