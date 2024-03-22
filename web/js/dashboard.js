/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

const submenuTitles = document.querySelectorAll(".submenu-title");

submenuTitles.forEach((title) => {
  title.addEventListener("click", () => {
    const submenu = title.nextElementSibling;
    submenu.style.display = submenu.style.display === "block" ? "none" : "block";
  });
});


function scrollToProgrammes() {
    var programmesSection = document.getElementById("programmes");
    if (programmesSection) {
        programmesSection.scrollIntoView({ behavior: "smooth" });
    }
}