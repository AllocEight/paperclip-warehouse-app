package controllers;

import model.Product;
import views.html.products.list;
import play.mvc.*;//* is Wild card - This will take all in play.mvc
import play.mvc.Controller;
import play.mvc.Result;
import play.data.Form;
//import views.html.products.details;
import java.util.List;


public class Products extends Controller {
   public static Result list(){
        List<Product> products = Product.findAll();

       return ok(list.render(products));
   }
    public static Result newProduct(){
        return TODO;
    }
    public static Result details(String ean){
        return TODO;
    }
    public static Result save(){
        return TODO;
    }
}

