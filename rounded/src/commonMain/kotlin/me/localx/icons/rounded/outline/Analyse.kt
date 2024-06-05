package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Analyse: ImageVector
    get() {
        if (_analyse != null) {
            return _analyse!!
        }
        _analyse = Builder(name = "Analyse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 23.707f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-5.969f, -5.969f)
                curveToRelative(-1.725f, 1.412f, -3.927f, 2.262f, -6.324f, 2.262f)
                curveTo(4.486f, 20.0f, 0.0f, 15.514f, 0.0f, 10.0f)
                reflectiveCurveTo(4.486f, 0.0f, 10.0f, 0.0f)
                curveToRelative(1.758f, 0.0f, 3.487f, 0.463f, 5.001f, 1.338f)
                curveToRelative(0.478f, 0.277f, 0.642f, 0.889f, 0.364f, 1.367f)
                curveToRelative(-0.185f, 0.32f, -0.521f, 0.499f, -0.866f, 0.499f)
                curveToRelative(-0.17f, 0.0f, -0.342f, -0.043f, -0.5f, -0.134f)
                curveToRelative(-1.209f, -0.7f, -2.592f, -1.07f, -3.999f, -1.07f)
                curveTo(5.589f, 2.0f, 2.0f, 5.589f, 2.0f, 10.0f)
                curveToRelative(0.0f, 1.167f, 0.257f, 2.274f, 0.709f, 3.274f)
                lineToRelative(3.799f, -4.559f)
                curveToRelative(0.362f, -0.436f, 0.896f, -0.7f, 1.462f, -0.726f)
                curveToRelative(0.562f, -0.025f, 1.122f, 0.188f, 1.524f, 0.591f)
                lineToRelative(1.928f, 1.928f)
                lineTo(20.237f, 0.34f)
                curveToRelative(0.362f, -0.419f, 0.994f, -0.462f, 1.41f, -0.103f)
                curveToRelative(0.418f, 0.361f, 0.465f, 0.993f, 0.104f, 1.411f)
                lineToRelative(-8.78f, 10.166f)
                curveToRelative(-0.366f, 0.424f, -0.897f, 0.679f, -1.458f, 0.7f)
                curveToRelative(-0.557f, 0.014f, -1.108f, -0.195f, -1.505f, -0.592f)
                lineToRelative(-1.928f, -1.928f)
                lineToRelative(-4.263f, 5.075f)
                curveToRelative(1.468f, 1.788f, 3.695f, 2.93f, 6.183f, 2.93f)
                curveToRelative(4.411f, 0.0f, 8.0f, -3.589f, 8.0f, -8.0f)
                curveToRelative(0.0f, -0.15f, -0.005f, -0.299f, -0.013f, -0.447f)
                curveToRelative(-0.029f, -0.552f, 0.395f, -1.022f, 0.946f, -1.052f)
                curveToRelative(0.547f, -0.04f, 1.022f, 0.394f, 1.052f, 0.945f)
                curveToRelative(0.01f, 0.183f, 0.015f, 0.368f, 0.015f, 0.553f)
                curveToRelative(0.0f, 2.398f, -0.85f, 4.6f, -2.262f, 6.324f)
                lineToRelative(5.969f, 5.969f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                close()
            }
        }
        .build()
        return _analyse!!
    }

private var _analyse: ImageVector? = null
