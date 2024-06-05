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

public val Icons.Outline.Hamburger: ImageVector
    get() {
        if (_hamburger != null) {
            return _hamburger!!
        }
        _hamburger = Builder(name = "Hamburger", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 14.006f)
                arcToRelative(2.981f, 2.981f, 0.0f, false, false, -1.0f, -2.219f)
                lineTo(23.0f, 9.0f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, false, -9.0f, -9.0f)
                lineTo(10.0f, 0.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, false, 1.0f, 9.0f)
                verticalLineToRelative(2.787f)
                arcToRelative(2.981f, 2.981f, 0.0f, false, false, -1.0f, 2.219f)
                verticalLineToRelative(0.171f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.0f, 2.249f)
                lineTo(1.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(19.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(23.0f, 16.226f)
                arcTo(2.981f, 2.981f, 0.0f, false, false, 24.0f, 14.006f)
                close()
                moveTo(3.0f, 9.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, true, 7.0f, -7.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, true, 7.0f, 7.0f)
                verticalLineToRelative(2.006f)
                lineTo(3.0f, 11.006f)
                close()
                moveTo(21.0f, 15.006f)
                lineTo(17.0f, 15.006f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, -7.212f, 2.7f)
                arcToRelative(1.193f, 1.193f, 0.0f, false, true, -1.575f, 0.0f)
                arcTo(11.0f, 11.0f, 0.0f, false, false, 2.774f, 15.15f)
                arcTo(0.97f, 0.97f, 0.0f, false, true, 2.0f, 14.177f)
                verticalLineToRelative(-0.171f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineTo(21.0f, 13.006f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 15.006f)
                close()
                moveTo(21.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(5.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(3.0f, 17.253f)
                arcTo(8.986f, 8.986f, 0.0f, false, true, 6.9f, 19.21f)
                arcToRelative(3.176f, 3.176f, 0.0f, false, false, 4.2f, 0.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 5.9f, -2.2f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(11.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 5.0f)
                close()
                moveTo(8.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 8.0f)
                close()
            }
        }
        .build()
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
