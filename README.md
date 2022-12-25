
# Cyrin - Cyber Risk Intelligence Application API

Siber Risk İstihbarat API

## API Kullanımı

## Register

```http
  POST {{VERSION}}/auth/register
```

| Parametre | Tip     | Açıklama                |
| :-------- | :------- | :------------------------- |
| `username` | `string` | **Gerekli**. Kullanıcı Adı|
| `email` | `string` | **Gerekli**. e-Posta Adresi
| `password` | `string` | **Gerekli**. Kullanıcı Şifresi|

#### Request:
```json
{
    "username": "resulsilay",
    "email": "resul.silay@gmail.com",
    "password": "0123456*",
    "role": [
        "ADMIN"
    ]
}
```

#### Response:
```json
{
    "message": "User registered successfully!"
}
```

## Login

```http
  POST {{VERSION}}/auth/login
```

| Parametre | Tip     | Açıklama                |
| :-------- | :------- | :------------------------- |
| `username` | `string` | **Gerekli**. Kullanıcı Adı|
| `password` | `string` | **Gerekli**. Kullanıcı Şifresi|

#### Request:
```json
{
    "username":"resulsilay",
    "password":"0123456*"
}
```

#### Response:
```json
{
    "refreshToken": "47daf3b3-02a4-44d8-9d2f-0473dec88b01",
    "id": "e5e10a8c-a1e6-4984-a702-c735be976c01",
    "username": "resulsilay",
    "email": "resul.silay@gmail.com",
    "role": [
        "ADMIN"
    ]
    "accessToken": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJyc2lsYXkiLCJpYXQiOjE2NzE5MzE4NDcsImV4cCI6MTY3MTkzMjIwN30.-fXHXmL1tYsL60enaCLTTCxfyWO_GCXywwR8ijUmBaCAvY0z3Oz519gp24KBq4L0Cp25pM6ls6NFGGPUqWiKfg",
    "tokenType": "Bearer"
}
```

## RefreshToken

```http
  POST {{VERSION}}/auth/refreshtoken
```

| Parametre | Tip     | Açıklama                |
| :-------- | :------- | :------------------------- |
| `username` | `string` | **Gerekli**. Kullanıcı Adı|
| `password` | `string` | **Gerekli**. Kullanıcı Şifresi|

#### Request:
```json
{
    "refreshToken": "{{REFRESH_TOKEN}}"
}
```

## User

```http
  POST {{VERSION}}/user
```

| Parametre | Tip     | Açıklama                |
| :-------- | :------- | :------------------------- |
| `username` | `string` | **Gerekli**. Kullanıcı Adı|
| `password` | `string` | **Gerekli**. Kullanıcı Şifresi|

#### Response:
```json
{
    "id": "e5e10a8c-a1e6-4984-a702-c735be976c01",
    "username": "resulsilay",
    "email": "rsilay@gmail.com",
    "password": "$2a$10$dHa/2ZS/q0x14kMLc7UcqOkjwCSB1eaUeaqL87LueRUtYGchITsoi",
    "roles": []
}
```

## Breach Email

```http
  POST {{VERSION}}/black/kit/breach/email
```

| Parametre | Tip     | Açıklama                |
| :-------- | :------- | :------------------------- |
| `email` | `string` | **Gerekli**. e-Posta|

#### Request:
```json
{
    "email": "resulsilay@gmail.com"
}
```


## Lisans

[MIT](https://choosealicense.com/licenses/mit/)
