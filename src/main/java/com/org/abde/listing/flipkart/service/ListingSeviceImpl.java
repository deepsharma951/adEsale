package com.org.abde.listing.flipkart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.org.abde.listing.flipkart.dao.ListingFlipkartDao;
import com.org.abde.listing.flipkart.model.ListingFlipkart;
@Service
@Transactional
public class ListingSeviceImpl implements ListingService {
	
	
	private ListingFlipkartDao listingDao;
	
	@Autowired
	public void setListingFlipkartDao(ListingFlipkartDao dao){
		this.listingDao=dao;
		
	}
	
	/*@Transactional
	   public long save(ListingFlipkart lf) {
	   return listingDao.save(lf);
	}

	public ListingFlipkart get(long id) {
		return listingDao.get(id);
	}

	public List<ListingFlipkart> list() {
		return listingDao.list();
	}

	public void update(long id, ListingFlipkart lf) {
		listingDao.update(id, lf);
		
	}
	 @Transactional 
	public void delete(long id) {
		 listingDao.delete(id);
		
	}*/

	

	@Override
	public List<ListingFlipkart> listAllListing() {	
		System.out.println("calling listAllListing");
		return this.listingDao.listAllListing();
	}

	@Override
	public long saveOrUpdate(ListingFlipkart lf) {
		// TODO Auto-generated method stub
		return listingDao.saveOrUpdate(lf);
	}

	@Override
	public ListingFlipkart findListingByID(long id) {
		// TODO Auto-generated method stub
		return listingDao.findListingByID(id);
	}

	@Override
	public void deleteListing(long id) {
		listingDao.deleteListing(id);
		
	}

}
