public interface Phone {
    void powerOn();
    void callNumber(String phoneNo);
    void receivedCall(String phoneNo);
    boolean ansCall();
    boolean isRinging();
}
