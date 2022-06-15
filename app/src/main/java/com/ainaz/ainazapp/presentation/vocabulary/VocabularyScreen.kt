package com.ainaz.ainazapp.presentation.vocabulary

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.ainaz.ainazapp.domain.model.localdictionary.Word

@Composable
fun VocabularyScreen() {
    LazyColumn() {
        items(vocabulary) { lex ->
            LexItem(title = lex.text, subtitle = lex.description) {

            }
        }
    }
}


val vocabulary = listOf(
    Word(
        text = "IDE (integrated development environment)",
        description = "an application normally consisting of a source code editor, a compiler and/or interpreter, build-automation tools, and a debugger"
    ),
    Word(
        text = "open source",
        description = "a program in which the code is distributed allowing programmers to alter and change the original software as much as they like"
    ),
    Word(
        text = "feature",
        description = "something a computer program is \"supposed\" to do; often a reason to buy or upgrade software"
    ),
    Word(
        text = "crash",
        description = "a computer failure which aborts an application or freezes an operating system"
    ),
    Word(
        text = "bug",
        description = "an error or glitch in a computer program caused by a programmer's mistake"
    ),
    Word(
        text = "closed source",
        description = "software in which the license stipulates that the user cannot see, edit, or manipulate the source code of a software program"
    ),
    Word(
        text = "compatible",
        description = "capable of being used without modification"
    ),
    Word(
        text = "error",
        description = "an incorrect action attributable to poor judgment, ignorance, or inattention"
    ),
    Word(
        text = "code monkey",
        description = "someone who sits and programs all day; someone who is only valued for their programming skills"
    ),
    Word(
        text = "early adopter",
        description = "a person who likes new things and often buys them before they are proven"
    ),
    Word(
        text = "fanboy",
        description = "someone obsessed or devoted to a particular item or genre"
    ),
    Word(
        text = "flame",
        description = "to write an intentionally abusive reply to a comment or forum post"
    ),
    Word(
        text = "geek",
        description = "an individual with a passion for computers, to the exclusion of other normal human interests"
    ),
    Word(
        text = "Killer app",
        description = "a piece of software which redefines the industry, often causing people to rush out and buy new hardware so they can use it"
    ),
    Word(
        text = "leading edge",
        description = "at the forefront of a new technology; also referred to as \"state-of-the-art\""
    ),
    Word(
        text = "PHB (pointy haired boss)",
        description = "This is a derogatory reference to a stereotypical IT manager who choose their technology platforms based on the latest TV commercial and have no knowledge at all of what their employees actually do"
    ),
    Word(
        text = "spaghetti code",
        description = "a derogatory term for poorly organized programming code."
    ),
    Word(
        text = "trendsetter",
        description = "someone who successfully defines a path for the rest of the industry to follow"
    ),
    Word(
        text = "troll",
        description = "a person who writes intentionally controversial posts on a user forum in order to start a flame war."
    ),
    Word(
        text = "whatever",
        description = "something sarcastic you can say to non-technical people when they tell repeatedly give you misguided technical instructions that are impossible, impractical, dangerous, or overly time-consuming"
    )
)


