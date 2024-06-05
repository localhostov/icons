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

public val Icons.Bold.CursorPlus: ImageVector
    get() {
        if (_cursorPlus != null) {
            return _cursorPlus!!
        }
        _cursorPlus = Builder(name = "CursorPlus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.5f, 7.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, 8.5f, 8.5f)
                arcToRelative(8.51f, 8.51f, 0.0f, false, false, -8.5f, -8.5f)
                close()
                moveTo(15.5f, 21.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 5.5f, -5.5f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, true, -5.5f, 5.5f)
                close()
                moveTo(18.5f, 14.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(7.745f, 7.745f)
                lineTo(5.895f, 11.445f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.895f, 0.555f)
                horizontalLineToRelative(-0.019f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.891f, -0.586f)
                lineToRelative(-3.944f, -8.675f)
                arcToRelative(2.011f, 2.011f, 0.0f, false, true, 0.442f, -2.151f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, true, 2.061f, -0.479f)
                arcToRelative(0.893f, 0.893f, 0.0f, false, true, 0.09f, 0.037f)
                lineToRelative(8.675f, 3.944f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.033f, 1.8f)
                close()
            }
        }
        .build()
        return _cursorPlus!!
    }

private var _cursorPlus: ImageVector? = null
