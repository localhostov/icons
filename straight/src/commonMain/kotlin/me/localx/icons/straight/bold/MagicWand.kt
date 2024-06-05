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

public val Icons.Bold.MagicWand: ImageVector
    get() {
        if (_magicWand != null) {
            return _magicWand!!
        }
        _magicWand = Builder(name = "MagicWand", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.447f, 4.326f)
                lineTo(1.149f, 17.3f)
                arcTo(3.924f, 3.924f, 0.0f, false, false, 3.924f, 24.0f)
                arcToRelative(3.887f, 3.887f, 0.0f, false, false, 2.762f, -1.136f)
                lineTo(20.0f, 9.875f)
                close()
                moveTo(15.728f, 9.849f)
                lineTo(13.12f, 12.394f)
                lineToRelative(-1.307f, -1.307f)
                lineToRelative(2.608f, -2.545f)
                close()
                moveTo(4.577f, 20.729f)
                arcToRelative(0.943f, 0.943f, 0.0f, false, true, -1.306f, 0.0f)
                arcToRelative(0.924f, 0.924f, 0.0f, false, true, -0.014f, -1.293f)
                lineToRelative(6.409f, -6.254f)
                lineToRelative(1.307f, 1.307f)
                close()
                moveTo(21.333f, 15.667f)
                lineTo(24.0f, 17.0f)
                lineToRelative(-2.667f, 1.333f)
                lineTo(20.0f, 21.0f)
                lineToRelative(-1.333f, -2.667f)
                lineTo(16.0f, 17.0f)
                lineToRelative(2.667f, -1.333f)
                lineTo(20.0f, 13.0f)
                close()
                moveTo(5.667f, 5.333f)
                lineTo(3.0f, 4.0f)
                lineTo(5.667f, 2.667f)
                lineTo(7.0f, 0.0f)
                lineTo(8.333f, 2.667f)
                lineTo(11.0f, 4.0f)
                lineTo(8.333f, 5.333f)
                lineTo(7.0f, 8.0f)
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
