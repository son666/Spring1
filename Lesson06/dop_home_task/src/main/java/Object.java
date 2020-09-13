import java.util.*;

public class Object {

    private int id;
    private Integer parentId;
    private List<Object> children = new ArrayList<>();

    public Object(int id, Integer parentId) {
        this.id = id;
        this.parentId = parentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public List<Object> getChildren() {
        return children;
    }

}
