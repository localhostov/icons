package me.localx.icons.rounded.bold

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

public val Icons.Bold.PersonDolly: ImageVector
    get() {
        if (_personDolly != null) {
            return _personDolly!!
        }
        _personDolly = Builder(name = "PersonDolly", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.0f, 2.5f)
                curveTo(1.0f, 1.119f, 2.119f, 0.0f, 3.5f, 0.0f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveTo(1.0f, 3.881f, 1.0f, 2.5f)
                close()
                moveTo(1.5f, 18.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(23.961f, 18.043f)
                curveToRelative(-0.187f, -0.808f, -0.992f, -1.311f, -1.8f, -1.122f)
                lineToRelative(-6.813f, 1.579f)
                lineToRelative(-2.86f, -12.339f)
                curveToRelative(-0.187f, -0.808f, -0.993f, -1.311f, -1.8f, -1.122f)
                curveToRelative(-0.807f, 0.187f, -1.31f, 0.993f, -1.123f, 1.8f)
                lineToRelative(0.733f, 3.161f)
                horizontalLineToRelative(-1.966f)
                lineToRelative(-1.325f, -2.121f)
                curveToRelative(-0.736f, -1.177f, -2.004f, -1.879f, -3.392f, -1.879f)
                horizontalLineToRelative(-0.614f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(4.085f)
                curveToRelative(0.0f, 1.396f, 0.744f, 2.71f, 1.942f, 3.43f)
                lineToRelative(3.058f, 1.835f)
                verticalLineToRelative(4.15f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-4.434f)
                curveToRelative(0.0f, -0.873f, -0.465f, -1.695f, -1.213f, -2.144f)
                lineToRelative(-1.787f, -1.072f)
                verticalLineToRelative(-4.52f)
                lineToRelative(0.935f, 1.497f)
                curveToRelative(0.461f, 0.734f, 1.253f, 1.173f, 2.119f, 1.173f)
                horizontalLineToRelative(2.939f)
                lineToRelative(1.446f, 6.236f)
                curveToRelative(-0.85f, 0.399f, -1.439f, 1.262f, -1.439f, 2.264f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.024f, -0.001f, -0.048f, -0.002f, -0.072f)
                lineToRelative(6.841f, -1.586f)
                curveToRelative(0.807f, -0.187f, 1.31f, -0.992f, 1.123f, -1.8f)
                close()
                moveTo(16.43f, 14.635f)
                curveToRelative(0.201f, 0.859f, 1.062f, 1.391f, 1.92f, 1.187f)
                lineToRelative(2.907f, -0.691f)
                curveToRelative(0.854f, -0.203f, 1.383f, -1.059f, 1.183f, -1.914f)
                lineToRelative(-0.7f, -2.986f)
                curveToRelative(-0.201f, -0.859f, -1.062f, -1.391f, -1.92f, -1.187f)
                lineToRelative(-2.907f, 0.691f)
                curveToRelative(-0.854f, 0.203f, -1.383f, 1.059f, -1.183f, 1.914f)
                lineToRelative(0.7f, 2.986f)
                close()
            }
        }
        .build()
        return _personDolly!!
    }

private var _personDolly: ImageVector? = null
