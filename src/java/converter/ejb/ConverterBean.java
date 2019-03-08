/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author nguye
 */
@Stateless
public class ConverterBean implements Converter{

    @Override
    public double cToF(double c) {
      return c * 9/5 + 32;
    }

    @Override
    public double fToC(double f) {
        return (f - 32) * 5/9;
    }
    
}
