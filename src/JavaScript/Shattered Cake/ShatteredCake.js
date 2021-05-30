const fs = require('fs');
const readfile = fs.readFileSync(0, 'utf8').split('\n');
let current = 0;

function input() {
    return readfile[current++];
}

let w = +input();
let n = +input();
let area = 0;
for (var i = 0; i < n; i++) {
    [wi, li] = input().split(' ');
    area += wi * li;
}
console.log(area / w);