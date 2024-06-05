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

public val Icons.Filled.Game: ImageVector
    get() {
        if (_game != null) {
            return _game!!
        }
        _game = Builder(name = "Game", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.8f, 8.156f)
                lineToRelative(-3.413f, 10.4f)
                arcToRelative(4.945f, 4.945f, 0.0f, false, true, -2.952f, 3.2f)
                arcToRelative(6.969f, 6.969f, 0.0f, false, false, 0.565f, -2.756f)
                verticalLineToRelative(-10.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, false, -7.0f, -7.0f)
                horizontalLineToRelative(-1.665f)
                arcToRelative(5.016f, 5.016f, 0.0f, false, true, 5.445f, -1.779f)
                lineToRelative(5.686f, 1.746f)
                arcToRelative(5.021f, 5.021f, 0.0f, false, true, 3.334f, 6.189f)
                close()
                moveTo(16.0f, 9.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                verticalLineToRelative(-10.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, -5.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, 5.0f)
                close()
                moveTo(12.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                curveToRelative(0.0f, 1.45f, 1.544f, 3.391f, 2.714f, 4.378f)
                arcToRelative(1.991f, 1.991f, 0.0f, false, false, 2.572f, 0.0f)
                curveToRelative(1.17f, -0.987f, 2.714f, -2.928f, 2.714f, -4.378f)
                close()
            }
        }
        .build()
        return _game!!
    }

private var _game: ImageVector? = null
