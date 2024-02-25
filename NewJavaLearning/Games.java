package NewJavaLearning;

public enum Games {
    GTA5(10000),RedDeadRedumption(2000),CallOfDuty(2123);
    private int price;
    Games(int price){
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
