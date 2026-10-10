package com.vineeth;

import java.util.ArrayList;
import java.util.Scanner;
public class Shop {
    ArrayList<Product> availableItems= new ArrayList<>();
    Cart c = new Cart();
    User user;

    Shop(User user){
        this.user = user;
        availableItems.add(new Product(1,"T-shirt","Wearables",599,10));
        availableItems.add(new Product(2,"Pants","Wearables",299,10));
        availableItems.add(new Product(3,"Apple Watch series 11","Wearables",3000,10));
        availableItems.add(new Product(4,"IPhone 15","Tech",100000,10));
        availableItems.add(new Product(5,"Lenovo ideapad 15","Tech",60000,10));
        availableItems.add(new Product(6,"Boat Earphones","Tech",799,10));
    }

    public Product searchProductById(int id){
        for (Product p:availableItems){
            if (p.getId()==id){
                return p;
            }
        }
        System.out.println("Product with that id doesnt exist");
        return null;
    }

    public void displayProducts(){
        System.out.println("------Available Products--------");
        for (Product p:availableItems){
            System.out.println(p);
        }
    }

    public void displayCart(){
        c.cartItems();
    }

    public void addToCart(int id){
        Product item = searchProductById(id);
        if (item == null){
            System.out.println("Product not found");
            return;
        }
        c.addItem(item);
    }

    public void checkout(){
        float total;
        Scanner sc = new Scanner(System.in);
        char choice;
        System.out.println("Ready to complete your order? Review your items below and proceed to payment.");
        displayCart();
        System.out.println("Proceed to payment?(y/n): ");
        choice = sc.next().toLowerCase().charAt(0);
        switch (choice){
            case 'y':
                total = c.calcTotalPrice();
                if (user.getBalance()<total){
                    System.out.println("Not enough Balance");
                    break;
                }else{
                    user.setBalance(user.getBalance()-total);
                    c.clearItems();
                    break;
                }
        }

    }
}
