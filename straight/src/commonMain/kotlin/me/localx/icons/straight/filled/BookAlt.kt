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

public val Icons.Filled.BookAlt: ImageVector
    get() {
        if (_bookAlt != null) {
            return _bookAlt!!
        }
        _bookAlt = Builder(name = "BookAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.922f, 1.7f)
                arcToRelative(3.017f, 3.017f, 0.0f, false, false, -2.516f, -0.636f)
                lineToRelative(-4.122f, 1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.284f, 3.936f)
                verticalLineToRelative(14.8f)
                lineToRelative(-1.0f, 0.181f)
                lineToRelative(-1.0f, -0.181f)
                verticalLineToRelative(-14.8f)
                arcToRelative(3.979f, 3.979f, 0.0f, false, false, -3.227f, -3.923f)
                lineToRelative(-4.237f, -1.028f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.536f, 2.951f)
                verticalLineToRelative(16.834f)
                lineToRelative(12.0f, 2.183f)
                lineToRelative(12.0f, -2.183f)
                verticalLineToRelative(-16.834f)
                arcToRelative(2.992f, 2.992f, 0.0f, false, false, -1.078f, -2.3f)
                close()
            }
        }
        .build()
        return _bookAlt!!
    }

private var _bookAlt: ImageVector? = null
