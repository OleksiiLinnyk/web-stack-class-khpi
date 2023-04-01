package ua.edu.khpi;

public class UserCabinet  {

    private boolean isNewsNotificationApplied;
    private boolean isNewUpdatesNotificationApplied;
    private boolean isProductSubscribeNotificationApplied;

    public UserCabinet(boolean isNewsNotificationApplied, boolean isNewUpdatesNotificationApplied, boolean isProductSubscribeNotificationApplied) {
        this.isNewsNotificationApplied = isNewsNotificationApplied;
        this.isNewUpdatesNotificationApplied = isNewUpdatesNotificationApplied;
        this.isProductSubscribeNotificationApplied = isProductSubscribeNotificationApplied;
    }

    public SnapShotUserCabinet createSnapShot() {
        SnapShotUserCabinet snapShotUserCabinet = new SnapShotUserCabinet(this, isNewsNotificationApplied, isNewUpdatesNotificationApplied, isProductSubscribeNotificationApplied);
        System.out.println("Snapshot was created " + snapShotUserCabinet);
        return snapShotUserCabinet;
    }

    public boolean isNewsNotificationApplied() {
        return isNewsNotificationApplied;
    }

    public void setNewsNotificationApplied(boolean newsNotificationApplied) {
        isNewsNotificationApplied = newsNotificationApplied;
    }

    public boolean isNewUpdatesNotificationApplied() {
        return isNewUpdatesNotificationApplied;
    }

    public void setNewUpdatesNotificationApplied(boolean newUpdatesNotificationApplied) {
        isNewUpdatesNotificationApplied = newUpdatesNotificationApplied;
    }

    public boolean isProductSubscribeNotificationApplied() {
        return isProductSubscribeNotificationApplied;
    }

    public void setProductSubscribeNotificationApplied(boolean productSubscribeNotificationApplied) {
        isProductSubscribeNotificationApplied = productSubscribeNotificationApplied;
    }

    @Override
    public String toString() {
        return "UserCabinet{" +
                "isNewsNotificationApplied=" + isNewsNotificationApplied +
                ", isNewUpdatesNotificationApplied=" + isNewUpdatesNotificationApplied +
                ", isProductSubscribeNotificationApplied=" + isProductSubscribeNotificationApplied +
                '}';
    }
}
