const express = require('express')
const app = express()
const port = 3000

app.get('/', (_, res) => {
  res.send('<h1>Full Cycle Rocks!</h1>');
})

app.listen(port, () => {
  console.log('rodando na', port)
})