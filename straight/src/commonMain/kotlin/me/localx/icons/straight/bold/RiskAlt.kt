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

public val Icons.Bold.RiskAlt: ImageVector
    get() {
        if (_riskAlt != null) {
            return _riskAlt!!
        }
        _riskAlt = Builder(name = "RiskAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.061f, 21.939f)
                lineToRelative(-6.02f, -6.02f)
                curveToRelative(1.225f, -1.66f, 1.959f, -3.703f, 1.959f, -5.92f)
                curveTo(20.0f, 4.486f, 15.514f, 0.0f, 10.0f, 0.0f)
                reflectiveCurveTo(0.0f, 4.486f, 0.0f, 10.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.217f, 0.0f, 4.26f, -0.734f, 5.92f, -1.959f)
                lineToRelative(6.02f, 6.02f)
                lineToRelative(2.121f, -2.121f)
                close()
                moveTo(10.0f, 3.0f)
                curveToRelative(3.86f, 0.0f, 7.0f, 3.141f, 7.0f, 7.0f)
                curveToRelative(0.0f, 1.396f, -0.416f, 2.696f, -1.123f, 3.789f)
                lineTo(10.0f, 3.714f)
                lineToRelative(-5.877f, 10.075f)
                curveToRelative(-0.708f, -1.094f, -1.123f, -2.393f, -1.123f, -3.789f)
                curveToRelative(0.0f, -3.859f, 3.14f, -7.0f, 7.0f, -7.0f)
                close()
                moveTo(9.0f, 10.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(4.264f, 14.0f)
                horizontalLineToRelative(11.472f)
                curveToRelative(-1.267f, 1.811f, -3.364f, 3.0f, -5.736f, 3.0f)
                reflectiveCurveToRelative(-4.47f, -1.189f, -5.736f, -3.0f)
                close()
            }
        }
        .build()
        return _riskAlt!!
    }

private var _riskAlt: ImageVector? = null
