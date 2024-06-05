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

public val Icons.Bold.Snooze: ImageVector
    get() {
        if (_snooze != null) {
            return _snooze!!
        }
        _snooze = Builder(name = "Snooze", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.914f, 16.056f)
                lineToRelative(-5.623f, 4.944f)
                horizontalLineToRelative(5.209f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                lineTo(2.813f, 24.0f)
                curveToRelative(-1.232f, 0.0f, -2.279f, -0.76f, -2.667f, -1.935f)
                curveToRelative(-0.383f, -1.16f, -0.014f, -2.377f, 0.94f, -3.121f)
                lineToRelative(5.623f, -4.944f)
                lineTo(1.5f, 14.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5.687f)
                curveToRelative(1.232f, 0.0f, 2.279f, 0.759f, 2.667f, 1.935f)
                curveToRelative(0.383f, 1.16f, 0.014f, 2.377f, -0.94f, 3.121f)
                close()
                moveTo(22.5f, 19.0f)
                horizontalLineToRelative(-1.41f)
                lineToRelative(2.064f, -1.923f)
                curveToRelative(0.737f, -0.601f, 1.029f, -1.594f, 0.728f, -2.505f)
                curveToRelative(-0.311f, -0.94f, -1.183f, -1.572f, -2.17f, -1.572f)
                horizontalLineToRelative(-3.212f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.41f)
                lineToRelative(-2.064f, 1.923f)
                curveToRelative(-0.737f, 0.601f, -1.029f, 1.594f, -0.728f, 2.505f)
                curveToRelative(0.311f, 0.94f, 1.183f, 1.572f, 2.17f, 1.572f)
                horizontalLineToRelative(3.212f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(20.0f, 9.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.692f)
                lineToRelative(4.207f, -3.379f)
                curveToRelative(0.89f, -0.661f, 1.253f, -1.813f, 0.904f, -2.868f)
                curveToRelative(-0.352f, -1.065f, -1.301f, -1.753f, -2.418f, -1.753f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.743f)
                lineToRelative(-4.206f, 3.379f)
                curveToRelative(-0.89f, 0.66f, -1.254f, 1.812f, -0.905f, 2.868f)
                curveToRelative(0.352f, 1.065f, 1.301f, 1.753f, 2.418f, 1.753f)
                horizontalLineToRelative(4.95f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _snooze!!
    }

private var _snooze: ImageVector? = null
