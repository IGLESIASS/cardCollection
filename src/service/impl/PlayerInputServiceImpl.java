package service.impl;

import data.BaseCard;
import exception.GameException;
import service.*;
import service.impl.game_manager.FunGameManagerImpl;
import service.impl.game_manager.HardGameManagerImpl;
import service.impl.game_manager.NormalGameManagerImpl;
import util.ConstUtil.PlayerInputConst;

import java.util.Scanner;

public class PlayerInputServiceImpl implements PlayerInputService {

    private final GameHelper gameHelper = new GameHelperImpl();
    private final BaseCardService baseCardService = new BaseCardServiceImpl();


    @Override
    public GameManager setSelectedGameType(Scanner scanner) {
        gameHelper.notifyAboutInput(PlayerInputConst.SELECT_GAME_TYPE);

        GameManager gameManager;
        int type = scanner.nextInt();
        scanner.nextLine();

        switch (type) {
            case (0):
                gameManager = new FunGameManagerImpl();
                break;
            case (1):
                gameManager = new NormalGameManagerImpl();
                break;
            case (2):
                gameManager = new HardGameManagerImpl();
                break;
            default:
                throw new GameException("Wrong game input type!");
        }

        return gameManager;
    }

    @Override
    public BaseCard createBaseCardByInput(Scanner scan) {
        gameHelper.notifyAboutInput(PlayerInputConst.CREATE_CARD);

        String cardName = scan.nextLine();
        int cardCost = scan.nextInt();
        scan.nextLine();

        return baseCardService.createCard(new BaseCard(cardName, cardCost));
    }

}
