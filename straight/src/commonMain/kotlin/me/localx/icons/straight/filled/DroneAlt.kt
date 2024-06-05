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

public val Icons.Filled.DroneAlt: ImageVector
    get() {
        if (_droneAlt != null) {
            return _droneAlt!!
        }
        _droneAlt = Builder(name = "DroneAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 6.0f)
                horizontalLineToRelative(-2.988f)
                lineToRelative(0.031f, 7.948f)
                lineToRelative(-0.338f, 0.3f)
                curveToRelative(-0.491f, 0.436f, -1.302f, 1.095f, -2.342f, 1.74f)
                lineToRelative(1.638f, 3.276f)
                verticalLineToRelative(2.736f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.264f)
                lineToRelative(-1.402f, -2.804f)
                curveToRelative(-1.351f, 0.612f, -2.917f, 1.069f, -4.598f, 1.069f)
                reflectiveCurveToRelative(-3.247f, -0.458f, -4.597f, -1.07f)
                lineToRelative(-1.403f, 2.805f)
                verticalLineToRelative(2.264f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.736f)
                lineToRelative(1.638f, -3.277f)
                curveToRelative(-1.019f, -0.632f, -1.815f, -1.275f, -2.299f, -1.701f)
                lineToRelative(-0.339f, -0.299f)
                verticalLineToRelative(-7.987f)
                lineTo(0.0f, 6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.373f)
                curveToRelative(0.301f, -0.22f, 0.615f, -0.421f, 0.934f, -0.611f)
                lineToRelative(3.238f, 3.238f)
                horizontalLineToRelative(5.828f)
                lineToRelative(3.174f, -3.174f)
                curveToRelative(0.292f, 0.178f, 0.578f, 0.367f, 0.854f, 0.57f)
                lineToRelative(-0.017f, -4.396f)
                horizontalLineToRelative(-3.012f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.004f)
                lineToRelative(-0.004f, -0.996f)
                lineToRelative(2.0f, -0.008f)
                lineToRelative(0.004f, 1.004f)
                horizontalLineToRelative(2.996f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(10.0f, 11.0f)
                horizontalLineToRelative(4.172f)
                lineToRelative(2.108f, -2.108f)
                curveToRelative(-1.355f, -0.529f, -2.804f, -0.82f, -4.28f, -0.82f)
                curveToRelative(-1.432f, 0.0f, -2.837f, 0.274f, -4.156f, 0.772f)
                lineToRelative(2.156f, 2.156f)
                close()
            }
        }
        .build()
        return _droneAlt!!
    }

private var _droneAlt: ImageVector? = null
