package com.patikastore;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean isContinue = true;
		int choice = -1;
		int choiceSub = -1;
		ProductManager productManager = new ProductManager();
		
		while(true) {
			if(choice == -1) {
				System.out.println("PatikaStore �r�n Y�netim Paneli !");
				System.out.println("1- Notebook ��lemleri");
				System.out.println("2- Cep Telefonu ��lemleri");
				System.out.println("3- Markalar� Listele");
				System.out.println("0- ��k�� Yap");
				System.out.println("Tercihiniz: ");
				choice = sc.nextInt();
				
				if(choice<0 || choice>3){
	                   choice=-1;
	                   System.out.println("--------------");
	                   System.out.println("Hatal� ��lem");
	                   System.out.println("---------------");
	                   continue;
	            }
	            if(choice == 0){
	            	break;
	            }
			}
			
			if(choice==3){
                System.out.println("----\n Markalar�m�z\n----");
                for(Brand brand :Brand.getBrands()){
                    System.out.println(brand.getName());
                }
                break;
            }
            if(choice==1){
                System.out.println("Patika Store Notebook ��lemleri !");
                System.out.println("1 - Listele");
                System.out.println("2 - Ekle");
                System.out.println("3 - Sil");
                System.out.println("4 - Id ile Bul");
                System.out.println("5 - Marka ile Bul");
                System.out.println("0 - Ana Men�");
                System.out.print("Tercihiniz:");
                choiceSub=sc.nextInt();
                if(choiceSub==1){
                	productManager.listProductByCategory("Laptop");
                }
                if(choiceSub==2){
                    System.out.print("id:");
                   int id = sc.nextInt();
                }
                if(choiceSub==3){

                }
                if(choiceSub==5){

                }
                if(choiceSub==0){
                    choice=-1;
                    choiceSub=-1;
                    continue;
                }
            }
			
			
		}
		
	}
}
