package iteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        NumberList numbers=new NumberList();
        List<Number> num=new ArrayList<>();
        num.add(new Number(1));
        num.add(new Number(2));
        num.add(new Number(3));
        num.add(new Number(6));
        num.add(new Number(7));
        num.add(new Number(12));
        num.add(new Number(24));
        numbers.setNumbers(num);
        NumberIterator numberIterator = new NumberIterator(num);
        for(Number number:num){
            System.out.println(number.getNumber());

        }





    }
}
