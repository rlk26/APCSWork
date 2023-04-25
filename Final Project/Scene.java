public interface Scene
{
    public void reDo();
    public void display();
    public boolean isLost();
    public boolean isWon();
    public void handleKeyPressed();
    public void handleKeyReleased();
    public void handleMouseClicked();
    public void saveHighScore();

}
