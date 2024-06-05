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

public val Icons.Outline.Kite: ImageVector
    get() {
        if (_kite != null) {
            return _kite!!
        }
        _kite = Builder(name = "Kite", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.76f, 16.0f)
                arcToRelative(5.207f, 5.207f, 0.0f, false, false, -3.707f, 1.535f)
                arcTo(15.143f, 15.143f, 0.0f, false, true, 4.274f, 22.0f)
                lineTo(3.123f, 22.0f)
                arcToRelative(1.121f, 1.121f, 0.0f, false, true, -0.793f, -1.914f)
                lineTo(5.52f, 16.9f)
                lineToRelative(11.768f, -3.138f)
                arcTo(5.005f, 5.005f, 0.0f, false, false, 21.0f, 8.927f)
                lineTo(21.0f, 5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                lineTo(12.073f, 0.0f)
                arcTo(5.005f, 5.005f, 0.0f, false, false, 7.242f, 3.712f)
                lineTo(4.1f, 15.485f)
                lineTo(0.916f, 18.672f)
                arcTo(3.121f, 3.121f, 0.0f, false, false, 3.123f, 24.0f)
                lineTo(4.274f, 24.0f)
                arcToRelative(17.127f, 17.127f, 0.0f, false, false, 12.193f, -5.051f)
                arcTo(3.243f, 3.243f, 0.0f, false, true, 22.0f, 21.242f)
                lineTo(22.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(24.0f, 21.242f)
                arcTo(5.249f, 5.249f, 0.0f, false, false, 18.76f, 16.0f)
                close()
                moveTo(16.772f, 11.826f)
                lineTo(8.342f, 14.074f)
                lineTo(14.5f, 7.915f)
                lineToRelative(3.356f, 3.356f)
                arcTo(2.981f, 2.981f, 0.0f, false, true, 16.772f, 11.826f)
                close()
                moveTo(19.0f, 5.0f)
                lineTo(19.0f, 8.927f)
                arcToRelative(2.984f, 2.984f, 0.0f, false, true, -0.066f, 0.593f)
                lineTo(15.915f, 6.5f)
                lineTo(18.7f, 3.716f)
                arcTo(2.963f, 2.963f, 0.0f, false, true, 19.0f, 5.0f)
                close()
                moveTo(12.073f, 2.0f)
                lineTo(16.0f, 2.0f)
                arcToRelative(2.977f, 2.977f, 0.0f, false, true, 1.287f, 0.3f)
                lineTo(14.5f, 5.087f)
                lineTo(11.48f, 2.066f)
                arcTo(2.984f, 2.984f, 0.0f, false, true, 12.073f, 2.0f)
                close()
                moveTo(9.173f, 4.228f)
                arcToRelative(2.981f, 2.981f, 0.0f, false, true, 0.555f, -1.085f)
                lineTo(13.087f, 6.5f)
                lineTo(6.925f, 12.663f)
                close()
            }
        }
        .build()
        return _kite!!
    }

private var _kite: ImageVector? = null
