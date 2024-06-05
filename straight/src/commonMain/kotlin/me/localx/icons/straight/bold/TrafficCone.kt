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

public val Icons.Bold.TrafficCone: ImageVector
    get() {
        if (_trafficCone != null) {
            return _trafficCone!!
        }
        _trafficCone = Builder(name = "TrafficCone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.011f, 21.0f)
                lineTo(13.511f, 0.0f)
                horizontalLineToRelative(-3.009f)
                lineTo(1.709f, 21.0f)
                lineTo(0.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.989f)
                close()
                moveTo(16.346f, 15.0f)
                lineTo(7.474f, 15.0f)
                lineToRelative(1.256f, -3.0f)
                horizontalLineToRelative(6.402f)
                lineToRelative(1.214f, 3.0f)
                close()
                moveTo(11.985f, 4.226f)
                lineToRelative(1.932f, 4.774f)
                horizontalLineToRelative(-3.932f)
                lineToRelative(1.999f, -4.774f)
                close()
                moveTo(6.217f, 18.0f)
                horizontalLineToRelative(11.343f)
                lineToRelative(1.214f, 3.0f)
                lineTo(4.961f, 21.0f)
                lineToRelative(1.256f, -3.0f)
                close()
            }
        }
        .build()
        return _trafficCone!!
    }

private var _trafficCone: ImageVector? = null
