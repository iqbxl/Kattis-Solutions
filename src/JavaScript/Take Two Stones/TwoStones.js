const rl = require('readline').createInterface(process.stdin, process.stdout);

rl.on('line', function(line) {
    console.log(line % 2 != 0 ? 'Alice' : 'Bob');
    rl.close();
});