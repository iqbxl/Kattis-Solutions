#include <iostream>
#include <vector>

int main() {
  std::vector<int> grading;
  for (int i = 0; i < 5; i++) {
    int grade;
    std::cin >> grade;
    grading.push_back(grade);
  }
  int score;
  std::cin >> score;

  if (score >= grading[0]) {
    std::cout << 'A';
  } else if (score >= grading[1]) {
    std::cout << 'B';
  } else if (score >= grading[2]) {
    std::cout << 'C';
  } else if (score >= grading[3]) {
    std::cout << 'D';
  } else if (score >= grading[4]) {
    std::cout << 'E';
  } else {
    std::cout << 'F';
  }
  std::cout << std::endl;
  return 0;
}