/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

/**
 *
 * @author Carmen_Lucia3
 */
public class Container {

    private double capacity;
    double volume;

    public Container(double tilavuus) {
        if (tilavuus > 0.0) {
            this.capacity = tilavuus;
        } 
        else {
            this.capacity = 0.0;
        }
        volume = 0.0;
    }

    public double getVolume() {
        return volume;
    }

    public double getOriginalCapacity() {
        return capacity;
    }

    public double getCurrentCapacity() {
        return capacity - volume;
    }

    public void addToTheContainer(double amount) {
        if (amount < 0) {
        }
        else if (amount <= getCurrentCapacity()) {
            volume = volume + amount;
        } 
        else {
            volume = capacity;
        }
    }

    public double takeFromTheContainer(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        else if (amount > volume) {
            double everything = volume;
            volume = 0.0;
            return everything;
        }
        volume = volume - amount;
        return amount;
    }

    @Override
    public String toString() {
        return "volume = " + volume + ", free space " + getCurrentCapacity();
    }
    
    

}

