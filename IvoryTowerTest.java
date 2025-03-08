package com.main;

public class IvoryTowerTest {

	import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.Test;

	class IvoryTowerTest {

	    @Test
	    void testSingletonInstance() {
	        IvoryTower instance1 = IvoryTower.getInstance();
	        IvoryTower instance2 = IvoryTower.getInstance();
	        assertSame(instance1, instance2, "Both instances should be the same");
	    }
	}
}
