<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ru">

<head>
    <meta charset="utf-8">
    <title>Лабораторная №2</title>
    <style>
        @import url('styles/Index.css');
    </style>
</head>

<body>
<!-- Табличная вёрстка -->
<table id="layout">
    <!-- Первая строка - заголовок -->
    <tr>
        <td colspan="2" id="cap">
            <div id="capBlock">
                Тучков Максим Русланович, группа: P32121, вариант: 1316
            </div>
        </td>
    </tr>
    <!-- Вторая строка - Данные для ввода, график и кнопка подтверждения -->
    <tr>
        <!-- Форма для отправки GET запроса на сервер (target показывает, как форма будет открываться) -->
        <form id="mainForm" action="controller-servlet" method="get" target="forms/Form.php">
            <!-- Столбик выбором данных (X, Y, R) -->
            <td id="data">
                <!-- Таблица: одна строка, три столбца (данные) -->
                <table id="dataTable">
                    <tr>
                        <!-- 1 столбик - координата X -->
                        <td>
                            <fieldset id="xFieldSet">
                                <legend id="xLegend">
                                    <b>Выберите координату X</b>
                                </legend>
                                <div class="radioX">
                                    <input id="x2" type="radio" name="xCoordinate" value="2" class="xBtn">
                                    <label for="x2">2</label>
                                </div>
                                <br>
                                <div class="radioX">
                                    <input id="x1.5" type="radio" name="xCoordinate" value="1.5" class="xBtn">
                                    <label for="x1.5">1.5</label>
                                </div>
                                <br>
                                <div class="radioX">
                                    <input id="x1" type="radio" name="xCoordinate" value="1" class="xBtn">
                                    <label for="x1">1</label>
                                </div>
                                <br>
                                <div class="radioX">
                                    <input id="x0.5" type="radio" name="xCoordinate" value="0.5" class="xBtn">
                                    <label for="x0.5">0.5</label>
                                </div>
                                <br>
                                <div class="radioX">
                                    <input id="x0" type="radio" name="xCoordinate" value="0" class="xBtn">
                                    <label for="x0">0</label>
                                </div>
                                <br>
                                <div class="radioX">
                                    <input id="x-0.5" type="radio" name="xCoordinate" value="-0.5" class="xBtn">
                                    <label for="x-0.5">-0.5</label>
                                </div>
                                <br>
                                <div class="radioX">
                                    <input id="x-1" type="radio" name="xCoordinate" value="-1" class="xBtn">
                                    <label for="x-1">-1</label>
                                </div>
                                <br>
                                <div class="radioX">
                                    <input id="x-1.5" type="radio" name="xCoordinate" value="-1.5" class="xBtn">
                                    <label for="x-1.5">-1.5</label>
                                </div>
                                <br>
                                <div class="radioX">
                                    <input id="x-2" type="radio" name="xCoordinate" value="-2" class="xBtn">
                                    <label for="x-2">-2</label>
                                </div>
                            </fieldset>
                        </td>
                        <!-- 2 столбик - координата Y -->
                        <td colspan="2">
                            <label for="yText">
                                <b>Введите координату Y:</b>
                            </label>
                            <p>
                                <input id="yText" name="yCoordinate" type="text" maxlength="10" placeholder="-5 ... 3">
                            </p>
                            <span role="alert" id="yNameError"></span>
                        </td>
                        <!-- 3 столбик - значение радиуса R -->
                        <td>
                            <fieldset id="rFieldSet">
                                <legend id="rLegend">
                                    <b>Выберите радиус R</b>
                                </legend>
                                <div class="radioR">
                                    <input id="r5" type="radio" name="radius" value="5" class="rBtn">
                                    <label for="r5">5</label>
                                </div>
                                <br>
                                <div class="radioR">
                                    <input id="r4" type="radio" name="radius" value="4" class="rBtn">
                                    <label for="r4">4</label>
                                </div>
                                <br>
                                <div class="radioR">
                                    <input id="r3" type="radio" name="radius" value="3" class="rBtn">
                                    <label for="r3">3</label>
                                </div>
                                <br>
                                <div class="radioR">
                                    <input id="r2" type="radio" name="radius" value="2" class="rBtn">
                                    <label for="r2">2</label>
                                </div>
                                <br>
                                <div class="radioR">
                                    <input id="r1" type="radio" name="radius" value="1" class="rBtn">
                                    <label for="r1">1</label>
                                </div>
                                <br>
                            </fieldset>
                        </td>
                    </tr>
                </table>
            </td>
            <!-- Столбик с отображением графика и кнопки -->
            <td id="visualisation">
                <!-- Картинка графика -->
                <article>
                    <figure id="areaImg">
                        <img id="graphImg" src="images/Area.png" alt="Изображение не найдено">
                        <figcaption>
                            <b>
                                <span id="imgLabel">График области</span>
                            </b>
                            <br><br>
                        </figcaption>
                    </figure>
                </article>
                <!-- Кнопка "submit" -->
                <p>
                    <input id="accButton" type="submit" value="Отправить данные на проверку">
                </p>
                <span role="alert" id="sendingError"></span>
            </td>
        </form>
    </tr>
</table>
<script src="js/Validating.js"></script>
</body>

</html>

<!--<a href="hello-servlet">Hello Servlet</a> -->