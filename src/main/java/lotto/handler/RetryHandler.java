package lotto.handler;

import java.util.function.Supplier;

public class RetryHandler {
    private <T> T getInputUntilValid(Supplier<T> inputFunction){
        while(true){
            try{
                return inputFunction.get();
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
}