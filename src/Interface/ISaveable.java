package Interface;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {

    List<String> write();
    void retrieve(List<String> rec);

}
