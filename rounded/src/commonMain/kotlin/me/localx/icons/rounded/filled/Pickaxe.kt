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

public val Icons.Filled.Pickaxe: ImageVector
    get() {
        if (_pickaxe != null) {
            return _pickaxe!!
        }
        _pickaxe = Builder(name = "Pickaxe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.867f, 18.985f)
                curveToRelative(-0.515f, 0.0f, -0.946f, -0.361f, -1.067f, -0.862f)
                curveToRelative(-0.809f, -3.356f, -2.643f, -6.666f, -5.092f, -9.418f)
                lineTo(1.707f, 23.707f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineTo(15.295f, 7.29f)
                curveToRelative(-2.755f, -2.456f, -6.071f, -4.296f, -9.434f, -5.106f)
                curveToRelative(-0.5f, -0.121f, -0.862f, -0.552f, -0.862f, -1.067f)
                curveTo(5.0f, 0.505f, 5.507f, -0.001f, 6.12f, 0.02f)
                curveToRelative(5.168f, 0.182f, 9.265f, 1.637f, 12.228f, 4.218f)
                lineToRelative(0.945f, -0.945f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-0.946f, 0.946f)
                curveToRelative(2.572f, 2.962f, 4.022f, 7.054f, 4.204f, 12.213f)
                curveToRelative(0.022f, 0.613f, -0.484f, 1.12f, -1.098f, 1.12f)
                close()
            }
        }
        .build()
        return _pickaxe!!
    }

private var _pickaxe: ImageVector? = null
