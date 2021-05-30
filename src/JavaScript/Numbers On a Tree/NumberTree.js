const rl = require('readline').createInterface(process.stdin, process.stdout);

rl.on('line', function(line) {
    let input = line.split(' ');
    if (input.length > 1) {
        const h = +input[0];
        const path = input[1];
        let current = 0;
        for (var i = 0; i < path.length; i++) {
            if (path.charAt(i) == 'L') {
                current = current * 2 + 1;
            } else {
                current = current * 2 + 2;
            }
        }
        console.log(h == 30 ? 2147483648 - 1 - current : (1 << h + 1) - 1 - current);
    } else {
        const h = +input[0];
        console.log(h == 30 ? 2147483648 - 1 : (1 << h + 1) - 1);
    }
    rl.close();
});