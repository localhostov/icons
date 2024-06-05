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

public val Icons.Filled.CursorFinger: ImageVector
    get() {
        if (_cursorFinger != null) {
            return _cursorFinger!!
        }
        _cursorFinger = Builder(name = "CursorFinger", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 2.58f)
                arcToRelative(2.564f, 2.564f, 0.0f, false, false, -2.087f, -2.546f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.913f, 2.466f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.389f)
                lineToRelative(-3.121f, 3.025f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.828f, 2.682f)
                arcToRelative(3.129f, 3.129f, 0.0f, false, false, 0.9f, 1.637f)
                lineToRelative(5.049f, 5.045f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-13.806f)
                lineToRelative(-9.0f, -2.014f)
                close()
            }
        }
        .build()
        return _cursorFinger!!
    }

private var _cursorFinger: ImageVector? = null
