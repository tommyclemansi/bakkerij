/*******************************************************************************
 * Copyright (c) 2014 Tom Cleymans
 *******************************************************************************/
package bakkerij;

import javax.ejb.EJB;

import myStateless.SoortService;

import org.junit.runner.RunWith;

public class SoortServiceTest {

	/**
	 * This test verifies that soort can be persisted and retrieved.
	 */
	//@RunWith(Arquillian.class)
	//@Run(RunModeType.IN_CONTAINER)
	public class ItemServiceTest {

	    /**
	     * Entity manager
	     */
	    @EJB
	    private SoortService soortService;


	    /**
	     * Creates a deployment item.
	     * @return ShrinkWrap
	     */
	  /*  @Deployment
	    public static Archive<?> createDeployment() {
	        return ShrinkWrap.create(JavaArchive.class, "foo.jar").addClasses(OrderProcessor.class,
	                OrderProcessorBean.class,
	                ItemService.class,
	                ItemServiceBean.class, Bid.class, Bidder.class, Item.class).addManifestResource("test-persistence.xml", ArchivePaths.create("persistence.xml"));
	    }*/

	    /**
	     * Test persistence of item
	     */
	    /*@Test
	    public void testItemPersistence() {
	        Item item = new Item("Apple IIGS", new Date(), new Date(), 45.0f);
	        itemService.createItem(item);
	        Assert.assertNotNull(item.getItemId());
	        itemService.getItem(item.getItemId());
	    }*/
	
	
}
	
}
