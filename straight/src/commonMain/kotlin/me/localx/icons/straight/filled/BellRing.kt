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

public val Icons.Filled.BellRing: ImageVector
    get() {
        if (_bellRing != null) {
            return _bellRing!!
        }
        _bellRing = Builder(name = "BellRing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.976f, 17.268f)
                lineToRelative(-4.125f, 6.684f)
                lineToRelative(-1.7f, -1.051f)
                lineToRelative(4.125f, -6.684f)
                close()
                moveTo(7.776f, 1.768f)
                lineTo(6.729f, 0.062f)
                lineTo(-0.006f, 4.184f)
                lineTo(1.037f, 5.889f)
                close()
                moveTo(20.18f, 5.234f)
                lineTo(22.08f, 3.334f)
                lineTo(20.668f, 1.918f)
                lineTo(18.777f, 3.809f)
                arcToRelative(8.361f, 8.361f, 0.0f, false, false, -9.707f, -0.488f)
                lineToRelative(-6.762f, 3.749f)
                arcToRelative(2.91f, 2.91f, 0.0f, false, false, -0.452f, 4.485f)
                lineToRelative(10.584f, 10.588f)
                arcToRelative(2.889f, 2.889f, 0.0f, false, false, 2.052f, 0.857f)
                arcToRelative(3.158f, 3.158f, 0.0f, false, false, 0.375f, -0.023f)
                arcToRelative(2.879f, 2.879f, 0.0f, false, false, 2.133f, -1.398f)
                lineToRelative(3.928f, -6.986f)
                arcToRelative(8.444f, 8.444f, 0.0f, false, false, -0.748f, -9.359f)
                close()
                moveTo(3.0f, 18.283f)
                arcToRelative(4.725f, 4.725f, 0.0f, false, false, 6.954f, 4.2f)
                lineToRelative(-6.394f, -6.4f)
                arcToRelative(4.712f, 4.712f, 0.0f, false, false, -0.56f, 2.2f)
                close()
            }
        }
        .build()
        return _bellRing!!
    }

private var _bellRing: ImageVector? = null
