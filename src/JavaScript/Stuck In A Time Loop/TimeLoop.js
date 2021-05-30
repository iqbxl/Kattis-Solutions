const rl = require('readline').createInterface(process.stdin, process.stdout);

rl.on('line', line => {
    for (var i = 1; i <= +line; i++) {
        console.log(i + ' Abracadabra');
    }
    rl.close();
});