package ru.geekbrains.geekbrains_popular_libraries_kotlin.mvp.presenter

import ru.geekbrains.geekbrains_popular_libraries_kotlin.mvp.model.CountersModel
import ru.geekbrains.geekbrains_popular_libraries_kotlin.mvp.view.MainView

class MainPresenter(private val mainView: MainView) {
    private val model = CountersModel()

    fun counterClickBtn1() {
        val nextValue = model.next(0)
        mainView.setButtonTextBtn1(nextValue.toString())
    }

    fun counterClickBtn2() {
        val nextValue = model.next(1)
        mainView.setButtonTextBtn2(nextValue.toString())
    }

    fun counterClickBtn3() {
        val nextValue = model.next(2)
        mainView.setButtonTextBtn3(nextValue.toString())
    }
}