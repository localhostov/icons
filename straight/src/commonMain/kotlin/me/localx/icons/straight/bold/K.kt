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

public val Icons.Bold.K: ImageVector
    get() {
        if (_k != null) {
            return _k!!
        }
        _k = Builder(name = "K", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.95f, 24.0f)
                lineToRelative(3.672f, 0.0f)
                lineToRelative(-7.831f, -11.061f)
                lineToRelative(7.772f, -12.939f)
                lineToRelative(-3.496f, 0.0f)
                lineToRelative(-6.616f, 11.0f)
                lineToRelative(-7.451f, 0.0f)
                lineToRelative(0.0f, -11.0f)
                lineToRelative(-3.0f, 0.0f)
                lineToRelative(0.0f, 24.0f)
                lineToRelative(3.0f, 0.0f)
                lineToRelative(0.0f, -10.0f)
                lineToRelative(6.862f, 0.0f)
                lineToRelative(7.088f, 10.0f)
                close()
            }
        }
        .build()
        return _k!!
    }

private var _k: ImageVector? = null
