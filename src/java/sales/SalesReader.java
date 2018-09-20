package java.sales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class SalesReader {

    private Reader reader;

    public SalesReader(Reader reader) {
        this.reader = reader;
    }

    public ArrayList<Sale> getSales() throws IOException {
        try (BufferedReader br = new BufferedReader(reader)) {
            ArrayList<Sale> sales = new ArrayList<Sale>();
            String line = br.readLine();
            while (line != null) {
                sales.add(parseSale(line));
                line = br.readLine();
            }

            return sales;
        }
    }

    private Sale parseSale(String line) {
        String[] tokens = line.split(",");
        return new Sale(Integer.parseInt(tokens[0]), tokens[1], Integer.parseInt(tokens[2]), tokens[3]);
    }

}
