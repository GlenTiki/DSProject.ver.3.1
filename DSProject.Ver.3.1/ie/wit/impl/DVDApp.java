package ie.wit.impl;


import ie.wit.abs.Device;
import ie.wit.io.FileHandler;

import java.util.ArrayList;
import java.util.List;

public class DVDApp
{
 
	
   public static void main( String args[] )
   {

	   int option;
	   
	   DVDManager manager = new DVDManager();
	   do {
	   option = manager.menuMain();
	   
	   	switch(option)
	   		{
	   	case 1  : manager.menuAddDevice();
	   			  break;
	   	case 2  : manager.menuPlayDevice();
	   			  break;
	   	case 3  : manager.menuListDevices();
	   		      break;		 
	   	case 4  : manager.writeToFile();
	   		      break;		
	   	default : break;
	   		}
	   } while(option != 4);
   } 			
}


