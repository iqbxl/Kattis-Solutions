const readline = require('readline')

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

rl.on('line', (line) => {
    var side = 2
    for (var i = 0; i < line; i++) {
        side = side * 2 - 1
    }
    console.log(side ** 2)
    rl.close()
});