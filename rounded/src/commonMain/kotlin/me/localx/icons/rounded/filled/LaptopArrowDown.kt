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

public val Icons.Filled.LaptopArrowDown: ImageVector
    get() {
        if (_laptopArrowDown != null) {
            return _laptopArrowDown!!
        }
        _laptopArrowDown = Builder(name = "LaptopArrowDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.038f, 18.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                lineTo(2.538f, 21.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5.651f)
                curveToRelative(0.589f, 0.0f, 1.147f, 0.259f, 1.527f, 0.708f)
                lineToRelative(0.247f, 0.292f)
                horizontalLineToRelative(4.149f)
                lineToRelative(0.247f, -0.292f)
                curveToRelative(0.38f, -0.449f, 0.938f, -0.708f, 1.527f, -0.708f)
                horizontalLineToRelative(5.652f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                close()
                moveTo(8.189f, 14.0f)
                curveToRelative(0.983f, 0.0f, 1.92f, 0.359f, 2.646f, 1.0f)
                horizontalLineToRelative(2.404f)
                curveToRelative(0.726f, -0.641f, 1.664f, -1.0f, 2.646f, -1.0f)
                horizontalLineToRelative(5.151f)
                curveToRelative(0.344f, 0.0f, 0.677f, 0.043f, 1.0f, 0.11f)
                verticalLineToRelative(-6.11f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-4.038f)
                verticalLineToRelative(6.421f)
                lineToRelative(2.319f, -2.154f)
                curveToRelative(0.403f, -0.376f, 1.038f, -0.353f, 1.413f, 0.053f)
                curveToRelative(0.376f, 0.405f, 0.353f, 1.037f, -0.052f, 1.413f)
                lineToRelative(-2.613f, 2.426f)
                curveToRelative(-0.562f, 0.561f, -1.308f, 0.843f, -2.058f, 0.843f)
                curveToRelative(-0.759f, 0.0f, -1.522f, -0.288f, -2.103f, -0.869f)
                lineToRelative(-2.587f, -2.4f)
                curveToRelative(-0.405f, -0.375f, -0.429f, -1.008f, -0.053f, -1.413f)
                curveToRelative(0.375f, -0.405f, 1.009f, -0.428f, 1.413f, -0.053f)
                lineToRelative(2.32f, 2.153f)
                lineTo(10.997f, 3.0f)
                horizontalLineToRelative(-3.962f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(6.11f)
                curveToRelative(0.323f, -0.067f, 0.656f, -0.11f, 1.0f, -0.11f)
                horizontalLineToRelative(5.151f)
                close()
            }
        }
        .build()
        return _laptopArrowDown!!
    }

private var _laptopArrowDown: ImageVector? = null
