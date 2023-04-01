package ua.edu.khpi;

public class Main {

    public static void main(String[] args) {
        UserCabinet userCabinet = new UserCabinet(false, false, true);
        Command command = new Command(userCabinet);
        command.makeBackup();
//        Snapshot was created SnapShotUserCabinet{isNewUpdatesNotificationAppliedNewsNotificationApplied=false, isNewUpdatesNotificationApplied=false, isProductSubscribeNotificationApplied=true}
        command.restoreBackup();
//        Restore data from snapshot UserCabinet{isNewsNotificationApplied=false, isNewUpdatesNotificationApplied=false, isProductSubscribeNotificationApplied=true}

        UserCabinet userCabinet1 = new UserCabinet(true, false, true);
        Command command1 = new Command(userCabinet1);

        command1.makeBackup();
//        Snapshot was created SnapShotUserCabinet{isNewsNotificationApplied=true, isNewUpdatesNotificationApplied=false, isProductSubscribeNotificationApplied=true}
        command1.restoreBackup();
//        Restore data from snapshot UserCabinet{isNewsNotificationApplied=true, isNewUpdatesNotificationApplied=false, isProductSubscribeNotificationApplied=true}

        UserCabinet userCabinet2 = new UserCabinet(true, true, true);
        Command command2 = new Command(userCabinet1);

        command2.makeBackup();
//        Snapshot was created SnapShotUserCabinet{isNewsNotificationApplied=true, isNewUpdatesNotificationApplied=false, isProductSubscribeNotificationApplied=true}
        command2.restoreBackup();
//        Restore data from snapshot UserCabinet{isNewsNotificationApplied=true, isNewUpdatesNotificationApplied=false, isProductSubscribeNotificationApplied=true}
    }
}
