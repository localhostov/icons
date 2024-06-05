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

public val Icons.Bold.Skating: ImageVector
    get() {
        if (_skating != null) {
            return _skating!!
        }
        _skating = Builder(name = "Skating", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 18.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.0f, 2.5f)
                close()
                moveTo(19.5f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.0f, 20.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.637f)
                arcToRelative(3.489f, 3.489f, 0.0f, false, false, -0.95f, -2.4f)
                lineToRelative(-3.024f, -3.214f)
                lineToRelative(2.949f, -2.965f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -0.062f, -5.011f)
                lineToRelative(-0.154f, -0.127f)
                arcTo(4.815f, 4.815f, 0.0f, false, false, 12.914f, 5.0f)
                horizontalLineTo(6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(5.661f)
                lineTo(9.953f, 10.336f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, false, 0.072f, 4.874f)
                lineTo(13.864f, 19.3f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.136f, 0.342f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 21.0f, 20.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.5f, 19.0f)
                close()
                moveTo(7.45f, 20.857f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.666f, 0.037f)
                lineToRelative(-0.208f, -0.231f)
                lineTo(8.591f, 18.53f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.182f, -2.06f)
                lineTo(4.555f, 18.434f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.167f, 2.072f)
                lineTo(4.6f, 22.95f)
                arcTo(3.474f, 3.474f, 0.0f, false, false, 7.065f, 24.0f)
                horizontalLineTo(7.1f)
                arcTo(3.477f, 3.477f, 0.0f, false, false, 9.55f, 23.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.1f, -2.143f)
                close()
            }
        }
        .build()
        return _skating!!
    }

private var _skating: ImageVector? = null
