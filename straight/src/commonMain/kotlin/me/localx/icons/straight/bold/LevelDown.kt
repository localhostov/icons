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

public val Icons.Bold.LevelDown: ImageVector
    get() {
        if (_levelDown != null) {
            return _levelDown!!
        }
        _levelDown = Builder(name = "LevelDown", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9f, 16.439f)
                lineToRelative(-2.9f, 2.9f)
                verticalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 10.5f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineTo(19.335f)
                lineToRelative(-2.9f, -2.9f)
                lineTo(5.983f, 18.561f)
                lineToRelative(4.677f, 4.676f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, false, 3.68f, 0.0f)
                lineToRelative(4.678f, -4.676f)
                close()
            }
        }
        .build()
        return _levelDown!!
    }

private var _levelDown: ImageVector? = null
