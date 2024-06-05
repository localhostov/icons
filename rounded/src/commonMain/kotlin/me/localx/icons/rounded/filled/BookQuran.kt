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

public val Icons.Filled.BookQuran: ImageVector
    get() {
        if (_bookQuran != null) {
            return _bookQuran!!
        }
        _bookQuran = Builder(name = "BookQuran", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 21.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                lineTo(7.0f, 24.0f)
                curveToRelative(-2.761f, 0.0f, -5.0f, -2.239f, -5.0f, -5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                close()
                moveTo(22.0f, 4.973f)
                verticalLineToRelative(12.052f)
                curveToRelative(-0.699f, -0.527f, -1.525f, -0.86f, -2.395f, -0.964f)
                curveToRelative(-0.199f, -0.041f, -0.402f, -0.061f, -0.605f, -0.061f)
                lineTo(2.0f, 16.0f)
                lineTo(2.0f, 5.0f)
                curveTo(2.0f, 2.239f, 4.239f, 0.0f, 7.0f, 0.0f)
                horizontalLineToRelative(10.033f)
                curveToRelative(2.744f, 0.0f, 4.968f, 2.229f, 4.967f, 4.973f)
                close()
                moveTo(12.386f, 12.27f)
                curveToRelative(-1.342f, -0.831f, -2.386f, -2.269f, -2.386f, -4.269f)
                reflectiveCurveToRelative(1.044f, -3.438f, 2.386f, -4.269f)
                curveToRelative(0.307f, -0.19f, 0.183f, -0.665f, -0.177f, -0.704f)
                curveToRelative(-0.293f, -0.032f, -0.594f, -0.036f, -0.903f, -0.007f)
                curveToRelative(-2.487f, 0.237f, -4.445f, 2.486f, -4.306f, 4.98f)
                curveToRelative(-0.139f, 2.494f, 1.82f, 4.743f, 4.306f, 4.98f)
                curveToRelative(0.309f, 0.029f, 0.61f, 0.026f, 0.903f, -0.007f)
                curveToRelative(0.359f, -0.04f, 0.484f, -0.514f, 0.177f, -0.704f)
                close()
                moveTo(17.026f, 7.248f)
                curveToRelative(0.0f, -0.137f, -0.111f, -0.248f, -0.248f, -0.248f)
                horizontalLineToRelative(-1.596f)
                lineToRelative(-0.449f, -1.718f)
                curveToRelative(-0.031f, -0.118f, -0.137f, -0.2f, -0.259f, -0.2f)
                reflectiveCurveToRelative(-0.228f, 0.082f, -0.259f, 0.2f)
                lineToRelative(-0.45f, 1.718f)
                horizontalLineToRelative(-1.607f)
                curveToRelative(-0.137f, 0.0f, -0.248f, 0.111f, -0.248f, 0.248f)
                curveToRelative(0.0f, 0.09f, 0.049f, 0.173f, 0.127f, 0.216f)
                lineToRelative(1.289f, 0.717f)
                lineToRelative(-0.499f, 1.56f)
                curveToRelative(-0.034f, 0.106f, 0.003f, 0.221f, 0.092f, 0.288f)
                curveToRelative(0.094f, 0.071f, 0.224f, 0.07f, 0.317f, -0.002f)
                lineToRelative(1.238f, -0.957f)
                lineToRelative(1.237f, 0.956f)
                curveToRelative(0.091f, 0.07f, 0.218f, 0.074f, 0.312f, 0.008f)
                curveToRelative(0.095f, -0.067f, 0.136f, -0.188f, 0.099f, -0.299f)
                lineToRelative(-0.504f, -1.531f)
                lineToRelative(1.283f, -0.742f)
                curveToRelative(0.077f, -0.044f, 0.124f, -0.126f, 0.124f, -0.214f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _bookQuran!!
    }

private var _bookQuran: ImageVector? = null
