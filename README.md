# Store Inventory Manager

This Java project implements a Store Inventory Manager that updates the quality and sell-in date of items in the store inventory according to specific rules. The project includes unit tests to verify the correctness of the implemented logic.

## Table of Contents

- [Overview](#overview)
- [Running Tests](#running-tests)
- [Unit Test Coverage](#unit-test-coverage)
- [Contributing](#contributing)
- [License](#license)
- [Author](#author)

## Overview

The `StoreInventoryManager` class manages the quality and sell-in date of items in the store inventory based on different rules for different types of items. The rules include:

- Decreasing the quality of basic items by 1 each day.
- Increasing the quality of "Gorquefort" cheese items by 1 each day.
- Increasing the quality of "Concert Tickets to Aurumback show" items by 1 each day, with special rules for different sell-in dates.

## Running Tests

The project includes JUnit tests to ensure the correctness of the `StoreInventoryManager` class. To run the tests:

1. Navigate to the test package in your IDE.
2. Run the `Test_StoreInventor` class.

## Unit Test Coverage

The unit tests cover various scenarios including:

- Normal case scenarios for basic items.
- Scenarios involving "Gorquefort" cheese items.
- Scenarios involving "Concert Tickets to Aurumback show" items.
- Limit value scenarios.

## Contributing

Contributions to this project are welcome! If you find any issues or have suggestions for improvements, please feel free to submit a pull request or open an issue.


## Author

Jordi Tusha
