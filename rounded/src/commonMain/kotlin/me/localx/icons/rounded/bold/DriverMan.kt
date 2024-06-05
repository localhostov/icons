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

public val Icons.Bold.DriverMan: ImageVector
    get() {
        if (_driverMan != null) {
            return _driverMan!!
        }
        _driverMan = Builder(name = "DriverMan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(15.309f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(-6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(16.934f, 22.286f)
                curveToRelative(0.119f, 0.82f, -0.357f, 1.714f, -1.486f, 1.714f)
                curveToRelative(-0.733f, 0.0f, -1.375f, -0.539f, -1.482f, -1.286f)
                curveToRelative(-0.142f, -0.978f, -0.986f, -1.714f, -1.965f, -1.714f)
                reflectiveCurveToRelative(-1.824f, 0.737f, -1.965f, 1.714f)
                curveToRelative(-0.118f, 0.82f, -0.878f, 1.389f, -1.699f, 1.27f)
                curveToRelative(-0.82f, -0.118f, -1.389f, -0.879f, -1.27f, -1.699f)
                curveToRelative(0.353f, -2.443f, 2.474f, -4.286f, 4.934f, -4.286f)
                reflectiveCurveToRelative(4.582f, 1.842f, 4.934f, 4.286f)
                close()
                moveTo(21.972f, 22.413f)
                curveToRelative(0.048f, 0.827f, -0.583f, 1.537f, -1.41f, 1.585f)
                curveToRelative(-0.03f, 0.001f, -0.06f, 0.002f, -0.089f, 0.002f)
                curveToRelative(-0.789f, 0.0f, -1.45f, -0.615f, -1.496f, -1.413f)
                curveToRelative(-0.215f, -3.694f, -3.28f, -6.587f, -6.977f, -6.587f)
                reflectiveCurveToRelative(-6.762f, 2.894f, -6.977f, 6.587f)
                curveToRelative(-0.048f, 0.827f, -0.76f, 1.453f, -1.585f, 1.41f)
                curveToRelative(-0.827f, -0.048f, -1.458f, -0.758f, -1.41f, -1.585f)
                curveToRelative(0.308f, -5.278f, 4.688f, -9.413f, 9.972f, -9.413f)
                reflectiveCurveToRelative(9.664f, 4.134f, 9.972f, 9.413f)
                close()
            }
        }
        .build()
        return _driverMan!!
    }

private var _driverMan: ImageVector? = null
