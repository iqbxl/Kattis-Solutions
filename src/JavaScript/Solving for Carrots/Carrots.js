const fs = require('fs');
const readinput = fs.readFileSync(0, 'utf8').split('\n');
let current = 0;

function input() {
    return readinput[current++];
}

[n, p] = input().split(' ');
for (let i = 0; i < +n; i++) {
    input();
}
console.log(p);