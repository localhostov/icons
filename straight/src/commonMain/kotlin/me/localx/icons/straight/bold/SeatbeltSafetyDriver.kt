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

public val Icons.Bold.SeatbeltSafetyDriver: ImageVector
    get() {
        if (_seatbeltSafetyDriver != null) {
            return _seatbeltSafetyDriver!!
        }
        _seatbeltSafetyDriver = Builder(name = "SeatbeltSafetyDriver", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 20.125f)
                curveToRelative(0.605f, -0.29f, 1.648f, -0.703f, 3.0f, -0.941f)
                verticalLineToRelative(4.816f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.875f)
                close()
                moveTo(14.0f, 24.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.969f)
                curveToRelative(-0.907f, -0.336f, -1.937f, -0.645f, -3.0f, -0.837f)
                verticalLineToRelative(4.805f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(21.0f, 4.389f)
                lineToRelative(-10.984f, 9.729f)
                curveToRelative(0.626f, -0.075f, 1.289f, -0.119f, 1.984f, -0.119f)
                curveToRelative(1.019f, 0.0f, 2.027f, 0.12f, 3.0f, 0.301f)
                verticalLineToRelative(-1.926f)
                lineToRelative(3.0f, -2.657f)
                verticalLineToRelative(5.366f)
                curveToRelative(1.169f, 0.392f, 2.201f, 0.828f, 3.0f, 1.206f)
                verticalLineToRelative(3.366f)
                curveToRelative(-0.994f, -0.55f, -5.059f, -2.657f, -9.0f, -2.657f)
                reflectiveCurveToRelative(-6.646f, 1.734f, -6.673f, 1.751f)
                lineToRelative(-2.321f, 1.519f)
                lineToRelative(-0.006f, -3.945f)
                lineToRelative(3.0f, -2.657f)
                verticalLineToRelative(-4.168f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                curveToRelative(0.0f, 0.0f, 5.097f, 0.008f, 5.146f, 0.01f)
                lineTo(21.0f, 0.382f)
                verticalLineToRelative(4.007f)
                close()
                moveTo(11.27f, 9.0f)
                horizontalLineToRelative(-1.77f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(1.51f)
                lineToRelative(2.27f, -2.01f)
                close()
            }
        }
        .build()
        return _seatbeltSafetyDriver!!
    }

private var _seatbeltSafetyDriver: ImageVector? = null
