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

public val Icons.Bold.LevelUp: ImageVector
    get() {
        if (_levelUp != null) {
            return _levelUp!!
        }
        _levelUp = Builder(name = "LevelUp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9f, 7.561f)
                lineTo(14.0f, 4.665f)
                verticalLineTo(20.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 10.5f, 24.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineTo(4.665f)
                lineToRelative(-2.9f, 2.9f)
                lineTo(5.983f, 5.439f)
                lineTo(10.66f, 0.763f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, 3.68f, 0.0f)
                lineToRelative(4.678f, 4.676f)
                close()
            }
        }
        .build()
        return _levelUp!!
    }

private var _levelUp: ImageVector? = null
