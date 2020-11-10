package data;

public class BaseCard {

    private String cardName;
    private int cardCost;

    public BaseCard() {
    }

    public BaseCard(String cardName, int cardCost) {
        this.cardName = cardName;
        this.cardCost = cardCost;
    }

    @Override
    public String toString() {
        return "BaseCard [cardName=" + cardName
                + ",cardCost=" + cardCost + "]";
    }


    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getCardCost() {
        return cardCost;
    }

    public void setCardCost(int cardCost) {
        this.cardCost = cardCost;
    }
}
