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
                curveToRelative(0.0f, -1.626f, -0.714f, -3.16f, -1.925f, -4.124f)
                curveToRelative(0.14f, -1.622f, -0.44f, -3.211f, -1.59f, -4.362f)
                curveToRelative(-1.15f, -1.149f, -2.735f, -1.731f, -4.277f, -1.555f)
                curveToRelative(-2.014f, -2.556f, -6.365f, -2.604f, -8.332f, -0.035f)
                curveTo(4.643f, 1.54f, 1.534f, 4.584f, 1.96f, 7.792f)
                curveToRelative(-2.556f, 2.014f, -2.605f, 6.365f, -0.035f, 8.333f)
                curveToRelative(-0.14f, 1.622f, 0.44f, 3.211f, 1.59f, 4.362f)
                curveToRelative(1.15f, 1.149f, 2.737f, 1.731f, 4.277f, 1.555f)
                curveToRelative(2.014f, 2.556f, 6.365f, 2.604f, 8.332f, 0.035f)
                curveToRelative(1.62f, 0.139f, 3.21f, -0.439f, 4.361f, -1.59f)
                curveToRelative(1.149f, -1.15f, 1.729f, -2.74f, 1.555f, -4.277f)
                curveToRelative(1.246f, -1.048f, 1.96f, -2.582f, 1.96f, -4.208f)
                close()
                moveTo(8.0f, 9.0f)
                curveToRelative(0.006f, -1.308f, 1.994f, -1.308f, 2.0f, 0.0f)
                curveToRelative(-0.006f, 1.308f, -1.994f, 1.308f, -2.0f, 0.0f)
                close()
                moveTo(10.832f, 15.555f)
                curveToRelative(-0.308f, 0.463f, -0.933f, 0.581f, -1.387f, 0.277f)
                curveToRelative(-0.46f, -0.306f, -0.584f, -0.927f, -0.277f, -1.387f)
                lineToRelative(4.0f, -6.0f)
                curveToRelative(0.306f, -0.459f, 0.926f, -0.585f, 1.387f, -0.277f)
                curveToRelative(0.46f, 0.306f, 0.584f, 0.927f, 0.277f, 1.387f)
                lineToRelative(-4.0f, 6.0f)
                close()
                moveTo(15.0f, 16.0f)
                curveToRelative(-1.308f, -0.006f, -1.308f, -1.994f, 0.0f, -2.0f)
                curveToRelative(1.308f, 0.006f, 1.308f, 1.994f, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _badgePercent!!
    }

private var _badgePercent: ImageVector? = null
