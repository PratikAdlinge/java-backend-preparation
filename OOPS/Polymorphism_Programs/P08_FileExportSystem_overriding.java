package OOPS.Polymorphism_Programs;

class FileExport {
    void export() {
        System.out.println("Started Export process....");
    }
}

class PDFExporter extends FileExport {
    @Override 
    void export (){
        System.out.println("PDF File Exported Successfully......");
    }
}

class CSVExporter extends FileExport {
    @Override 
    void export() {
        System.out.println("CSV file Exported Successfully....");
    }
}

class JSONExporter extends FileExport {
    @Override 
    void export() {
        System.out.println("JSON File Exported Successfully....");
    }
}
public class P08_FileExportSystem_overriding {
    public static void main(String[] args) {
        FileExport f1=new PDFExporter();
        FileExport f2=new CSVExporter();
        FileExport f3=new JSONExporter();
        
        f1.export();
        f2.export();
        f3.export();
    }
}
