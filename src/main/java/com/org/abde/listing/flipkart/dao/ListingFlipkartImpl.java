package com.org.abde.listing.flipkart.dao;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.abde.listing.flipkart.model.ListingFlipkart;

@Repository
public class ListingFlipkartImpl implements ListingFlipkartDao{
	
	 @Autowired
	 private SessionFactory sessionFactory;
	 
	 @SuppressWarnings("unused")
	private Session getSessionFactory(){
		 System.out.println("getting seesion factory");
		return sessionFactory.getCurrentSession();
		 
	 }
	 
	/*public ListingFlipkart get(long id) {
		 return sessionFactory.getCurrentSession().get(ListingFlipkart.class, id);
	}
	public List<ListingFlipkart> list() {
		Session session = sessionFactory.getCurrentSession();
	      CriteriaBuilder cb = session.getCriteriaBuilder();
	      CriteriaQuery<ListingFlipkart> cq = cb.createQuery(ListingFlipkart.class);
	      Root<ListingFlipkart> root = cq.from(ListingFlipkart.class);
	      cq.select(root);
	      Query<ListingFlipkart> query = session.createQuery(cq);
	      return query.getResultList();
	}
	public void update(long id, ListingFlipkart lf) {
		Session session = sessionFactory.getCurrentSession();
		 ListingFlipkart lfDb = session.byId(ListingFlipkart.class).load(id);
	     
	      session.flush();
		
	}
	public void delete(long id) {
		 Session session = sessionFactory.getCurrentSession();
		 ListingFlipkart lf = session.byId(ListingFlipkart.class).load(id);
	      session.delete(lf); 
		
	}
	public long save(com.org.abde.listing.flipkart.model.ListingFlipkart lf) {
		sessionFactory.getCurrentSession().save(lf);
	      return lf.getId();
	}
	 public static void main(String[] args) {
		    /*Session session = null;
		    Transaction transaction = null;
		    try {
		      session = HibernateUtil.getSessionFactory().openSession();
		      transaction = session.getTransaction();
		      transaction.begin();

		      ListingFlipkart lf = new ListingFlipkart();
		      lf.setActual_stock_count(0);
		      lf.setAttributeValues(0);
		      lf.setErrorCode("error");
		      
		      session.save(lf);

		      transaction.commit();
		    } catch (Exception e) {
		      if (transaction != null) {
		        transaction.rollback();
		      }
		      e.printStackTrace();
		    } finally {
		      if (session != null) {
		        session.close();
		      }
		    }

		    HibernateUtil.shutdown();
		  }
*/
	@Override
	public long saveOrUpdate(ListingFlipkart lf) {
		getSessionFactory().saveOrUpdate(lf);
		return 0;
	}

	@Override
	public ListingFlipkart findListingByID(long id) {
		ListingFlipkart Lfs=(ListingFlipkart) getSessionFactory().get(ListingFlipkart.class,id);
		return Lfs;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ListingFlipkart> listAllListing() {
		System.out.println("calling listAll in dao");
		
		Criteria  citeria =getSessionFactory().createCriteria(ListingFlipkart.class);		
		return (List<ListingFlipkart>)citeria.list();
	}

	@Override
	public void deleteListing(long id) {
		ListingFlipkart Lfs=(ListingFlipkart) getSessionFactory().get(ListingFlipkart.class,id);	
		getSessionFactory().delete(Lfs);
	}
}
