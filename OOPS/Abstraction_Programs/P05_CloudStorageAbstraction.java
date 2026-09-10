package OOPS.Abstraction_Programs;
abstract class CloudStorage {
    abstract void uploadFile();
    abstract void downloadFile();
}
class GoogleDrive extends  CloudStorage {
    @Override 
    void uploadFile() {
        System.out.println("File Uploaded in Google Drive");
    }

    @Override 
    void downloadFile() {
        System.out.println("File is Downloaded from google drive.");
    }
}
class OneDrive extends  CloudStorage {
    @Override 
    void uploadFile() {
        System.out.println("File Uploaded in OneDrive");
    }

    @Override 
    void downloadFile() {
        System.out.println("File is Downloaded from OneDrive.");
    }
}
class DropBox extends  CloudStorage {
    @Override 
    void uploadFile() {
        System.out.println("File Uploaded in DropBox");
    }

    @Override 
    void downloadFile() {
        System.out.println("File is Downloaded from DropBox.");
    }
}

public class P05_CloudStorageAbstraction {
    public static void main(String[] args) {
        CloudStorage googledrive=new GoogleDrive ();
        CloudStorage dropbox=new DropBox();
        CloudStorage onedrive=new OneDrive();

        googledrive.uploadFile();
        googledrive.downloadFile();

        dropbox.uploadFile();
        dropbox.downloadFile();

        onedrive.uploadFile();
        onedrive.downloadFile();
    }
}
