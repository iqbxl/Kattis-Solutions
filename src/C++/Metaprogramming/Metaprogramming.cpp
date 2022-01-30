#include <iostream>
#include <unordered_map>
#include <vector>
#include <sstream>

using namespace std;

int main() {
  unordered_map<string, int> map;
  string line;
  while (getline(cin, line)) {
    vector<string> input;
    istringstream iss(line);
    string s;
    while (iss >> s) {
      input.push_back(s);
    }

    if (input[0] == "define") {
      map[input[2]] = stoi(input[1]);
    } else {
      cout << boolalpha;
      if (map.count(input[1]) == 0 || map.count(input[3]) == 0) { // Check for key membership
        cout << "undefined\n";
      } else if (input[2] == "<") {
        cout << (map[input[1]] < map[input[3]]) << "\n";
      } else if (input[2] == ">") {
        cout << (map[input[1]] > map[input[3]]) << "\n";
      } else {
        cout << (map[input[1]] == map[input[3]]) << "\n";
      }
    }
  }
  return 0;
}