const rl = require('readline').createInterface(process.stdin, process.stdout);

function sumDigits(num) {
    let sum = 0;
    while (num > 0) {
        sum += num % 10;
        num = Math.floor(num / 10);
    }
    return sum;
}

rl.on('line', first => {
    rl.on('line', second => {
        rl.on('line', third => {
            var l = parseInt(first);
            var d = parseInt(second);
            var x = parseInt(third);
            for (var i = l; i <= d; i++) {
                if (sumDigits(i) === x) {
                    console.log(i);
                    break;
                }
            }
            for (var i = d; i >= l; i--) {
                if (sumDigits(i) === x) {
                    console.log(i);
                    break;
                }
            }
            rl.close();
        });
    });
});