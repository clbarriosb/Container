/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Carmen_Lucia3
 */
public class ContainerHistory {

    private ArrayList<Double> object;

    public ContainerHistory() {
        this.object = new ArrayList<>();
    }

    public void add(double situation) {
        this.object.add(situation);
    }

    public void reset() {
        this.object.clear();
    }

    @Override
    public String toString() {
        return this.object.toString();
    }

    public double maxValue() {
        return Collections.max(this.object);
    }

    public double minValue() {
        return Collections.min(this.object);
    }

    public double average() {
        double counter = 0;
        for (double objec : this.object) {
            counter += objec;
        }

        if (counter == 0) {
            return 0;
        } else {
            return counter / this.object.size();
        }

    }
    
    public double greatestFluctuation() {
        double maxFluctuation = 0;
        ArrayList<Double> maxFluctuate = new ArrayList<>();
        if (this.object.isEmpty() || this.object.size() == 1) {
            return maxFluctuation;
        } 
        else {
            for (int i = 0; i < this.object.size(); i++) {
                if (i != this.object.size() - 1) {
                    double firstNumber = this.object.get(i);
                    double secondNumber = this.object.get(i + 1);
                    maxFluctuation = secondNumber - firstNumber;
                    maxFluctuate.add(Math.abs(maxFluctuation));
                }  else {
                   double firstNumber = this.object.get(i - 1);
                    double secondNumber = this.object.get(i);
                    maxFluctuation = secondNumber - firstNumber;
                    maxFluctuate.add(Math.abs(maxFluctuation));
                }
            }
        }
        return Math.abs(Collections.max(maxFluctuate));
    }
    
    /*
    public double greatestFluctuation() {
       return maxValue() - Math.abs(minValue());
    }*/
    
    public double variance () {
        double variance = 0;
        double average=average();
        if (this.object.isEmpty() || this.object.size() == 1) {
            return 0;
        } 
        else {
            for (double objec : this.object) {
            variance += Math.pow((objec- average),2);
            }
            return variance / (object.size()-1);
        }
    }
    
}
