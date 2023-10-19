Feature: Register the user in demoWebShop

@Reg
  Scenario: Register the user in demoWebShop and save
    Given Enter into demoWebShop
    When Click register icon
    And Enter personal details
		Then Click register button and continue