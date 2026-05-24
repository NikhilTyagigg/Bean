package module1.springboot.impl;

import module1.springboot.Forcasting;
import org.springframework.stereotype.Component;

@Component
public class ChocolateFrosting implements Forcasting {
    @Override
    public String getforcasting() {
        return "ChocolateFrosting";
    }
}
