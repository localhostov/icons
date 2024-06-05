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

public val Icons.Outline.MagicWand: ImageVector
    get() {
        if (_magicWand != null) {
            return _magicWand!!
        }
        _magicWand = Builder(name = "MagicWand", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.081f, 5.586f)
                lineTo(0.9f, 18.769f)
                arcTo(3.064f, 3.064f, 0.0f, false, false, 5.23f, 23.1f)
                lineTo(18.414f, 9.919f)
                close()
                moveTo(15.586f, 9.919f)
                lineTo(13.0f, 12.505f)
                lineTo(11.5f, 11.0f)
                lineToRelative(2.586f, -2.586f)
                close()
                moveTo(3.816f, 21.688f)
                arcToRelative(1.087f, 1.087f, 0.0f, false, true, -1.5f, 0.0f)
                arcToRelative(1.062f, 1.062f, 0.0f, false, true, 0.0f, -1.5f)
                lineToRelative(7.769f, -7.77f)
                lineToRelative(1.505f, 1.505f)
                close()
                moveTo(21.333f, 14.628f)
                lineTo(24.0f, 15.962f)
                lineTo(21.333f, 17.3f)
                lineTo(20.0f, 19.962f)
                lineTo(18.667f, 17.3f)
                lineTo(16.0f, 15.962f)
                lineToRelative(2.667f, -1.334f)
                lineTo(20.0f, 11.962f)
                close()
                moveTo(6.667f, 5.333f)
                lineTo(4.0f, 4.0f)
                lineTo(6.667f, 2.667f)
                lineTo(8.0f, 0.0f)
                lineTo(9.333f, 2.667f)
                lineTo(12.0f, 4.0f)
                lineTo(9.333f, 5.333f)
                lineTo(8.0f, 8.0f)
                close()
                moveTo(19.333f, 4.667f)
                lineTo(17.0f, 3.5f)
                lineToRelative(2.333f, -1.167f)
                lineTo(20.5f, 0.0f)
                lineToRelative(1.167f, 2.333f)
                lineTo(24.0f, 3.5f)
                lineTo(21.667f, 4.667f)
                lineTo(20.5f, 7.0f)
                close()
            }
        }
        .build()
        return _magicWand!!
    }

private var _magicWand: ImageVector? = null
