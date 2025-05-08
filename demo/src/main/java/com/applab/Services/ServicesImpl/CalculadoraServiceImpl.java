package com.applab.Services.ServicesImpl;

import org.springframework.stereotype.Service;

import com.applab.Services.CalculadoraService;

@Service
public class CalculadoraServiceImpl implements CalculadoraService{

    @Override
    public double calcular(double a, double b, String operacion){

        double resultado = 0.0;

        switch(operacion){

            case "suma": resultado = a+b;
            break;
            
            case "resta": resultado = a-b;
            break;
            
            case "multi": resultado = a*b;
            break;

            case "divi" : resultado = a/b;
            break;

            default:;
            break;
            

        }

        return resultado;

    }
}
