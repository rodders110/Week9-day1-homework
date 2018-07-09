import models.Randomiser;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;

import static spark.Spark.get;

public class Controller {

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        get("/one", (req, res) -> {
            Randomiser names = new Randomiser();
            String result = names.getOne();
            HashMap<String, Object> model = new HashMap<String, Object>();
            model.put("result", result);
            model.put("template", "one.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/two", (req, res) -> {
            Randomiser names = new Randomiser();
            String result = names.getTwo();
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            model.put("template", "two.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);
    }

}
