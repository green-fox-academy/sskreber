import java.util.ArrayList;

public class Sum {

    public int sum(ArrayList<Integer> inputList) {
        int sum = 0;
        if (inputList != null) {
            for (Integer listItem : inputList) {
                sum += listItem;
            }
        } else {
            inputList.add(0);
        }
        return sum;
    }
}
