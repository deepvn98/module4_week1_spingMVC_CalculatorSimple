package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Calculator {
    @GetMapping("Calculator")
    public String calculator(){
        return "calculator";
    }

    @PostMapping("Calculator")
    public ModelAndView getResult(@RequestParam("numberone")double number1,
                                 @RequestParam("numbertwo")double number2,
                                 @RequestParam("select")String operator){
        ModelAndView modelAndView = new ModelAndView("calculator");
        double result = 0;
        if (operator.equals("+")){
            result = number1 +number2;
            modelAndView.addObject("result",result);
            return modelAndView;
        }else
            if(operator.equals("-")){
                result = number1 - number2;
                modelAndView.addObject("result",result);
                return modelAndView;
            }else
            if(operator.equals("*")) {
                result = number1 * number2;
                modelAndView.addObject("result", result);
                return modelAndView;
            }else{
                result = number1 / number2;
                modelAndView.addObject("result", result);
                return modelAndView;
            }
    }
}
