package week11_day5;

import java.util.List;

public interface BatchDao {
    void launchNewBatch(Batch batch, List<Student> students);
}

