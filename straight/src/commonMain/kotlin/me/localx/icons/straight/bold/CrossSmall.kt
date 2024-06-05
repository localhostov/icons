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

public val Icons.Bold.CrossSmall: ImageVector
    get() {
        if (_crossSmall != null) {
            return _crossSmall!!
        }
        _crossSmall = Builder(name = "CrossSmall", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.061f, 7.061f)
                lineToRelative(-2.122f, -2.122f)
                lineToRelative(-4.939f, 4.94f)
                lineToRelative(-4.939f, -4.94f)
                lineToRelative(-2.122f, 2.122f)
                lineToRelative(4.94f, 4.939f)
                lineToRelative(-4.94f, 4.939f)
                lineToRelative(2.122f, 2.122f)
                lineToRelative(4.939f, -4.94f)
                lineToRelative(4.939f, 4.94f)
                lineToRelative(2.122f, -2.122f)
                lineToRelative(-4.94f, -4.939f)
                lineToRelative(4.94f, -4.939f)
                close()
            }
        }
        .build()
        return _crossSmall!!
    }

private var _crossSmall: ImageVector? = null
