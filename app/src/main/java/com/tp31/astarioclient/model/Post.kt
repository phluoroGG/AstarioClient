package com.tp31.astarioclient.model

class Post {

    private var id = 0
    private var header: String? = null
    private var text: String? = null

    fun getId(): Int {
        return id
    }

    fun setId(id: Int) {
        this.id = id
    }

    fun getHeader(): String? {
        return header
    }

    fun setHeader(header: String) {
        this.header = header
    }

    fun getText(): String? {
        return text
    }

    fun setText(text: String) {
        this.text = text
    }

    override fun toString(): String {
        return "Post{" +
                "id=" + id +
                ", header='" + header + '\'' +
                ", text='" + text + '\'' +
                '}'
    }
}

