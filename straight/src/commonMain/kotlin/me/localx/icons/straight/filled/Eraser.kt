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

public val Icons.Filled.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = Builder(name = "Eraser", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.242f, 7.438f)
                lineTo(12.751f, 1.911f)
                curveToRelative(1.17f, -1.175f, 3.213f, -1.175f, 4.383f, 0.0f)
                lineToRelative(5.935f, 5.955f)
                curveToRelative(1.206f, 1.21f, 1.206f, 3.179f, 0.0f, 4.389f)
                lineToRelative(-5.506f, 5.525f)
                lineTo(7.242f, 7.438f)
                close()
                moveTo(14.353f, 21.0f)
                lineToRelative(1.798f, -1.804f)
                lineTo(5.83f, 8.855f)
                lineTo(0.882f, 13.82f)
                curveToRelative(-1.206f, 1.21f, -1.206f, 3.179f, 0.0f, 4.389f)
                lineToRelative(4.774f, 4.791f)
                horizontalLineToRelative(18.344f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-9.647f)
                close()
            }
        }
        .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null
