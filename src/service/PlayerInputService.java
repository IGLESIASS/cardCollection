package service;

import data.BaseCard;

import java.util.Scanner;

public interface PlayerInputService {

    GameManager setSelectedGameType(Scanner scan);

    BaseCard createBaseCardByInput(Scanner scan);


}
