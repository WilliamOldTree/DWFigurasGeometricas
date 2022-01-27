<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <!--Bootstrap  -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">


    <!--CSS Style  -->

    <style>
        /* Fonte */
        @import url('https://fonts.googleapis.com/css2?family=Roboto:wght@300&display=swap');

        /* Zerar default */
        header,
        body,
        html {
            padding: 0px;
            margin: 0px;
            font-family: "Roboto";
            color: aliceblue;
        }

        #figuras {
            
            width: 600px;
            height: 500px;
            background-color: black;
        }

        .dados {
            padding: 70px;
            display: flex;
            flex-direction: column;
            justify-content: center;
            
            align-items: center;
        }

        .form-control {
            width: 200px;
        }
    </style>

</head>

<body>
    <header>
        <div class="container" id="figuras">

            <form method="post" action="Figuras">
                <div class="dados">

                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Digite um valor</label>
                        <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="n1">
                    </div>

                    <div class="mb-3">
                        <label for="exampleInputPassword1" class="form-label">Digite um valor</label>
                        <input type="text" class="form-control" id="exampleInput1" name="n2">
                    </div>

                    <div class="mb-3">
                        <label for="exampleInputPassword1" class="form-label">Digite um valor</label>
                        <input type="text" class="form-control" id="exampleInput2" name="n3">
                    </div>
                    <div>
                        <button type="submit" class="btn btn-primary">Calcular</button>
                    <button type="reset" class="btn btn-primary">Limpar</button>
                    </div>
                    
                </div>
                
            </form>

        </div>
    </header>
</body>

</html>