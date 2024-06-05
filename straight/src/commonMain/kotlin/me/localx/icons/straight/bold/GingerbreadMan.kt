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

public val Icons.Bold.GingerbreadMan: ImageVector
    get() {
        if (_gingerbreadMan != null) {
            return _gingerbreadMan!!
        }
        _gingerbreadMan = Builder(name = "GingerbreadMan", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 13.5f)
                close()
                moveTo(18.0f, 13.41f)
                verticalLineToRelative(1.769f)
                lineToRelative(2.33f, 2.606f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.6f, 4.515f)
                lineTo(12.0f, 20.3f)
                lineToRelative(-1.726f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.6f, -4.515f)
                lineTo(6.0f, 15.181f)
                lineTo(6.0f, 13.412f)
                lineToRelative(-1.627f, -0.658f)
                arcToRelative(3.956f, 3.956f, 0.0f, false, true, -2.3f, -2.185f)
                arcToRelative(4.022f, 4.022f, 0.0f, false, true, 0.051f, -3.254f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 4.9f, -2.089f)
                curveTo(7.019f, 5.149f, 7.0f, 5.077f, 7.0f, 5.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 17.0f, 5.0f)
                curveToRelative(0.0f, 0.079f, -0.02f, 0.153f, -0.023f, 0.231f)
                arcToRelative(4.106f, 4.106f, 0.0f, false, true, 4.9f, 2.085f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.282f, 5.451f)
                close()
                moveTo(10.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 5.0f)
                close()
                moveTo(15.0f, 16.333f)
                lineTo(15.0f, 11.387f)
                lineToRelative(3.572f, -1.441f)
                arcToRelative(0.988f, 0.988f, 0.0f, false, false, 0.593f, -0.553f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.016f, -0.82f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -1.364f, -0.47f)
                lineTo(13.63f, 9.726f)
                arcTo(6.62f, 6.62f, 0.0f, false, true, 12.0f, 10.0f)
                arcToRelative(6.505f, 6.505f, 0.0f, false, true, -1.59f, -0.26f)
                lineTo(6.155f, 8.082f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, false, -1.308f, 0.491f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.016f, 0.82f)
                arcToRelative(0.988f, 0.988f, 0.0f, false, false, 0.593f, 0.553f)
                lineTo(9.0f, 11.388f)
                verticalLineToRelative(4.947f)
                lineTo(6.124f, 19.52f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.324f, 1.313f)
                arcToRelative(1.024f, 1.024f, 0.0f, false, false, 1.387f, -0.28f)
                lineToRelative(2.27f, -2.653f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 3.788f, 0.0f)
                lineToRelative(2.273f, 2.655f)
                arcToRelative(1.024f, 1.024f, 0.0f, false, false, 1.386f, 0.28f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.325f, -1.313f)
                close()
            }
        }
        .build()
        return _gingerbreadMan!!
    }

private var _gingerbreadMan: ImageVector? = null
