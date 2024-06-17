package iteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NumberList implements Iterable<Number> {

    private List<Number> numbers;
    int index=0;
    public NumberList(){
        numbers=new ArrayList<>();
    }

    public void setNumbers(List<Number> numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Number> iterator() {
        return numbers.iterator();
    }
}
