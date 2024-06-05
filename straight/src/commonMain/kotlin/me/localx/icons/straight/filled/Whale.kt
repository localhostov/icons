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

public val Icons.Filled.Whale: ImageVector
    get() {
        if (_whale != null) {
            return _whale!!
        }
        _whale = Builder(name = "Whale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.509f, 8.001f)
                reflectiveCurveToRelative(-1.143f, 0.0f, -1.21f, 0.002f)
                curveToRelative(0.0f, 0.0f, -0.001f, 0.0f, -0.002f, 0.0f)
                curveToRelative(-4.244f, 0.11f, -8.598f, 3.618f, -10.297f, 5.355f)
                verticalLineToRelative(-2.781f)
                curveToRelative(0.656f, -0.592f, 1.433f, -1.202f, 2.298f, -1.778f)
                curveToRelative(0.033f, -0.228f, 0.068f, -0.455f, 0.106f, -0.682f)
                lineToRelative(0.466f, -2.765f)
                curveToRelative(2.374f, -0.615f, 4.129f, -2.788f, 4.129f, -5.352f)
                curveToRelative(-4.173f, 0.0f, -5.5f, 2.776f, -5.5f, 2.776f)
                curveToRelative(0.0f, 0.0f, -1.378f, -2.776f, -5.5f, -2.776f)
                curveToRelative(0.0f, 2.278f, 1.385f, 4.247f, 3.358f, 5.089f)
                lineToRelative(-0.503f, 0.754f)
                curveTo(0.987f, 8.644f, 0.0f, 11.904f, 0.0f, 15.273f)
                verticalLineToRelative(2.727f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-2.499f)
                curveToRelative(0.0f, -4.683f, -3.81f, -8.496f, -8.491f, -8.5f)
                close()
                moveTo(15.5f, 19.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _whale!!
    }

private var _whale: ImageVector? = null
