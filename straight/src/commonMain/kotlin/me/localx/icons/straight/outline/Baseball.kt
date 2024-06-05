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

public val Icons.Outline.Baseball: ImageVector
    get() {
        if (_baseball != null) {
            return _baseball!!
        }
        _baseball = Builder(name = "Baseball", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, false, -12.0f, -12.0f)
                close()
                moveTo(17.812f, 15.485f)
                lineTo(19.578f, 14.958f)
                lineTo(19.006f, 13.042f)
                lineTo(17.173f, 13.588f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.173f, -1.588f)
                arcToRelative(7.986f, 7.986f, 0.0f, false, true, 0.173f, -1.588f)
                lineToRelative(1.833f, 0.546f)
                lineToRelative(0.572f, -1.916f)
                lineToRelative(-1.766f, -0.527f)
                arcToRelative(7.972f, 7.972f, 0.0f, false, true, 2.067f, -2.651f)
                arcToRelative(9.936f, 9.936f, 0.0f, false, true, 0.0f, 12.272f)
                arcToRelative(7.972f, 7.972f, 0.0f, false, true, -2.067f, -2.651f)
                close()
                moveTo(4.121f, 5.864f)
                arcToRelative(7.972f, 7.972f, 0.0f, false, true, 2.067f, 2.651f)
                lineToRelative(-1.766f, 0.527f)
                lineToRelative(0.572f, 1.916f)
                lineToRelative(1.833f, -0.546f)
                arcToRelative(7.986f, 7.986f, 0.0f, false, true, 0.173f, 1.588f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.173f, 1.588f)
                lineToRelative(-1.833f, -0.546f)
                lineToRelative(-0.572f, 1.916f)
                lineToRelative(1.766f, 0.527f)
                arcToRelative(7.972f, 7.972f, 0.0f, false, true, -2.067f, 2.651f)
                arcToRelative(9.936f, 9.936f, 0.0f, false, true, 0.0f, -12.272f)
                close()
                moveTo(5.507f, 19.59f)
                arcToRelative(9.971f, 9.971f, 0.0f, false, false, 2.614f, -3.529f)
                lineToRelative(2.051f, 0.612f)
                lineToRelative(0.572f, -1.917f)
                lineToRelative(-1.993f, -0.6f)
                arcToRelative(10.02f, 10.02f, 0.0f, false, false, 0.249f, -2.156f)
                arcToRelative(10.02f, 10.02f, 0.0f, false, false, -0.249f, -2.161f)
                lineToRelative(1.993f, -0.6f)
                lineToRelative(-0.572f, -1.917f)
                lineToRelative(-2.051f, 0.612f)
                arcToRelative(9.971f, 9.971f, 0.0f, false, false, -2.614f, -3.524f)
                arcToRelative(9.952f, 9.952f, 0.0f, false, true, 12.986f, 0.0f)
                arcToRelative(9.971f, 9.971f, 0.0f, false, false, -2.614f, 3.529f)
                lineToRelative(-2.051f, -0.612f)
                lineToRelative(-0.572f, 1.917f)
                lineToRelative(1.993f, 0.6f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 0.0f, 4.322f)
                lineToRelative(-1.993f, 0.6f)
                lineToRelative(0.572f, 1.917f)
                lineToRelative(2.051f, -0.612f)
                arcToRelative(9.971f, 9.971f, 0.0f, false, false, 2.614f, 3.529f)
                arcToRelative(9.952f, 9.952f, 0.0f, false, true, -12.986f, 0.0f)
                close()
            }
        }
        .build()
        return _baseball!!
    }

private var _baseball: ImageVector? = null
