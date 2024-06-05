package me.localx.icons.rounded.filled

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

public val Icons.Filled.Lamp: ImageVector
    get() {
        if (_lamp != null) {
            return _lamp!!
        }
        _lamp = Builder(name = "Lamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.955f, 10.212f)
                lineToRelative(-0.778f, -6.095f)
                curveToRelative(-0.301f, -2.347f, -2.312f, -4.117f, -4.677f, -4.117f)
                horizontalLineTo(5.489f)
                curveTo(3.123f, 0.0f, 1.113f, 1.77f, 0.813f, 4.117f)
                lineTo(0.034f, 10.212f)
                curveToRelative(-0.154f, 1.21f, 0.22f, 2.43f, 1.026f, 3.346f)
                curveToRelative(0.807f, 0.917f, 1.97f, 1.442f, 3.19f, 1.442f)
                horizontalLineToRelative(6.749f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.827f, -1.536f, 1.993f, -2.0f, 2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.619f, -1.289f, -2.942f, -2.895f, -2.998f)
                curveToRelative(-0.364f, -0.078f, -2.105f, -0.527f, -2.105f, -2.002f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.739f)
                curveToRelative(1.221f, 0.0f, 2.383f, -0.525f, 3.189f, -1.441f)
                curveToRelative(0.807f, -0.917f, 1.181f, -2.136f, 1.026f, -3.347f)
                close()
            }
        }
        .build()
        return _lamp!!
    }

private var _lamp: ImageVector? = null
