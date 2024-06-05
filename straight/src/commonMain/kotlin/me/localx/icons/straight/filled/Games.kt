package me.localx.icons.straight.filled

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

public val Icons.Filled.Games: ImageVector
    get() {
        if (_games != null) {
            return _games!!
        }
        _games = Builder(name = "Games", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.0f, -4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                close()
                moveTo(7.934f, 8.52f)
                lineTo(18.234f, 18.82f)
                arcToRelative(10.822f, 10.822f, 0.0f, false, false, 2.642f, -1.944f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, false, 3.124f, -7.118f)
                arcToRelative(9.412f, 9.412f, 0.0f, false, false, -2.735f, -7.019f)
                arcToRelative(9.745f, 9.745f, 0.0f, false, false, -11.865f, -1.348f)
                arcToRelative(5.961f, 5.961f, 0.0f, false, true, -1.466f, 7.129f)
                close()
                moveTo(6.171f, 9.586f)
                arcToRelative(5.987f, 5.987f, 0.0f, false, true, -2.144f, 0.414f)
                arcToRelative(10.617f, 10.617f, 0.0f, false, false, 1.054f, 5.0f)
                arcToRelative(0.483f, 0.483f, 0.0f, false, true, -0.081f, 0.578f)
                lineToRelative(-3.718f, 2.575f)
                arcToRelative(3.363f, 3.363f, 0.0f, false, false, -1.282f, 2.413f)
                arcToRelative(2.824f, 2.824f, 0.0f, false, false, 0.853f, 2.151f)
                lineToRelative(0.445f, 0.422f)
                arcToRelative(2.948f, 2.948f, 0.0f, false, false, 2.083f, 0.861f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, 2.275f, -1.08f)
                lineToRelative(2.744f, -3.92f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.6f, -0.119f)
                arcToRelative(10.441f, 10.441f, 0.0f, false, false, 7.2f, 0.738f)
                close()
            }
        }
        .build()
        return _games!!
    }

private var _games: ImageVector? = null
