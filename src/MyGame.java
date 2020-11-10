import data.BaseCard;
import exception.GameException;

import java.util.Scanner;

import service.*;
import service.impl.BaseCardServiceImpl;
import service.impl.GameHelperImpl;
import service.impl.PlayerInputServiceImpl;

public class MyGame {

    public static void main(String[] args) {
        GameManager gameManager;
        GameHelper gameHelper = new GameHelperImpl();
        PlayerInputService inputService = new PlayerInputServiceImpl();
        BaseCardService baseCardService = new BaseCardServiceImpl();

        Scanner scan = new Scanner(System.in);

        try {
            gameManager = inputService.setSelectedGameType(scan);
            gameManager.startGame();
            BaseCard playerInputCard = inputService.createBaseCardByInput(scan);
            System.out.println(playerInputCard.toString());

            System.out.println(baseCardService.createRandomCard().toString());
            System.out.println(baseCardService.createRandomCard().toString());
            System.out.println(baseCardService.createRandomCard().toString());
            System.out.println(baseCardService.createRandomCard().toString());
        } catch (GameException ex) {
            gameHelper.notifyAboutGameEnd();
        }

    }
}
