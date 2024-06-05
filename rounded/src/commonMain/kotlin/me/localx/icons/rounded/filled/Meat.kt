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
                moveToRelative(21.322f, 2.683f)
                curveTo(18.561f, -0.078f, 14.838f, -0.831f, 13.006f, 1.001f)
                curveToRelative(-1.832f, 1.832f, -1.079f, 5.555f, 1.682f, 8.316f)
                curveToRelative(2.761f, 2.761f, 6.484f, 3.514f, 8.316f, 1.682f)
                curveToRelative(1.832f, -1.832f, 1.079f, -5.555f, -1.682f, -8.316f)
                close()
                moveTo(19.318f, 7.312f)
                curveToRelative(-0.401f, 0.401f, -1.313f, 0.138f, -2.038f, -0.587f)
                reflectiveCurveToRelative(-0.988f, -1.637f, -0.587f, -2.038f)
                reflectiveCurveToRelative(1.313f, -0.138f, 2.038f, 0.587f)
                curveToRelative(0.725f, 0.725f, 0.988f, 1.637f, 0.587f, 2.038f)
                close()
                moveTo(21.308f, 13.928f)
                curveToRelative(0.037f, -0.017f, 0.074f, -0.034f, 0.111f, -0.051f)
                curveToRelative(-2.911f, 2.372f, -6.573f, 3.753f, -10.915f, 4.109f)
                curveToRelative(-0.115f, 0.009f, -0.23f, 0.014f, -0.345f, 0.014f)
                curveToRelative(-0.763f, 0.0f, -1.505f, -0.208f, -2.149f, -0.596f)
                lineToRelative(-3.783f, 3.784f)
                curveToRelative(0.461f, 0.256f, 0.774f, 0.748f, 0.774f, 1.312f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.231f, 0.052f, -0.45f, 0.146f, -0.646f)
                curveToRelative(-0.196f, 0.093f, -0.415f, 0.146f, -0.646f, 0.146f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.565f, 0.0f, 1.057f, 0.312f, 1.312f, 0.773f)
                lineToRelative(3.783f, -3.784f)
                curveToRelative(-0.446f, -0.741f, -0.654f, -1.61f, -0.581f, -2.494f)
                curveToRelative(0.352f, -4.298f, 1.719f, -7.936f, 4.066f, -10.841f)
                curveToRelative(-0.002f, 0.015f, -0.004f, 0.029f, -0.006f, 0.044f)
                curveToRelative(-0.369f, 2.535f, 0.752f, 5.584f, 3.2f, 8.032f)
                curveToRelative(2.144f, 2.144f, 4.749f, 3.272f, 7.065f, 3.272f)
                curveToRelative(0.33f, 0.0f, 0.652f, -0.028f, 0.969f, -0.074f)
                close()
            }
        }
        .build()
        return _meat!!
    }

private var _meat: ImageVector? = null
