package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.TimerClockCall: ImageVector
    get() {
        if (_timerClockCall != null) {
            return _timerClockCall!!
        }
        _timerClockCall = Builder(name = "TimerClockCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.327f, 14.89f)
                curveToRelative(-2.327f, -1.097f, -4.042f, -2.818f, -5.207f, -5.227f)
                lineToRelative(2.964f, -2.963f)
                lineTo(5.442f, 0.058f)
                lineTo(1.798f, 3.702f)
                curveTo(0.659f, 4.838f, 0.032f, 6.374f, 0.032f, 8.025f)
                curveTo(0.032f, 15.177f, 8.823f, 23.968f, 15.975f, 23.968f)
                curveToRelative(1.651f, 0.0f, 3.187f, -0.627f, 4.322f, -1.765f)
                lineToRelative(3.646f, -3.645f)
                lineToRelative(-6.642f, -6.641f)
                lineToRelative(-2.974f, 2.973f)
                close()
                moveTo(18.175f, 20.083f)
                curveToRelative(-0.57f, 0.571f, -1.352f, 0.885f, -2.2f, 0.885f)
                curveToRelative(-4.993f, 0.0f, -12.942f, -7.067f, -12.942f, -12.942f)
                curveToRelative(0.0f, -0.849f, 0.314f, -1.63f, 0.886f, -2.201f)
                lineToRelative(1.524f, -1.524f)
                lineToRelative(2.399f, 2.399f)
                lineToRelative(-2.269f, 2.268f)
                lineToRelative(0.369f, 0.919f)
                curveToRelative(1.59f, 3.959f, 4.348f, 6.712f, 8.195f, 8.18f)
                lineToRelative(0.908f, 0.347f)
                lineToRelative(2.255f, -2.255f)
                lineToRelative(2.399f, 2.399f)
                lineToRelative(-1.525f, 1.525f)
                close()
                moveTo(19.0f, 10.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, -2.239f, 5.0f, -5.0f)
                reflectiveCurveTo(21.761f, 0.0f, 19.0f, 0.0f)
                reflectiveCurveToRelative(-5.0f, 2.239f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.239f, 5.0f, 5.0f, 5.0f)
                close()
                moveTo(18.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.586f)
                lineToRelative(1.707f, 1.707f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.293f, -2.293f)
                verticalLineToRelative(-3.414f)
                close()
            }
        }
        .build()
        return _timerClockCall!!
    }

private var _timerClockCall: ImageVector? = null
