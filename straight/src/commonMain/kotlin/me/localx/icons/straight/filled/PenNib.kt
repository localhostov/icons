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
                moveToRelative(11.23f, 3.649f)
                lineToRelative(9.125f, 9.125f)
                lineToRelative(-2.541f, 7.07f)
                lineTo(1.419f, 24.0f)
                lineToRelative(8.067f, -8.067f)
                curveToRelative(0.164f, 0.044f, 0.336f, 0.067f, 0.514f, 0.067f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                curveToRelative(0.0f, 0.18f, 0.024f, 0.355f, 0.069f, 0.521f)
                lineTo(0.005f, 22.586f)
                lineTo(4.149f, 6.191f)
                lineToRelative(7.082f, -2.542f)
                close()
                moveTo(16.0f, 0.005f)
                lineToRelative(-2.793f, 2.793f)
                lineToRelative(8.0f, 8.0f)
                lineToRelative(2.793f, -2.793f)
                lineTo(16.0f, 0.005f)
                close()
            }
        }
        .build()
        return _penNib!!
    }

private var _penNib: ImageVector? = null
