package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.LevelDownAlt: ImageVector
    get() {
        if (_levelDownAlt != null) {
            return _levelDownAlt!!
        }
        _levelDownAlt = Builder(name = "LevelDownAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.087f, 17.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(5.5f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 8.0f, 0.0f)
                horizontalLineTo(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineTo(8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.913f)
                arcToRelative(0.924f, 0.924f, 0.0f, false, false, -0.644f, 1.575f)
                lineToRelative(5.087f, 5.155f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 1.288f, 0.0f)
                lineToRelative(5.087f, -5.155f)
                arcTo(0.924f, 0.924f, 0.0f, false, false, 17.087f, 17.0f)
                close()
            }
        }
        .build()
        return _levelDownAlt!!
    }

private var _levelDownAlt: ImageVector? = null
