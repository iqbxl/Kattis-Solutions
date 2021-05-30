const fs = require('fs');
const readinput = fs.readFileSync(0, 'utf8').split('\n');
let current = 0;

function input() {
    return readinput[current++];
}

[n, w, h] = input().split(' ');
let hyp = Math.sqrt(w * w + h * h);
while (n-- > 0) {
    if (input() <= hyp) {
        console.log('DA');
    } else {
        console.log('NE');
    }
}