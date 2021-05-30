const fs = require('fs');
const read = fs.readFileSync(0, 'utf8').split('\n');

let count = 0;
function input() {
    return read[count++];
}

var n = input();
var qaly = 0;
while (n-- > 0) {
    [q, y] = input().split(' ');
    qaly += q * y;
}
console.log(qaly);