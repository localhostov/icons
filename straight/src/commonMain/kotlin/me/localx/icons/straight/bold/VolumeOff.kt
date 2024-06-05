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

public val Icons.Bold.VolumeOff: ImageVector
    get() {
        if (_volumeOff != null) {
            return _volumeOff!!
        }
        _volumeOff = Builder(name = "VolumeOff", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 23.609f)
                lineToRelative(-7.733f, -5.109f)
                horizontalLineToRelative(-3.144f)
                curveToRelative(-1.171f, 0.0f, -2.123f, -0.952f, -2.123f, -2.123f)
                verticalLineTo(7.623f)
                curveToRelative(0.0f, -1.171f, 0.952f, -2.123f, 2.123f, -2.123f)
                horizontalLineToRelative(3.144f)
                lineTo(13.0f, 0.391f)
                verticalLineToRelative(23.219f)
                close()
                moveTo(3.0f, 15.5f)
                horizontalLineToRelative(3.169f)
                lineToRelative(3.831f, 2.531f)
                verticalLineTo(5.969f)
                lineToRelative(-3.831f, 2.531f)
                horizontalLineToRelative(-3.169f)
                verticalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _volumeOff!!
    }

private var _volumeOff: ImageVector? = null
