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

public val Icons.Filled.ParkingCircleSlash: ImageVector
    get() {
        if (_parkingCircleSlash != null) {
            return _parkingCircleSlash!!
        }
        _parkingCircleSlash = Builder(name = "ParkingCircleSlash", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.425f, 22.239f)
                curveToRelative(-0.061f, 0.324f, -0.277f, 0.598f, -0.578f, 0.731f)
                curveToRelative(-1.543f, 0.683f, -3.173f, 1.029f, -4.847f, 1.029f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                curveToRelative(0.0f, -1.673f, 0.347f, -3.303f, 1.029f, -4.846f)
                curveToRelative(0.133f, -0.301f, 0.406f, -0.518f, 0.73f, -0.578f)
                curveToRelative(0.328f, -0.064f, 0.657f, 0.043f, 0.891f, 0.276f)
                lineToRelative(4.35f, 4.349f)
                verticalLineToRelative(6.799f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-4.799f)
                lineToRelative(8.148f, 8.148f)
                curveToRelative(0.233f, 0.233f, 0.337f, 0.566f, 0.276f, 0.89f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 3.205f, -1.248f, 6.218f, -3.515f, 8.485f)
                curveToRelative(-0.188f, 0.188f, -0.441f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.52f, -0.105f, -0.707f, -0.293f)
                lineTo(3.515f, 4.929f)
                curveToRelative(-0.188f, -0.188f, -0.293f, -0.442f, -0.293f, -0.707f)
                reflectiveCurveToRelative(0.105f, -0.52f, 0.293f, -0.708f)
                curveTo(5.782f, 1.248f, 8.796f, 0.0f, 12.0f, 0.0f)
                curveToRelative(6.617f, 0.0f, 12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(18.0f, 9.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.765f, 0.0f, -1.508f, 0.216f, -2.148f, 0.626f)
                curveToRelative(-0.466f, 0.297f, -0.602f, 0.916f, -0.305f, 1.381f)
                curveToRelative(0.298f, 0.466f, 0.915f, 0.601f, 1.381f, 0.305f)
                curveToRelative(0.319f, -0.204f, 0.69f, -0.312f, 1.072f, -0.312f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                curveToRelative(0.0f, 0.886f, -0.476f, 1.714f, -1.242f, 2.161f)
                curveToRelative(-0.477f, 0.278f, -0.638f, 0.891f, -0.36f, 1.368f)
                curveToRelative(0.187f, 0.318f, 0.521f, 0.496f, 0.865f, 0.496f)
                curveToRelative(0.171f, 0.0f, 0.345f, -0.044f, 0.503f, -0.136f)
                curveToRelative(1.378f, -0.804f, 2.234f, -2.293f, 2.234f, -3.889f)
                close()
            }
        }
        .build()
        return _parkingCircleSlash!!
    }

private var _parkingCircleSlash: ImageVector? = null
