const min = -5;
const max = 3;

qS("#yText").oninput = revalidateAns;
qS("#yText").onchange = revalidateAns;
let ans;

function revalidateAns() {
    ans = validateY();
    qS("#yNameError").textContent = ans;
}

el("mainForm").addEventListener("submit", (e) => {
    let yAns = validateY();
    let xAns = validateX();
    let rAns = validateR();
    let answer = (yAns + xAns + rAns !== "" ? "Ошибка отправки: " : "") +
        (yAns === "" ? yAns : yAns + "; ") +
        (xAns === "" ? xAns : xAns + "; ") +
        (rAns === "" ? rAns : rAns + "; ");
    qS("#sendingError").textContent = answer;
    if (answer.length > 0) {
        e.preventDefault();
    }
});

function validateY() {

    let y = qS("#yText").value;
    console.log(y);

    if (y.replace(/\s/g, "") === "" || y === "") {
        return "Y не может быть пустым";
    }

    y = y.trim();

    if (!(/^-?\d*[.,]?\d+$/.test(y))) {
        return "Y - десятичное число";
    }
    if (y < min || y > max) {
        return min + " <= Y <= " + max;
    }
    if (y.length > 10) {
        return "Длина поля Y < 11"
    }

    return "";
}

function validateX() {
    let xSet = elByClassname("xBtn");
    let x;
    for (let i = 0; i < xSet.length; i++) {
        if (xSet[i].checked) {
            x = xSet[i].value;
            break;
        }
    }
    if (isNaN(x)) {
        return "Не выбран X";
    } else {
        return "";
    }
}

function validateR() {
    let rSet = elByClassname("rBtn");
    let r;
    for (let i = 0; i < rSet.length; i++) {
        if (rSet[i].checked) {
            r = rSet[i].value;
            break;
        }
    }
    if (isNaN(r)) {
        return "Не выбран R";
    } else {
        return "";
    }
}

function qS(element) {
    return document.querySelector(element);
}

function el(element) {
    return document.getElementById(element);
}

function elByClassname(element) {
    return document.getElementsByClassName(element)
}

