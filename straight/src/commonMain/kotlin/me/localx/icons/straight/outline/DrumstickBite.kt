package me.localx.icons.straight.outline

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

public val Icons.Outline.DrumstickBite: ImageVector
    get() {
        if (_drumstickBite != null) {
            return _drumstickBite!!
        }
        _drumstickBite = Builder(name = "DrumstickBite", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.511f, 2.49f)
                curveToRelative(-3.314f, -3.314f, -8.707f, -3.314f, -12.021f, 0.0f)
                curveToRelative(-3.171f, 3.171f, -3.478f, 11.139f, -3.488f, 11.476f)
                lineToRelative(-0.016f, 0.434f)
                lineToRelative(1.1f, 1.1f)
                lineToRelative(-4.278f, 4.279f)
                curveToRelative(-0.256f, -0.462f, -0.742f, -0.779f, -1.308f, -0.779f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.237f, 0.0f, 0.459f, -0.06f, 0.658f, -0.158f)
                curveToRelative(-0.098f, 0.199f, -0.158f, 0.421f, -0.158f, 0.658f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.565f, -0.316f, -1.052f, -0.778f, -1.307f)
                lineToRelative(4.278f, -4.278f)
                lineToRelative(1.101f, 1.101f)
                lineToRelative(0.436f, -0.016f)
                curveToRelative(0.092f, -0.003f, 2.288f, -0.087f, 4.828f, -0.593f)
                lineToRelative(1.004f, -0.2f)
                lineToRelative(-0.224f, -0.999f)
                curveToRelative(-0.091f, -0.407f, -0.137f, -0.812f, -0.137f, -1.205f)
                curveToRelative(0.0f, -3.033f, 2.468f, -5.5f, 5.5f, -5.5f)
                curveToRelative(0.567f, 0.0f, 1.131f, 0.088f, 1.674f, 0.261f)
                lineToRelative(1.249f, 0.399f)
                lineToRelative(0.054f, -1.311f)
                curveToRelative(0.098f, -2.374f, -0.804f, -4.692f, -2.474f, -6.362f)
                close()
                moveTo(21.008f, 7.503f)
                curveToRelative(-4.136f, 0.0f, -7.5f, 3.365f, -7.5f, 7.5f)
                curveToRelative(0.0f, 0.203f, 0.009f, 0.407f, 0.026f, 0.612f)
                curveToRelative(-1.361f, 0.224f, -2.54f, 0.322f, -3.143f, 0.362f)
                lineToRelative(-2.372f, -2.372f)
                curveToRelative(0.14f, -2.367f, 0.849f, -7.667f, 2.884f, -9.702f)
                curveToRelative(2.534f, -2.534f, 6.657f, -2.535f, 9.193f, 0.0f)
                curveToRelative(1.006f, 1.006f, 1.636f, 2.274f, 1.83f, 3.655f)
                curveToRelative(-0.305f, -0.038f, -0.611f, -0.057f, -0.919f, -0.057f)
                close()
            }
        }
        .build()
        return _drumstickBite!!
    }

private var _drumstickBite: ImageVector? = null
