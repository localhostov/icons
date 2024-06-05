package me.localx.icons.rounded.outline

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

public val Icons.Outline.CursorPlus: ImageVector
    get() {
        if (_cursorPlus != null) {
            return _cursorPlus!!
        }
        _cursorPlus = Builder(name = "CursorPlus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, false, -8.0f, -8.0f)
                close()
                moveTo(16.0f, 22.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 6.0f, -6.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, true, -6.0f, 6.0f)
                close()
                moveTo(20.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
                moveTo(12.0f, 4.981f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.586f, -0.891f)
                lineToRelative(-8.675f, -3.944f)
                arcToRelative(0.893f, 0.893f, 0.0f, false, false, -0.09f, -0.037f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, false, -2.061f, 0.479f)
                arcToRelative(2.011f, 2.011f, 0.0f, false, false, -0.442f, 2.151f)
                lineToRelative(3.944f, 8.675f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.891f, 0.586f)
                horizontalLineToRelative(0.019f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.895f, -0.553f)
                lineToRelative(1.85f, -3.7f)
                lineToRelative(3.7f, -1.85f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.555f, -0.916f)
                close()
                moveTo(6.553f, 6.105f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.448f, 0.448f)
                lineToRelative(-1.064f, 2.128f)
                lineToRelative(-3.041f, -6.676f)
                lineToRelative(6.679f, 3.038f)
                close()
            }
        }
        .build()
        return _cursorPlus!!
    }

private var _cursorPlus: ImageVector? = null
