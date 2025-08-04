package FactoryPattern;

public class SimpleFactory {
    public static Product createProduct(String type){
        if(type.equals("A")){
            return new ProductA();
        }else if(type.equals("B")){
            return new ProductB();
        }
        return null;
    }

    public static void main(String[] args) {
        Product product = SimpleFactory.createProduct("A");
        product.print();
    }
}

abstract class Product{
    public abstract void print();
}

class ProductA extends Product{

    @Override
    public void print() {
        System.out.println("ProductA");
    }
}
class ProductB extends Product{

    @Override
    public void print() {
        System.out.println("ProductB");
    }
}
