import java.util.ArrayList;

public class Atelier implements MenClothing, WomenClothing{
    String type;
    size size;
    int price;
    String color;
    public void dressWoman(ArrayList<Clothes> list){
        for(Clothes cl : list){
            if(cl.getType().equals("TShirt") || cl.getType().equals("Pants") || cl.getType().equals("Skirt")){
                type = cl.getType();
                size = cl.size;
                price = cl.price;
                color = cl.color;
                dressWoman();
            }
        }
    }
    public void dressMan(ArrayList<Clothes> list){
        for(Clothes cl : list){
            if(cl.getType().equals("TShirt") || cl.getType().equals("Pants") || cl.getType().equals("Tie")){
                type = cl.getType();
                size = cl.size;
                price = cl.price;
                color = cl.color;
                dressMan();
            }
        }
    }

    @Override
    public void dressWoman() {
        System.out.println(type + " - size: " + size + ", price: " + price + ", color: " + color);
    }
    @Override
    public void dressMan(){
        System.out.println(type + " - size: " + size + ", price: " + price + ", color: " + color);
    }
}
