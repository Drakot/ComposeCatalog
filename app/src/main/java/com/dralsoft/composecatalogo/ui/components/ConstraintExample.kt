package com.dralsoft.composecatalogo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import com.dralsoft.composecatalogo.ui.theme.*

@Composable
fun ConstrainExample1() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxBlack, boxRed, boxPurple7, boxPurple2, boxTeal) = createRefs()


        Box(modifier = Modifier
            .size(125.dp)
            .background(Red)
            .constrainAs(boxRed) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
            })

        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Purple700)
                .constrainAs(boxPurple7) {
                    bottom.linkTo(boxRed.top)
                    end.linkTo(boxRed.start)
                })
        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Purple200)
                .constrainAs(boxPurple2) {
                    bottom.linkTo(boxRed.top)
                    start.linkTo(boxRed.end)
                })
        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Teal200)
                .constrainAs(boxTeal) {
                    top.linkTo(boxRed.bottom)
                    start.linkTo(boxRed.end)
                })

        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Black)
                .constrainAs(boxBlack) {
                    top.linkTo(boxRed.bottom)
                    end.linkTo(boxRed.start)
                })

    }
}

@Composable
fun ConstrainExampleGuide() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val boxRed = createRef()

        val topGuide = createGuidelineFromTop(0.1f)
        val startGuide = createGuidelineFromStart(0.25f)

        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Red)
                .constrainAs(boxRed) {
                    top.linkTo(topGuide)
                    start.linkTo(startGuide)
                })

    }
}

@Composable
fun ConstrainExampleBarrier() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxBlack, boxTeal, boxRed, boxPurple7) = createRefs()

        // val topGuide = createGuidelineFromTop(0.1f)
        //  val startGuide = createGuidelineFromStart(0.25f)

        val barrier = createEndBarrier(boxRed, boxBlack)

        Box(
            modifier = Modifier
                .size(125.dp)
                .background(Color.Black)
                .constrainAs(boxBlack) {
                    start.linkTo(parent.start, margin = 16.dp)
                })

        Box(
            modifier = Modifier
                .size(225.dp)
                .background(Red)
                .constrainAs(boxRed) {
                    start.linkTo(boxBlack.start, margin = 36.dp)
                    top.linkTo(boxBlack.bottom)
                })
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Teal200)
                .constrainAs(boxTeal) {
                    start.linkTo(barrier)
                })

    }
}

@Preview
@Composable
fun ConstrainExampleChain() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxBlack, boxTeal, boxRed, boxPurple7) = createRefs()

        Box(
            modifier = Modifier
                .size(75.dp)
                .background(Color.Black)
                .constrainAs(boxBlack) {
                    start.linkTo(parent.start)
                    end.linkTo(boxRed.start)
                })

        Box(
            modifier = Modifier
                .size(75.dp)
                .background(Red)
                .constrainAs(boxRed) {
                    start.linkTo(boxBlack.end)
                    end.linkTo(boxTeal.start)
                })
        Box(
            modifier = Modifier
                .size(75.dp)
                .background(Teal200)
                .constrainAs(boxTeal) {
                    start.linkTo(boxRed.end)
                    end.linkTo(parent.end)
                })

        createHorizontalChain(boxRed, boxBlack, boxTeal, chainStyle = ChainStyle.SpreadInside)

    }
}