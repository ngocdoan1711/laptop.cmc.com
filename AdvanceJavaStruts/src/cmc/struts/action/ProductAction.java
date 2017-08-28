/**
 * 
 */
package cmc.struts.action;

import java.sql.SQLException;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cmc.struts.bus.CategoryBUS;
import cmc.struts.bus.ProductBUS;
import cmc.struts.model.Category;
import cmc.struts.model.Product;

/**
 * @author User
 *
 */
public class ProductAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Product product;
	private List<Product> listProduct;
	private int categoryId;
	private int productId;
	private Category category;
	private List<Category> listCategory;
	
	public String getAllProduct() throws ClassNotFoundException, SQLException {
		ProductBUS productBUS = new ProductBUS();
		listProduct = productBUS.getAllProduct();
		return "success";
	}
	
	public String getProductByCategoryId() throws ClassNotFoundException, SQLException {
		ProductBUS productBUS = new ProductBUS();
		CategoryBUS categoryBUS = new CategoryBUS();
		listProduct = productBUS.getProductByCategoryId(categoryId);
		category = categoryBUS.getCategoryById(categoryId);
		return "success";
	}
	
	public String getProductById() throws SQLException, ClassNotFoundException {
		ProductBUS productBUS = new ProductBUS();
		CategoryBUS categoryBUS = new CategoryBUS();
		product = productBUS.getProductById(productId);
		category = categoryBUS.getCategoryByProductId(productId);
		return "success";
	}
	
	public String insertProduct() throws SQLException, ClassNotFoundException {
		ProductBUS productBUS = new ProductBUS();
		productBUS.insertProduct(product);
		return "success"; 
	}
	
	public String editProduct(int productId, Product product) throws SQLException, ClassNotFoundException {
		ProductBUS productBUS = new ProductBUS();
		productBUS.editProduct(productId, product);
		return "success";
	}
	
	public String deleteProduct(int productId) throws SQLException, ClassNotFoundException{
		ProductBUS productBUS = new ProductBUS();
		productBUS.deleteProduct(productId);
		return "success";
	}
	
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Category> getListCategory() {
		return listCategory;
	}

	public void setListCategory(List<Category> listCategory) {
		this.listCategory = listCategory;
	}

	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public List<Product> getListProduct() {
		return listProduct;
	}
	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
	
}
