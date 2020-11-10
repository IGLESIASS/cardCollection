package service.impl.game_manager;

import data.BaseCard;
import service.BaseCardService;
import service.impl.BaseCardServiceImpl;
import service.GameManager;

public class FunGameManagerImpl implements GameManager {

  private final BaseCardService baseCardService = new BaseCardServiceImpl();

  @Override
  public void startGame() {
    BaseCard playerCard = baseCardService.createCard(new BaseCard());
  }
}
