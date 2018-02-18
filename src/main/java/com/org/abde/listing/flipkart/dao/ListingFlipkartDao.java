package com.org.abde.listing.flipkart.dao;

import java.util.List;

import com.org.abde.listing.flipkart.model.ListingFlipkart;

public interface ListingFlipkartDao {
	long saveOrUpdate(ListingFlipkart lf);

	ListingFlipkart findListingByID(long id);

	List<ListingFlipkart> listAllListing();

	void deleteListing(long id);
}
