package me.localx.icons.rounded.filled

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
                moveTo(2.446f, 5.825f)
                arcTo(7.168f, 7.168f, 0.0f, false, true, 2.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                arcToRelative(7.168f, 7.168f, 0.0f, false, true, -0.446f, 1.825f)
                arcTo(11.618f, 11.618f, 0.0f, false, false, 9.0f, 8.0f)
                lineTo(3.0f, 8.0f)
                arcTo(11.618f, 11.618f, 0.0f, false, false, 2.446f, 5.825f)
                close()
                moveTo(9.511f, 10.0f)
                lineTo(2.489f, 10.0f)
                curveToRelative(-0.217f, 0.5f, -0.48f, 1.012f, -0.753f, 1.537f)
                arcTo(11.781f, 11.781f, 0.0f, false, false, 0.0f, 17.0f)
                arcToRelative(11.08f, 11.08f, 0.0f, false, false, 0.986f, 4.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 4.61f, 24.0f)
                lineTo(7.39f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.624f, -2.3f)
                arcTo(11.08f, 11.08f, 0.0f, false, false, 12.0f, 17.0f)
                arcToRelative(11.781f, 11.781f, 0.0f, false, false, -1.736f, -5.463f)
                curveTo(9.991f, 11.012f, 9.728f, 10.5f, 9.511f, 10.0f)
                close()
                moveTo(24.0f, 16.0f)
                arcToRelative(8.006f, 8.006f, 0.0f, false, true, -11.529f, 7.183f)
                arcToRelative(5.979f, 5.979f, 0.0f, false, false, 0.357f, -0.642f)
                arcTo(13.05f, 13.05f, 0.0f, false, false, 14.0f, 17.0f)
                arcToRelative(13.58f, 13.58f, 0.0f, false, false, -1.961f, -6.385f)
                curveToRelative(-0.209f, -0.4f, -0.407f, -0.795f, -0.585f, -1.181f)
                arcTo(7.981f, 7.981f, 0.0f, false, true, 24.0f, 16.0f)
                close()
                moveTo(18.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 15.0f)
                close()
                moveTo(20.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 12.0f)
                close()
                moveTo(22.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.0f, 15.0f)
                close()
            }
        }
        .build()
        return _bowling!!
    }

private var _bowling: ImageVector? = null
