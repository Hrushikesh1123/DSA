package iteratorPattern;

import java.util.Iterator;
import java.util.List;

public class NumberIterator implements Iterator<Number> {
    private List<Number> numbers;
    int index=0;

    public NumberIterator(List<Number> numbers){
    this.numbers=numbers;
    this.index=0;

    }

    @Override
    public boolean hasNext() {
        if(index<numbers.size()){
            return true;
        }
        throw new java.util.NoSuchElementException();
    }

    @Override
    public Number next() {
        if(!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        shiftIndexToNextEven();
            return numbers.get(index);
        }

    private void shiftIndexToNextEven() {
        while(numbers.size()>index&&numbers.get(index).getNumber()%2!=0){
            index++;
        }
    }
}

