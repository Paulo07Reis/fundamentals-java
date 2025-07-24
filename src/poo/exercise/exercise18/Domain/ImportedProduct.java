package poo.exercise.exercise18.Domain;

public class ImportedProduct extends Product {
    private Double customFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    @Override
    public final String priceTag(){
        return super.priceTag() + String.format(" (Customs fee: $%.2f)", customFee);
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }
}
