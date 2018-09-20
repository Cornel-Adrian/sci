package java.sales;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class Export {


    public void writeSalesToFile(HashMap products, HashMap topCustomers, HashMap topReturning) throws IOException {
        File f = new File("sales-stats.txt");
        if (f.exists()) {
            f.delete();
        } else {
            f.createNewFile();
        }

        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(products);
        oos.writeObject(topCustomers);
        oos.writeObject(topReturning);
        oos.flush();
        oos.close();


    }

}
