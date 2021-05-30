const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.on('line', line => {
    rl.on('line', next => {
        var x = parseInt(line);
        var y = parseInt(next);
        if (x > 0 && y > 0) {
            console.log(1);
        } else if (x < 0 && y > 0) {
            console.log(2);
        } else if (x < 0 && y < 0) {
            console.log(3);
        } else {
            console.log(4);
        }
        rl.close();
    });
});