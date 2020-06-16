package Main.java.Utils;

import java.util.Random;

public class RandomString1 {
    public String getRandom(int i) {
        int leftLimit = 97; //letter a
        int rightLimit =122;    //letter z
        Random random =new Random();

        return random.ints(leftLimit,rightLimit+1)
                .limit(5)
                .collect(StringBuilder:: new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
