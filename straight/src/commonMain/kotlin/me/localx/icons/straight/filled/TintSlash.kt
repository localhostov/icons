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

public val Icons.Filled.TintSlash: ImageVector
    get() {
        if (_tintSlash != null) {
            return _tintSlash!!
        }
        _tintSlash = Builder(name = "TintSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.563f, 19.149f)
                curveToRelative(2.35f, -3.902f, 1.76f, -8.967f, -1.5f, -12.228f)
                lineTo(12.0f, 0.014f)
                lineToRelative(-5.345f, 5.227f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-3.394f, -3.394f)
                close()
                moveTo(17.853f, 22.096f)
                curveToRelative(-1.695f, 1.23f, -3.72f, 1.904f, -5.854f, 1.904f)
                curveToRelative(-2.671f, 0.0f, -5.182f, -1.04f, -7.071f, -2.929f)
                curveToRelative(-3.517f, -3.517f, -3.851f, -9.017f, -1.024f, -12.924f)
                lineToRelative(13.949f, 13.948f)
                close()
            }
        }
        .build()
        return _tintSlash!!
    }

private var _tintSlash: ImageVector? = null
