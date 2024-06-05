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

public val Icons.Bold.RocketLunch: ImageVector
    get() {
        if (_rocketLunch != null) {
            return _rocketLunch!!
        }
        _rocketLunch = Builder(name = "RocketLunch", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 8.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 15.5f, 6.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.0f, 8.5f)
                close()
                moveTo(16.659f, 17.713f)
                arcToRelative(11.038f, 11.038f, 0.0f, false, true, -0.828f, 2.222f)
                arcTo(7.634f, 7.634f, 0.0f, false, true, 9.0f, 24.0f)
                lineTo(8.0f, 24.0f)
                lineTo(8.0f, 19.143f)
                arcTo(3.214f, 3.214f, 0.0f, false, false, 4.857f, 16.0f)
                lineTo(0.0f, 16.0f)
                lineTo(0.0f, 15.0f)
                arcTo(7.634f, 7.634f, 0.0f, false, true, 4.065f, 8.169f)
                arcToRelative(11.038f, 11.038f, 0.0f, false, true, 2.222f, -0.828f)
                curveTo(9.96f, 2.38f, 14.221f, 0.178f, 20.458f, 0.0f)
                lineTo(20.5f, 0.0f)
                arcTo(3.489f, 3.489f, 0.0f, false, true, 24.0f, 3.551f)
                curveTo(23.82f, 9.877f, 21.686f, 14.0f, 16.659f, 17.713f)
                close()
                moveTo(21.0f, 3.508f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 20.515f, 3.0f)
                curveToRelative(-5.461f, 0.162f, -8.839f, 1.966f, -12.038f, 6.431f)
                arcToRelative(28.441f, 28.441f, 0.0f, false, false, -2.206f, 3.737f)
                arcToRelative(6.287f, 6.287f, 0.0f, false, true, 4.561f, 4.561f)
                arcToRelative(28.376f, 28.376f, 0.0f, false, false, 3.737f, -2.206f)
                curveTo(19.042f, 12.317f, 20.846f, 8.949f, 21.0f, 3.508f)
                close()
                moveTo(1.631f, 18.728f)
                curveTo(0.857f, 19.5f, 0.38f, 21.831f, 0.211f, 22.8f)
                lineTo(0.0f, 24.0f)
                lineToRelative(1.2f, -0.212f)
                curveToRelative(0.961f, -0.17f, 3.278f, -0.649f, 4.052f, -1.425f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, false, 0.0f, -3.635f)
                arcTo(2.613f, 2.613f, 0.0f, false, false, 1.631f, 18.728f)
                close()
            }
        }
        .build()
        return _rocketLunch!!
    }

private var _rocketLunch: ImageVector? = null
