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

public val Icons.Filled.ChartScatter: ImageVector
    get() {
        if (_chartScatter != null) {
            return _chartScatter!!
        }
        _chartScatter = Builder(name = "ChartScatter", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 24.0f)
                lineTo(2.988f, 24.0f)
                curveTo(1.333f, 24.0f, -0.012f, 22.654f, -0.012f, 21.0f)
                lineTo(-0.012f, 1.0f)
                curveTo(-0.006f, -0.308f, 1.982f, -0.307f, 1.988f, 1.0f)
                lineTo(1.988f, 21.0f)
                curveToRelative(0.0f, 0.552f, 0.449f, 1.0f, 1.0f, 1.0f)
                lineTo(23.0f, 22.0f)
                curveToRelative(1.308f, 0.006f, 1.307f, 1.995f, 0.0f, 2.0f)
                close()
                moveTo(14.0f, 13.0f)
                curveToRelative(0.006f, 1.308f, 1.994f, 1.308f, 2.0f, 0.0f)
                curveToRelative(-0.006f, -1.308f, -1.994f, -1.308f, -2.0f, 0.0f)
                close()
                moveTo(20.0f, 7.0f)
                curveToRelative(0.006f, 1.308f, 1.994f, 1.308f, 2.0f, 0.0f)
                curveToRelative(-0.006f, -1.308f, -1.994f, -1.308f, -2.0f, 0.0f)
                close()
                moveTo(11.0f, 18.0f)
                curveToRelative(0.006f, 1.308f, 1.994f, 1.308f, 2.0f, 0.0f)
                curveToRelative(-0.006f, -1.308f, -1.994f, -1.308f, -2.0f, 0.0f)
                close()
                moveTo(20.0f, 17.0f)
                curveToRelative(0.006f, 1.308f, 1.994f, 1.308f, 2.0f, 0.0f)
                curveToRelative(-0.006f, -1.308f, -1.994f, -1.308f, -2.0f, 0.0f)
                close()
                moveTo(9.0f, 5.0f)
                curveToRelative(0.006f, 1.308f, 1.994f, 1.308f, 2.0f, 0.0f)
                curveToRelative(-0.006f, -1.308f, -1.994f, -1.308f, -2.0f, 0.0f)
                close()
                moveTo(5.0f, 12.0f)
                curveToRelative(0.006f, 1.308f, 1.994f, 1.308f, 2.0f, 0.0f)
                curveToRelative(-0.006f, -1.308f, -1.994f, -1.308f, -2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _chartScatter!!
    }

private var _chartScatter: ImageVector? = null
