package java.sales;

import java.util.*;

public class Operations {

    private HashMap<String, Integer> products = new HashMap<>(100);
    private HashMap<String, Integer> returningCustomers = new HashMap<>(100);
    private HashMap<String, Integer> topCustomers = new HashMap<>(100);


    public void Operations(List<Sale> sales) {


        for (int i = 0; i < sales.size(); i++) {
            Sale sale = sales.get(i);
            addProductSales(sale);
            addTopClients(sale);
            addTopReturning(sale);
        }
        sort(products);
        sort(topCustomers);
        sort(returningCustomers);

        first10(products);
        first10(topCustomers);
        first10(returningCustomers);
    }


    private HashMap addProductSales(Sale sale) {
        String product = sale.getProduct();
        if (products.containsKey(product)) {
            int toAdd = products.get(product);
            products.put(product, sale.getPrice() + toAdd);
        } else {
            products.put(product, sale.getPrice());
        }
        return products;
    }

    private HashMap addTopClients(Sale sale) {
        String customer = sale.getClientName();
        if (topCustomers.containsKey(customer)) {
            int toAdd = sale.getPrice();
            topCustomers.put(customer, sale.getPrice() + toAdd);

        } else {
            topCustomers.put(customer, sale.getPrice());
        }
        return topCustomers;
    }

    private HashMap addTopReturning(Sale sale) {
        String customer = sale.getClientName();
        if (returningCustomers.containsKey(customer)) {
            int toAdd = returningCustomers.get(customer);
            returningCustomers.put(customer, toAdd + 1);
        } else {
            returningCustomers.put(customer, 1);
        }
        return returningCustomers;
    }

    private void sort(HashMap map) {
        List list = new ArrayList(map.entrySet());

        Collections.sort(list, new Comparator() {
            public int compare(Object obj2, Object obj1) {
                return ((Comparable) ((Map.Entry) (obj2)).getValue

                        ()).compareTo(((Map.Entry) (obj1)).getValue());
            }
        });
    }

    private HashMap first10(HashMap map){
        Set<String> keys = map.keySet();
        String[] keysArray = keys.toArray(new String [keys.size()]);
        for (int i = 11 ; i< keysArray.length; i++){
            map.remove(i);
        }
        return map;
    }

    public HashMap<String, Integer> getProducts() {
        return products;
    }

    public HashMap<String, Integer> getReturningCustomers() {
        return returningCustomers;
    }

    public HashMap<String, Integer> getTopCustomers() {
        return topCustomers;
    }
}
