package com.methodusingobject;

public class GreensTech 
{
	public void greensOmr() 
	{
	System.out.println("OMR Address : No.19, Balamurugan Garden, OMR Road, Thoraipakkam, Kancheepuram (DT)\n");
	}
	public void greensAdayar() 
	{
	System.out.println("Adayar Address : No.11, First Street,Padmanabha Nagar,Adyar, Chennai-600 020\n");
	}
	public void greensTambaram() 
	{
	System.out.println("Tambaram Address : No.1, Appa Rao colony, Tambaram,Sanatorium, Chennai - 600047\n");
	}
	public void greensporur() 
	{
	System.out.println("Porur Address : No.149, 1C/1D, 1st Floor, Opp to DLF IT Park, Ramapuram, Chennai - 600089.\n");
	}
	public void greensnavalur() 
	{
	System.out.println("Navalur Address : No 12, Rajiv Gandhi Salai, (OMR), Egattur Village, Navalur,(Just Before Navalur Tollgate), Chennai-600 035.\n");
	}
	public void greensperumbakkam() {
	System.out.println("Perumbakkam Address : 1st Floor, Plot No. 19 & 20, American Advent Christian Layout, Sholinganallur to Medavakkam Main Road, Perumbakkam, (next to OMR food street ), Chennai-600 100.\n");
	}
	public static void main(String[] args) {
		GreensTech address = new GreensTech();
		System.out.println("Greens technologies Branches :\n");
		address.greensAdayar();
		address.greensnavalur();
		address.greensOmr();
		address.greensperumbakkam();
		address.greensporur();
		address.greensTambaram();
	}	
}

