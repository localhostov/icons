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

public val Icons.Outline.Hand: ImageVector
    get() {
        if (_hand != null) {
            return _hand!!
        }
        _hand = Builder(name = "Hand", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.951f, 12.3f)
                lineToRelative(-0.705f, -5.0f)
                arcTo(5.024f, 5.024f, 0.0f, false, false, 18.3f, 3.0f)
                lineTo(5.0f, 3.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 0.0f, 8.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                lineTo(7.712f, 18.0f)
                lineToRelative(1.914f, 3.878f)
                arcToRelative(3.037f, 3.037f, 0.0f, false, false, 5.721f, -1.837f)
                lineTo(15.011f, 18.0f)
                lineTo(19.0f, 18.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 4.951f, -5.7f)
                close()
                moveTo(5.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                lineTo(7.0f, 16.0f)
                lineTo(5.0f, 16.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(2.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 5.0f)
                close()
                moveTo(21.264f, 14.968f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 16.0f)
                lineTo(13.833f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.987f, 1.162f)
                lineToRelative(0.528f, 3.2f)
                arcToRelative(1.024f, 1.024f, 0.0f, false, true, -0.233f, 0.84f)
                arcToRelative(1.07f, 1.07f, 0.0f, false, true, -1.722f, -0.212f)
                lineTo(9.23f, 16.558f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 16.266f)
                lineTo(9.0f, 5.0f)
                horizontalLineToRelative(9.3f)
                arcToRelative(3.012f, 3.012f, 0.0f, false, true, 2.97f, 2.581f)
                lineToRelative(0.706f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 21.264f, 14.968f)
                close()
            }
        }
        .build()
        return _hand!!
    }

private var _hand: ImageVector? = null
