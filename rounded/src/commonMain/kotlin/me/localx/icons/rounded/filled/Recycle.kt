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

public val Icons.Filled.Recycle: ImageVector
    get() {
        if (_recycle != null) {
            return _recycle!!
        }
        _recycle = Builder(name = "Recycle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.357f, 2.921f)
                lineToRelative(-1.416f, 2.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.7f, -1.048f)
                lineToRelative(1.416f, -2.3f)
                arcToRelative(3.948f, 3.948f, 0.0f, false, true, 6.692f, 0.0f)
                lineToRelative(4.2f, 6.834f)
                lineToRelative(0.441f, -2.365f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.967f, 0.366f)
                lineToRelative(-0.5f, 2.67f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.529f, 2.393f)
                lineToRelative(-2.63f, -0.518f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.386f, -1.962f)
                lineToRelative(2.133f, 0.421f)
                lineTo(13.643f, 2.921f)
                arcTo(1.934f, 1.934f, 0.0f, false, false, 10.357f, 2.921f)
                close()
                moveTo(23.409f, 14.98f)
                lineToRelative(-0.968f, -1.572f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.7f, 1.048f)
                lineToRelative(0.968f, 1.572f)
                arcToRelative(1.934f, 1.934f, 0.0f, false, true, 0.041f, 1.98f)
                arcTo(1.91f, 1.91f, 0.0f, false, true, 20.062f, 19.0f)
                horizontalLineTo(12.676f)
                lineToRelative(1.271f, -1.269f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.412f, -1.416f)
                lineTo(10.843f, 18.0f)
                arcTo(2.862f, 2.862f, 0.0f, false, false, 10.0f, 19.945f)
                verticalLineToRelative(0.062f)
                arcToRelative(2.885f, 2.885f, 0.0f, false, false, 0.858f, 2.078f)
                lineToRelative(1.682f, 1.652f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.4f, -1.427f)
                lineTo(12.609f, 21.0f)
                horizontalLineToRelative(7.453f)
                arcToRelative(3.948f, 3.948f, 0.0f, false, false, 3.347f, -6.02f)
                close()
                moveTo(8.047f, 9.146f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.53f, -2.393f)
                lineToRelative(-2.629f, 0.518f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.386f, 1.962f)
                lineToRelative(2.108f, -0.415f)
                lineTo(0.591f, 14.98f)
                arcTo(3.948f, 3.948f, 0.0f, false, false, 3.937f, 21.0f)
                horizontalLineTo(7.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(3.937f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, true, -1.684f, -0.992f)
                arcToRelative(1.934f, 1.934f, 0.0f, false, true, 0.041f, -1.98f)
                lineTo(6.132f, 9.79f)
                lineToRelative(0.446f, 2.394f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.967f, -0.368f)
                close()
            }
        }
        .build()
        return _recycle!!
    }

private var _recycle: ImageVector? = null
