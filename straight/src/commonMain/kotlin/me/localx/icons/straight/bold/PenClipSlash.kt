package me.localx.icons.straight.bold

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

public val Icons.Bold.PenClipSlash: ImageVector
    get() {
        if (_penClipSlash != null) {
            return _penClipSlash!!
        }
        _penClipSlash = Builder(name = "PenClipSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.379f, 15.379f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-2.6f, 2.601f)
                curveToRelative(-1.126f, 1.126f, -3.856f, 1.571f, -5.444f, 1.739f)
                lineToRelative(-2.308f, 2.308f)
                lineTo(0.027f, 22.027f)
                lineToRelative(2.272f, -2.272f)
                curveToRelative(0.163f, -1.578f, 0.604f, -4.368f, 1.746f, -5.509f)
                lineToRelative(2.601f, -2.601f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-2.601f, 2.601f)
                curveToRelative(-0.218f, 0.258f, -0.481f, 1.187f, -0.68f, 2.292f)
                curveToRelative(1.106f, -0.199f, 2.038f, -0.466f, 2.303f, -0.689f)
                lineToRelative(2.59f, -2.591f)
                close()
                moveTo(23.998f, 21.877f)
                lineToRelative(-2.121f, 2.121f)
                lineTo(0.002f, 2.123f)
                lineTo(2.123f, 0.002f)
                lineToRelative(4.709f, 4.708f)
                lineToRelative(3.402f, -3.402f)
                curveToRelative(1.457f, -1.457f, 3.82f, -1.457f, 5.277f, 0.0f)
                lineToRelative(0.736f, 0.736f)
                lineToRelative(0.552f, -0.552f)
                curveToRelative(1.546f, -1.547f, 4.027f, -1.715f, 5.648f, -0.389f)
                curveToRelative(0.907f, 0.742f, 1.462f, 1.837f, 1.521f, 3.002f)
                curveToRelative(0.058f, 1.167f, -0.382f, 2.31f, -1.208f, 3.135f)
                lineToRelative(-6.699f, 6.699f)
                lineToRelative(7.937f, 7.937f)
                close()
                moveTo(10.206f, 8.085f)
                lineToRelative(3.919f, -3.919f)
                lineToRelative(-0.736f, -0.736f)
                curveToRelative(-0.286f, -0.286f, -0.749f, -0.286f, -1.035f, 0.0f)
                lineToRelative(-3.402f, 3.402f)
                lineToRelative(1.254f, 1.254f)
                close()
                moveTo(13.939f, 11.818f)
                lineToRelative(3.919f, -3.919f)
                lineToRelative(-1.612f, -1.612f)
                lineToRelative(-3.919f, 3.919f)
                lineToRelative(1.612f, 1.612f)
                close()
            }
        }
        .build()
        return _penClipSlash!!
    }

private var _penClipSlash: ImageVector? = null
