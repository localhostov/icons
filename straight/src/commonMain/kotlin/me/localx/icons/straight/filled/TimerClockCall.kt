package me.localx.icons.straight.filled

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

public val Icons.Filled.TimerClockCall: ImageVector
    get() {
        if (_timerClockCall != null) {
            return _timerClockCall!!
        }
        _timerClockCall = Builder(name = "TimerClockCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.613f, 12.848f)
                lineToRelative(6.265f, 6.266f)
                lineToRelative(-3.171f, 3.171f)
                curveToRelative(-1.105f, 1.106f, -2.6f, 1.716f, -4.207f, 1.716f)
                curveTo(9.252f, 24.0f, 0.0f, 14.748f, 0.0f, 7.5f)
                curveToRelative(0.0f, -1.608f, 0.609f, -3.103f, 1.716f, -4.208f)
                lineTo(4.887f, 0.122f)
                lineToRelative(6.265f, 6.265f)
                lineToRelative(-4.125f, 4.125f)
                curveToRelative(1.373f, 3.061f, 3.493f, 5.186f, 6.453f, 6.468f)
                lineToRelative(4.133f, -4.132f)
                close()
                moveTo(19.0f, 0.0f)
                curveToRelative(-2.761f, 0.0f, -5.0f, 2.239f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.239f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.239f, 5.0f, -5.0f)
                reflectiveCurveTo(21.761f, 0.0f, 19.0f, 0.0f)
                close()
                moveTo(20.293f, 7.707f)
                lineToRelative(-2.293f, -2.293f)
                verticalLineToRelative(-3.414f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.586f)
                lineToRelative(1.707f, 1.707f)
                lineToRelative(-1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _timerClockCall!!
    }

private var _timerClockCall: ImageVector? = null
