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

public val Icons.Bold.Assessment: ImageVector
    get() {
        if (_assessment != null) {
            return _assessment!!
        }
        _assessment = Builder(name = "Assessment", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.907f, 21.785f)
                lineToRelative(-2.742f, -2.742f)
                curveToRelative(0.527f, -0.893f, 0.836f, -1.931f, 0.836f, -3.043f)
                curveToRelative(0.0f, -3.314f, -2.686f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                curveToRelative(1.112f, 0.0f, 2.15f, -0.308f, 3.043f, -0.836f)
                lineToRelative(2.742f, 2.742f)
                lineToRelative(2.121f, -2.121f)
                close()
                moveTo(16.749f, 18.443f)
                curveToRelative(-0.744f, 0.744f, -2.058f, 0.746f, -2.823f, -0.019f)
                lineToRelative(-2.182f, -2.268f)
                lineToRelative(1.387f, -1.441f)
                lineToRelative(2.216f, 2.301f)
                lineToRelative(3.614f, -3.703f)
                lineToRelative(1.398f, 1.43f)
                lineToRelative(-3.607f, 3.696f)
                lineToRelative(-0.004f, 0.004f)
                close()
                moveTo(8.001f, 8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(5.001f, 15.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(10.001f, 8.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(8.001f, 13.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(15.922f, 23.999f)
                lineToRelative(-7.922f, -0.003f)
                verticalLineToRelative(0.004f)
                lineToRelative(-7.999f, -0.009f)
                lineTo(0.001f, 2.993f)
                curveTo(0.0f, 1.339f, 1.346f, -0.007f, 3.0f, -0.007f)
                lineTo(17.001f, 0.0f)
                curveToRelative(1.654f, 0.002f, 2.999f, 1.348f, 2.999f, 3.0f)
                verticalLineToRelative(6.072f)
                curveToRelative(-0.903f, -0.523f, -1.918f, -0.936f, -3.0f, -1.071f)
                lineTo(17.0f, 2.999f)
                lineToRelative(-14.0f, -0.006f)
                verticalLineToRelative(18.002f)
                lineToRelative(4.0f, 0.004f)
                verticalLineToRelative(-0.003f)
                horizontalLineToRelative(2.753f)
                curveToRelative(1.451f, 1.812f, 3.673f, 2.979f, 6.168f, 3.003f)
                close()
            }
        }
        .build()
        return _assessment!!
    }

private var _assessment: ImageVector? = null
