package service;

import data.BaseCard;

import java.util.Scanner;

/***
 * ОТВЕЧАЕТ ЗА ЛЮБОЙ ВВОД ПОЛЬЗОВАТЕЛЕМ
 */
public interface PlayerInputService {

  GameManager setSelectedGameType(Scanner scan);
  BaseCard createBaseCardByInput(Scanner scan);


}
