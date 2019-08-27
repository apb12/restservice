<!DOCTYPE html>
<html lang="en">
<head>

        <meta charset="UTF-8">
        <title>restservicc</title>
</head>
<body>

        <#list message as messages>
        <div align="center">
        <b> Имя :${messages.username}</b>
        <b> Баланс :${messages.cash}</b>
        <b> Скидка :${messages.discount}</b>
        </div>
</#list>

</body>
</html>

