package controllers;

import model.Product;
import views.html.products.list;
import play.mvc.*;//* is Wild card - This will take all in play.mvc
import play.mvc.Controller;
import play.mvc.Result;
import play.data.Form;
import views.html.products.details;
import java.util.List;


public class Products extends Controller {

    private static final Form<model.Product> productForm = Form.form(model.Product.class);

   public static Result list(){
        List<Product> products = Product.findAll();

       return ok(list.render(products));
   }
    public static Result newProduct(){
        return ok(details.render(productForm));
    }

    public static Result details(String EAN){
        return TODO;
    }

    public static Result save(){
        Form<Product> boundForm = productForm.bindFromRequest();
        Product product = boundForm.get();
        product.save();
        return ok(String.format("Saved product %s", product));
    }

}

