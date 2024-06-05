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

public val Icons.Bold.HeartRate: ImageVector
    get() {
        if (_heartRate != null) {
            return _heartRate!!
        }
        _heartRate = Builder(name = "HeartRate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.474f, 23.821f)
                lineToRelative(-4.554f, -14.169f)
                lineToRelative(-4.317f, 11.993f)
                lineToRelative(-3.603f, -8.645f)
                lineToRelative(-4.0f, 0.0f)
                lineToRelative(0.0f, -3.0f)
                lineToRelative(6.0f, 0.0f)
                lineToRelative(1.397f, 3.355f)
                lineToRelative(4.683f, -13.007f)
                lineToRelative(4.446f, 13.831f)
                lineToRelative(1.393f, -4.179f)
                lineToRelative(6.081f, 0.0f)
                lineToRelative(0.0f, 3.0f)
                lineToRelative(-3.919f, 0.0f)
                lineToRelative(-3.607f, 10.821f)
                close()
            }
        }
        .build()
        return _heartRate!!
    }

private var _heartRate: ImageVector? = null
