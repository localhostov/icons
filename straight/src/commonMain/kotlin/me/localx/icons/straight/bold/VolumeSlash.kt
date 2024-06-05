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

public val Icons.Bold.VolumeSlash: ImageVector
    get() {
        if (_volumeSlash != null) {
            return _volumeSlash!!
        }
        _volumeSlash = Builder(name = "VolumeSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 14.87f)
                lineToRelative(3.0f, 3.0f)
                verticalLineToRelative(5.739f)
                lineToRelative(-7.733f, -5.109f)
                horizontalLineToRelative(-3.144f)
                curveToRelative(-1.171f, 0.0f, -2.123f, -0.953f, -2.123f, -2.123f)
                lineTo(0.0f, 7.623f)
                curveToRelative(0.0f, -0.746f, 0.389f, -1.401f, 0.973f, -1.78f)
                lineToRelative(2.027f, 2.027f)
                verticalLineToRelative(7.63f)
                horizontalLineToRelative(3.169f)
                lineToRelative(3.831f, 2.531f)
                verticalLineToRelative(-3.161f)
                close()
                moveTo(20.951f, 18.75f)
                lineToRelative(3.025f, 3.025f)
                lineToRelative(-2.121f, 2.121f)
                lineTo(0.055f, 2.097f)
                lineTo(2.176f, -0.024f)
                lineToRelative(4.556f, 4.556f)
                lineTo(13.0f, 0.391f)
                verticalLineToRelative(10.409f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(-4.482f)
                curveToRelative(2.03f, 0.0f, 3.682f, 1.652f, 3.682f, 3.682f)
                curveToRelative(0.0f, 1.219f, -0.595f, 2.301f, -1.51f, 2.971f)
                lineToRelative(1.652f, 1.652f)
                curveToRelative(1.362f, -1.13f, 2.177f, -2.825f, 2.177f, -4.623f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(4.963f, 0.0f, 9.0f, 4.038f, 9.0f, 9.0f)
                curveToRelative(0.0f, 2.601f, -1.136f, 5.059f, -3.049f, 6.751f)
                close()
            }
        }
        .build()
        return _volumeSlash!!
    }

private var _volumeSlash: ImageVector? = null
