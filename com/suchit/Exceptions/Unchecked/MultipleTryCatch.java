package com.suchit.Exceptions.Unchecked;
class MultipleTryCatch{

    public void productDetails(){
        try {
            String nameOfTheProduct = null;
            System.out.println(nameOfTheProduct.length());
            int pricePerProduct = 100 / 0;
        }
        catch(NullPointerException e){
            System.out.println("product name should be mentioned"+e);
        }
        catch(ArithmeticException e){
            System.out.println("price should be calculated with atleast 1 product"+e);
        }
        finally{
            System.out.println("product details");
        }

    }
}
