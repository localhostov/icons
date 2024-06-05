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

public val Icons.Bold.PlugCircleCheck: ImageVector
    get() {
        if (_plugCircleCheck != null) {
            return _plugCircleCheck!!
        }
        _plugCircleCheck = Builder(name = "PlugCircleCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(18.752f, 20.44f)
                lineToRelative(-0.004f, 0.004f)
                curveToRelative(-0.744f, 0.744f, -2.058f, 0.746f, -2.823f, -0.019f)
                lineToRelative(-2.182f, -2.268f)
                lineToRelative(1.387f, -1.441f)
                lineToRelative(2.216f, 2.301f)
                lineToRelative(3.614f, -3.703f)
                lineToRelative(1.398f, 1.43f)
                lineToRelative(-3.607f, 3.696f)
                close()
                moveTo(10.459f, 15.35f)
                curveToRelative(-0.292f, 0.831f, -0.459f, 1.72f, -0.459f, 2.65f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.519f)
                curveToRelative(-3.352f, -0.257f, -6.0f, -3.065f, -6.0f, -6.481f)
                verticalLineToRelative(-4.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(-3.0f)
                lineTo(4.0f, 5.0f)
                lineTo(4.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(7.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                lineTo(10.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.262f)
                curveToRelative(-1.112f, 0.287f, -2.131f, 0.801f, -3.0f, 1.498f)
                verticalLineToRelative(-3.76f)
                lineTo(4.0f, 8.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.335f, 0.0f, 0.652f, -0.062f, 0.959f, -0.15f)
                close()
            }
        }
        .build()
        return _plugCircleCheck!!
    }

private var _plugCircleCheck: ImageVector? = null
