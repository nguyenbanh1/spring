<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
        <h1>Add Alien</h1>
        <form method = "post" action = "addAlien">
            Name : <input type = "text" name = "name"/>
            Mark : <input type = "number" name = "mark">
            <input type = "submit" value = "add">

        </form>

        <h1>Get ALL Alien</h1>
        <form method = "post" action = "getAllAlien">
            <input type = "submit" value = "get">

        </form>

        <h1>Check Name Alien</h1>
        <form method = "post" action = "checkNameAlien">
            Name : <input type = "text" name = "name"/>
            <input type = "submit" value = "add">
        </form>


        <h1>Tim tat ca Alien voi ten</h1>
        <form method = "post" action = "getAlienByName">
            Name : <input type = "text" name = "name"/>
            <input type = "submit" value = "get">
        </form>


        <h1>Tim tat cac ten Alien by Procedure </h1>
        <form method = "post" action = "getAlienWithProcedure">
            <input type = "submit" value = "get">
        </form>





        <h1>Check Name Alien bang procedure</h1>
        <form method = "post" action = "checkNameAlienProcedure">
            Name : <input type = "text" name = "name"/>
            <input type = "submit" value = "check">
        </form>



</body>
</html>