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
                moveToRelative(17.578f, 9.053f)
                lineToRelative(-3.578f, -0.716f)
                verticalLineToRelative(-4.337f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(4.45f)
                lineToRelative(-3.722f, 4.523f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, false, 0.262f, 7.17f)
                lineToRelative(2.2f, 2.224f)
                arcToRelative(5.536f, 5.536f, 0.0f, false, false, 3.91f, 1.633f)
                horizontalLineToRelative(7.85f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, 5.5f, -5.5f)
                verticalLineToRelative(-4.054f)
                arcToRelative(5.513f, 5.513f, 0.0f, false, false, -4.422f, -5.393f)
                close()
                moveTo(19.0f, 18.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-7.85f)
                arcToRelative(2.521f, 2.521f, 0.0f, false, true, -1.778f, -0.742f)
                lineToRelative(-2.2f, -2.23f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, -0.094f, -3.123f)
                lineToRelative(1.422f, -1.734f)
                verticalLineToRelative(3.329f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-12.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(5.566f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.206f, 1.471f)
                lineToRelative(4.784f, 0.957f)
                arcToRelative(2.508f, 2.508f, 0.0f, false, true, 2.01f, 2.452f)
                close()
            }
        }
        .build()
        return _cursorFinger!!
    }

private var _cursorFinger: ImageVector? = null
