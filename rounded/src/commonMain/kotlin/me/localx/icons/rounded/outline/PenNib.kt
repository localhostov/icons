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

public val Icons.Outline.PenNib: ImageVector
    get() {
        if (_penNib != null) {
            return _penNib!!
        }
        _penNib = Builder(name = "PenNib", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 7.293f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-2.293f, 2.293f)
                lineToRelative(-5.586f, -5.586f)
                lineToRelative(2.293f, -2.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(-1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-2.845f, 2.845f)
                lineToRelative(-5.863f, 2.169f)
                curveToRelative(-1.488f, 0.551f, -2.637f, 1.791f, -3.073f, 3.317f)
                lineTo(0.111f, 20.545f)
                curveToRelative(-0.278f, 0.946f, -0.018f, 1.967f, 0.68f, 2.664f)
                curveToRelative(0.513f, 0.514f, 1.202f, 0.79f, 1.904f, 0.79f)
                curveToRelative(0.251f, 0.0f, 0.504f, -0.035f, 0.751f, -0.108f)
                lineToRelative(11.884f, -3.377f)
                curveToRelative(1.521f, -0.432f, 2.76f, -1.574f, 3.315f, -3.054f)
                lineToRelative(2.215f, -5.907f)
                lineToRelative(2.846f, -2.846f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(16.772f, 16.758f)
                curveToRelative(-0.333f, 0.888f, -1.076f, 1.573f, -1.989f, 1.833f)
                lineToRelative(-11.12f, 3.16f)
                lineToRelative(5.818f, -5.818f)
                curveToRelative(0.165f, 0.044f, 0.339f, 0.068f, 0.518f, 0.068f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                curveToRelative(0.0f, 0.179f, 0.024f, 0.353f, 0.068f, 0.518f)
                lineToRelative(-5.817f, 5.817f)
                lineToRelative(3.184f, -11.161f)
                curveToRelative(0.262f, -0.916f, 0.951f, -1.66f, 1.844f, -1.991f)
                lineToRelative(5.467f, -2.023f)
                lineToRelative(6.091f, 6.091f)
                lineToRelative(-2.065f, 5.506f)
                close()
            }
        }
        .build()
        return _penNib!!
    }

private var _penNib: ImageVector? = null
