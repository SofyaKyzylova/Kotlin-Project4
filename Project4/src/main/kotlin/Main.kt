class Name

class Author

class InternationalStandardBookNumber

class BookType

class PublishingHouse

class Book(name: Name, author: Author, isbn: InternationalStandardBookNumber, bookType: BookType, publishingHouse: PublishingHouse)
{
    public val name: Name = name
    public val author: Author = author
    public val isbn: InternationalStandardBookNumber = isbn
    public val bookType: BookType = bookType
    public val publishingHouse: PublishingHouse = publishingHouse

    constructor(name: Name) : this(name, Author(), InternationalStandardBookNumber(), BookType(), PublishingHouse()) {
        println("Constructor with 1 parameter: Name")
    }

    constructor(author: Author) : this(Name(), author, InternationalStandardBookNumber(), BookType(), PublishingHouse()) {
        println("Constructor with 1 parameter: Author")
    }

    constructor(isbn: InternationalStandardBookNumber) : this(Name(), Author(), isbn, BookType(), PublishingHouse()) {
        println("Constructor with 1 parameter: InternationalStandardBookNumber")
    }

    constructor(bookType: BookType) : this(Name(), Author(), InternationalStandardBookNumber(), bookType, PublishingHouse()) {
        println("Constructor with 1 parameter: BookType")
    }

    constructor(publishingHouse: PublishingHouse) : this(Name(), Author(), InternationalStandardBookNumber(), BookType(), publishingHouse) {
        println("Constructor with 1 parameter: PublishingHouse")
    }

    constructor(name: Name, author: Author, publishingHouse: PublishingHouse) : this(name, author, InternationalStandardBookNumber(), BookType(), publishingHouse) {
        println("Constructor with 3 parameters: Name, Author, PublishingHouse")
    }
}


fun main() {
    val book1 = Book(Name(), Author(), InternationalStandardBookNumber(), BookType(), PublishingHouse())
    println("Book 1")
    println(book1)
    println()

    val book2 = Book(Name())
    println("Book 2")
    println(book2)
    println()

    val book3 = Book(Name(), Author(), PublishingHouse())
    println("Book 3")
    println(book3)
    println()

    val library = listOf(Book(Name(), Author(), InternationalStandardBookNumber(), BookType(), PublishingHouse()),
        Book(Name(), Author(), InternationalStandardBookNumber(), BookType(), PublishingHouse()),
        Book(Name(), Author(), InternationalStandardBookNumber(), BookType(), PublishingHouse()))
    for(book in library)
    {
        println(book)
        println(book.name)
        println(book.author)
        println(book.isbn)
        println(book.bookType)
        println(book.publishingHouse)
        println()
    }
}