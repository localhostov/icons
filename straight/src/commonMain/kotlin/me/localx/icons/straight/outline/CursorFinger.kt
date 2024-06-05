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

public val Icons.Outline.CursorFinger: ImageVector
    get() {
        if (_cursorFinger != null) {
            return _cursorFinger!!
        }
        _cursorFinger = Builder(name = "CursorFinger", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 8.18f)
                verticalLineToRelative(-5.073f)
                arcToRelative(3.082f, 3.082f, 0.0f, false, false, -2.5f, -3.066f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.5f, 2.959f)
                verticalLineToRelative(7.581f)
                lineToRelative(-4.121f, 4.055f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 4.242f)
                lineToRelative(5.121f, 5.122f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-13.82f)
                close()
                moveTo(20.0f, 22.0f)
                horizontalLineToRelative(-12.172f)
                lineToRelative(-4.535f, -4.536f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.006f, -1.408f)
                lineToRelative(2.713f, -2.669f)
                verticalLineToRelative(3.613f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.175f, -0.986f)
                arcToRelative(1.085f, 1.085f, 0.0f, false, true, 0.825f, 1.093f)
                verticalLineToRelative(6.713f)
                lineToRelative(10.0f, 2.0f)
                close()
            }
        }
        .build()
        return _cursorFinger!!
    }

private var _cursorFinger: ImageVector? = null
