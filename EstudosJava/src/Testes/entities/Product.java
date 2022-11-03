package Testes.entities;

public class Product {

   public  String name;
    public Double price;
    public int quantity;


    public double totalValueInStock(){
        return  price * quantity;
    }

    public  void  addProducts(int quantity){                   // this: palavra reservada que significa uma auto referencia para o objeto
         this.quantity += quantity;                       // ao usar estou sendo especifico que quero usar o atributo da classe.
    }

    public void removeProduct(int quantity){
        this.quantity -= quantity;
    }
}
