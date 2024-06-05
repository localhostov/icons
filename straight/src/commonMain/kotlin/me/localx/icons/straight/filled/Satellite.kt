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

public val Icons.Filled.Satellite: ImageVector
    get() {
        if (_satellite != null) {
            return _satellite!!
        }
        _satellite = Builder(name = "Satellite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.195f, 9.695f)
                lineToRelative(-3.652f, -3.652f)
                lineTo(8.5f, 0.086f)
                lineToRelative(3.652f, 3.652f)
                lineToRelative(-5.957f, 5.957f)
                close()
                moveTo(14.283f, 17.783f)
                lineToRelative(3.674f, 3.674f)
                lineToRelative(5.957f, -5.957f)
                lineToRelative(-3.674f, -3.674f)
                lineToRelative(-5.957f, 5.957f)
                close()
                moveTo(5.261f, 12.089f)
                curveToRelative(-1.776f, 0.0f, -3.447f, 0.691f, -4.703f, 1.948f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(3.996f, 3.996f)
                lineToRelative(-1.407f, 1.407f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.407f, -1.407f)
                lineToRelative(3.995f, 3.996f)
                lineToRelative(0.354f, -0.354f)
                curveToRelative(1.256f, -1.256f, 1.948f, -2.926f, 1.948f, -4.703f)
                reflectiveCurveToRelative(-0.691f, -3.447f, -1.948f, -4.703f)
                curveToRelative(-1.256f, -1.256f, -2.926f, -1.948f, -4.702f, -1.948f)
                close()
                moveTo(23.269f, 2.433f)
                lineToRelative(-1.725f, -1.725f)
                curveToRelative(-0.946f, -0.945f, -2.593f, -0.943f, -3.535f, 0.0f)
                lineToRelative(-9.878f, 9.877f)
                curveToRelative(1.206f, 0.424f, 2.315f, 1.107f, 3.245f, 2.037f)
                curveToRelative(0.922f, 0.922f, 1.601f, 2.019f, 2.026f, 3.213f)
                lineToRelative(9.866f, -9.867f)
                curveToRelative(0.975f, -0.975f, 0.975f, -2.561f, 0.0f, -3.536f)
                close()
            }
        }
        .build()
        return _satellite!!
    }

private var _satellite: ImageVector? = null
