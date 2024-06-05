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

public val Icons.Bold.SkiingNordic: ImageVector
    get() {
        if (_skiingNordic != null) {
            return _skiingNordic!!
        }
        _skiingNordic = Builder(name = "SkiingNordic", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 14.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 2.5f)
                close()
                moveTo(24.0f, 19.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 19.5f, 24.0f)
                lineTo(1.5f, 24.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.031f, 22.2f)
                lineToRelative(1.654f, -8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.938f, 0.608f)
                lineTo(3.342f, 21.0f)
                lineTo(4.493f, 21.0f)
                lineToRelative(0.848f, -2.069f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.776f, 1.138f)
                lineTo(7.736f, 21.0f)
                lineTo(12.0f, 21.0f)
                lineTo(12.0f, 19.534f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.211f, -0.408f)
                lineToRelative(-3.248f, -2.3f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, true, -1.3f, -4.242f)
                lineTo(8.709f, 9.0f)
                lineTo(6.492f, 9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.48f, 0.361f)
                lineToRelative(-0.161f, 0.556f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.882f, -0.834f)
                lineToRelative(0.16f, -0.554f)
                arcTo(3.516f, 3.516f, 0.0f, false, true, 6.492f, 6.0f)
                lineTo(12.5f, 6.0f)
                arcToRelative(3.519f, 3.519f, 0.0f, false, true, 3.0f, 1.7f)
                lineToRelative(1.843f, 3.063f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.429f, 0.242f)
                horizontalLineToRelative(0.984f)
                lineToRelative(0.424f, -1.837f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.923f, 0.674f)
                lineTo(19.526f, 21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.0f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
                moveTo(15.0f, 19.534f)
                lineTo(15.0f, 21.0f)
                horizontalLineToRelative(1.447f)
                lineToRelative(1.615f, -7.0f)
                horizontalLineToRelative(-0.291f)
                arcToRelative(3.518f, 3.518f, 0.0f, false, true, -3.0f, -1.7f)
                lineToRelative(-1.164f, -1.933f)
                lineToRelative(-2.024f, 4.935f)
                lineToRelative(1.939f, 1.371f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 15.0f, 19.534f)
                close()
            }
        }
        .build()
        return _skiingNordic!!
    }

private var _skiingNordic: ImageVector? = null
