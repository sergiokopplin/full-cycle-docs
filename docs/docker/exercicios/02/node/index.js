const express = require('express')
const faker = require('faker')
const app = express()
const port = process.env.APP_PORT || 3000

const config = {
  host: 'db',
  user: 'root',
  password: 'root',
  database: 'nodedb',
}

const mysql = require('mysql')
const connection = mysql.createConnection(config)

app.get('/', (_, res) => {
  const n = faker.name.findName()

  connection.query(`INSERT INTO people (nome) VALUES ('${n}')`)
  connection.query(`SELECT nome FROM people`, (_param, results, _lastParam) => {
    res.send(`
      <h1>Full Cycle Rocks!</h1>
      <ol>
        ${!!results.length ? results.map(el => `<li>${el.nome}</li>`).join('') : ''}
      </ol>
    `)
  })
})

app.listen(port, () => {
  console.log('Up on:', port);
})