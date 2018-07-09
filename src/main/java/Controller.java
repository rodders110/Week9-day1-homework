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
            String result = names.getList(1);
            HashMap<String, Object> model = new HashMap<String, Object>();
            model.put("result", result);
            model.put("template", "one.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/two", (req, res) -> {
            Randomiser names = new Randomiser();
            String result = names.getList(2);
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            model.put("template", "two.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/three", (req, res) -> {
            Randomiser names = new Randomiser();
            String result = names.getList(3);
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            model.put("template", "two.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/four", (req, res) -> {
            Randomiser names = new Randomiser();
            String result = names.getList(4);
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            model.put("template", "two.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/five", (req, res) -> {
            Randomiser names = new Randomiser();
            String result = names.getList(5);
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            model.put("template", "two.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/six", (req, res) -> {
            Randomiser names = new Randomiser();
            String result = names.getList(6);
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            model.put("template", "two.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/seven", (req, res) -> {
            Randomiser names = new Randomiser();
            String result = names.getList(7);
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            model.put("template", "two.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/eight", (req, res) -> {
            Randomiser names = new Randomiser();
            String result = names.getList(8);
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            model.put("template", "two.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);
    }

}
