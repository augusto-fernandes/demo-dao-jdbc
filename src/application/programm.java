package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class programm {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
				
		System.out.println("=== TESTE 1 : seller findByID ====");
		Seller seller = sellerDao.findByID(3);
		
		System.out.println(seller);

	}

}
