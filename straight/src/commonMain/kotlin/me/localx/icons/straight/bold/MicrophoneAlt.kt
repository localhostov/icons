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

public val Icons.Bold.MicrophoneAlt: ImageVector
    get() {
        if (_microphoneAlt != null) {
            return _microphoneAlt!!
        }
        _microphoneAlt = Builder(name = "MicrophoneAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.257f, 15.005f)
                arcToRelative(5.708f, 5.708f, 0.0f, false, false, -4.06f, 1.681f)
                lineToRelative(-3.0f, 3.0f)
                arcTo(4.473f, 4.473f, 0.0f, false, true, 8.016f, 21.0f)
                lineTo(3.607f, 21.0f)
                arcToRelative(0.621f, 0.621f, 0.0f, false, true, -0.439f, -1.06f)
                lineToRelative(1.3f, -1.3f)
                arcToRelative(4.108f, 4.108f, 0.0f, false, false, 4.588f, -0.848f)
                lineTo(13.867f, 13.0f)
                lineToRelative(0.153f, 0.0f)
                arcToRelative(6.094f, 6.094f, 0.0f, false, false, 4.3f, -1.776f)
                lineToRelative(0.914f, -0.913f)
                arcToRelative(6.069f, 6.069f, 0.0f, false, false, -0.4f, -8.948f)
                arcToRelative(6.244f, 6.244f, 0.0f, false, false, -8.355f, 0.533f)
                lineTo(9.9f, 2.475f)
                arcTo(6.408f, 6.408f, 0.0f, false, false, 8.031f, 7.139f)
                lineToRelative(-4.819f, 4.8f)
                arcToRelative(4.115f, 4.115f, 0.0f, false, false, -0.863f, 4.575f)
                lineToRelative(-1.3f, 1.3f)
                arcTo(3.62f, 3.62f, 0.0f, false, false, 3.607f, 24.0f)
                lineTo(8.016f, 24.0f)
                arcToRelative(7.453f, 7.453f, 0.0f, false, false, 5.3f, -2.194f)
                lineToRelative(3.0f, -3.0f)
                arcTo(2.744f, 2.744f, 0.0f, false, true, 21.0f, 20.744f)
                lineTo(21.0f, 24.0f)
                horizontalLineToRelative(3.0f)
                lineTo(24.0f, 20.744f)
                arcTo(5.746f, 5.746f, 0.0f, false, false, 18.257f, 15.005f)
                close()
                moveTo(12.019f, 4.6f)
                lineToRelative(0.578f, -0.578f)
                arcTo(3.45f, 3.45f, 0.0f, false, true, 15.021f, 3.0f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, true, 1.881f, 0.665f)
                arcToRelative(3.067f, 3.067f, 0.0f, false, true, 0.207f, 4.527f)
                lineTo(16.2f, 9.1f)
                arcTo(3.074f, 3.074f, 0.0f, false, true, 11.662f, 8.9f)
                arcTo(3.216f, 3.216f, 0.0f, false, true, 12.019f, 4.6f)
                close()
                moveTo(5.331f, 14.07f)
                lineTo(9.049f, 10.364f)
                arcToRelative(5.511f, 5.511f, 0.0f, false, false, 0.317f, 0.464f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 1.284f, 1.142f)
                lineToRelative(-3.712f, 3.7f)
                arcToRelative(1.138f, 1.138f, 0.0f, false, true, -1.606f, 0.0f)
                arcToRelative(1.131f, 1.131f, 0.0f, false, true, 0.0f, -1.6f)
                close()
            }
        }
        .build()
        return _microphoneAlt!!
    }

private var _microphoneAlt: ImageVector? = null
