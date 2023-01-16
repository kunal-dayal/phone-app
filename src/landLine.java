public class landLine implements Phone{

    private String myPhoneNo;
    private boolean isRinging;
    private boolean ispowerOn;

    public landLine(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        this.isRinging = false;
        this.ispowerOn = true;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isIspowerOn() {
        return ispowerOn;
    }

    public void setIspowerOn(boolean ispowerOn) {
        this.ispowerOn = ispowerOn;
    }

    @Override
    public void powerOn() {
        this.ispowerOn = true;
    }

    @Override
    public void callNumber(String phoneNo) {
        if(ispowerOn){
                System.out.println("you dialed - "+phoneNo);
            }else{
            System.out.println("power is off");
        }
        return;
    }

    @Override
    public void receivedCall(String phoneNo) {
        if(ispowerOn && myPhoneNo.equals(phoneNo)){
            this.isRinging = true;
            System.out.println("you received a call");
        }else{
            System.out.println("unable to reach");
        }
        return;
    }

    @Override
    public boolean ansCall() {
        if(isRinging){
            System.out.println("call answered");
            isRinging = false;
            return true;
        }else{
            System.out.println("unable to reach");
            return false;
        }
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
