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

public val Icons.Filled.GlassHalf: ImageVector
    get() {
        if (_glassHalf != null) {
            return _glassHalf!!
        }
        _glassHalf = Builder(name = "GlassHalf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.016f, 11.0f)
                lineTo(1.111f, 0.0f)
                horizontalLineToRelative(21.774f)
                lineToRelative(-0.967f, 11.0f)
                lineTo(2.016f, 11.0f)
                close()
                moveTo(2.18f, 13.0f)
                lineToRelative(0.678f, 8.246f)
                curveToRelative(0.127f, 1.544f, 1.44f, 2.754f, 2.99f, 2.754f)
                horizontalLineToRelative(12.18f)
                curveToRelative(1.566f, 0.0f, 2.852f, -1.177f, 2.988f, -2.737f)
                lineToRelative(0.726f, -8.263f)
                lineTo(2.18f, 13.0f)
                close()
            }
        }
        .build()
        return _glassHalf!!
    }

private var _glassHalf: ImageVector? = null
