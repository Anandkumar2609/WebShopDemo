Feature: Register the user in demoWebShop

@Reg
  Scenario: Register the user in demoWebShop and save
    Given Enter into demoWebShop
    When Click register icon
    And Enter personal details
		Then Click register button and continue
@AddToCart
 	Scenario: Login and add mobile into cart
  	Given Enter into demoWebShop
  	When Click login button
  	And Enter the credentials and login
  	Then Select the product and add to cart
@AddDetails 
	 Scenario: Navigate to gift cards and provide details
	 	Given Enter into demoWebShop
  	When Click login button
  	And Enter the credentials and login
  	And Click gift cards and enter details
@CompareProduct
	Scenario: Select product and compare list
		Given Enter into demoWebShop
  	When Click login button
  	And Enter the credentials and login
  	And Select computers and sort names
  	Then Click any products and compare list 
 	

