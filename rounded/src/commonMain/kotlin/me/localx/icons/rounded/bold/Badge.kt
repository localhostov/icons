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

public val Icons.Bold.Badge: ImageVector
    get() {
        if (_badge != null) {
            return _badge!!
        }
        _badge = Builder(name = "Badge", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.1f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -14.1f, 5.161f)
                verticalLineToRelative(7.986f)
                arcToRelative(2.847f, 2.847f, 0.0f, false, false, 4.63f, 2.226f)
                lineToRelative(1.37f, -1.1f)
                lineToRelative(1.369f, 1.1f)
                arcToRelative(2.85f, 2.85f, 0.0f, false, false, 4.631f, -2.226f)
                verticalLineToRelative(-7.76f)
                arcToRelative(7.963f, 7.963f, 0.0f, false, false, 2.1f, -5.387f)
                close()
                moveTo(12.1f, 3.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -5.0f, 5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, -5.0f)
                close()
                moveTo(13.31f, 19.487f)
                arcToRelative(2.088f, 2.088f, 0.0f, false, false, -2.626f, 0.0f)
                lineToRelative(-1.684f, 1.348f)
                verticalLineToRelative(-5.462f)
                arcToRelative(7.943f, 7.943f, 0.0f, false, false, 6.0f, 0.076f)
                verticalLineToRelative(5.386f)
                close()
            }
        }
        .build()
        return _badge!!
    }

private var _badge: ImageVector? = null
