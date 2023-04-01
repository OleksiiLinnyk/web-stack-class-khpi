package ua.edu.khpi;

public class Command {

    private SnapShotUserCabinet snapShotUserCabinet;
    private final UserCabinet userCabinet;

    public Command(UserCabinet userCabinet) {
        this.userCabinet = userCabinet;
    }

    public void makeBackup() {
        snapShotUserCabinet = userCabinet.createSnapShot();
    }

    public void restoreBackup() {
        if (snapShotUserCabinet != null) {
            snapShotUserCabinet.restore();
        }
    }
}
