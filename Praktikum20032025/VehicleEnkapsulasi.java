/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum20032025;

/**
 *
 * @author Asus
 */
public class VehicleEnkapsulasi {
    private double load;
    private double maxLoad;
    
    public VehicleEnkapsulasi(double maxLoad){
        this.maxLoad = maxLoad;
    }
    public VehicleEnkapsulasi (){
        
    }
    public double getLoad(){
        return load;
    }
    public double getMaxLoad(){
        return maxLoad;
    }
    public void setMaxLoad(double maxLoad){
        this.maxLoad = maxLoad;
    }
    public boolean addBox(double weight){
        double temp = load+weight;
        if(temp<=maxLoad){
            this.load = temp;
            return true;
        }
        else // temp>maxLoad
            return false;
        //endif
    }
}
