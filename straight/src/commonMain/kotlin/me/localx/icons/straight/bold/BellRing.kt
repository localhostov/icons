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

public val Icons.Bold.BellRing: ImageVector
    get() {
        if (_bellRing != null) {
            return _bellRing!!
        }
        _bellRing = Builder(name = "BellRing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.783f, 5.407f)
                lineToRelative(-1.566f, -2.558f)
                lineToRelative(4.5f, -2.749f)
                lineToRelative(1.566f, 2.553f)
                close()
                moveTo(21.383f, 17.712f)
                lineTo(18.606f, 22.212f)
                lineTo(21.159f, 23.788f)
                lineTo(23.936f, 19.288f)
                close()
                moveTo(20.907f, 14.786f)
                lineTo(16.216f, 22.393f)
                arcToRelative(3.273f, 3.273f, 0.0f, false, true, -2.42f, 1.58f)
                arcToRelative(3.456f, 3.456f, 0.0f, false, true, -0.429f, 0.027f)
                arcToRelative(3.291f, 3.291f, 0.0f, false, true, -2.337f, -0.972f)
                lineToRelative(-1.085f, -1.083f)
                arcToRelative(4.172f, 4.172f, 0.0f, false, true, -5.889f, -5.891f)
                lineToRelative(-3.084f, -3.086f)
                arcToRelative(3.318f, 3.318f, 0.0f, false, true, 0.513f, -5.11f)
                lineToRelative(7.392f, -4.522f)
                arcToRelative(8.487f, 8.487f, 0.0f, false, true, 9.461f, 0.205f)
                lineToRelative(1.976f, -1.977f)
                lineToRelative(2.122f, 2.122f)
                lineToRelative(-1.976f, 1.975f)
                arcToRelative(8.592f, 8.592f, 0.0f, false, true, 0.445f, 9.125f)
                close()
                moveTo(17.387f, 6.641f)
                arcToRelative(5.532f, 5.532f, 0.0f, false, false, -6.92f, -0.76f)
                lineToRelative(-7.367f, 4.508f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, -0.1f, 0.2f)
                arcToRelative(0.31f, 0.31f, 0.0f, false, false, 0.091f, 0.255f)
                lineToRelative(10.056f, 10.06f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, 0.264f, 0.09f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, 0.231f, -0.152f)
                lineToRelative(4.679f, -7.584f)
                arcToRelative(5.563f, 5.563f, 0.0f, false, false, -0.936f, -6.617f)
                close()
            }
        }
        .build()
        return _bellRing!!
    }

private var _bellRing: ImageVector? = null
