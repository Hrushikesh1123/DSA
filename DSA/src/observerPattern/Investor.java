package observerPattern;

import java.util.ArrayList;

public interface Investor extends DisplayInterface {

    void updatedData(ArrayList<Stocks> stocks);


}
