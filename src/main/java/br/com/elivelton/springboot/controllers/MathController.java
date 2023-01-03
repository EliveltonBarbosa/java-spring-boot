package br.com.elivelton.springboot.controllers;

//import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.elivelton.springboot.converters.NumberConverter;
import br.com.elivelton.springboot.exceptions.UnsupportedMathOperationException;
import br.com.elivelton.springboot.math.SimpleMath;


@RestController
public class MathController {

    private SimpleMath math = new SimpleMath();
    
    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double sum(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
            
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please set a numeric value.");
        }

        return math.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));        
    }
    
    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double sub(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
            
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please set a numeric value.");
        }

        return math.sub(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));        
    }
    
    @RequestMapping(value = "/multi/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double multi(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
            
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please set a numeric value.");
        }

        return math.multi(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));        
    }
    
    @RequestMapping(value = "/div/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double div(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
            
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please set a numeric value.");
        }

        return math.div(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));        
    }
    
    @RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double mean(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
            
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please set a numeric value.");
        }

        return math.mean(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));        
    }
    
    @RequestMapping(value = "/sqr/{number}", method=RequestMethod.GET)
    public Double sqr(@PathVariable(value = "number") String number) throws Exception {
            
        if(!NumberConverter.isNumeric(number)){
            throw new UnsupportedMathOperationException("Please set a numeric value.");
        }

        return math.sqr(NumberConverter.convertToDouble(number));        
    }
 
}