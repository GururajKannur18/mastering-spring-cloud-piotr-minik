# Testing API With Swagger

```
http://localhost:2222/swagger-ui.html
```

# POST

```
curl -X POST "http://localhost:2222/person" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"age\": 20, \"firstName\": \"John\", \"gender\": \"MALE\", \"id\": 1, \"lastName\": \"Scott\"}"
```

Response Body:

```
{
  "id": 1,
  "firstName": "John",
  "lastName": "Scott",
  "age": 20,
  "gender": "MALE"
}
```