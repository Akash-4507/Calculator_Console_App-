package controller;

import service.CalculatorService;
import view.CalculatorView;

public class CalculatorController {
    CalculatorView view;
    CalculatorService service;
    public CalculatorController(CalculatorService service, CalculatorView view) {
        this.view = view;
        this.service = service;
    }

    public void run() {
        while(true) {
            int choice=view.getChoice();
            if(choice==5){
                view.getExit();
                break;
            }
            double num1=view.getNumber("First Number");
            double num2=view.getNumber("Second Number");
            double result=0;
            switch(choice){
                case 1:
                    result=service.getAdd(num1,num2);
                    break;
                case 2:
                    result=service.getSubtract(num1,num2);
                    break;
                case 3:
                    result=service.getMultiply(num1,num2);
                    break;
                case 4:
                    if(num2==0){
                        view.getError("Number 2 will not be zero");
                        continue;
                    }
                    result=service.getDivide(num1,num2);
                    break;
                default:
                    view.getError("Wrong choice");
                    break;
            }
            view.showResult(result);
        }
    }
}
