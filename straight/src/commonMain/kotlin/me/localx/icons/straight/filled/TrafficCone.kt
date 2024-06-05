package me.localx.icons.straight.filled

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

public val Icons.Filled.TrafficCone: ImageVector
    get() {
        if (_trafficCone != null) {
            return _trafficCone!!
        }
        _trafficCone = Builder(name = "TrafficCone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.328f, 11.0f)
                horizontalLineToRelative(11.201f)
                lineToRelative(1.581f, 4.0f)
                lineTo(4.691f, 15.0f)
                lineToRelative(1.637f, -4.0f)
                close()
                moveTo(16.738f, 9.0f)
                lineTo(13.18f, 0.0f)
                horizontalLineToRelative(-2.351f)
                lineToRelative(-3.683f, 9.0f)
                horizontalLineToRelative(9.592f)
                close()
                moveTo(19.901f, 17.0f)
                lineTo(3.872f, 17.0f)
                lineToRelative(-2.046f, 5.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.123f)
                lineToRelative(-1.977f, -5.0f)
                close()
            }
        }
        .build()
        return _trafficCone!!
    }

private var _trafficCone: ImageVector? = null
