package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.ZoomIn: ImageVector
    get() {
        if (_zoomIn != null) {
            return _zoomIn!!
        }
        _zoomIn = Builder(name = "ZoomIn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 128.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-64.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(403.624f, 358.488f)
                curveToRelative(74.104f, -99.032f, 53.896f, -239.386f, -45.136f, -313.49f)
                reflectiveCurveTo(119.102f, -8.898f, 44.998f, 90.134f)
                reflectiveCurveTo(-8.898f, 329.52f, 90.134f, 403.624f)
                curveToRelative(79.549f, 59.525f, 188.806f, 59.525f, 268.354f, 0.0f)
                lineTo(466.864f, 512.0f)
                lineTo(512.0f, 466.949f)
                lineTo(403.624f, 358.488f)
                close()
                moveTo(225.121f, 384.498f)
                curveToRelative(-88.021f, 0.0f, -159.377f, -71.356f, -159.377f, -159.377f)
                reflectiveCurveTo(137.1f, 65.744f, 225.121f, 65.744f)
                reflectiveCurveTo(384.498f, 137.1f, 384.498f, 225.121f)
                curveTo(384.416f, 313.109f, 313.109f, 384.416f, 225.121f, 384.498f)
                close()
            }
        }
        .build()
        return _zoomIn!!
    }

private var _zoomIn: ImageVector? = null
