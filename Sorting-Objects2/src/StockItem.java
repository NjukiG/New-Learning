
public class StockItem implements Comparable<StockItem>{
    private String sku;
    private int quantityOnHand;

    public StockItem(String sku, int quantityOnHand) {
        this.sku = sku;
        this.quantityOnHand = quantityOnHand;
    }

    @Override
    public String toString() {
        return "\n" +"StockItem{" +
                "sku='" + sku + '\'' +
                ", quantityOnHand=" + quantityOnHand +
                '}';
    }


    @Override
    public int compareTo(StockItem o) {
        if(this.quantityOnHand > o.quantityOnHand){
            return 1;
        }else{
            return -1;
        }
    }
}