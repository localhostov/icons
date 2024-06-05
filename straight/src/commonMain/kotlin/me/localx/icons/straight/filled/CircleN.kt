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

public val Icons.Filled.CircleN: ImageVector
    get() {
        if (_circleN != null) {
            return _circleN!!
        }
        _circleN = Builder(name = "CircleN", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(17.0f, 16.451f)
                curveToRelative(0.0f, 0.683f, -0.443f, 1.274f, -1.102f, 1.473f)
                curveToRelative(-0.152f, 0.046f, -0.307f, 0.067f, -0.458f, 0.067f)
                curveToRelative(-0.513f, 0.0f, -1.0f, -0.252f, -1.294f, -0.698f)
                lineToRelative(-5.146f, -8.189f)
                verticalLineToRelative(8.646f)
                horizontalLineToRelative(-2.0f)
                lineTo(7.0f, 7.548f)
                curveToRelative(0.0f, -0.684f, 0.443f, -1.275f, 1.103f, -1.474f)
                curveToRelative(0.666f, -0.2f, 1.371f, 0.053f, 1.752f, 0.631f)
                lineToRelative(5.146f, 8.189f)
                lineTo(15.001f, 6.25f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.201f)
                close()
            }
        }
        .build()
        return _circleN!!
    }

private var _circleN: ImageVector? = null
