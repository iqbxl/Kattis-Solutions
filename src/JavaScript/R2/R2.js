const readline = require('readline');
const rl = readline.createInterface(process.stdin, process.stdout);

rl.on('line', line => {
    [r1, s] = line.split(' ');
    console.log(s * 2 - r1);
    rl.close();
});