package edu.ncsu.monopoly;

public class TradeDeal {
    private int amount;
    private int playerIndex;
    private String propertyName;

    public int getAmount() {
        return amount;
    }
    
    public int getPlayerIndex() {
        return playerIndex;
    }
    
    public String getPropertyName() {
        return propertyName;
    }
    
    public String makeMessage() {
        Player player = GameMaster.instance().getPlayer(playerIndex);
		String message = GameMaster.instance().getCurrentPlayer() + 
        	" wishes to purchase " +
        	propertyName + " from " + 
        	player +
        	" for " + amount + ".  " + 
        	player +
        	", do you wish to trade your property?";
        return message;
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }
    
    public void setSellerIndex(int playerIndex) {
        this.playerIndex = playerIndex;
    }
}
