package com.ustglobal.stockmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.stockmanagement.dto.ProductBean;
import com.ustglobal.stockmanagement.service.OrderService;
import com.ustglobal.stockmanagement.service.ProductService;

	@RestController
	@CrossOrigin(origins = "http://localhost:4200")
	//@CrossOrigin(origins = "*", allowedHeaders = "*")
	public class ProductController {

		@Autowired
		private ProductService productservice;
		
		@Autowired
		private OrderService orderService;
		@GetMapping(path = "/get-product-by-id", produces = MediaType.APPLICATION_JSON_VALUE)
		public ProductBean searchProductById(@RequestParam("id") int id) {
			return  productservice.searchProductById(id);
		}
		
		
		
		@GetMapping(path = "/get-product-by-name", produces = MediaType.APPLICATION_JSON_VALUE)
		public ProductBean searchProductByName(@RequestParam("name") String name) {
			return  productservice.searchProductByName(name);
		}
		
		
		
		
		@GetMapping(path = "/get-product-by-category", produces = MediaType.APPLICATION_JSON_VALUE)
		public ProductBean searchProductByCategory(@RequestParam("category") String category) {
			return  productservice.searchProductByCategory(category);
		}
		
		
		@GetMapping(path = "/get-product-by-company", produces = MediaType.APPLICATION_JSON_VALUE)
		public ProductBean searchProductByCompany(@RequestParam("company") String company) {
			return  productservice.searchProductByCompany(company);
		}
		
		
		@PostMapping(path = "/search-product-by-id", produces = MediaType.APPLICATION_JSON_VALUE)
		public ProductBean searchProductById(@RequestBody ProductBean bean) {
			int id = bean.getId();
			return productservice.searchProductById(id);
		}
		
		
		@GetMapping(path = "/get-all-product", produces = MediaType.APPLICATION_JSON_VALUE)
		public List<ProductBean> getAllProduct() {
			return productservice.getAllProduct();
		}


		
		@GetMapping(path = "/request-product/{id}/{order_id}", produces = MediaType.APPLICATION_JSON_VALUE)
		public int requestProduct(@PathVariable("order_id") int order_id, @PathVariable("id") int id) {
			return productservice.requestProduct(order_id, id);
		}

		@GetMapping(path = "/get-all-requested-product/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
		public List<ProductBean> getAllRequestedProduct(@PathVariable int id){

			return productservice.getAllRequestedProduct(id);
		}
		
		
//		@GetMapping(path = "/get-all-requested-product/{order_id}")
//		public List<TransactionBean> getAllRequestedproducts(@PathVariable("order_id") int order_id){
//			return service.getAllRequestedProduct(order_id);
//		}
//		
		
		@PostMapping(path = "/add-product")
		public boolean addProduct(@RequestBody ProductBean bean) {
			if(orderService.addProduct(bean)) {
				return true;
			} else {
				return false;
			}
		}
		
		
	
//		@GetMapping(path = "/get-all-received-requested-product")
//		public List<TransactionBean> getAllReceivedRequestedProduct() {
//			return orderService.getAllReceivedRequestedProduct();
//		}
		
		@GetMapping(path = "/action-on-requested-product/{tid}/{sValue}/{id}")
		public int actionOnRequestedProduct(@PathVariable("tid") int tid, @PathVariable("sValue") int sValue,
				@PathVariable("id") int id) {
			return orderService.actionOnRequestedProduct(tid, sValue, id);
		}
		
//		@GetMapping(path = "/get-all-approved-rejected-book")
//		public List<TransactionBean> getAllApprovedRejectedBook(){
//			return productService.getAllApprovedRejectedBook();
//		}
		
	}
