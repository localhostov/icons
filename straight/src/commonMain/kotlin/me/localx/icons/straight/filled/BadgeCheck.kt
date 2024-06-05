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

public val Icons.Filled.BadgeCheck: ImageVector
    get() {
        if (_badgeCheck != null) {
            return _badgeCheck!!
        }
        _badgeCheck = Builder(name = "BadgeCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, -1.696f, -0.86f, -3.191f, -2.168f, -4.073f)
                curveToRelative(0.301f, -1.548f, -0.148f, -3.213f, -1.347f, -4.413f)
                curveToRelative(-1.199f, -1.199f, -2.864f, -1.648f, -4.413f, -1.347f)
                curveToRelative(-0.882f, -1.308f, -2.377f, -2.168f, -4.073f, -2.168f)
                reflectiveCurveToRelative(-3.191f, 0.86f, -4.073f, 2.168f)
                curveToRelative(-1.548f, -0.301f, -3.214f, 0.148f, -4.413f, 1.347f)
                curveToRelative(-1.199f, 1.199f, -1.648f, 2.864f, -1.347f, 4.413f)
                curveToRelative(-1.308f, 0.882f, -2.168f, 2.377f, -2.168f, 4.073f)
                reflectiveCurveToRelative(0.86f, 3.191f, 2.168f, 4.073f)
                curveToRelative(-0.301f, 1.548f, 0.148f, 3.214f, 1.347f, 4.413f)
                curveToRelative(1.199f, 1.199f, 2.864f, 1.648f, 4.413f, 1.347f)
                curveToRelative(0.882f, 1.308f, 2.377f, 2.168f, 4.073f, 2.168f)
                reflectiveCurveToRelative(3.191f, -0.86f, 4.073f, -2.168f)
                curveToRelative(1.548f, 0.301f, 3.214f, -0.148f, 4.413f, -1.347f)
                curveToRelative(1.199f, -1.199f, 1.648f, -2.864f, 1.347f, -4.413f)
                curveToRelative(1.308f, -0.882f, 2.168f, -2.377f, 2.168f, -4.073f)
                close()
                moveTo(11.909f, 15.419f)
                curveToRelative(-0.387f, 0.387f, -0.896f, 0.58f, -1.407f, 0.58f)
                reflectiveCurveToRelative(-1.025f, -0.195f, -1.416f, -0.585f)
                lineToRelative(-2.782f, -2.696f)
                lineToRelative(1.393f, -1.437f)
                lineToRelative(2.793f, 2.707f)
                lineToRelative(5.809f, -5.701f)
                lineToRelative(1.404f, 1.425f)
                lineToRelative(-5.793f, 5.707f)
                close()
            }
        }
        .build()
        return _badgeCheck!!
    }

private var _badgeCheck: ImageVector? = null
