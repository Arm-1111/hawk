package hawkBase;

import java.util.concurrent.TimeUnit;

public class hawkBase {

    public static void waitForLoad(){
        try {
            TimeUnit.MILLISECONDS.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
