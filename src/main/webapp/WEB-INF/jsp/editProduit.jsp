<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>form</title>
</head>
<body>

<div>
    <div>
        <h3>Modify Product</h3>
        <div>
            <form th:action="@{save}" method="post">
                <div>
                    <label>Id</label>
                    <input type="text" name="id" th:value="${produit.id}">
                </div>
                <div>
                    <label>Designation</label>
                    <input type="text" name="designation" th:value="${produit.designation}">
                </div>
                <div>
                    <label>Price</label>
                    <input type="text" name="prix" th:value="${produit.prix}">
                </div>
                <div>
                    <label>Quantity</label>
                    <input type="text" name="quantite" th:value="${produit.quantite}">
                </div>
                <div>
                    <button type="submit">Update</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>