package me.localx.icons.rounded.outline

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

public val Icons.Outline.Horseshoe: ImageVector
    get() {
        if (_horseshoe != null) {
            return _horseshoe!!
        }
        _horseshoe = Builder(name = "Horseshoe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 22.0f)
                horizontalLineToRelative(-0.492f)
                curveToRelative(0.901f, -2.26f, 2.492f, -6.838f, 2.492f, -11.0f)
                curveTo(23.0f, 4.935f, 18.065f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(1.0f, 4.935f, 1.0f, 11.0f)
                curveToRelative(0.0f, 4.162f, 1.591f, 8.74f, 2.492f, 11.0f)
                horizontalLineToRelative(-0.492f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.03f)
                reflectiveCurveToRelative(0.004f, 0.0f, 0.006f, 0.0f)
                horizontalLineToRelative(2.963f)
                curveToRelative(0.614f, 0.0f, 1.185f, -0.274f, 1.566f, -0.754f)
                curveToRelative(0.38f, -0.478f, 0.52f, -1.094f, 0.383f, -1.689f)
                curveToRelative(-0.085f, -0.374f, -0.192f, -0.819f, -0.311f, -1.316f)
                curveToRelative(-0.612f, -2.563f, -1.638f, -6.854f, -1.638f, -9.24f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                curveToRelative(0.0f, 2.387f, -1.025f, 6.677f, -1.638f, 9.24f)
                curveToRelative(-0.119f, 0.497f, -0.226f, 0.942f, -0.311f, 1.316f)
                curveToRelative(-0.137f, 0.596f, 0.003f, 1.212f, 0.383f, 1.689f)
                curveToRelative(0.381f, 0.479f, 0.953f, 0.754f, 1.566f, 0.754f)
                horizontalLineToRelative(4.999f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(17.045f, 7.764f)
                lineToRelative(2.444f, -1.746f)
                curveToRelative(0.953f, 1.428f, 1.511f, 3.14f, 1.511f, 4.982f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.192f, -0.353f, -2.301f, -0.955f, -3.236f)
                close()
                moveTo(4.511f, 6.018f)
                lineToRelative(2.444f, 1.746f)
                curveToRelative(-0.602f, 0.935f, -0.955f, 2.044f, -0.955f, 3.236f)
                lineTo(3.0f, 11.0f)
                curveToRelative(0.0f, -1.841f, 0.558f, -3.554f, 1.511f, -4.982f)
                close()
                moveTo(5.656f, 22.0f)
                curveToRelative(-0.597f, -1.417f, -2.09f, -5.239f, -2.531f, -9.0f)
                horizontalLineToRelative(3.021f)
                curveToRelative(0.302f, 2.482f, 1.025f, 5.522f, 1.547f, 7.705f)
                curveToRelative(0.117f, 0.49f, 0.223f, 0.93f, 0.307f, 1.295f)
                horizontalLineToRelative(-2.344f)
                close()
                moveTo(8.314f, 6.276f)
                lineToRelative(-2.506f, -1.79f)
                curveToRelative(1.387f, -1.32f, 3.19f, -2.205f, 5.193f, -2.427f)
                verticalLineToRelative(3.031f)
                curveToRelative(-1.002f, 0.169f, -1.918f, 0.585f, -2.687f, 1.186f)
                close()
                moveTo(13.001f, 5.09f)
                lineTo(13.001f, 2.059f)
                curveToRelative(2.003f, 0.223f, 3.805f, 1.108f, 5.193f, 2.427f)
                lineToRelative(-2.506f, 1.79f)
                curveToRelative(-0.768f, -0.601f, -1.685f, -1.017f, -2.687f, -1.186f)
                close()
                moveTo(16.001f, 22.004f)
                curveToRelative(0.084f, -0.369f, 0.19f, -0.809f, 0.307f, -1.299f)
                curveToRelative(0.522f, -2.183f, 1.244f, -5.223f, 1.547f, -7.705f)
                horizontalLineToRelative(3.021f)
                curveToRelative(-0.441f, 3.763f, -1.936f, 7.587f, -2.532f, 9.002f)
                lineToRelative(-2.343f, 0.002f)
                close()
            }
        }
        .build()
        return _horseshoe!!
    }

private var _horseshoe: ImageVector? = null
