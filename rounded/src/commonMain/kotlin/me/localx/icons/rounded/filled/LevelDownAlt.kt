package me.localx.icons.rounded.filled

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

public val Icons.Filled.LevelDownAlt: ImageVector
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
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 8.0f, 0.0f)
                horizontalLineTo(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 2.0f)
                horizontalLineTo(8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
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
