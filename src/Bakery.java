//<<<<<<< HEAD
//=======
public class Bakery {
    private String productName;
    private double price;
    private String expirationDate;
    private String allergy;
    private String allergy2;
    private int quantityInStock;
    public Bakery(){
    }
    public Bakery(String productName,double price,String expirationDate,String allergy,String allergy2,int quantityInStock){
        this.productName=productName;
        this.price=price;
        this.expirationDate=expirationDate;
        this.allergy=allergy;
        this.quantityInStock=quantityInStock;
        this.allergy2=allergy2;
    }
    //getter and setters
    public void setProductName(String productName){
        this.productName=productName;
    }
    public String getProductName(){
        return this.productName;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return this.price;
    }
    public void setExpirationDate(String expirationDate){
        this.expirationDate=expirationDate;
    }
    public String getExpirationDate(){
        return this.expirationDate;
    }
    public void setAllergy(String allergy){
        this.allergy=allergy;
    }
    public String getAllergy(){
        return this.allergy;
    }
    public void setQuantityInStock(int quantityInStock){
        this.quantityInStock=quantityInStock;
    }
    public int getQuantityInStock(){
        return this.quantityInStock;
    }
    public void setAllergy2(String Allergy2){
        this.allergy2=allergy2;
    }
    public String getAllergy2(){
    return this.allergy2;
    }
}



    //make a method that prints the whole itemOne

//>>>>>>> 56228d043ed59cc84c4561b5449fdc6f4102e57d