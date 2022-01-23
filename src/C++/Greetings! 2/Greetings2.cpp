#include <iostream>

int main() {
  std::string greeting;
  std::cin >> greeting;
  int lenOfE = greeting.length() - 2;
  greeting.insert(1, lenOfE, 'e');
  std::cout << greeting << std::endl;
  return 0;
}