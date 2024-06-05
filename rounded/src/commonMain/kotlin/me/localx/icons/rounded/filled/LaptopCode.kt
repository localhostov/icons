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

public val Icons.Filled.LaptopCode: ImageVector
    get() {
        if (_laptopCode != null) {
            return _laptopCode!!
        }
        _laptopCode = Builder(name = "LaptopCode", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 16.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                lineTo(2.5f, 21.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                lineTo(0.0f, 18.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5.651f)
                curveToRelative(0.589f, 0.0f, 1.147f, 0.259f, 1.527f, 0.708f)
                lineToRelative(0.247f, 0.292f)
                horizontalLineToRelative(4.149f)
                lineToRelative(0.247f, -0.292f)
                curveToRelative(0.38f, -0.449f, 0.938f, -0.708f, 1.527f, -0.708f)
                horizontalLineToRelative(5.652f)
                close()
                moveTo(22.0f, 8.0f)
                verticalLineToRelative(6.11f)
                curveToRelative(-0.323f, -0.067f, -0.656f, -0.11f, -1.0f, -0.11f)
                horizontalLineToRelative(-5.151f)
                curveToRelative(-0.983f, 0.0f, -1.92f, 0.359f, -2.646f, 1.0f)
                horizontalLineToRelative(-2.404f)
                curveToRelative(-0.726f, -0.641f, -1.663f, -1.0f, -2.646f, -1.0f)
                lineTo(3.0f, 14.0f)
                curveToRelative(-0.344f, 0.0f, -0.677f, 0.043f, -1.0f, 0.11f)
                verticalLineToRelative(-6.11f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(9.066f, 8.888f)
                lineToRelative(1.681f, -1.681f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(-1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-1.681f, 1.681f)
                curveToRelative(-0.872f, 0.872f, -0.872f, 2.29f, 0.015f, 3.176f)
                lineToRelative(1.638f, 1.572f)
                curveToRelative(0.194f, 0.186f, 0.443f, 0.278f, 0.692f, 0.278f)
                curveToRelative(0.263f, 0.0f, 0.525f, -0.103f, 0.722f, -0.308f)
                curveToRelative(0.382f, -0.398f, 0.369f, -1.032f, -0.029f, -1.414f)
                lineToRelative(-1.624f, -1.557f)
                curveToRelative(-0.092f, -0.092f, -0.092f, -0.241f, 0.0f, -0.333f)
                close()
                moveTo(16.345f, 7.474f)
                lineToRelative(-1.681f, -1.681f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                reflectiveCurveToRelative(-0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(1.681f, 1.681f)
                curveToRelative(0.092f, 0.092f, 0.092f, 0.241f, 0.015f, 0.318f)
                lineToRelative(-1.638f, 1.572f)
                curveToRelative(-0.398f, 0.382f, -0.412f, 1.016f, -0.029f, 1.414f)
                curveToRelative(0.196f, 0.205f, 0.459f, 0.308f, 0.722f, 0.308f)
                curveToRelative(0.249f, 0.0f, 0.499f, -0.092f, 0.692f, -0.278f)
                lineToRelative(1.653f, -1.586f)
                curveToRelative(0.872f, -0.872f, 0.872f, -2.29f, 0.0f, -3.161f)
                close()
            }
        }
        .build()
        return _laptopCode!!
    }

private var _laptopCode: ImageVector? = null
