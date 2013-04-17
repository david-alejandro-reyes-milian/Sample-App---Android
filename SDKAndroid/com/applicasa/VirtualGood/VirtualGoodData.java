package com.applicasa.VirtualGood;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import applicasa.LiCore.LiField;
import applicasa.LiJson.LiJSONObject;

import com.applicasa.VirtualGoodCategory.VirtualGoodCategory;

public class VirtualGoodData {


	protected static Map<String, LiFieldVirtualGood> stringMap = new HashMap<String, LiFieldVirtualGood>();
	LiJSONObject incrementedFields = new LiJSONObject();
	public static boolean EnableOffline = true;
	public enum LiFieldVirtualGood implements LiField
	{
		VirtualGood_None
	, VirtualGoodID
	, VirtualGoodTitle
	, VirtualGoodDescription
	, VirtualGoodMainCurrency
	, VirtualGoodSecondaryCurrency
	, VirtualGoodRelatedVirtualGood
	, VirtualGoodPos
	, VirtualGoodQuantity
	, VirtualGoodMaxForUser
	, VirtualGoodUserInventory
	, VirtualGoodImageA
	, VirtualGoodImageB
	, VirtualGoodImageC
	, VirtualGoodIsDeal
	, VirtualGoodConsumable
	, VirtualGoodLastUpdate
	, VirtualGoodMainCategory

	;

		private LiFieldVirtualGood() {
			stringMap.put(this.toString(), this);
		}

		public static LiFieldVirtualGood getLiFieldVirtualGood(String key) {
			return stringMap.get(key);
	}
	}

	protected static Map<String, Object > virtualGoodCallbacks = new HashMap<String, Object>();
	//Class Name 
	public final static String kClassName                =  "VirtualGood";
	
	////
	//// Class fields name - Static Fields
	////
	////
	////
		public String VirtualGoodID;
	
		public String VirtualGoodTitle;
	
		public String VirtualGoodDescription;
	
		public int VirtualGoodMainCurrency;
	
		public int VirtualGoodSecondaryCurrency;
	
		public String VirtualGoodRelatedVirtualGood;
	
		public int VirtualGoodPos;
	
		public int VirtualGoodQuantity;
	
		public int VirtualGoodMaxForUser;
	
		public int VirtualGoodUserInventory;
	
		public String VirtualGoodImageA;
	
		public String VirtualGoodImageB;
	
		public String VirtualGoodImageC;
	
		public Boolean VirtualGoodIsDeal;
	
		public Boolean VirtualGoodConsumable;
	
		public GregorianCalendar VirtualGoodLastUpdate;
	
		public VirtualGoodCategory VirtualGoodMainCategory;
	
		public String getVirtualGoodID() {
			return VirtualGoodID;
		}
		
		public void setVirtualGoodID(String VirtualGoodID) {
			this.VirtualGoodID = VirtualGoodID;
		}
		
		public String getVirtualGoodTitle() {
			return VirtualGoodTitle;
		}
		
		public void setVirtualGoodTitle(String VirtualGoodTitle) {
			this.VirtualGoodTitle = VirtualGoodTitle;
		}
		
		public String getVirtualGoodDescription() {
			return VirtualGoodDescription;
		}
		
		public void setVirtualGoodDescription(String VirtualGoodDescription) {
			this.VirtualGoodDescription = VirtualGoodDescription;
		}
		
		public int getVirtualGoodMainCurrency() {
			return VirtualGoodMainCurrency;
		}
		
		public void setVirtualGoodMainCurrency(int VirtualGoodMainCurrency) {
			this.VirtualGoodMainCurrency = VirtualGoodMainCurrency;
		}
		
		public int getVirtualGoodSecondaryCurrency() {
			return VirtualGoodSecondaryCurrency;
		}
		
		public void setVirtualGoodSecondaryCurrency(int VirtualGoodSecondaryCurrency) {
			this.VirtualGoodSecondaryCurrency = VirtualGoodSecondaryCurrency;
		}
		
		public String getVirtualGoodRelatedVirtualGood() {
			return VirtualGoodRelatedVirtualGood;
		}
		
		public void setVirtualGoodRelatedVirtualGood(String VirtualGoodRelatedVirtualGood) {
			this.VirtualGoodRelatedVirtualGood = VirtualGoodRelatedVirtualGood;
		}
		
		public int getVirtualGoodPos() {
			return VirtualGoodPos;
		}
		
		public void setVirtualGoodPos(int VirtualGoodPos) {
			this.VirtualGoodPos = VirtualGoodPos;
		}
		
		public int getVirtualGoodQuantity() {
			return VirtualGoodQuantity;
		}
		
		public void setVirtualGoodQuantity(int VirtualGoodQuantity) {
			this.VirtualGoodQuantity = VirtualGoodQuantity;
		}
		
		public int getVirtualGoodMaxForUser() {
			return VirtualGoodMaxForUser;
		}
		
		public void setVirtualGoodMaxForUser(int VirtualGoodMaxForUser) {
			this.VirtualGoodMaxForUser = VirtualGoodMaxForUser;
		}
		
		public int getVirtualGoodUserInventory() {
			return VirtualGoodUserInventory;
		}
		
		public void setVirtualGoodUserInventory(int VirtualGoodUserInventory) {
			this.VirtualGoodUserInventory = VirtualGoodUserInventory;
		}
		
		public String getVirtualGoodImageA() {
			return VirtualGoodImageA;
		}
		
		public void setVirtualGoodImageA(String VirtualGoodImageA) {
			this.VirtualGoodImageA = VirtualGoodImageA;
		}
		
		public String getVirtualGoodImageB() {
			return VirtualGoodImageB;
		}
		
		public void setVirtualGoodImageB(String VirtualGoodImageB) {
			this.VirtualGoodImageB = VirtualGoodImageB;
		}
		
		public String getVirtualGoodImageC() {
			return VirtualGoodImageC;
		}
		
		public void setVirtualGoodImageC(String VirtualGoodImageC) {
			this.VirtualGoodImageC = VirtualGoodImageC;
		}
		
		public Boolean getVirtualGoodIsDeal() {
			return VirtualGoodIsDeal;
		}
		
		public void setVirtualGoodIsDeal(Boolean VirtualGoodIsDeal) {
			this.VirtualGoodIsDeal = VirtualGoodIsDeal;
		}
		
		public Boolean getVirtualGoodConsumable() {
			return VirtualGoodConsumable;
		}
		
		public void setVirtualGoodConsumable(Boolean VirtualGoodConsumable) {
			this.VirtualGoodConsumable = VirtualGoodConsumable;
		}
		
		public GregorianCalendar getVirtualGoodLastUpdate() {
			return VirtualGoodLastUpdate;
		}
		
		public void setVirtualGoodLastUpdate(GregorianCalendar VirtualGoodLastUpdate) {
			this.VirtualGoodLastUpdate = VirtualGoodLastUpdate;
		}
		
		public VirtualGoodCategory getVirtualGoodMainCategory() {
			return VirtualGoodMainCategory;
		}
		
		public void setVirtualGoodMainCategory(VirtualGoodCategory VirtualGoodMainCategory) {
			this.VirtualGoodMainCategory = VirtualGoodMainCategory;
		}
		
		public static String getVirtualGoodSortField(VirtualGoodData.LiFieldVirtualGood field)
		{
			return field.toString();
		}
	public Object getVirtualGoodFieldbySortType(VirtualGoodData.LiFieldVirtualGood field)
	{
		switch (field){
			case VirtualGood_None:
				return VirtualGoodID;
				
			case VirtualGoodID:
				return VirtualGoodID;
				
			case VirtualGoodTitle:
				return VirtualGoodTitle;
				
			case VirtualGoodDescription:
				return VirtualGoodDescription;
				
			case VirtualGoodMainCurrency:
				return VirtualGoodMainCurrency;
				
			case VirtualGoodSecondaryCurrency:
				return VirtualGoodSecondaryCurrency;
				
			case VirtualGoodRelatedVirtualGood:
				return VirtualGoodRelatedVirtualGood;
				
			case VirtualGoodPos:
				return VirtualGoodPos;
				
			case VirtualGoodQuantity:
				return VirtualGoodQuantity;
				
			case VirtualGoodMaxForUser:
				return VirtualGoodMaxForUser;
				
			case VirtualGoodUserInventory:
				return VirtualGoodUserInventory;
				
			case VirtualGoodImageA:
				return VirtualGoodImageA;
				
			case VirtualGoodImageB:
				return VirtualGoodImageB;
				
			case VirtualGoodImageC:
				return VirtualGoodImageC;
				
			case VirtualGoodIsDeal:
					return VirtualGoodIsDeal;
					
			case VirtualGoodConsumable:
					return VirtualGoodConsumable;
					
			case VirtualGoodLastUpdate:
				return VirtualGoodLastUpdate;
				
			case VirtualGoodMainCategory:
				return VirtualGoodMainCategory.VirtualGoodCategoryID;
				
			default:
				return "";
		}
		
	}
	
	protected boolean setVirtualGoodFieldbySortType(VirtualGoodData.LiFieldVirtualGood field, Object value)
	{
		switch (field){
			case VirtualGood_None:
				break;
				
			case VirtualGoodID:
					VirtualGoodID = (String)value;
					break;
					
			case VirtualGoodTitle:
					VirtualGoodTitle = (String)value;
					break;
					
			case VirtualGoodDescription:
					VirtualGoodDescription = (String)value;
					break;
					
			case VirtualGoodMainCurrency:
					VirtualGoodMainCurrency = (Integer)value;
					break;
					
			case VirtualGoodSecondaryCurrency:
					VirtualGoodSecondaryCurrency = (Integer)value;
					break;
					
			case VirtualGoodRelatedVirtualGood:
					VirtualGoodRelatedVirtualGood = (String)value;
					break;
					
			case VirtualGoodPos:
					VirtualGoodPos = (Integer)value;
					break;
					
			case VirtualGoodQuantity:
					VirtualGoodQuantity = (Integer)value;
					break;
					
			case VirtualGoodMaxForUser:
					VirtualGoodMaxForUser = (Integer)value;
					break;
					
			case VirtualGoodUserInventory:
					VirtualGoodUserInventory = (Integer)value;
					break;
					
			case VirtualGoodImageA:
					VirtualGoodImageA = (String)value;
					break;
					
			case VirtualGoodImageB:
					VirtualGoodImageB = (String)value;
					break;
					
			case VirtualGoodImageC:
					VirtualGoodImageC = (String)value;
					break;
					
			case VirtualGoodIsDeal:
					VirtualGoodIsDeal = (Boolean)value;
					break;
					
			case VirtualGoodConsumable:
					VirtualGoodConsumable = (Boolean)value;
					break;
					
			case VirtualGoodLastUpdate:
					VirtualGoodLastUpdate = (GregorianCalendar)value;
					break;
				
			case VirtualGoodMainCategory:
					VirtualGoodMainCategory =  new VirtualGoodCategory((String)value);
					break;
					
			default:
				break;
		}
		return true;
	}
}
