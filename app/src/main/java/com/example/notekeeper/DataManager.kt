package com.example.notekeeper

object DataManager {

    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses[course.courseId] = course

        course = CourseInfo("android_async", "Android Async Programming and Services")
        courses[course.courseId] = course

        course = CourseInfo("java_lang", "Java Fundamentals: The Java Language")
        courses[course.courseId] = course

        course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        courses[course.courseId] = course
    }

    private fun initializeNotes() {
        var note = courses["android_intents"]?.let { NoteInfo(it, "This is a note", "This is the content of the note") }
        notes.add(note!!)

        note = NoteInfo(courses["java_lang"]!!, "The last day of class!", "I don't want to take notes today!")
        notes.add(note)

        note = NoteInfo(courses["java_core"]!!, "The last day of class!", "I don't want to take notes today!")
        notes.add(note)

        note = NoteInfo(courses["java_core"]!!, "The last day of class!", "I don't want to take notes today!")
        notes.add(note)
    }

}