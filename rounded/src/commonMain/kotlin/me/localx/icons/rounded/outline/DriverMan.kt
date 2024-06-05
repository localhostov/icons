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

public val Icons.Outline.DriverMan: ImageVector
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
                moveTo(12.0f, 2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(21.936f, 22.89f)
                curveToRelative(0.061f, 0.549f, -0.304f, 1.11f, -0.996f, 1.11f)
                curveToRelative(-0.503f, 0.0f, -0.936f, -0.378f, -0.993f, -0.89f)
                curveToRelative(-0.448f, -4.053f, -3.865f, -7.11f, -7.947f, -7.11f)
                reflectiveCurveToRelative(-7.499f, 3.057f, -7.947f, 7.11f)
                curveToRelative(-0.061f, 0.549f, -0.559f, 0.947f, -1.104f, 0.884f)
                curveToRelative(-0.549f, -0.061f, -0.945f, -0.555f, -0.884f, -1.104f)
                curveToRelative(0.561f, -5.068f, 4.833f, -8.89f, 9.936f, -8.89f)
                reflectiveCurveToRelative(9.375f, 3.822f, 9.936f, 8.89f)
                close()
                moveTo(17.88f, 22.801f)
                curveToRelative(0.11f, 0.542f, -0.24f, 1.069f, -0.781f, 1.179f)
                curveToRelative(-0.067f, 0.014f, -0.134f, 0.02f, -0.2f, 0.02f)
                curveToRelative(-0.466f, 0.0f, -0.883f, -0.327f, -0.979f, -0.801f)
                curveToRelative(-0.376f, -1.854f, -2.025f, -3.199f, -3.919f, -3.199f)
                reflectiveCurveToRelative(-3.543f, 1.345f, -3.919f, 3.199f)
                curveToRelative(-0.11f, 0.541f, -0.634f, 0.893f, -1.179f, 0.781f)
                curveToRelative(-0.541f, -0.11f, -0.891f, -0.638f, -0.781f, -1.179f)
                curveToRelative(0.565f, -2.782f, 3.038f, -4.801f, 5.879f, -4.801f)
                reflectiveCurveToRelative(5.314f, 2.019f, 5.879f, 4.801f)
                close()
            }
        }
        .build()
        return _driverMan!!
    }

private var _driverMan: ImageVector? = null
