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

public val Icons.Filled.SafeBox: ImageVector
    get() {
        if (_safeBox != null) {
            return _safeBox!!
        }
        _safeBox = Builder(name = "SafeBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 13.0f)
                curveToRelative(0.0f, 1.657f, -2.686f, 3.0f, -6.0f, 3.0f)
                reflectiveCurveTo(0.0f, 14.657f, 0.0f, 13.0f)
                reflectiveCurveToRelative(2.686f, -3.0f, 6.0f, -3.0f)
                reflectiveCurveToRelative(6.0f, 1.343f, 6.0f, 3.0f)
                close()
                moveTo(12.0f, 18.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.995f, -2.579f, 3.5f, -6.0f, 3.5f)
                reflectiveCurveToRelative(-6.0f, -1.505f, -6.0f, -3.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.971f, 2.5f, 3.5f, 6.0f, 3.5f)
                reflectiveCurveToRelative(6.0f, -1.529f, 6.0f, -3.5f)
                close()
                moveTo(12.0f, 14.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.995f, -2.579f, 3.5f, -6.0f, 3.5f)
                reflectiveCurveToRelative(-6.0f, -1.505f, -6.0f, -3.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.971f, 2.5f, 3.5f, 6.0f, 3.5f)
                reflectiveCurveToRelative(6.0f, -1.529f, 6.0f, -3.5f)
                close()
                moveTo(11.0f, 6.0f)
                curveToRelative(-1.509f, 0.0f, -2.825f, 0.84f, -3.506f, 2.076f)
                curveToRelative(3.676f, 0.383f, 6.267f, 2.179f, 6.49f, 4.585f)
                curveToRelative(0.632f, -0.708f, 1.016f, -1.64f, 1.016f, -2.661f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(21.0f, 6.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(4.586f)
                curveToRelative(1.301f, -0.902f, 3.159f, -1.474f, 5.338f, -1.571f)
                curveToRelative(0.821f, -2.336f, 3.049f, -4.015f, 5.662f, -4.015f)
                curveToRelative(3.309f, 0.0f, 6.0f, 2.691f, 6.0f, 6.0f)
                curveToRelative(0.0f, 2.216f, -1.208f, 4.156f, -3.0f, 5.195f)
                verticalLineToRelative(4.805f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.342f, 0.0f, 0.677f, -0.035f, 1.0f, -0.101f)
                verticalLineToRelative(1.101f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.003f)
                curveToRelative(1.214f, -0.913f, 2.0f, -2.365f, 2.0f, -3.997f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _safeBox!!
    }

private var _safeBox: ImageVector? = null
