package Lesson01;

import org.springframework.stereotype.Component;

@Component("Direction")
public class DirectionTherapist implements Direction {

    @Override
    public void direct() {
        System.out.println("Выдано направление к терапевту!");
    }
}
