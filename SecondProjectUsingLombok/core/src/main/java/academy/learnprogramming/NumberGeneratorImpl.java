package academy.learnprogramming;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Slf4j
@Component
public class NumberGeneratorImpl implements NumberGenerator {

    //private static final Logger log = LoggerFactory.getLogger(NumberGeneratorImpl.class); // used @Slf4j

    private final Random random = new Random();

    @Getter
    private final int maxNumber;

    @Getter
    private final int minNumber;



    @Autowired
    public NumberGeneratorImpl(@MaxNumber int maxNumber, @MinNumber int minNumber) {
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
    }


    @Override
    public int next() {
        return random.nextInt(100) + 1;
    }


    // used @Getter
//    @Override
//    public int getMaxNumber() {
//        return maxNumber;
//    }
//
//    @Override
//    public int getMinNumber() {
//        return minNumber;
//    }
}
