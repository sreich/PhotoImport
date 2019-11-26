import java.io.File
import java.lang.System.exit
import java.awt.Desktop


fun main(args: Array<String>) {

    print("Enter the name of the new photoshoot to create directories for: ")
    val desiredDir = readLine()!!

    //create it in both
    val rawsDir = "./New RAWs/$desiredDir/"
    val exportedDir = "./Exported JPEGs/$desiredDir/"

    File("$rawsDir/").mkdirs()

    //exported jpeg
    File("$exportedDir/orig").mkdirs()
    File("$exportedDir/8x10").mkdirs()
    File("$exportedDir/8x10-full").mkdirs()
    File("$exportedDir/9x16").mkdirs()
    File("$exportedDir/8x10-watermarked").mkdirs()

    val file = File(rawsDir)
    val desktop = Desktop.getDesktop()
    desktop.open(file)

    //exportedDir
//    File("$basePath").walk().forEach {
//        println(it)
//    }

    exit(0)
}
