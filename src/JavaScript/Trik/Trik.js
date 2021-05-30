const rl = require('readline').createInterface(process.stdin, process.stdout);

rl.on('line', function(line) {
    const str = line;
    let idx = 0;
    for (var i = 0; i < str.length; i++) {
        if (str.charAt(i) === 'A' && idx != 2) {
            idx = -idx + 1;
        } else if (str.charAt(i) === 'B' && idx != 0) {
            idx = -idx + 3;
        } else if (str.charAt(i) === 'C' && idx != 1) {
            idx = -idx + 2;
        }
    }
    console.log(idx + 1);
    rl.close();
});