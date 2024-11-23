/**
 * 
 */
/**
 * 
 */
module MagicalArena {
	requires junit;
	requires org.junit.jupiter.api;
	
	 exports com.magicalarena.main.test to junit;
	 
	    exports com.magicalarena.model;
	    exports com.magicalarena.service;
	    exports com.magicalarena.utility;
	    
	    opens com.magicalarena.model to junit;
	    opens com.magicalarena.service to junit;
	    opens com.magicalarena.utility to junit;
	
}