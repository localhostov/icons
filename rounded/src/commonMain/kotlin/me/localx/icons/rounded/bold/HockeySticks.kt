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

public val Icons.Bold.HockeySticks: ImageVector
    get() {
        if (_hockeySticks != null) {
            return _hockeySticks!!
        }
        _hockeySticks = Builder(name = "HockeySticks", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.973f, 17.641f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -3.9f, -4.881f)
                lineToRelative(2.87f, -10.117f)
                arcTo(2.258f, 2.258f, 0.0f, false, false, 22.676f, 0.955f)
                arcTo(2.063f, 2.063f, 0.0f, false, false, 21.333f, 0.047f)
                arcToRelative(2.26f, 2.26f, 0.0f, false, false, -2.568f, 1.527f)
                curveToRelative(-0.012f, 0.033f, -2.26f, 8.2f, -2.26f, 8.2f)
                arcTo(3.123f, 3.123f, 0.0f, false, true, 13.5f, 12.0f)
                lineTo(10.177f, 12.0f)
                curveToRelative(-0.665f, -0.17f, -2.215f, -0.688f, -2.576f, -1.876f)
                curveToRelative(0.0f, 0.0f, -2.354f, -8.516f, -2.366f, -8.548f)
                arcTo(2.255f, 2.255f, 0.0f, false, false, 2.667f, 0.047f)
                arcTo(2.061f, 2.061f, 0.0f, false, false, 1.324f, 0.955f)
                arcToRelative(2.274f, 2.274f, 0.0f, false, false, -0.25f, 1.74f)
                lineToRelative(2.734f, 9.719f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 6.0f, 24.0f)
                lineTo(9.254f, 24.0f)
                arcToRelative(10.2f, 10.2f, 0.0f, false, false, 2.687f, -0.358f)
                arcTo(10.065f, 10.065f, 0.0f, false, false, 14.606f, 24.0f)
                horizontalLineToRelative(3.6f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 5.769f, -6.359f)
                close()
                moveTo(6.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                horizontalLineToRelative(7.5f)
                arcToRelative(6.124f, 6.124f, 0.0f, false, false, 3.041f, -0.8f)
                lineToRelative(-0.5f, 1.768f)
                arcTo(7.052f, 7.052f, 0.0f, false, true, 9.254f, 21.0f)
                close()
                moveTo(20.274f, 20.083f)
                arcTo(2.8f, 2.8f, 0.0f, false, true, 18.2f, 21.0f)
                lineTo(16.446f, 21.0f)
                arcToRelative(10.172f, 10.172f, 0.0f, false, false, 2.472f, -4.186f)
                lineToRelative(0.327f, -1.152f)
                arcToRelative(2.818f, 2.818f, 0.0f, false, true, 1.741f, 2.264f)
                arcTo(2.768f, 2.768f, 0.0f, false, true, 20.274f, 20.083f)
                close()
            }
        }
        .build()
        return _hockeySticks!!
    }

private var _hockeySticks: ImageVector? = null
