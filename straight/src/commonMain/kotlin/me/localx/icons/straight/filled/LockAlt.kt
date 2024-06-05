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

public val Icons.Filled.LockAlt: ImageVector
    get() {
        if (_lockAlt != null) {
            return _lockAlt!!
        }
        _lockAlt = Builder(name = "LockAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
                moveTo(24.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, true, 12.0f, 12.0f)
                close()
                moveTo(15.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -4.0f, 2.816f)
                verticalLineToRelative(4.184f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.184f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.0f, -2.816f)
                close()
            }
        }
        .build()
        return _lockAlt!!
    }

private var _lockAlt: ImageVector? = null
