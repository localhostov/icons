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

public val Icons.Bold.Delete: ImageVector
    get() {
        if (_delete != null) {
            return _delete!!
        }
        _delete = Builder(name = "Delete", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.561f, 10.561f)
                lineToRelative(-1.44f, 1.439f)
                lineToRelative(1.44f, 1.439f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.122f, 2.122f)
                lineToRelative(-1.439f, -1.44f)
                lineToRelative(-1.439f, 1.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.122f, -2.122f)
                lineToRelative(1.44f, -1.439f)
                lineToRelative(-1.44f, -1.439f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.122f, -2.122f)
                lineToRelative(1.439f, 1.44f)
                lineToRelative(1.439f, -1.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.122f, 2.122f)
                close()
                moveTo(24.0f, 7.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                horizontalLineToRelative(-9.023f)
                arcToRelative(5.534f, 5.534f, 0.0f, false, true, -4.37f, -2.159f)
                lineToRelative(-5.3f, -6.93f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -1.822f)
                lineToRelative(5.3f, -6.93f)
                arcToRelative(5.534f, 5.534f, 0.0f, false, true, 4.37f, -2.159f)
                horizontalLineToRelative(9.023f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, 5.0f)
                close()
                moveTo(21.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(-9.023f)
                arcToRelative(2.518f, 2.518f, 0.0f, false, false, -1.987f, 0.981f)
                lineToRelative(-4.601f, 6.019f)
                lineToRelative(4.6f, 6.019f)
                arcToRelative(2.518f, 2.518f, 0.0f, false, false, 1.988f, 0.981f)
                horizontalLineToRelative(9.023f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _delete!!
    }

private var _delete: ImageVector? = null
