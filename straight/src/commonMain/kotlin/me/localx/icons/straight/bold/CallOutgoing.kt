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

public val Icons.Bold.CallOutgoing: ImageVector
    get() {
        if (_callOutgoing != null) {
            return _callOutgoing!!
        }
        _callOutgoing = Builder(name = "CallOutgoing", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.3f, 14.923f)
                arcTo(10.694f, 10.694f, 0.0f, false, true, 9.089f, 9.694f)
                lineToRelative(2.963f, -2.963f)
                lineTo(5.41f, 0.09f)
                lineTo(1.765f, 3.734f)
                arcTo(6.062f, 6.062f, 0.0f, false, false, 0.0f, 8.058f)
                curveTo(0.0f, 15.209f, 8.791f, 24.0f, 15.942f, 24.0f)
                arcToRelative(6.058f, 6.058f, 0.0f, false, false, 4.323f, -1.765f)
                lineTo(23.91f, 18.59f)
                lineToRelative(-6.641f, -6.642f)
                close()
                moveTo(18.148f, 20.114f)
                arcToRelative(3.076f, 3.076f, 0.0f, false, true, -2.2f, 0.886f)
                curveTo(10.949f, 21.0f, 3.0f, 13.934f, 3.0f, 8.058f)
                arcToRelative(3.08f, 3.08f, 0.0f, false, true, 0.886f, -2.2f)
                lineTo(5.41f, 4.332f)
                lineToRelative(2.4f, 2.4f)
                lineTo(5.542f, 9.0f)
                lineToRelative(0.369f, 0.919f)
                arcTo(13.935f, 13.935f, 0.0f, false, false, 14.105f, 18.1f)
                lineToRelative(0.909f, 0.346f)
                lineToRelative(2.255f, -2.256f)
                lineToRelative(2.4f, 2.4f)
                close()
                moveTo(24.0f, 1.0f)
                lineTo(24.0f, 6.5f)
                lineTo(21.811f, 4.311f)
                lineTo(17.186f, 8.936f)
                lineTo(15.064f, 6.814f)
                lineToRelative(4.625f, -4.625f)
                lineTo(17.5f, 0.0f)
                lineTo(23.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 24.0f, 1.0f)
                close()
            }
        }
        .build()
        return _callOutgoing!!
    }

private var _callOutgoing: ImageVector? = null
