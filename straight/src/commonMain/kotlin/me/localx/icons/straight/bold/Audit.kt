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

public val Icons.Bold.Audit: ImageVector
    get() {
        if (_audit != null) {
            return _audit!!
        }
        _audit = Builder(name = "Audit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.907f, 21.786f)
                lineToRelative(-2.742f, -2.742f)
                curveToRelative(0.527f, -0.893f, 0.836f, -1.931f, 0.836f, -3.043f)
                curveToRelative(0.0f, -3.314f, -2.686f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                curveToRelative(1.112f, 0.0f, 2.15f, -0.308f, 3.043f, -0.836f)
                lineToRelative(2.742f, 2.742f)
                lineToRelative(2.121f, -2.121f)
                close()
                moveTo(16.749f, 18.444f)
                curveToRelative(-0.744f, 0.744f, -2.058f, 0.746f, -2.823f, -0.019f)
                lineToRelative(-2.182f, -2.268f)
                lineToRelative(1.387f, -1.441f)
                lineToRelative(2.216f, 2.301f)
                lineToRelative(3.614f, -3.703f)
                lineToRelative(1.398f, 1.43f)
                lineToRelative(-3.607f, 3.696f)
                lineToRelative(-0.004f, 0.004f)
                close()
                moveTo(15.921f, 24.0f)
                lineTo(0.0f, 23.993f)
                verticalLineToRelative(-1.5f)
                reflectiveCurveToRelative(0.0f, -19.5f, 0.0f, -19.5f)
                curveTo(0.0f, 1.339f, 1.346f, -0.007f, 3.0f, -0.007f)
                horizontalLineToRelative(11.381f)
                lineToRelative(5.619f, 5.665f)
                verticalLineToRelative(3.413f)
                curveToRelative(-0.903f, -0.523f, -1.918f, -0.936f, -3.0f, -1.071f)
                verticalLineToRelative(-0.007f)
                horizontalLineToRelative(-5.0f)
                lineTo(12.0f, 2.993f)
                lineTo(3.0f, 2.993f)
                verticalLineToRelative(18.001f)
                lineToRelative(6.753f, 0.003f)
                curveToRelative(1.451f, 1.811f, 3.673f, 2.978f, 6.168f, 3.002f)
                close()
                moveTo(8.062f, 15.001f)
                curveToRelative(-0.041f, 0.328f, -0.062f, 0.661f, -0.062f, 1.0f)
                curveToRelative(0.0f, 0.691f, 0.088f, 1.361f, 0.252f, 2.0f)
                horizontalLineToRelative(-3.252f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.062f)
                close()
                moveTo(8.582f, 13.001f)
                horizontalLineToRelative(-3.582f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.709f)
                curveToRelative(-0.924f, 0.815f, -1.657f, 1.84f, -2.127f, 3.0f)
                close()
            }
        }
        .build()
        return _audit!!
    }

private var _audit: ImageVector? = null
