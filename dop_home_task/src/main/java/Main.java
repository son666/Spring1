import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Object> objects = new ArrayList<Object>();
        objects.add(new Object(1, null));
        objects.add(new Object(2, null));
        objects.add(new Object(3, 1));
        objects.add(new Object(4, 3));
        objects.add(new Object(5, null));
        objects.add(new Object(6, 3));
        objects.add(new Object(7, 2));
        objects.add(new Object(8, 5));

        for (Object obj : objects) {
            int id = obj.getId();
            for (Object childObj : objects) {
                if (childObj.getParentId() != null && childObj.getParentId() == id) {
                    obj.getChildren().add(childObj);
                }
            }
            System.out.println("id paren: " + obj.getId() + " -> Count child: " + obj.getChildren().size());
        }

    }
}
