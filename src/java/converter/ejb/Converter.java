/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter.ejb;

import javax.ejb.Remote;

/**
 *
 * @author nguye
 */
@Remote
public interface Converter {
    public double cToF(double c);
    public double fToC(double f);
}
