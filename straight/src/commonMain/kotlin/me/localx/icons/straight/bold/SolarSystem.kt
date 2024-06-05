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
                moveToRelative(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                curveToRelative(0.0f, -1.683f, -0.349f, -3.283f, -0.975f, -4.737f)
                curveToRelative(-0.64f, 0.814f, -1.54f, 1.412f, -2.587f, 1.635f)
                curveToRelative(0.357f, 0.969f, 0.562f, 2.01f, 0.562f, 3.102f)
                curveToRelative(0.0f, 4.963f, -4.037f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.0f, 16.963f, 3.0f, 12.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                curveToRelative(1.091f, 0.0f, 2.133f, 0.205f, 3.102f, 0.562f)
                curveToRelative(0.223f, -1.048f, 0.821f, -1.948f, 1.635f, -2.587f)
                curveToRelative(-1.454f, -0.625f, -3.054f, -0.975f, -4.737f, -0.975f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(19.5f, 2.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(-0.424f, 0.0f, -0.838f, 0.044f, -1.241f, 0.116f)
                curveToRelative(0.761f, 0.729f, 1.241f, 1.749f, 1.241f, 2.884f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                curveToRelative(-1.135f, 0.0f, -2.155f, -0.48f, -2.884f, -1.241f)
                curveToRelative(-0.072f, 0.403f, -0.116f, 0.817f, -0.116f, 1.241f)
                curveToRelative(0.0f, 3.866f, 3.134f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.134f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.134f, -7.0f, -7.0f, -7.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(8.0f, 6.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(12.0f, 10.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _solarSystem!!
    }

private var _solarSystem: ImageVector? = null
