/**
 * 
 */
package com.example.testrest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mujahed
 *
 */
@RestController
public class TestRest1 {
	
	@RequestMapping(value="ello", method = RequestMethod.GET)
	String display() {
		return "Say Hello";
	}

}
