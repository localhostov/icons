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

public val Icons.Bold.LifeRing: ImageVector
    get() {
        if (_lifeRing != null) {
            return _lifeRing!!
        }
        _lifeRing = Builder(name = "LifeRing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.468f, 19.346f)
                arcToRelative(11.922f, 11.922f, 0.0f, false, false, 0.0f, -14.692f)
                lineToRelative(1.593f, -1.593f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.939f, 0.939f)
                lineTo(19.346f, 2.532f)
                arcToRelative(11.922f, 11.922f, 0.0f, false, false, -14.692f, 0.0f)
                lineTo(3.061f, 0.939f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.939f, 3.061f)
                lineTo(2.532f, 4.654f)
                arcToRelative(11.922f, 11.922f, 0.0f, false, false, 0.0f, 14.692f)
                lineTo(0.939f, 20.939f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, 2.122f)
                lineToRelative(1.593f, -1.593f)
                arcToRelative(11.922f, 11.922f, 0.0f, false, false, 14.692f, 0.0f)
                lineToRelative(1.593f, 1.593f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, -2.122f)
                close()
                moveTo(21.0f, 12.0f)
                arcToRelative(8.942f, 8.942f, 0.0f, false, true, -1.672f, 5.206f)
                lineTo(16.65f, 14.529f)
                arcToRelative(5.121f, 5.121f, 0.0f, false, false, 0.0f, -5.058f)
                lineToRelative(2.678f, -2.677f)
                arcTo(8.942f, 8.942f, 0.0f, false, true, 21.0f, 12.0f)
                close()
                moveTo(9.682f, 12.0f)
                arcTo(2.318f, 2.318f, 0.0f, true, true, 12.0f, 14.318f)
                arcTo(2.321f, 2.321f, 0.0f, false, true, 9.682f, 12.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(8.942f, 8.942f, 0.0f, false, true, 5.206f, 1.672f)
                lineTo(14.529f, 7.35f)
                arcToRelative(5.121f, 5.121f, 0.0f, false, false, -5.058f, 0.0f)
                lineTo(6.794f, 4.672f)
                arcTo(8.942f, 8.942f, 0.0f, false, true, 12.0f, 3.0f)
                close()
                moveTo(3.0f, 12.0f)
                arcTo(8.942f, 8.942f, 0.0f, false, true, 4.672f, 6.794f)
                lineTo(7.35f, 9.471f)
                arcToRelative(5.121f, 5.121f, 0.0f, false, false, 0.0f, 5.058f)
                lineTo(4.672f, 17.206f)
                arcTo(8.942f, 8.942f, 0.0f, false, true, 3.0f, 12.0f)
                close()
                moveTo(12.0f, 21.0f)
                arcToRelative(8.942f, 8.942f, 0.0f, false, true, -5.206f, -1.672f)
                lineTo(9.471f, 16.65f)
                arcToRelative(5.121f, 5.121f, 0.0f, false, false, 5.058f, 0.0f)
                lineToRelative(2.677f, 2.678f)
                arcTo(8.942f, 8.942f, 0.0f, false, true, 12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _lifeRing!!
    }

private var _lifeRing: ImageVector? = null
