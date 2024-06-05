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

public val Icons.Bold.CursorFinger: ImageVector
    get() {
        if (_cursorFinger != null) {
            return _cursorFinger!!
        }
        _cursorFinger = Builder(name = "CursorFinger", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 7.829f)
                verticalLineToRelative(-3.829f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(5.872f)
                lineToRelative(-3.975f, 3.91f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, 4.95f)
                lineToRelative(5.267f, 5.268f)
                horizontalLineToRelative(14.708f)
                verticalLineToRelative(-14.171f)
                close()
                moveTo(19.0f, 21.0f)
                horizontalLineToRelative(-10.464f)
                lineToRelative(-4.39f, -4.39f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.146f, -0.353f)
                arcToRelative(0.487f, 0.487f, 0.0f, false, true, 0.138f, -0.344f)
                lineToRelative(1.862f, -1.833f)
                verticalLineToRelative(1.92f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(6.171f)
                lineToRelative(8.0f, 2.0f)
                close()
            }
        }
        .build()
        return _cursorFinger!!
    }

private var _cursorFinger: ImageVector? = null
