package org.example;

import java.io.Console;
import java.util.*;


// to-dos:
// 1. enable user to remove a desired product

public class Main {
    public static ProductRepo productRepo = new ProductRepo();
    public static OrderRepoInterface orderRepo = new OrderListRepo();

    public static void main(String[] args) {
        System.out.println();
        System.out.println();

        // define products
        /*      ********************************************************      */
        Product product1 = new Product("p-201", "product-201");
        Product product2 = new Product("p-202", "product-202");
        Product product3 = new Product("p-301", "product-301");
        Product product4 = new Product("p-401", "product-401");
        Product product5 = new Product("p-407", "product-407");
        /*      ********************************************************      */


        // add products to the product repo
        /*      ********************************************************      */
        productRepo.addProduct(product1);
        productRepo.addProduct(product2);
        productRepo.addProduct(product3);
        productRepo.addProduct(product4);
        productRepo.addProduct(product5);
        productRepo.addProduct(new Product("test-id", "test-product"));
        /*      ********************************************************      */

        // create orders
        /*      ********************************************************      */
        Order order1 = new Order("o-1001",
                new ArrayList<Product>(Arrays.asList(product1, product2)));
        Order order2 = new Order("o-1002",
                new ArrayList<Product>(Arrays.asList(product5, product3)));
        Order order3 = new Order("o-1003",
                new ArrayList<Product>(Arrays.asList(product4, product2)));
        Order order4 = new Order("o-1004",
                new ArrayList<Product>(Arrays.asList(product2, product5)));
        /*      ********************************************************      */


        // get user selection
        /*      ********************************************************      */
        Scanner userInput = new Scanner(System.in);

        while(true) {
                    List<Product> productList = productRepo.getProducts();
            System.out.println("Please make a selection from the following list: ");
            System.out.println(
                    " 1. List all products\n" +
                    " 2. Add product\n" +
                    " 3. Remove product\n" +
                    " 4. Place, Change, or Remove an order \n" +
                    " 5. Quit \n\n" );
            System.out.print("Your input: ");

            String userSelection = userInput.nextLine().toLowerCase();

            switch (userSelection) {
                case "1":
                    // get all products - create productList from product repo
                    /*      ********************************************************      */

                    // get all products from the product repo
                    System.out.println("Available products: ");
                    for (Product product : productList) {
                        System.out.println(
                                "Product-ID: " + product.productId() + "  ---  Product Name: " + product.productName());
                    }
                    System.out.println();
                    break;
                    /*      ********************************************************      */
                case "2":
                    // add product to the product repo
                    System.out.println("\nPlease enter a 3 digits for the new product's ID: ");
                    String newProductId = "p-" + userInput.nextLine().substring(0,3);
                    System.out.println("\nEnter the name as well: ");
                    String newProductName = userInput.nextLine().substring(0,20);

                    Product newProduct = new Product(newProductId, newProductName);
                    productRepo.addProduct(newProduct);

                    System.out.println("\n Product added successfully. " +
                            "The updated product list: \n" + productList);
                    break;

                case  "3":
                    // remove product
                    /*      ********************************************************      */
                    boolean productRemoved = productRepo.removeProduct("test-id");
                    if (productRemoved) System.out.println("Product removed successfully.");
                    else System.out.println("Product couldn't be removed. Please check the given product ID.");
                    break;
                    /*      ********************************************************      */

                case "4":
                    // create an ShopService object and
                    // place an order
                    /*      ********************************************************      */
                    System.out.println();
                    ShopService shopService = new ShopService(orderRepo, productRepo);

                    shopService.createOrder(new ArrayList<>(List.of("p-202", "araba", "car")));
                    System.out.println(orderRepo.getAllOrders());
                    System.out.println();
                    /*      ********************************************************      */

                case "5": {
                    // quit from user selection
                    System.out.println("You have successfully quit from selection menu.");
                    return;
                }

                default:
                    System.out.println("A problem is occurred. Please try again.");
                    return;
            }

        }

        /*      ********************************************************      */

    }

    public Order makeOrder() {


        return null;
    }

}