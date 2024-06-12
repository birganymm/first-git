<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Landing Page</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <header>
        <div class="logo">Aty</div>
        <nav>
            <ul class="nav-links">
                <li><a href="#" id="home">Home</a></li>
                <li><a href="#">Feature</a></li>
                <li><a href="#">Product</a></li>
                <li><a href="#">Support</a></li>
            </ul>
        </nav>
        <div class="mode-switcher" id="modeSwitcher">Dark Mode</div>
        <div class="space"></div>
        <div class="burger" id="burger">
            <div class="line1"></div>
            <div class="line2"></div>
            <div class="line3"></div>
        </div>
    </header>

    <section class="content" id="home">
        <div class="left">
            <h1>Birbale!</h1>
            <p class="subheading">Birbale de birbale</p>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ad, nam aut, nemo deleniti, at minima ducimus excepturi repellendus harum nihil iste aliquid libero fuga molestias!</p>
            <a href="#" class="cta-button">Join Us</a>
        </div>
        <div class="slider">
                <div class="slides">
                    <div class="slide"><img src=".jpg" alt="Slide 1"></div>
                    <div class="slide"><img src=".jpg" alt="Slide 2"></div>
                    <div class="slide"><img src=".jpg" alt="Slide 3"></div>
                </div>
                <button class="nav prev" onclick="moveSlide(-1)">&#10094;</button>
                <button class="nav next" onclick="moveSlide(1)">&#10095;</button>
        </div>
    </section>

    <!-- Page 2 -->
    <section id="page2" class="page">
        <div class="tab-container">
            <div class="tabs">
                <button class="tab-link active" data-tab="tab1">Tab 1</button>
                <button class="tab-link" data-tab="tab2">Tab 2</button>
            </div>
            <div class="tab-content">
                <div id="tab1" class="tab active">
                    <h2>Tab 1 Content</h2>
                    <p>Welcome to Tab 1!</p>
                </div>
                <div id="tab2" class="tab">
                    <h2>Tab 2 Content</h2>
                    <p>Welcome to Tab 2!</p>
                </div>
            </div>
        </div>
        <div class="form-container">
            <form>
                <label for="phoneNumber">Phone Number:</label>
                <input type="text" id="phoneNumber" name="phoneNumber">
                <button type="button" id="submitBtn">Submit</button>
            </form>
        </div>

        <!-- The Modal -->
        <div id="myModal" class="modal">
            <div class="modal-content">
                <span class="close">&times;</span>
                <p>You submitted your phone number. We will call you later for additional information.</p>
            </div>
        </div>
    </section>
    
    <footer>
        <div class="footer-container">
            <div class="footer-left">
                <h3>About Us</h3>
                <p>Birbale biz turaly</p>
            </div>
            <div class="footer-middle">
                <h3>Contact</h3>
                <p>Email: contact@com</p>
            </div>
            <div class="footer-right">
                <h3>Follow Us</h3>
                <div class="social-icons">
                    <a href="#">Facebook</a>
                    <a href="#">Instagram</a>
                    <a href="#">Twitter</a>
                    <a href="#">YouTube</a>
                </div>
            </div>
        </div>
        <div class="footer-bottom">
            &copy; 2024. All rights reserved.
        </div>
    </footer>

    <div id="myModal" class="modal">
        <div class="modal-content">
            <span class="close">&times;</span>
            <p>Thank you for submitting!</p>
        </div>
    </div>

    <script src="index.js"></script>
</body>
</html>

:root {
    /* Colors */
    --primary-color: #003087;
    --secondary-color: #0050c8;
    --background-light: #f5f5f5;
    --background-dark: #121212;
    --text-light: #ffffff;
    --text-dark: #333333;
    --footer-bg: #003087;
    --footer-bg-dark: #1e1e1e;
    --cta-hover: #7babf4;
}

* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: Arial, sans-serif;
}

body {
    background-color: var(--background-light);
    color: var(--text-dark);
    transition: background-color 0.3s, color 0.3s;
}

header {
    display: flex;
    justify-content: space-between;
    align-items: center;
    background-color: var(--text-light);
    padding: 2% 12%;
    box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
    transition: background-color 0.3s;
}

.logo {
    font-size: 24px;
    font-weight: bold;
}

nav {
    flex: 1;
    text-align: center;
}

.nav-links {
    list-style: none;
    display: inline-flex;
    background-color: var(--text-light);
    padding: 10px;
    transition: background-color 0.3s;
}

.nav-links li {
    margin: 0 15px;
}

.nav-links a {
    text-decoration: none;
    color: var(--text-dark);
    transition: color 0.3s;
}

.mode-switcher {
    cursor: pointer;
}



.burger {
    
    display: none;
    cursor: pointer;
}

.burger div {
    
    width: 25px;
    height: 3px;
    background-color: var(--text-dark);
    margin: 5px;
    transition: all 0.3s;
}
.space {
    width: 2%;
}
.content {
    display: flex;
    justify-content: space-around;
    align-items: center;
    min-height: 80vh;
    padding: 0 12%;
}

.left {
    max-width: 600px;
}

.left h1 {
    font-size: 48px;
    margin-bottom: 20px;
}


.subheading {
    font-size: 24px;
    margin-bottom: 20px;
}

.left p {
    font-size: 16px;
    margin-bottom: 20px;
}

.cta-button {
    background-color: var(--primary-color);
    color: var(--text-light);
    padding: 15px 30px;
    text-decoration: none;
    border-radius: 5px;
    transition: background-color 0.3s;
}

.cta-button:hover {
    background-color: var(--secondary-color);
}
/* */
.slider img {
    max-width:  800px;
    
    
}
.slider {
    position: relative;
    width: 50%;
    max-width: 300px;
    overflow: hidden;
    border-radius: 10px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

.slides {
    margin-top: 50px;
    display: flex;
    transition: transform 0.5s ease-in-out;
}

.slide {
    min-width: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
}

.slide img {
    width: 100%;
    height: auto;
    border-radius: 10px;
}

.nav {
    position: absolute;
    top: 50%;
    transform: translateY(-50%);
    background: rgba(0, 0, 0, 0.5);
    color: #fff;
    border: none;
    padding: 10px;
    cursor: pointer;
    border-radius: 50%;
}

.nav.prev {
    left: 10px;
}

.nav.next {
    right: 10px;
}

footer {
    background-color: var(--footer-bg);
    color: var(--text-light);
    padding: 20px 0;
    text-align: center;
}

.footer-container {
    display: flex;
    justify-content: space-around;
    align-items: flex-start;
    flex-wrap: wrap;
    padding: 20px;
}

.footer-left, .footer-middle, .footer-right {
    flex: 1;
    margin: 10px;
    min-width: 200px;
}

.footer-left h3, .footer-middle h3, .footer-right h3 {
    margin-bottom: 10px;
}

.footer-bottom {
    margin-top: 10px;
}

.social-icons a {
    display: inline-block;
    margin: 5px;
    text-decoration: none;
    color: var(--text-light);
    background-color: var(--secondary-color);
    padding: 10px;
    border-radius: 5px;
    transition: background-color 0.3s;
}

.social-icons a:hover {
    background-color: var(--primary-color);
}

/* Responsive Styles */
@media (max-width: 768px) {
    .content {
        flex-direction: column;
        text-align: center;
    }

    .left, .slider {
        max-width: 100%;
    }

    .nav-links {
        display: none;
        flex-direction: column;
        align-items: center;
        background-color: var(--text-light);
        padding: 20px 0;
        box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        position: absolute;
        top: 60px;
        left: 0;
        right: 0;
    }

    .nav-links.nav-active {
        display: flex;
    }

    .burger {
        display: block;
    }

    .nav-active li {
        margin: 10px 0;
    }
}

/* Dark Mode Styles */
body.dark-mode {
    background-color: var(--background-dark);
    color: var(--text-light);
}

body.dark-mode header {
    background-color: var(--background-dark);
}

body.dark-mode .nav-links {
    background-color: var(--background-dark);
}

body.dark-mode .nav-links a {
    color: var(--text-light);
}

body.dark-mode footer {
    background-color: var(--footer-bg-dark);
}

body.dark-mode .content {
    background-color: var(--background-dark);
}

body.dark-mode .cta, 
body.dark-mode .cta-button {
    background-color: var(--secondary-color);
}

body.dark-mode .social-icons a {
    background-color: #444;
}

/* Modal Styles */
.modal {
    display: none;
    position: fixed;
    z-index: 1;
    left: 0;
    top: 0;
    width: 100%;
    height: 100%;
    overflow: auto;
    background-color: rgba(0,0,0,0.4);
    padding-top: 60px;
}

.modal-content {
    background-color: #fefefe;
    margin: 5% auto;
    padding: 20px;
    border: 1px solid #888;
    width: 80%;
    max-width: 500px;
    border-radius: 10px;
    box-shadow: 0 5px 15px rgba(0,0,0,0.3);
}

.close {
    color: #aaa;
    float: right;
    font-size: 28px;
    font-weight: bold;
}

.close:hover,
.close:focus {
    color: black;
    text-decoration: none;
    cursor: pointer;
}

/* tab */
/* General Styles */
.tab-container {
    width: 100%;
    max-width: 600px;
    margin: 30px auto;
    background-color: var(--text-light);
    border: 1px solid #ccc;
    border-radius: 5px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    transition: background-color 0.3s;
}

.tabs {
    display: flex;
    justify-content: space-around;
    border-bottom: 1px solid #ccc;
}

.tab-link {
    flex: 1;
    padding: 10px 20px;
    cursor: pointer;
    background-color: var(---light);
    border: none;
    outline: none;
    transition: background-color 0.5s;
    text-align: center;
    color: var(--text-dark);
}

.tab-link:hover {
    background-color: var(--cta-hover);
}

.tab-link.active {
    background-color: var(--primary-color);
    color: var(--text-light);
}

.tab-content {
    padding: 20px;
    background-color: var(--text-light);
    transition: background-color 0.3s;
}

.tab {
    display: none;
}

.tab.active {
    display: block;
}

.form-container {
    display: flex;
    justify-content: center;
    margin-top: 20px;
}

form {
    display: flex;
    flex-direction: column;
    width: 300px;
    padding-bottom: 10%;
    padding-top: 5%;
}

form label, form input, form button {
    margin-bottom: 10px;
}

form input {
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
    background-color: var(--background-light);
    color: var(--text-dark);
}

form button {
    padding: 10px;
    border: none;
    background-color: var(--primary-color);
    color: var(--text-light);
    border-radius: 5px;
    cursor: pointer;
    transition: background-color 0.3s;
}

form button:hover {
    background-color: var(--cta-hover);
}

/* Modal Styles */
.modal {
    display: none;
    position: fixed;
    z-index: 1;
    left: 0;
    top: 0;
    width: 100%;
    height: 100%;
    overflow: auto;
    background-color: rgba(0, 0, 0, 0.4);
    padding-top: 60px;
    transition: background-color 0.3s;
}

.modal-content {
    background-color: var(--text-light);
    margin: 5% auto;
    padding: 20px;
    border: 1px solid #888;
    width: 80%;
    max-width: 500px;
    border-radius: 10px;
    box-shadow: 0 5px 15px rgba(0, 0, 0, 0.3);
    transition: background-color 0.3s;
}

.close {
    color: #aaa;
    float: right;
    font-size: 28px;
    font-weight: bold;
}

.close:hover,
.close:focus {
    color: black;
    text-decoration: none;
    cursor: pointer;
}

/* Dark Mode Styles */
body.dark-mode .tab-container,
body.dark-mode .tab-content,
body.dark-mode .modal-content {
    background-color: var(--background-dark);
}

body.dark-mode .tab-link {
    background-color: var(--background-dark);
    color: var(--text-light);
}

body.dark-mode .tab-link.active {
    background-color: var(--secondary-color);
}

body.dark-mode .form input,
body.dark-mode .form button {
    background-color: var(--background-dark);
    color: var(--text-light);
}

body.dark-mode .form button:hover {
    background-color: var(--secondary-color);
}

/* Responsive Styles */
@media (max-width: 600px) {
    .tabs {
        flex-direction: column;
    }

    .tab-link {
        text-align: left;
        padding: 15px;
    }

    .tab-container,
    .tab-content,
    .modal-content {
        width: 90%;
    }
}


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
