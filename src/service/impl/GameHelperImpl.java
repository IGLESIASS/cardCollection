package service.impl;

import service.GameHelper;

public class GameHelperImpl implements GameHelper {

    @Override
    public void notifyAboutGameEnd() {
        System.out.println("Game is going to be turned off...");
    }

    @Override
    public void notifyAboutInput(String message) {
        System.out.println(message);

    }
}
