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

public val Icons.Filled.GrinAlt: ImageVector
    get() {
        if (_grinAlt != null) {
            return _grinAlt!!
        }
        _grinAlt = Builder(name = "GrinAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.893f, 24.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(15.5f, 7.0f)
                curveToRelative(1.964f, 0.027f, 1.964f, 4.973f, 0.0f, 5.0f)
                curveTo(13.536f, 11.973f, 13.536f, 7.027f, 15.5f, 7.0f)
                close()
                moveTo(8.5f, 7.0f)
                curveToRelative(1.964f, 0.027f, 1.964f, 4.973f, 0.0f, 5.0f)
                curveTo(6.536f, 11.973f, 6.536f, 7.027f, 8.5f, 7.0f)
                close()
                moveTo(12.007f, 19.0f)
                curveTo(8.671f, 19.0f, 6.615f, 16.28f, 6.0f, 14.0f)
                arcToRelative(21.841f, 21.841f, 0.0f, false, false, 6.0f, 1.0f)
                arcToRelative(21.923f, 21.923f, 0.0f, false, false, 6.007f, -1.0f)
                curveTo(17.392f, 16.28f, 15.343f, 19.0f, 12.007f, 19.0f)
                close()
            }
        }
        .build()
        return _grinAlt!!
    }

private var _grinAlt: ImageVector? = null
