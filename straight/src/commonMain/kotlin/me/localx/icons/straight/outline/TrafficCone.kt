package me.localx.icons.straight.outline

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

public val Icons.Outline.TrafficCone: ImageVector
    get() {
        if (_trafficCone != null) {
            return _trafficCone!!
        }
        _trafficCone = Builder(name = "TrafficCone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.877f, 22.0f)
                lineTo(13.18f, 0.0f)
                horizontalLineToRelative(-2.351f)
                lineTo(1.826f, 22.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.123f)
                close()
                moveTo(17.355f, 16.0f)
                lineTo(6.443f, 16.0f)
                lineToRelative(1.637f, -4.0f)
                horizontalLineToRelative(7.694f)
                lineToRelative(1.582f, 4.0f)
                close()
                moveTo(11.992f, 2.437f)
                lineToRelative(2.991f, 7.563f)
                horizontalLineToRelative(-6.085f)
                lineToRelative(3.095f, -7.563f)
                close()
                moveTo(5.624f, 18.0f)
                horizontalLineToRelative(12.522f)
                lineToRelative(1.582f, 4.0f)
                lineTo(3.988f, 22.0f)
                lineToRelative(1.637f, -4.0f)
                close()
            }
        }
        .build()
        return _trafficCone!!
    }

private var _trafficCone: ImageVector? = null
