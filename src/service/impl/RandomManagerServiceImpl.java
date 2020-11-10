package service.impl;

import service.RandomManagerService;
import util.RandomUtil;

import java.util.List;
import java.util.Random;

public class RandomManagerServiceImpl implements RandomManagerService {

    @Override
    public String getRandomCardName() {
        List<String> firstNames = RandomUtil.firstNamesRandom;
        List<String> secondNames = RandomUtil.secondNamesRandom;
        List<String> thirdnames = RandomUtil.thirdNamesRandom;

        Random rand = new Random();
        String firstName = firstNames.get(rand.nextInt(firstNames.size()));
        String secondName = secondNames.get(rand.nextInt(secondNames.size()));
        String thirdName = thirdnames.get(rand.nextInt(thirdnames.size()));

        return firstName + secondName + thirdName;
    }
}
