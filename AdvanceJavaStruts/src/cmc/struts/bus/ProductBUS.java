/**
 * 
 */
package cmc.struts.bus;

import java.sql.SQLException;
import java.util.List;

import cmc.struts.dao.ProductDao;
import cmc.struts.model.Product;

/**
 * @author User
 *
 */
public class ProductBUS {
	/**
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public List<Product> getAllProduct() throws ClassNotFoundException, SQLException {
		ProductDao productDao = new ProductDao();
		return productDao.getAllProduct();
	}
	
	public List<Product> getProductByCategoryId(int categoryId) throws ClassNotFoundException, SQLException {
		ProductDao productDao = new ProductDao();
		return productDao.getProductByCategoryId(categoryId);
	}
	
	public Product getProductById(int id) throws SQLException, ClassNotFoundException {
		ProductDao productDao = new ProductDao();
		return productDao.getProductById(id);
	}
	
	public boolean insertProduct(Product product) throws SQLException, ClassNotFoundException {
		ProductDao productDao = new ProductDao();
		return productDao.insertProduct(product);
	}
	
	public boolean editProduct(int productId, Product product) throws SQLException, ClassNotFoundException {
		ProductDao productDao = new ProductDao();
		return productDao.editProduct(productId, product);
	}
	
	public boolean deleteProduct(int productId) throws SQLException, ClassNotFoundException{
		ProductDao productDao = new ProductDao();
		return productDao.deleteProduct(productId);
	}
}
