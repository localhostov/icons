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

public val Icons.Filled.BadgePercent: ImageVector
    get() {
        if (_badgePercent != null) {
            return _badgePercent!!
        }
        _badgePercent = Builder(name = "BadgePercent", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(8.0f, 9.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(10.766f, 16.0f)
                horizontalLineToRelative(-2.332f)
                lineToRelative(4.8f, -8.0f)
                horizontalLineToRelative(2.332f)
                lineToRelative(-4.8f, 8.0f)
                close()
                moveTo(15.0f, 16.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _badgePercent!!
    }

private var _badgePercent: ImageVector? = null
