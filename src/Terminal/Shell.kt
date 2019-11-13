package Terminal

import react.*
import react.dom.*
import utils.PROJECTS
import utils.WORK_EXPERIENCE
import utils.STUDIES
import utils.ABOUT_ME

// TODO Check grammar
// TODO Improve css layout and fonts (Color & Size)

data class Command(val command: String,
                   val resultKey: String)

interface ShellProps: RProps {
    var user: String
    var dir: String
    var commandList: List<Command>
}

interface ShellState: RState {
    var commandsExecuted: Int?
    var last: Boolean
}

class Shell(props: ShellProps): RComponent<ShellProps, ShellState>() {

    private val history: MutableList<Command> = mutableListOf(props.commandList[0])

    override fun ShellState.init(props: ShellProps) {
        commandsExecuted = 0
    }

    fun addToHistory() {
        val index = state.commandsExecuted ?: 0
        if (index == props.commandList?.size -1) { return }
        history.add(props.commandList[index + 1])
        setState{
            commandsExecuted = index + 1
        }
    }

    private fun RBuilder.getResults(key: String) {
        when(key) {
            "whoami" -> pre {+ABOUT_ME}
            "projects" -> div("projects") {
                for (project in PROJECTS) {
                    div("project") {
                        h1("title"){ a {
                            attrs.href = project.href ?: ""
                            +project.title
                        } }
                        p("description") { +project.description}
                        project.code?.let {
                            a{
                                attrs.href = it
                                +"visitar"
                            }
                        }
                    }
                }
                a("github") {
                    attrs.href = "https://github.com/val171001"
                    +"Mas proyectos en github val171001"
                }
            }
            "work" -> div("work-experience") {
                for( work in WORK_EXPERIENCE) {
                    div("work") {
                        h1("title") {+work.company}
                        h3("position") {+work.job}
                        h4("date") {+work.date}
                        work.description?.let { p("description"){+it} }
                    }
                }
            }
            "studies" -> div("studies") {
                for(study in STUDIES) {
                    div("study") {
                        h2("degree") {+study.degree}
                        h3("school") {+study.school}
                        h4("date") {+study.date}
                    }
                }
            }
            "shutdown" -> pre {
               +"Password:\nShutdown NOW!\n\n*** FINAL System shutdown message from ${props.user}@JV ***\nSystem going down IMMEDIATELY\n\n\nSystem shutdown time has arrived"
            }
            else -> span("error") { +"No results found"}
        }
    }
    override fun RBuilder.render() {
        div("terminal") {
            for(command in history) {
                div("shell-command") {
                    attrs { key = command.resultKey }
                    div {
                        commandUI(command.command, "${props.user}@JV:~/${props.dir}\$", ::addToHistory) {
                            getResults(command.resultKey)
                        }
                    }
                }
            }
        }
    }
    
}

fun RBuilder.shell(user: String, dir: String, commands: List<Command>) = child(Shell::class){
    attrs.user = user
    attrs.dir = dir
    attrs.commandList = commands
}
