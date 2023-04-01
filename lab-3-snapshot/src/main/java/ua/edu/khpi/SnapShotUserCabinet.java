package ua.edu.khpi;

public class SnapShotUserCabinet {

    private final UserCabinet userCabinet;
    private final boolean isNewsNotificationApplied;
    private final boolean isNewUpdatesNotificationApplied;
    private final boolean isProductSubscribeNotificationApplied;

    public SnapShotUserCabinet(UserCabinet userCabinet, boolean isNewsNotificationApplied,
                               boolean isNewUpdatesNotificationApplied, boolean isProductSubscribeNotificationApplied) {
        this.userCabinet = userCabinet;
        this.isNewsNotificationApplied = isNewsNotificationApplied;
        this.isNewUpdatesNotificationApplied = isNewUpdatesNotificationApplied;
        this.isProductSubscribeNotificationApplied = isProductSubscribeNotificationApplied;
    }

    public void restore() {
        userCabinet.setNewsNotificationApplied(this.isNewsNotificationApplied);
        userCabinet.setNewUpdatesNotificationApplied(this.isNewUpdatesNotificationApplied);
        userCabinet.setProductSubscribeNotificationApplied(this.isProductSubscribeNotificationApplied);
        System.out.println("Restore data from snapshot " + userCabinet);
    }

    @Override
    public String toString() {
        return "SnapShotUserCabinet{" +
                "isNewsNotificationApplied=" + isNewsNotificationApplied +
                ", isNewUpdatesNotificationApplied=" + isNewUpdatesNotificationApplied +
                ", isProductSubscribeNotificationApplied=" + isProductSubscribeNotificationApplied +
                '}';
    }
}
