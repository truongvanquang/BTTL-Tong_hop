package com.ute.studentmvvm.network

import com.google.gson.annotations.SerializedName
import com.ute.studentmvvm.model.Student

data class StudentDto(
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("name")
    val fullName: String? = null,
    @SerializedName("username")
    val studentCode: String? = null,
    @SerializedName("email")
    val email: String? = null,
    @SerializedName("gpa")
    val gpa: Double? = null,
    @SerializedName("major")
    val major: String? = null
)

fun StudentDto.toEntity(): Student {
    return Student(
        id = 0,
        fullName = fullName ?: "Sinh viên Cloud",
        studentCode = studentCode ?: "2011${(1000..9999).random()}",
        email = email ?: "student@ute.udn.vn",
        gpa = gpa ?: 3.50,
        major = major ?: "Công Nghệ Thông Tin"
    )
}