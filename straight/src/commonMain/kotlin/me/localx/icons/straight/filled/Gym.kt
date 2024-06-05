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

public val Icons.Filled.Gym: ImageVector
    get() {
        if (_gym != null) {
            return _gym!!
        }
        _gym = Builder(name = "Gym", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.121f, 7.122f)
                lineToRelative(-2.414f, -2.415f)
                lineToRelative(2.0f, -2.0f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.0f, 2.0f)
                lineToRelative(-2.414f, -2.414f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -4.243f, 0.0f)
                lineToRelative(-2.828f, 2.828f)
                lineToRelative(4.535f, 4.536f)
                lineToRelative(-6.1f, 6.1f)
                lineToRelative(-4.536f, -4.535f)
                lineToRelative(-2.828f, 2.828f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 4.242f)
                lineToRelative(2.414f, 2.415f)
                lineToRelative(-2.0f, 2.0f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.0f, -2.0f)
                lineToRelative(2.414f, 2.414f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.243f, 0.0f)
                lineToRelative(2.828f, -2.828f)
                lineToRelative(-4.535f, -4.536f)
                lineToRelative(6.1f, -6.1f)
                lineToRelative(4.535f, 4.535f)
                lineToRelative(2.828f, -2.828f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -4.242f)
                close()
            }
        }
        .build()
        return _gym!!
    }

private var _gym: ImageVector? = null
