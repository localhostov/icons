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

public val Icons.Filled.Meat: ImageVector
    get() {
        if (_meat != null) {
            return _meat!!
        }
        _meat = Builder(name = "Meat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.34f, 14.008f)
                curveToRelative(0.33f, 0.0f, 0.652f, -0.028f, 0.969f, -0.074f)
                curveToRelative(-4.647f, 3.546f, -10.943f, 4.042f, -11.236f, 4.064f)
                lineToRelative(-0.456f, 0.033f)
                lineToRelative(-1.116f, -1.116f)
                lineToRelative(-4.279f, 4.278f)
                curveToRelative(0.462f, 0.256f, 0.779f, 0.742f, 0.779f, 1.308f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.237f, 0.06f, -0.459f, 0.158f, -0.658f)
                curveToRelative(-0.199f, 0.098f, -0.421f, 0.158f, -0.658f, 0.158f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.565f, 0.0f, 1.052f, 0.316f, 1.307f, 0.778f)
                lineToRelative(4.279f, -4.278f)
                lineToRelative(-1.117f, -1.117f)
                lineToRelative(0.034f, -0.456f)
                curveToRelative(0.021f, -0.292f, 0.526f, -6.577f, 4.071f, -11.223f)
                curveToRelative(-0.369f, 2.535f, 0.752f, 5.584f, 3.2f, 8.032f)
                curveToRelative(2.144f, 2.144f, 4.749f, 3.272f, 7.065f, 3.272f)
                close()
                moveTo(23.004f, 11.004f)
                curveToRelative(-1.832f, 1.832f, -5.555f, 1.078f, -8.316f, -1.682f)
                curveToRelative(-2.761f, -2.761f, -3.514f, -6.484f, -1.682f, -8.316f)
                curveToRelative(1.832f, -1.832f, 5.555f, -1.079f, 8.316f, 1.682f)
                curveToRelative(2.761f, 2.761f, 3.514f, 6.484f, 1.682f, 8.316f)
                close()
                moveTo(18.731f, 5.279f)
                curveToRelative(-0.725f, -0.725f, -1.637f, -0.988f, -2.038f, -0.587f)
                reflectiveCurveToRelative(-0.138f, 1.313f, 0.587f, 2.038f)
                reflectiveCurveToRelative(1.637f, 0.988f, 2.038f, 0.587f)
                reflectiveCurveToRelative(0.138f, -1.313f, -0.587f, -2.038f)
                close()
            }
        }
        .build()
        return _meat!!
    }

private var _meat: ImageVector? = null
