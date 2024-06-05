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

public val Icons.Filled.Hotdog: ImageVector
    get() {
        if (_hotdog != null) {
            return _hotdog!!
        }
        _hotdog = Builder(name = "Hotdog", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(11.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(13.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 6.0f)
                close()
                moveTo(17.0f, 4.0f)
                lineTo(17.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(15.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 4.0f)
                close()
                moveTo(9.0f, 3.989f)
                lineTo(9.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 2.0f)
                lineTo(7.0f, 3.989f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 3.989f)
                close()
                moveTo(20.441f, 22.061f)
                curveToRelative(5.283f, -2.692f, 1.537f, -10.546f, -3.887f, -8.12f)
                arcTo(9.327f, 9.327f, 0.0f, false, true, 12.0f, 15.0f)
                arcToRelative(9.327f, 9.327f, 0.0f, false, true, -4.556f, -1.059f)
                curveToRelative(-5.419f, -2.426f, -9.174f, 5.427f, -3.887f, 8.12f)
                curveTo(7.915f, 24.6f, 16.084f, 24.6f, 20.441f, 22.061f)
                close()
                moveTo(0.957f, 12.906f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 6.015f, 8.065f)
                curveToRelative(2.558f, 2.553f, 9.49f, 2.513f, 11.98f, -0.014f)
                curveToRelative(3.423f, -3.284f, 8.322f, 1.858f, 4.812f, 5.083f)
                arcToRelative(6.507f, 6.507f, 0.0f, false, false, -7.117f, -1.0f)
                arcTo(7.388f, 7.388f, 0.0f, false, true, 12.0f, 13.0f)
                arcToRelative(7.4f, 7.4f, 0.0f, false, true, -3.693f, -0.862f)
                arcToRelative(6.505f, 6.505f, 0.0f, false, false, -7.116f, 1.0f)
                curveTo(1.073f, 13.025f, 0.994f, 12.945f, 0.957f, 12.906f)
                close()
            }
        }
        .build()
        return _hotdog!!
    }

private var _hotdog: ImageVector? = null
