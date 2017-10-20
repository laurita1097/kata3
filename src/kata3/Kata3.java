/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;


public class Kata3 {

    
    public static void main(String[] args) {
        Histogram histogram = new Histogram();
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("hotmail.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        histogram.increment("facebook.es");
        histogram.increment("ulpgc.es");
        new HistogramDisplay(histogram).execute();
    }
}
