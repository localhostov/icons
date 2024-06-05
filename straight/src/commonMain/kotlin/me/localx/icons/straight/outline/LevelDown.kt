package me.localx.icons.straight.outline

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

public val Icons.Outline.LevelDown: ImageVector
    get() {
        if (_levelDown != null) {
            return _levelDown!!
        }
        _levelDown = Builder(name = "LevelDown", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.75f, 17.293f)
                lineTo(13.0f, 21.042f)
                verticalLineTo(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineTo(21.042f)
                lineTo(7.25f, 17.293f)
                lineTo(5.836f, 18.707f)
                lineToRelative(4.677f, 4.677f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, 2.973f, 0.0f)
                lineToRelative(4.678f, -4.677f)
                close()
            }
        }
        .build()
        return _levelDown!!
    }

private var _levelDown: ImageVector? = null
