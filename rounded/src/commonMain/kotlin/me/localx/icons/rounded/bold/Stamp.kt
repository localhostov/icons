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

public val Icons.Bold.Stamp: ImageVector
    get() {
        if (_stamp != null) {
            return _stamp!!
        }
        _stamp = Builder(name = "Stamp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 24.0f)
                lineTo(3.5f, 24.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                lineTo(20.5f, 21.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(2.476f, 19.0f)
                lineTo(21.502f, 19.0f)
                curveToRelative(0.869f, 0.008f, 1.444f, -0.36f, 1.764f, -0.675f)
                curveToRelative(0.682f, -0.671f, 0.734f, -1.532f, 0.734f, -1.779f)
                curveToRelative(0.0f, -3.213f, -2.236f, -5.545f, -5.318f, -5.545f)
                horizontalLineToRelative(-3.624f)
                curveToRelative(0.291f, -1.727f, 0.942f, -5.729f, 0.942f, -7.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                curveToRelative(0.0f, 1.271f, 0.651f, 5.274f, 0.942f, 7.0f)
                horizontalLineToRelative(-3.624f)
                curveToRelative(-3.082f, 0.0f, -5.318f, 2.332f, -5.318f, 5.545f)
                curveToRelative(0.0f, 0.248f, 0.053f, 1.108f, 0.734f, 1.78f)
                curveToRelative(0.314f, 0.31f, 0.866f, 0.675f, 1.7f, 0.675f)
                horizontalLineToRelative(0.042f)
                close()
                moveTo(9.355f, 14.0f)
                curveToRelative(0.784f, 0.0f, 1.522f, -0.343f, 2.027f, -0.942f)
                curveToRelative(0.365f, -0.433f, 0.578f, -0.963f, 0.618f, -1.515f)
                curveToRelative(0.04f, 0.552f, 0.252f, 1.083f, 0.618f, 1.515f)
                curveToRelative(0.504f, 0.599f, 1.244f, 0.942f, 2.027f, 0.942f)
                horizontalLineToRelative(4.037f)
                curveToRelative(1.256f, 0.0f, 2.095f, 0.752f, 2.279f, 2.0f)
                lineTo(3.039f, 16.0f)
                curveToRelative(0.186f, -1.247f, 1.023f, -2.0f, 2.28f, -2.0f)
                horizontalLineToRelative(4.037f)
                close()
                moveTo(13.0f, 4.0f)
                curveToRelative(0.0f, 0.616f, -0.333f, 3.185f, -0.969f, 6.904f)
                curveToRelative(-0.015f, 0.086f, -0.025f, 0.172f, -0.031f, 0.257f)
                curveToRelative(-0.006f, -0.085f, -0.017f, -0.171f, -0.031f, -0.257f)
                curveToRelative(-0.636f, -3.719f, -0.969f, -6.288f, -0.969f, -6.904f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _stamp!!
    }

private var _stamp: ImageVector? = null
