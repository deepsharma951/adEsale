package com.org.abde.listing.flipkart.service;

import java.util.List;

import com.org.abde.listing.flipkart.model.ListingFlipkart;

public interface ListingService {
	List<ListingFlipkart> listAllListing();
	long saveOrUpdate(ListingFlipkart lf);
	ListingFlipkart findListingByID(long id);
	void deleteListing(long id);
}
