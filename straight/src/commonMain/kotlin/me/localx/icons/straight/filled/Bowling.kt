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

public val Icons.Filled.Bowling: ImageVector
    get() {
        if (_bowling != null) {
            return _bowling!!
        }
        _bowling = Builder(name = "Bowling", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 8.0f)
                arcToRelative(7.965f, 7.965f, 0.0f, false, false, -4.546f, 1.434f)
                curveToRelative(0.178f, 0.386f, 0.376f, 0.778f, 0.585f, 1.181f)
                arcToRelative(13.58f, 13.58f, 0.0f, false, true, 1.961f, 6.385f)
                arcToRelative(12.788f, 12.788f, 0.0f, false, true, -1.507f, 6.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 3.507f, -15.2f)
                close()
                moveTo(17.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                close()
                moveTo(19.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                close()
                moveTo(21.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                close()
                moveTo(10.264f, 11.537f)
                arcToRelative(11.781f, 11.781f, 0.0f, false, true, 1.736f, 5.463f)
                arcToRelative(9.732f, 9.732f, 0.0f, false, true, -2.293f, 6.707f)
                lineToRelative(-0.293f, 0.293f)
                horizontalLineToRelative(-6.828f)
                lineToRelative(-0.293f, -0.293f)
                arcToRelative(9.732f, 9.732f, 0.0f, false, true, -2.293f, -6.707f)
                arcToRelative(11.781f, 11.781f, 0.0f, false, true, 1.736f, -5.463f)
                curveToRelative(0.273f, -0.525f, 0.536f, -1.037f, 0.753f, -1.537f)
                horizontalLineToRelative(7.022f)
                curveToRelative(0.217f, 0.5f, 0.48f, 1.012f, 0.753f, 1.537f)
                close()
                moveTo(2.446f, 5.825f)
                arcToRelative(7.168f, 7.168f, 0.0f, false, true, -0.446f, -1.825f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                arcToRelative(7.168f, 7.168f, 0.0f, false, true, -0.446f, 1.825f)
                arcToRelative(11.618f, 11.618f, 0.0f, false, false, -0.554f, 2.175f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(11.618f, 11.618f, 0.0f, false, false, -0.554f, -2.175f)
                close()
            }
        }
        .build()
        return _bowling!!
    }

private var _bowling: ImageVector? = null
