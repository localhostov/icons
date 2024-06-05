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

public val Icons.Filled.HeartRate: ImageVector
    get() {
        if (_heartRate != null) {
            return _heartRate!!
        }
        _heartRate = Builder(name = "HeartRate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.494f, 23.525f)
                lineTo(11.937f, 7.442f)
                lineToRelative(-4.359f, 13.459f)
                lineToRelative(-3.247f, -7.902f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.67f)
                lineToRelative(1.685f, 4.098f)
                lineTo(12.063f, 0.558f)
                lineToRelative(4.511f, 15.917f)
                lineToRelative(1.688f, -5.475f)
                horizontalLineToRelative(5.738f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.262f)
                lineToRelative(-3.244f, 10.525f)
                close()
            }
        }
        .build()
        return _heartRate!!
    }

private var _heartRate: ImageVector? = null
