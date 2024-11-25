## API para Agência de Viagens

### Endpoints Disponíveis
1. **Cadastrar Destino**
   - Método: `POST /api/destinos`
   - Exemplo de Body (JSON):
     ```json
     {
       "nome": "SP",
       "localizacao": "Brasil",
       "descricao": "Viagemzinha",
       "precoPacote": 4000.0
     }
     ```

2. **Listar Destinos**
   - Método: `GET /api/destinos`

3. **Pesquisar Destinos**
   - Método: `GET /api/destinos/search?termo=Rio`

4. **Visualizar Destino**
   - Método: `GET /api/destinos/{id}`

5. **Reservar Pacote**
   - Método: `POST /api/destinos/{id}/reservar`

6. **Deletar Destino**
   - Método: `DELETE /api/destinos/{id}`