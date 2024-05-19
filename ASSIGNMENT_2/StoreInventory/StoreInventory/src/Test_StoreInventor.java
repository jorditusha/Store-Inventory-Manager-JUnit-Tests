

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class Test_StoreInventor {

	@Test
	void test1_normalCaseTest() {
		//setting items list
		StoreInventoryManager storeinventory = new StoreInventoryManager(null);
		StoreInventoryManager.Item[] listItem = new StoreInventoryManager.Item[2]; 
		
		//setting item		
		StoreInventoryManager.Item item1 = storeinventory.new Item("glass",4,30); //name, sellIn, quality
		listItem[0]=item1;
		StoreInventoryManager.Item item1_expected = storeinventory.new Item("glass",3,29);		
		
		StoreInventoryManager.Item item2 = storeinventory.new Item("cup",0,30); //name, sellIn, quality
		listItem[1]=item2;
		StoreInventoryManager.Item item2_expected = storeinventory.new Item("cup",-1,28);		
		
		//setting manager and end-day
		StoreInventoryManager storeMgr = new StoreInventoryManager(listItem);
		storeMgr.updateQuality();		
		
		//Checking result
		StoreInventoryManager.Item[] listItemResult = storeMgr.getItems();
		assertEquals(listItemResult[0].quality,item1_expected.quality);
		assertEquals(listItemResult[0].sellIn,item1_expected.sellIn);
		
		assertEquals(listItemResult[1].quality,item2_expected.quality);
		assertEquals(listItemResult[1].sellIn,item2_expected.sellIn);
		
		//Check toString
		String string1= item1_expected.toString();
		String string2= listItemResult[0].toString();
		assertEquals(string1,string2);
		
		String string3= "glass, 3, 29";
		assertEquals(string3,string1);
		assertEquals(string3,string2);
		}

	
	
	@Test
	void test2_cheeseOrGorguefort() {
		//setting items list
		StoreInventoryManager storeinventory = new StoreInventoryManager(null);
		StoreInventoryManager.Item[] listItem = new StoreInventoryManager.Item[3]; 
		
		//setting item		
		StoreInventoryManager.Item item1 = storeinventory.new Item("Gorquefort",4,40); //name, sellIn, quality
		listItem[0]=item1;
		StoreInventoryManager.Item item1_expected = storeinventory.new Item("Gorquefort",3,41);		
		
		StoreInventoryManager.Item item2 = storeinventory.new Item("Gorquefort",1,31); //name, sellIn, quality
		listItem[1]=item2;
		StoreInventoryManager.Item item2_expected = storeinventory.new Item("Gorquefort",0,32);			
		
		//___________________Missing in specification ______________________________
		StoreInventoryManager.Item item3 = storeinventory.new Item("Gorquefort",-3,34); //name, sellIn, quality
		listItem[2]=item3;
		StoreInventoryManager.Item item3_expected = storeinventory.new Item("Gorquefort",-4,36);			
		
		//setting manager and end-day
		StoreInventoryManager storeMgr = new StoreInventoryManager(listItem);
		storeMgr.updateQuality();		
		
		//Checking result
		StoreInventoryManager.Item[] listItemResult = storeMgr.getItems();
		assertEquals(listItemResult[0].quality,item1_expected.quality);
		assertEquals(listItemResult[0].sellIn,item1_expected.sellIn);
		
		assertEquals(listItemResult[1].quality,item2_expected.quality);
		assertEquals(listItemResult[1].sellIn,item2_expected.sellIn);		

		assertEquals(item3_expected.quality,listItemResult[2].quality);
		assertEquals(item3_expected.sellIn,listItemResult[2].sellIn);
		}
	
	
	
	@Test
	void test3_excaliburName() {
		//setting items list
		StoreInventoryManager storeinventory = new StoreInventoryManager(null);
		StoreInventoryManager.Item[] listItem = new StoreInventoryManager.Item[3]; 
		
		//setting item		
		StoreInventoryManager.Item item1 = storeinventory.new Item("Excalibur",5,30); //name, sellIn, quality
		listItem[0]=item1;
		StoreInventoryManager.Item item1_expected = storeinventory.new Item("Excalibur",5,30);		
		
		StoreInventoryManager.Item item2 = storeinventory.new Item("Excalibur",3,47); //name, sellIn, quality
		listItem[1]=item2;
		StoreInventoryManager.Item item2_expected = storeinventory.new Item("Excalibur",3,47);			
		

		StoreInventoryManager.Item item3 = storeinventory.new Item("Excalibur",-2,60); //name, sellIn, quality
		listItem[2]=item3;
		StoreInventoryManager.Item item3_expected = storeinventory.new Item("Excalibur",-2,60);			
		
		//setting manager and end-day
		StoreInventoryManager storeMgr = new StoreInventoryManager(listItem);
		storeMgr.updateQuality();		
		
		//Checking result
		StoreInventoryManager.Item[] listItemResult = storeMgr.getItems();
		assertEquals(item1_expected.quality,listItemResult[0].quality);
		assertEquals(item1_expected.sellIn,listItemResult[0].sellIn);
		
		assertEquals(item2_expected.quality,listItemResult[1].quality);
		assertEquals(item2_expected.sellIn,listItemResult[1].sellIn);
		

		assertEquals(item3_expected.quality,listItemResult[2].quality);
		assertEquals(item3_expected.sellIn,listItemResult[2].sellIn);		
		}
	
	
	
	//"Concert Tickets to Aurumback show"
	
	@Test
	void test4_concertTicketsAurumbackShow() {
		//setting items list
		StoreInventoryManager storeinventory = new StoreInventoryManager(null);
		StoreInventoryManager.Item[] listItem = new StoreInventoryManager.Item[8]; 
		
		//setting item		
		StoreInventoryManager.Item item1 = storeinventory.new Item("Concert Tickets to Aurumback show",9,20); //name, sellIn, quality
		listItem[0]=item1;
		StoreInventoryManager.Item item1_result = storeinventory.new Item("Concert Tickets to Aurumback show",8,22);		
		
		StoreInventoryManager.Item item2 = storeinventory.new Item("Concert Tickets to Aurumback show",4,17); //name, sellIn, quality
		listItem[1]=item2;
		StoreInventoryManager.Item item2_result = storeinventory.new Item("Concert Tickets to Aurumback show",3,20);		
		
		StoreInventoryManager.Item item3 = storeinventory.new Item("Concert Tickets to Aurumback show",2,10); //name, sellIn, quality
		listItem[2]=item3;
		StoreInventoryManager.Item item3_result = storeinventory.new Item("Concert Tickets to Aurumback show",1,13);
		
		StoreInventoryManager.Item item4 = storeinventory.new Item("Concert Tickets to Aurumback show",0,28); //name, sellIn, quality
		listItem[3]=item4;
		StoreInventoryManager.Item item4_result = storeinventory.new Item("Concert Tickets to Aurumback show",-1,0);
		

		StoreInventoryManager.Item item5 = storeinventory.new Item("Concert Tickets to Aurumback show",10,47); //name, sellIn, quality
		listItem[4]=item5;
		StoreInventoryManager.Item item5_result = storeinventory.new Item("Concert Tickets to Aurumback show",9,49);
		

		StoreInventoryManager.Item item6 = storeinventory.new Item("Concert Tickets to Aurumback show",0,49); //name, sellIn, quality
		listItem[5]=item6;
		StoreInventoryManager.Item item6_result = storeinventory.new Item("Concert Tickets to Aurumback show",-1,0);		

		StoreInventoryManager.Item item7 = storeinventory.new Item("Concert Tickets to Aurumback show",5,29); //name, sellIn, quality
		listItem[6]=item7;
		StoreInventoryManager.Item item7_result = storeinventory.new Item("Concert Tickets to Aurumback show",4,32);
		

		StoreInventoryManager.Item item8 = storeinventory.new Item("Concert Tickets to Aurumback show",1,28); //name, sellIn, quality
		listItem[7]=item8;
		StoreInventoryManager.Item item8_result = storeinventory.new Item("Concert Tickets to Aurumback show",0,31);
		
		
		//setting manager and end-day
		StoreInventoryManager storeMgr = new StoreInventoryManager(listItem);
		storeMgr.updateQuality();		
		
		//Checking result
		StoreInventoryManager.Item[] listItemResult = storeMgr.getItems();
		assertEquals(item1_result.quality,listItemResult[0].quality);
		assertEquals(item1_result.sellIn,listItemResult[0].sellIn);
		
		assertEquals(item2_result.quality, listItemResult[1].quality);
		assertEquals(item2_result.sellIn,listItemResult[1].sellIn);		//expected 9 but was8

		assertEquals(item3_result.quality,listItemResult[2].quality);
		assertEquals(item3_result.sellIn,listItemResult[2].sellIn);		

		assertEquals(item4_result.quality,listItemResult[3].quality);
		assertEquals(item4_result.sellIn,listItemResult[3].sellIn);		

		assertEquals(item5_result.quality,listItemResult[4].quality);
		assertEquals(item5_result.sellIn,listItemResult[4].sellIn);

		assertEquals(item6_result.quality,listItemResult[5].quality);
		assertEquals(item6_result.sellIn,listItemResult[5].sellIn);		

		assertEquals(item7_result.quality,listItemResult[6].quality);
		assertEquals(item7_result.sellIn,listItemResult[6].sellIn);

		assertEquals(item8_result.quality,listItemResult[7].quality);
		assertEquals(item8_result.sellIn,listItemResult[7].sellIn);
		}
	

	
	@Test
	void test5_limitValues() {
		//setting items list
		StoreInventoryManager storeinventory = new StoreInventoryManager(null);
		StoreInventoryManager.Item[] listItem = new StoreInventoryManager.Item[1]; 
		
		//setting item		
		StoreInventoryManager.Item item1 = storeinventory.new Item("cook",0,0); //name, sellIn, quality
		listItem[0]=item1;
		StoreInventoryManager.Item item1_expected = storeinventory.new Item("cook",-1,0);		

		//setting manager and end-day
		StoreInventoryManager storeMgr = new StoreInventoryManager(listItem);
		storeMgr.updateQuality();		
		
		//Checking result
		StoreInventoryManager.Item[] listItemResult = storeMgr.getItems();
		assertEquals(item1_expected.quality,listItemResult[0].quality);
		assertEquals(item1_expected.sellIn,listItemResult[0].sellIn);
		
		}

}
