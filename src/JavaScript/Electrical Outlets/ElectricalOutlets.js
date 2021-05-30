const fs = require('fs');
// Windows bug! Code cannot compile if file descriptor is 0, but Kattis accepts
const input = fs.readFileSync(0, 'utf-8').trim().split('\n');

let currentLine = 0;
function readLine() {
    return input[currentLine++];
}

let n = readLine();
for (var i = 0; i < n; i++) {
    let arr = readLine().split(' ');
    let max = 0;
    for (var j = 1; j <= arr[0]; j++) {
        max += arr[j] - 1;
    }
    console.log(max + 1);
}