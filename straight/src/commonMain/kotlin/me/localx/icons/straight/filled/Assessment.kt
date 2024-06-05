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

public val Icons.Filled.Assessment: ImageVector
    get() {
        if (_assessment != null) {
            return _assessment!!
        }
        _assessment = Builder(name = "Assessment", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.553f, 22.139f)
                lineToRelative(-2.666f, -2.666f)
                curveToRelative(0.698f, -0.981f, 1.113f, -2.177f, 1.113f, -3.473f)
                curveToRelative(0.0f, -3.314f, -2.686f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                curveToRelative(1.296f, 0.0f, 2.492f, -0.415f, 3.473f, -1.113f)
                lineToRelative(2.666f, 2.666f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(16.748f, 18.444f)
                curveToRelative(-0.744f, 0.744f, -2.058f, 0.746f, -2.823f, -0.019f)
                lineToRelative(-2.182f, -2.268f)
                lineToRelative(1.387f, -1.441f)
                lineToRelative(2.216f, 2.301f)
                lineToRelative(3.614f, -3.703f)
                lineToRelative(1.398f, 1.43f)
                lineToRelative(-3.607f, 3.696f)
                lineToRelative(-0.004f, 0.004f)
                close()
                moveTo(8.0f, 16.001f)
                curveToRelative(0.0f, -4.411f, 3.589f, -8.0f, 8.0f, -8.0f)
                curveToRelative(1.458f, 0.0f, 2.822f, 0.398f, 4.0f, 1.082f)
                verticalLineToRelative(-2.082f)
                horizontalLineToRelative(0.0f)
                lineTo(20.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.345f, 0.0f, 0.0f, 1.347f, 0.0f, 3.001f)
                verticalLineToRelative(20.999f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-0.004f)
                lineToRelative(7.96f, 0.002f)
                curveToRelative(-4.393f, -0.022f, -7.96f, -3.6f, -7.96f, -7.998f)
                close()
                moveTo(9.0f, 5.001f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(7.0f, 17.001f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 12.001f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 7.001f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _assessment!!
    }

private var _assessment: ImageVector? = null
