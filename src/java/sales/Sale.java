package java.sales;

public class Sale {
    private int orderNr;
    private String product;
    private int price;
    private String clientName;


    public int getOrderNr() {
        return orderNr;
    }

    public void setOrderNr(int orderNr) {
        this.orderNr = orderNr;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }


    public Sale(int orderNr, String product, int price, String clientName) {
        this.orderNr = orderNr;
        this.product = product;
        this.price = price;
        this.clientName = clientName;
    }

}
