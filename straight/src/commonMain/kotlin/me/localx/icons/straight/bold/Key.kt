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

public val Icons.Bold.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 0.0f)
                horizontalLineToRelative(-3.306f)
                arcToRelative(3.477f, 3.477f, 0.0f, false, false, -2.474f, 1.025f)
                lineToRelative(-7.008f, 7.008f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -2.878f, 0.267f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 9.866f, 9.866f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 0.264f, -2.931f)
                lineToRelative(1.036f, -1.163f)
                verticalLineToRelative(-2.072f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.96f)
                lineToRelative(1.015f, -0.72f)
                arcToRelative(3.477f, 3.477f, 0.0f, false, false, 1.025f, -2.474f)
                verticalLineToRelative(-3.306f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, -2.5f)
                close()
                moveTo(21.0f, 5.806f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.04f, 0.194f)
                horizontalLineToRelative(-3.96f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.928f)
                lineToRelative(-1.321f, 1.359f)
                arcToRelative(4.945f, 4.945f, 0.0f, false, true, 0.321f, 1.713f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -5.0f, -5.0f)
                arcToRelative(4.947f, 4.947f, 0.0f, false, true, 1.678f, 0.31f)
                lineToRelative(8.163f, -8.164f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.353f, -0.146f)
                horizontalLineToRelative(2.806f)
                close()
                moveTo(5.0f, 17.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
