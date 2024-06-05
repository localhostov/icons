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

public val Icons.Filled.PenNib: ImageVector
    get() {
        if (_penNib != null) {
            return _penNib!!
        }
        _penNib = Builder(name = "PenNib", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 8.707f)
                lineToRelative(-2.293f, 2.293f)
                lineTo(13.0f, 2.586f)
                lineTo(15.293f, 0.293f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(7.0f, 7.0f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(11.19f, 3.604f)
                lineToRelative(-4.605f, 1.703f)
                curveToRelative(-1.488f, 0.551f, -2.637f, 1.791f, -3.073f, 3.317f)
                lineTo(0.111f, 20.545f)
                curveToRelative(-0.18f, 0.612f, -0.134f, 1.254f, 0.109f, 1.821f)
                lineToRelative(7.848f, -7.848f)
                curveToRelative(-0.044f, -0.165f, -0.068f, -0.339f, -0.068f, -0.518f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                curveToRelative(-0.179f, 0.0f, -0.353f, -0.024f, -0.518f, -0.068f)
                lineToRelative(-7.848f, 7.848f)
                curveToRelative(0.335f, 0.144f, 0.696f, 0.219f, 1.061f, 0.219f)
                curveToRelative(0.251f, 0.0f, 0.504f, -0.035f, 0.751f, -0.108f)
                lineToRelative(11.884f, -3.377f)
                curveToRelative(1.521f, -0.432f, 2.76f, -1.574f, 3.315f, -3.054f)
                lineToRelative(1.746f, -4.655f)
                lineTo(11.19f, 3.604f)
                close()
            }
        }
        .build()
        return _penNib!!
    }

private var _penNib: ImageVector? = null
