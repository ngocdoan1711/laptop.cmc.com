package cmc.struts.bus;

import java.sql.SQLException;
import java.util.List;

import cmc.struts.dao.CategoryDao;
import cmc.struts.model.Category;

public class CategoryBUS {
	public List<Category> getAllCategories() throws ClassNotFoundException, SQLException {
		CategoryDao categoryDao = new CategoryDao();
		return categoryDao.getAllCategories();
	}

	public Category getCategoryById(int id) throws ClassNotFoundException, SQLException {
		CategoryDao categoryDao = new CategoryDao();
		return categoryDao.getCategoryById(id);
	}

	public Category getCategoryByProductId(int id) throws ClassNotFoundException, SQLException {
		CategoryDao categoryDao = new CategoryDao();
		return categoryDao.getCategoryByProductId(id);
	}

	public boolean insertCategory(Category category) throws ClassNotFoundException, SQLException {
		CategoryDao categoryDao = new CategoryDao();
		return categoryDao.insertCategory(category);
	}

	public boolean editCategory(int id, Category category) throws ClassNotFoundException, SQLException {
		CategoryDao categoryDao = new CategoryDao();
		return categoryDao.editCategory(id, category);
	}

	public boolean deleteCategory(int id) throws ClassNotFoundException, SQLException {
		CategoryDao categoryDao = new CategoryDao();
		return categoryDao.deleteCategory(id);
	}
}
