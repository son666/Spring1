import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

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
        }
        //Удаляем дочерние элементы из списка
        ListIterator<Object> iterator = objects.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().getParentId() != null) {
                iterator.remove();
            }
        }
    }
}
