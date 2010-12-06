package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void somar(int num1, int num2) {
    	int soma = num1 + num2;
    	renderText("A soma dos numeros é: " + soma);
    }
    
    public static void tabuada(int numero) {
    	String tabuada = "";
    	for (int i = 0; i <= 10; i++) {
			tabuada += i + " x " + numero + " = " + numero * i;
			tabuada += "\n";
		}
    	
    	renderText(tabuada);
    }

}