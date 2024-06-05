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

public val Icons.Filled.Dolphin: ImageVector
    get() {
        if (_dolphin != null) {
            return _dolphin!!
        }
        _dolphin = Builder(name = "Dolphin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 7.0f)
                horizontalLineToRelative(-0.062f)
                curveToRelative(-0.448f, -3.623f, -3.327f, -7.0f, -8.438f, -7.0f)
                curveToRelative(-2.005f, 0.0f, -4.136f, 0.489f, -6.013f, 1.612f)
                curveTo(5.988f, 0.909f, 3.957f, 0.248f, 1.313f, 0.004f)
                curveTo(0.394f, -0.081f, -0.451f, 1.127f, 0.273f, 1.699f)
                curveToRelative(1.595f, 1.262f, 2.663f, 2.671f, 3.381f, 3.943f)
                curveToRelative(-1.024f, 1.888f, -1.653f, 4.308f, -1.653f, 7.358f)
                curveToRelative(0.0f, 2.437f, 0.613f, 4.705f, 1.078f, 6.075f)
                curveToRelative(-1.822f, 0.904f, -3.078f, 2.786f, -3.078f, 4.953f)
                curveToRelative(4.173f, 0.0f, 5.5f, -2.776f, 5.5f, -2.776f)
                curveToRelative(0.0f, 0.0f, 1.378f, 2.776f, 5.5f, 2.776f)
                curveToRelative(0.0f, -2.303f, -1.417f, -4.287f, -3.425f, -5.114f)
                curveToRelative(0.205f, -1.708f, 0.852f, -3.547f, 1.748f, -4.847f)
                curveToRelative(0.809f, -1.173f, 1.868f, -1.904f, 2.98f, -2.365f)
                curveToRelative(0.487f, 0.851f, 1.04f, 2.155f, 1.697f, 3.797f)
                curveToRelative(0.987f, -1.974f, 1.451f, -3.4f, 1.634f, -4.484f)
                curveToRelative(0.156f, -0.006f, 0.317f, -0.016f, 0.467f, -0.016f)
                horizontalLineToRelative(7.899f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _dolphin!!
    }

private var _dolphin: ImageVector? = null
