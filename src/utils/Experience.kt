package utils

data class Project(val title: String,
                    val description: String,
                    val code: String?,
                    val href: String?)

data class Work(val company: String,
                val job: String,
                val date: String,
                val description: String?)

data class Studies(val school: String,
                   val degree: String,
                   val date: String)

// FIXME grammar
val WORK_EXPERIENCE = listOf(
        Work("Kemik.gt", "Desarrollador web", "Marzo 2019 - Presente", "Encargado del desarrollo de herramientas internas. Desarrollo utilizando kotlin (retrofit, jackson, http4k), Vue, PHP, Python"),
        Work("Detektor", "Sys Admin", "Septiembre 2016 - Octubre 2016", "Encargado del mantenimiento de servidores, y todo equipo de computo interno utilizanod herramientos como bash, power shell, windows server, nginx")
)

val PROJECTS = listOf(
        Project(
                title = "Reciclaje UVG",
                description = "Aplicacion para fomentar el reciclaje en lugares publicos. La aplicacion fue desarrollada utilizando Vue + quasar (frontend), Express.js + PostgressSQL (Backend) y python (Embedded devices)",
                code = "https://github.com/chchew/PROYECTO-HCI",
                href = "https://thereciclator.herokuapp.com"
        ),
        Project(
                title = "Fedora Project Clone",
                description = "Clon SSR de https://start.fedoraproject.org/ desarrollado from scratch utilizando React, Babel, webpack, eslint, express",
                code = "https://github.com/val171001/fedoraproject-clone",
                href = "http://msdeus.site/171001/fpc/"
        )
)

val STUDIES = listOf(Studies("Universidad del Valle de Guatemala", "Ingenieria en ciencias de la computacion", "2017-2021"))

val ABOUT_ME = """

 ▄▄▄██▀▀▀▒█████    ██████  █    ██ ▓█████     ██▒   █▓ ▄▄▄       ██▓    ▓█████  ███▄    █ ▒███████▒ █    ██ ▓█████  ██▓    ▄▄▄      
   ▒██  ▒██▒  ██▒▒██    ▒  ██  ▓██▒▓█   ▀    ▓██░   █▒▒████▄    ▓██▒    ▓█   ▀  ██ ▀█   █ ▒ ▒ ▒ ▄▀░ ██  ▓██▒▓█   ▀ ▓██▒   ▒████▄    
   ░██  ▒██░  ██▒░ ▓██▄   ▓██  ▒██░▒███       ▓██  █▒░▒██  ▀█▄  ▒██░    ▒███   ▓██  ▀█ ██▒░ ▒ ▄▀▒░ ▓██  ▒██░▒███   ▒██░   ▒██  ▀█▄  
▓██▄██▓ ▒██   ██░  ▒   ██▒▓▓█  ░██░▒▓█  ▄      ▒██ █░░░██▄▄▄▄██ ▒██░    ▒▓█  ▄ ▓██▒  ▐▌██▒  ▄▀▒   ░▓▓█  ░██░▒▓█  ▄ ▒██░   ░██▄▄▄▄██ 
 ▓███▒  ░ ████▓▒░▒██████▒▒▒▒█████▓ ░▒████▒      ▒▀█░   ▓█   ▓██▒░██████▒░▒████▒▒██░   ▓██░▒███████▒▒▒█████▓ ░▒████▒░██████▒▓█   ▓██▒
 ▒▓▒▒░  ░ ▒░▒░▒░ ▒ ▒▓▒ ▒ ░░▒▓▒ ▒ ▒ ░░ ▒░ ░      ░ ▐░   ▒▒   ▓▒█░░ ▒░▓  ░░░ ▒░ ░░ ▒░   ▒ ▒ ░▒▒ ▓░▒░▒░▒▓▒ ▒ ▒ ░░ ▒░ ░░ ▒░▓  ░▒▒   ▓▒█░
 ▒ ░▒░    ░ ▒ ▒░ ░ ░▒  ░ ░░░▒░ ░ ░  ░ ░  ░      ░ ░░    ▒   ▒▒ ░░ ░ ▒  ░ ░ ░  ░░ ░░   ░ ▒░░░▒ ▒ ░ ▒░░▒░ ░ ░  ░ ░  ░░ ░ ▒  ░ ▒   ▒▒ ░
 ░ ░ ░  ░ ░ ░ ▒  ░  ░  ░   ░░░ ░ ░    ░           ░░    ░   ▒     ░ ░      ░      ░   ░ ░ ░ ░ ░ ░ ░ ░░░ ░ ░    ░     ░ ░    ░   ▒   
 ░   ░      ░ ░        ░     ░        ░  ░         ░        ░  ░    ░  ░   ░  ░         ░   ░ ░       ░        ░  ░    ░  ░     ░  ░
                                                  ░                                       ░
                                                web developer and sys admin
"""
