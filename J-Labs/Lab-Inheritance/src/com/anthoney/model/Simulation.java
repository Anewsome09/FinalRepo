package com.anthoney.model;

public class Simulation {
	
    public static void main(String[] args){
        FlyingVehicle fv = new FlyingVehicle((short)2, new Engine());
        
        
        fv.setName("New Flying Vehicle");
        System.out.println(fv.getName());
        
        Airplane boeing = new Airplane((short)3, (short)4);
        boeing.move(20);
        
    }

}
