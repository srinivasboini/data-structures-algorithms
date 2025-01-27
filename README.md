# Data Structures and Algorithms Practice

A comprehensive collection of Data Structures and Algorithms problems with multiple solution approaches, designed for learning and interview preparation.

## Project Structure

```
src/
├── main/java/com/dsa/
│   ├── arrays/          # Array-based problems
│   ├── strings/         # String manipulation problems
│   ├── twopointers/     # Two pointer pattern problems
│   ├── slidingwindow/   # Sliding window pattern problems
│   ├── utils/           # Utility classes
│   └── common/          # Common helper classes
├── test/java/com/dsa/   # Test cases for all implementations
└── resources/
    └── week1/notes/     # Problem-specific documentation
```

## Design Principles

- **Strategy Pattern**: Each problem has multiple solution approaches
- **Clean Code**: Well-documented, maintainable solutions
- **Comprehensive Testing**: Unit tests for all approaches
- **Learning Focus**: Detailed explanations and approach comparisons

## Features

- Multiple solution approaches for each problem
- Time and space complexity analysis
- Detailed problem explanations
- Comprehensive test cases
- Performance comparisons
- Interview tips and insights

## Getting Started

### Prerequisites
- Java 17 or higher
- Maven 3.6 or higher

### Building the Project
```bash
mvn clean install
```

### Running Tests
```bash
mvn test
```

### Running a Specific Problem
```bash
# Example: Running Two Sum problem
mvn exec:java -Dexec.mainClass="com.dsa.arrays.twosum.HashMapApproach"
```

## Problem Categories

### Week 1: Arrays and Strings
1. [Two Sum](src/resources/week1/notes/twosum/README.md)
   - Brute Force Approach
   - HashMap Approach
   - Two Pointer Approach

(More problems to be added...)

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingSolution`)
3. Commit your changes (`git commit -m 'Add some AmazingSolution'`)
4. Push to the branch (`git push origin feature/AmazingSolution`)
5. Open a Pull Request

## Documentation

Each problem includes:
- Problem statement and constraints
- Multiple solution approaches
- Time and space complexity analysis
- Example usage
- Edge cases and test cases
- Learning points and common mistakes

## Learning Path

1. Start with array and string problems
2. Progress to two-pointer and sliding window patterns
3. Move on to more complex data structures
4. Practice dynamic programming problems
5. Study advanced algorithms

## Resources

- [LeetCode Problems](https://leetcode.com/)
- [Data Structures and Algorithms](https://www.geeksforgeeks.org/data-structures/)
- [Algorithm Patterns](https://github.com/AswinBarath/algorithm-patterns)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details. 