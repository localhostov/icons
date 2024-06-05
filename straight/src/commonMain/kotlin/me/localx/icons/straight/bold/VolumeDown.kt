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

public val Icons.Bold.VolumeDown: ImageVector
    get() {
        if (_volumeDown != null) {
            return _volumeDown!!
        }
        _volumeDown = Builder(name = "VolumeDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.682f, 12.0f)
                curveToRelative(0.0f, 2.03f, -1.652f, 3.682f, -3.682f, 3.682f)
                verticalLineToRelative(-7.364f)
                curveToRelative(2.03f, 0.0f, 3.682f, 1.652f, 3.682f, 3.682f)
                close()
                moveTo(5.267f, 5.5f)
                lineTo(13.0f, 0.391f)
                verticalLineToRelative(23.219f)
                lineToRelative(-7.733f, -5.109f)
                horizontalLineToRelative(-3.144f)
                curveToRelative(-1.171f, 0.0f, -2.123f, -0.952f, -2.123f, -2.123f)
                lineTo(0.0f, 7.623f)
                curveToRelative(0.0f, -1.171f, 0.952f, -2.123f, 2.123f, -2.123f)
                horizontalLineToRelative(3.144f)
                close()
                moveTo(6.168f, 8.5f)
                horizontalLineToRelative(-3.168f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(3.168f)
                lineToRelative(3.832f, 2.531f)
                lineTo(10.0f, 5.969f)
                lineToRelative(-3.832f, 2.531f)
                close()
            }
        }
        .build()
        return _volumeDown!!
    }

private var _volumeDown: ImageVector? = null
