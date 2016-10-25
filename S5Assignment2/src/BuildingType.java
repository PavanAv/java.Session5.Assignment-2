public class BuildingType {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Building bd = new Building(); 		
bd.showDetails("Building's Default Values");				
Bunglow bglow = new Bunglow(0, 6, 5, " Mahal", true);		
System.out.println();		
bglow.showDetails("BUNGLOW");				
LowRiseBuilding lrbd = new LowRiseBuilding(3, 3, 2, "Red Ville Low Rise", true, false);		
System.out.println(); 		
lrbd.showDetails("Low Rise Building");				
MidRiseBuilding mrbd = new MidRiseBuilding(10, 3, 3, "Blue Ville Mid Rise", true, true, 2, false);		
System.out.println(); 		
mrbd.showDetails("Mid Rise Building");				
HighRiseBuilding hrbd = new HighRiseBuilding(30, 5, 5, "Green Ville High Rise", true, true, 4, true, true);		
System.out.println(); 		
hrbd.showDetails("High Rise Building");	
}
}
