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

public val Icons.Filled.Icicles: ImageVector
    get() {
        if (_icicles != null) {
            return _icicles!!
        }
        _icicles = Builder(name = "Icicles", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                lineToRelative(24.0f, 0.0f)
                lineToRelative(0.0f, 0.635f)
                lineToRelative(-3.0f, 21.365f)
                lineToRelative(-3.132f, -12.719f)
                lineToRelative(-2.857f, 8.862f)
                lineToRelative(-3.103f, -8.876f)
                lineToRelative(-3.908f, 14.733f)
                lineToRelative(-3.429f, -14.468f)
                lineToRelative(-2.571f, 7.468f)
                lineToRelative(-2.0f, -16.365f)
                lineToRelative(0.0f, -0.635f)
                close()
            }
        }
        .build()
        return _icicles!!
    }

private var _icicles: ImageVector? = null
