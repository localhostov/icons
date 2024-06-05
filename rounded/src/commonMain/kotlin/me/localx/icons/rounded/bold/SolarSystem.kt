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

public val Icons.Bold.SolarSystem: ImageVector
    get() {
        if (_solarSystem != null) {
            return _solarSystem!!
        }
        _solarSystem = Builder(name = "SolarSystem", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 4.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(8.0f, 10.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(13.5f, 12.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(23.782f, 9.716f)
                curveToRelative(-0.157f, -0.814f, -0.949f, -1.348f, -1.757f, -1.188f)
                curveToRelative(-0.813f, 0.157f, -1.346f, 0.943f, -1.188f, 1.757f)
                curveToRelative(0.108f, 0.562f, 0.163f, 1.139f, 0.163f, 1.716f)
                curveToRelative(0.0f, 4.963f, -4.037f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.0f, 16.963f, 3.0f, 12.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                curveToRelative(0.577f, 0.0f, 1.154f, 0.055f, 1.716f, 0.163f)
                curveToRelative(0.804f, 0.156f, 1.6f, -0.374f, 1.757f, -1.188f)
                curveToRelative(0.157f, -0.813f, -0.375f, -1.6f, -1.188f, -1.757f)
                curveToRelative(-0.748f, -0.145f, -1.517f, -0.218f, -2.284f, -0.218f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                curveToRelative(0.0f, -0.768f, -0.073f, -1.536f, -0.218f, -2.284f)
                close()
                moveTo(12.056f, 6.299f)
                curveToRelative(-0.226f, 0.797f, 0.237f, 1.626f, 1.035f, 1.852f)
                curveToRelative(1.712f, 0.484f, 2.908f, 2.067f, 2.908f, 3.85f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                curveToRelative(-1.782f, 0.0f, -3.365f, -1.196f, -3.85f, -2.908f)
                curveToRelative(-0.226f, -0.798f, -1.056f, -1.263f, -1.852f, -1.035f)
                curveToRelative(-0.798f, 0.226f, -1.261f, 1.055f, -1.035f, 1.852f)
                curveToRelative(0.849f, 2.998f, 3.618f, 5.092f, 6.736f, 5.092f)
                curveToRelative(3.859f, 0.0f, 7.0f, -3.141f, 7.0f, -7.0f)
                curveToRelative(0.0f, -3.118f, -2.094f, -5.888f, -5.092f, -6.736f)
                curveToRelative(-0.794f, -0.227f, -1.626f, 0.237f, -1.852f, 1.035f)
                close()
            }
        }
        .build()
        return _solarSystem!!
    }

private var _solarSystem: ImageVector? = null
