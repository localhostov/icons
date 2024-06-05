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

public val Icons.Bold.X: ImageVector
    get() {
        if (_x != null) {
            return _x!!
        }
        _x = Builder(name = "X", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.86f, 12.0f)
                lineToRelative(8.801f, -12.0f)
                lineToRelative(-3.721f, 0.0f)
                lineToRelative(-6.94f, 9.463f)
                lineToRelative(-6.94f, -9.463f)
                lineToRelative(-3.721f, 0.0f)
                lineToRelative(8.801f, 12.0f)
                lineToRelative(-8.801f, 12.0f)
                lineToRelative(3.721f, 0.0f)
                lineToRelative(6.94f, -9.463f)
                lineToRelative(6.94f, 9.463f)
                lineToRelative(3.721f, 0.0f)
                lineToRelative(-8.801f, -12.0f)
                close()
            }
        }
        .build()
        return _x!!
    }

private var _x: ImageVector? = null
