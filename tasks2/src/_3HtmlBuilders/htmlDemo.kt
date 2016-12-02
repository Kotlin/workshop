package _3HtmlBuilders

import _3HtmlBuilders.renderProductTable
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JScrollPane
import javax.swing.SwingConstants.CENTER

fun main(args: Array<String>) {
    with (JFrame("Product popularity")) {
        setSize(600, 600)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        add(JScrollPane(JLabel(renderProductTable(), CENTER)))
        isVisible = true
    }
}

