document.getElementById("academics").addEventListener("click", function () {
    var dropdown = document.getElementById("academics-dropdown");
    if (dropdown.style.display === "none" || dropdown.style.display === "") {
        dropdown.style.display = "block";
    } else {
        dropdown.style.display = "none";
    }
});

document.getElementById("math").addEventListener("click", function () {
    displayMathChapters();
});

document.getElementById("science").addEventListener("click", function () {
    displaySubjects("Science", ["Physics", "Chemistry", "Biology"]);
});

document.getElementById("health").addEventListener("click", function () {
    displaySubjects("Health", ["Nutrition", "Exercise", "Mental Health"]);
});

function displaySubjects(subject, chapters) {
    var content = document.querySelector(".content");
    content.innerHTML = `<h2>${subject}</h2>`;
    
    var dropdownList = document.createElement("div");
    dropdownList.classList.add("dropdown");
    
    chapters.forEach(function (chapter) {
        var chapterItem = document.createElement("div");
        chapterItem.classList.add("dropdown-item");
        chapterItem.textContent = chapter;
        dropdownList.appendChild(chapterItem);
    });
    
    content.appendChild(dropdownList);
}

function displayMathChapters() {
    var mathDropdown = document.getElementById("math-dropdown");
    if (mathDropdown.style.display === "none" || mathDropdown.style.display === "") {
        mathDropdown.style.display = "block";
    } else {
        mathDropdown.style.display = "none";
    }
}
