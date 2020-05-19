package com.agilisium.product.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agilisium.product.model.Config;
import com.agilisium.product.model.Product;

@RestController
@RequestMapping("/api")
public class DemoController {
	/**
	 * Return the product details
	 * 
	 * @return
	 */
	@GetMapping("/getproductdetails")
	public ResponseEntity<List<Product>> getProductDetails() {
		Product product = new Product();
		product.setPrice(BigDecimal.valueOf(87464.98));
		product.setProdcutId(12345L);
		product.setProductName("IPhone");

		Product product1 = new Product();
		product1.setPrice(BigDecimal.valueOf(17464));
		product1.setProdcutId(67789L);
		product1.setProductName("Andriod");

		List<Product> productList = Arrays.asList(product, product1);

		return ResponseEntity.status(HttpStatus.OK).body(productList);

	}

	/**
	 * Get Config Details
	 * 
	 * @return
	 */
	@GetMapping("/getconfigdetails")
	public ResponseEntity<List<Config>> getConfigDetails() {
		Config config = new Config();
		config.setConfigName("configName");
		List<Config> configLit = Arrays.asList(config);
		return ResponseEntity.status(HttpStatus.OK).body(configLit);
	}

}
