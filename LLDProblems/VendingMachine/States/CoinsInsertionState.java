package LLDProblems.VendingMachine.States;

public interface CoinsInsertionState {
    public void addCoins(int coin);
    public void cancelAndRefund();
    public void chooseProduct();
}
