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

public val Icons.Bold.Basketball: ImageVector
    get() {
        if (_basketball != null) {
            return _basketball!!
        }
        _basketball = Builder(name = "Basketball", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, false, -12.0f, -12.0f)
                close()
                moveTo(10.668f, 15.453f)
                lineTo(12.0f, 14.121f)
                lineTo(17.207f, 19.328f)
                arcToRelative(8.946f, 8.946f, 0.0f, false, true, -4.169f, 1.607f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -2.37f, -5.482f)
                close()
                moveTo(13.332f, 8.547f)
                lineTo(12.0f, 9.879f)
                lineTo(6.794f, 4.672f)
                arcToRelative(8.939f, 8.939f, 0.0f, false, true, 4.167f, -1.607f)
                arcToRelative(11.916f, 11.916f, 0.0f, false, false, 2.371f, 5.482f)
                close()
                moveTo(9.879f, 12.0f)
                lineTo(8.547f, 13.332f)
                arcToRelative(11.916f, 11.916f, 0.0f, false, false, -5.482f, -2.371f)
                arcToRelative(8.934f, 8.934f, 0.0f, false, true, 1.607f, -4.167f)
                close()
                moveTo(14.121f, 12.0f)
                lineTo(15.453f, 10.668f)
                arcToRelative(11.916f, 11.916f, 0.0f, false, false, 5.482f, 2.371f)
                arcToRelative(8.942f, 8.942f, 0.0f, false, true, -1.607f, 4.168f)
                close()
                moveTo(20.757f, 9.958f)
                arcToRelative(8.985f, 8.985f, 0.0f, false, true, -6.715f, -6.716f)
                arcToRelative(9.021f, 9.021f, 0.0f, false, true, 6.715f, 6.716f)
                close()
                moveTo(3.243f, 14.042f)
                arcToRelative(8.986f, 8.986f, 0.0f, false, true, 6.715f, 6.715f)
                arcToRelative(9.018f, 9.018f, 0.0f, false, true, -6.715f, -6.715f)
                close()
            }
        }
        .build()
        return _basketball!!
    }

private var _basketball: ImageVector? = null
