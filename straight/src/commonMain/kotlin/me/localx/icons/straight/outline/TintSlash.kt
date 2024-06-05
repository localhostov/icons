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

public val Icons.Outline.TintSlash: ImageVector
    get() {
        if (_tintSlash != null) {
            return _tintSlash!!
        }
        _tintSlash = Builder(name = "TintSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.571f, 19.156f)
                curveToRelative(2.337f, -3.879f, 1.773f, -8.954f, -1.508f, -12.236f)
                lineTo(12.0f, 0.014f)
                lineToRelative(-5.345f, 5.227f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-3.386f, -3.386f)
                close()
                moveTo(12.0f, 2.811f)
                lineToRelative(5.657f, 5.532f)
                curveToRelative(2.498f, 2.499f, 3.024f, 6.306f, 1.445f, 9.345f)
                lineTo(8.069f, 6.655f)
                lineToRelative(3.93f, -3.844f)
                close()
                moveTo(16.426f, 20.668f)
                lineToRelative(1.436f, 1.436f)
                curveToRelative(-1.695f, 1.231f, -3.727f, 1.896f, -5.861f, 1.896f)
                curveToRelative(-2.671f, 0.0f, -5.182f, -1.04f, -7.071f, -2.929f)
                curveToRelative(-3.518f, -3.518f, -3.862f, -9.025f, -1.032f, -12.932f)
                lineToRelative(1.436f, 1.436f)
                curveToRelative(-2.062f, 3.101f, -1.727f, 7.345f, 1.01f, 10.082f)
                curveToRelative(1.511f, 1.511f, 3.521f, 2.343f, 5.657f, 2.343f)
                curveToRelative(1.598f, 0.0f, 3.125f, -0.466f, 4.425f, -1.332f)
                close()
            }
        }
        .build()
        return _tintSlash!!
    }

private var _tintSlash: ImageVector? = null
