package Observer;
interface Observable {
    void registerObserver(EmailMsgObserver observer);
    void removeObserver(EmailMsgObserver observer);
    void notifyObserver();
}
