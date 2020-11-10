package service.impl;

import data.BaseCard;
import service.BaseCardService;
import service.RandomManagerService;
import util.ConstUtil.DefaultCardConst;

public class BaseCardServiceImpl implements BaseCardService {

    private final RandomManagerService randomManagerService = new RandomManagerServiceImpl();

    @Override
    public BaseCard createCard(BaseCard card) {

        if (card.getCardName() == null || card.getCardName().equals("")) {
            card.setCardName(DefaultCardConst.DEFAULT_NAME);
        }

        if (card.getCardCost() < 0 || card.getCardCost() > 10) {
            card.setCardCost(0);
        }

        return card;
    }

    @Override
    public BaseCard createRandomCard() {
        return new BaseCard(randomManagerService.getRandomCardName(), 0);
    }
}
