package service;

import data.BaseCard;

public interface BaseCardService {

    BaseCard createCard(BaseCard card);

    BaseCard createRandomCard();

}
