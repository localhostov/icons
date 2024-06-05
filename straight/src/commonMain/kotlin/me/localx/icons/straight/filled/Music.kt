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

public val Icons.Filled.Music: ImageVector
    get() {
        if (_music != null) {
            return _music!!
        }
        _music = Builder(name = "Music", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 1.0f)
                horizontalLineTo(11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.0f, 4.0f)
                verticalLineTo(14.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 2.0f, 4.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineTo(14.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 2.0f, 4.0f)
                verticalLineTo(4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 1.0f)
                close()
            }
        }
        .build()
        return _music!!
    }

private var _music: ImageVector? = null
