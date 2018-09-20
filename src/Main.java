import java.io.IOException;
import java.sales.Export;
import java.sales.Operations;
import java.sales.Sale;
import java.sales.SalesReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        HashMap products = null;
        HashMap topCustomers =null;
        HashMap topReturning = null;

        ArrayList<Sale> sales = new ArrayList<Sale>(10);
        SalesReader salesReader = null;
        sales = salesReader.getSales();
        Operations operations = new Operations();
        operations.Operations(sales);

        products = operations.getProducts();
        topCustomers = operations.getTopCustomers();
        topReturning = operations.getReturningCustomers();

        Export export = new Export();

    }
}
