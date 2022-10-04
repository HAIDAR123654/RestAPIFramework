// this is optional basic not optimized. for that APIResources class is has been used.
package resources;

public class demo {
     
	String addPlaceAPI = "/map/api/place/add/json";
	String getPlaceAPI = "/map/api/place/get/json";
	String deletePlaceAPI = "/map/api/place/delete/json";
	
	public String getAddPlaceAPI() {
		return addPlaceAPI;
	}
	
	public String getPlaceAPI() {
		return getPlaceAPI;
	}
	
	public String deletePlaceAPI() {
		return deletePlaceAPI;
	}
}
