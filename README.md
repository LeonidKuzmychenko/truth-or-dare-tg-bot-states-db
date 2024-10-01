Vault path:
```text
http://localhost:8200/ui/vault/secrets/microservices/kv/truth-or-dare-tg-bot-states-db%2Fdev%2Fdb/details?version=2
```
Vault config:
```json
{
  "pg.data-source.driver-class-name": "org.postgresql.Driver",
  "pg.data-source.host": "localhost",
  "pg.data-source.jdbc-url": "jdbc:postgresql://${pg.data-source.host}:${pg.data-source.port}/${pg.data-source.name}",
  "pg.data-source.name": "mydb",
  "pg.data-source.password": "mypass",
  "pg.data-source.port": 5432,
  "pg.data-source.username": "myuser"
}
```