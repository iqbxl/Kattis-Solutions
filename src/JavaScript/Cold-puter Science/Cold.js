const readline = require('readline');
const rl = readline.createInterface(process.stdin, process.stdout);

rl.on('line', line => {
    rl.on('line', line2 => {
        let n = +line;
        let arr = line2.split(' ');
        let num = 0;
        for (let i = 0; i < n; i++) {
            if (+arr[i] < 0) {
                num++;
            }
        }
        console.log(num);
        rl.close();
    });
});