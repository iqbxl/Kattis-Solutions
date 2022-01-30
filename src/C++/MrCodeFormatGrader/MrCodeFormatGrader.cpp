#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
  int c, n, e;
  cin >> c >> n;
  vector<int> errors;
  for (int i = 0; i < n; i++) {
    cin >> e;
    errors.push_back(e);
  }

  int idx = 1;
  vector<string> formatErrors;
  for (int i = 1; i < n; i++) {
    if (errors[i] - 1 == errors[i - 1]) {
      idx++;
    } else {
      if (idx == 1) {
        formatErrors.push_back(to_string(errors[i - 1]));
      } else {
        formatErrors.push_back(to_string(errors[i - idx]) + "-" + to_string(errors[i - 1]));
        idx = 1;
      }
    }
  }
  
  if (idx == 1) {
    formatErrors.push_back(to_string(errors[n - 1]));
  } else {
    formatErrors.push_back(to_string(errors[n - idx]) + "-" + to_string(errors[n - 1]));
  }

  cout << "Errors: ";
  for (int i = 0; i < formatErrors.size(); i++) {
    if (i == formatErrors.size() - 2) {
      cout << formatErrors[i] << " and " << formatErrors[i + 1] << endl;
      break;
    }
    cout << formatErrors[i] << ", ";
  }

  vector<int> correct;
  for (int i = 1; i <= c; i++) {
    if (find(errors.begin(), errors.end(), i) == errors.end()) { // Check if vector does NOT contain
      correct.push_back(i);
    }
  }

  idx = 1;
  vector<string> formatCorrect;
  for (int i = 1; i < correct.size(); i++) {
    if (correct[i] - 1 == correct[i - 1]) {
      idx++;
    } else {
      if (idx == 1) {
        formatCorrect.push_back(to_string(correct[i - 1]));
      } else {
        formatCorrect.push_back(to_string(correct[i - idx]) + "-" + to_string(correct[i - 1]));
        idx = 1;
      }
    }
  }
  
  if (idx == 1) {
    formatCorrect.push_back(to_string(correct[correct.size() - 1]));
  } else {
    formatCorrect.push_back(to_string(correct[correct.size() - idx]) + "-" + to_string(correct[correct.size() - 1]));
  }

  cout << "Correct: ";
  for (int i = 0; i < formatCorrect.size(); i++) {
    if (i == formatCorrect.size() - 2) {
      cout << formatCorrect[i] << " and " << formatCorrect[i + 1] << endl;
      break;
    }
    cout << formatCorrect[i] << ", ";
  }

  return 0;
}