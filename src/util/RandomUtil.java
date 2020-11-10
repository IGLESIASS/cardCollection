package util;

import java.util.ArrayList;
import java.util.List;

public class RandomUtil {

    public static List<String> firstNamesRandom = List.of(
            FirstNameRandom.ARMAN,
            FirstNameRandom.ILYA,
            FirstNameRandom.MITYA,
            FirstNameRandom.DIMA);

    public static List<String> secondNamesRandom = List.of(
            SecondNameRandom.TEST_1,
            SecondNameRandom.TEST_2,
            SecondNameRandom.TEST_3);

    public static List<String> thirdNamesRandom = List.of(
            ThirdNameRandom.TEST_1,
            ThirdNameRandom.TEST_2,
            ThirdNameRandom.TEST_3);

    public static class FirstNameRandom {
        public static final String ARMAN = "Арман - ";
        public static final String ILYA = "Илья - ";
        public static final String MITYA = "Митя - ";
        public static final String DIMA = "Дима - ";
    }

    public static class SecondNameRandom {
        public static final String TEST_1 = "разрушитель ";
        public static final String TEST_2 = "хранитель ";
        public static final String TEST_3 = "спаситель ";
    }

    public static class ThirdNameRandom {
        public static final String TEST_1 = "миров";
        public static final String TEST_2 = "снов";
        public static final String TEST_3 = "университетов";
    }
}
