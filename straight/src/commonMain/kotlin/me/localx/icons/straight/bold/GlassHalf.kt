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

public val Icons.Bold.GlassHalf: ImageVector
    get() {
        if (_glassHalf != null) {
            return _glassHalf!!
        }
        _glassHalf = Builder(name = "GlassHalf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.014f, 0.0f)
                lineToRelative(1.71f, 20.787f)
                curveToRelative(0.147f, 1.802f, 1.68f, 3.213f, 3.488f, 3.213f)
                horizontalLineToRelative(11.459f)
                curveToRelative(1.827f, 0.0f, 3.326f, -1.373f, 3.486f, -3.193f)
                lineTo(22.986f, 0.0f)
                lineTo(1.014f, 0.0f)
                close()
                moveTo(19.711f, 3.0f)
                lineToRelative(-0.615f, 7.0f)
                lineTo(4.847f, 10.0f)
                lineToRelative(-0.576f, -7.0f)
                horizontalLineToRelative(15.439f)
                close()
                moveTo(17.671f, 21.0f)
                lineTo(6.212f, 21.0f)
                curveToRelative(-0.258f, 0.0f, -0.478f, -0.201f, -0.498f, -0.459f)
                lineToRelative(-0.62f, -7.541f)
                horizontalLineToRelative(13.738f)
                lineToRelative(-0.663f, 7.544f)
                curveToRelative(-0.023f, 0.26f, -0.237f, 0.456f, -0.498f, 0.456f)
                close()
            }
        }
        .build()
        return _glassHalf!!
    }

private var _glassHalf: ImageVector? = null
