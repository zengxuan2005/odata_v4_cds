package cxs.ana.odata_v4_cds;

import com.sap.cloud.sdk.result.ElementName;

public class ProductEntity {
	
	@ElementName( "ProductID" )
    private String ProductID;

	@ElementName( "Name" )
    private String Name;

    @ElementName( "Description" )
    private String Description;
 
    @ElementName( "Category" )
    private String Category;
	
    
    public String getProductID() {
		return ProductID;
	}

	public void setProductID(String productID) {
		this.ProductID = productID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		this.Description = description;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		this.Category = category;
	}

	
}
