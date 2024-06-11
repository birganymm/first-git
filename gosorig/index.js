document.addEventListener("DOMContentLoaded", () => {
    const burger = document.querySelector("#burger");
    const navLinks = document.querySelector(".nav-links");

    burger.addEventListener("click", () => {
        navLinks.classList.toggle("nav-active");
    });

    const modeSwitcher = document.getElementById("modeSwitcher");
    modeSwitcher.addEventListener("click", () => {
        document.body.classList.toggle("dark-mode");
        modeSwitcher.textContent = document.body.classList.contains("dark-mode") ? "Light Mode" : "Dark Mode";
    });

    const modal = document.getElementById("myModal");
    const closeModal = document.querySelector(".close");

    closeModal.addEventListener("click", () => {
        modal.style.display = "none";
    });

    window.onclick = function(event) {
        if (event.target === modal) {
            modal.style.display = "none";
        }
    };
});
// Slide functionality
let currentSlide = 0;

function moveSlide(direction) {
    const slides = document.querySelectorAll('.slide');
    currentSlide = (currentSlide + direction + slides.length) % slides.length;
    document.querySelector('.slides').style.transform = `translateX(-${currentSlide * 100}%)`;
}

document.addEventListener('DOMContentLoaded', () => moveSlide(0));
// tab
// Tab functionality
    const tabLinks = document.querySelectorAll(".tab-link");
    const tabs = document.querySelectorAll(".tab");

    tabLinks.forEach((link) => {
        link.addEventListener("click", () => {
            tabLinks.forEach((item) => item.classList.remove("active"));
            tabs.forEach((item) => item.classList.remove("active"));

            link.classList.add("active");
            document.getElementById(link.dataset.tab).classList.add("active");
        });
    });

// phone
document.addEventListener("DOMContentLoaded", function() {
    const modal = document.getElementById("myModal");
    const btn = document.getElementById("submitBtn");
    const span = document.getElementsByClassName("close")[0];

    btn.onclick = function() {
        modal.style.display = "block";
    };

    span.onclick = function() {
        modal.style.display = "none";
    };

    window.onclick = function(event) {
        if (event.target == modal) {
            modal.style.display = "none";
        }
    };
});
