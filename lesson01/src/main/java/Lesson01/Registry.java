package Lesson01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Registry")
public class Registry {
    private Direction direction;

    public Direction getDirection() {
        return direction;
    }
    @Autowired(required = false)
    @Qualifier("Direction")
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void issue_direction() {
        System.out.println("Выдача направления");
        direction.direct();
    }
}
