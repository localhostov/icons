package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.LocationAlt: ImageVector
    get() {
        if (_locationAlt != null) {
            return _locationAlt!!
        }
        _locationAlt = Builder(name = "LocationAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 15.0f)
                arcToRelative(3.244f, 3.244f, 0.0f, false, false, 1.453f, -0.341f)
                lineToRelative(1.75f, -0.875f)
                arcToRelative(3.231f, 3.231f, 0.0f, false, false, 1.797f, -2.909f)
                verticalLineToRelative(-1.75f)
                arcToRelative(3.231f, 3.231f, 0.0f, false, false, -1.8f, -2.907f)
                lineToRelative(-1.75f, -0.875f)
                arcToRelative(3.264f, 3.264f, 0.0f, false, false, -2.906f, 0.0f)
                lineToRelative(-1.744f, 0.875f)
                arcToRelative(3.231f, 3.231f, 0.0f, false, false, -1.8f, 2.907f)
                verticalLineToRelative(1.75f)
                arcToRelative(3.231f, 3.231f, 0.0f, false, false, 1.8f, 2.907f)
                lineToRelative(1.75f, 0.875f)
                arcToRelative(3.244f, 3.244f, 0.0f, false, false, 1.45f, 0.343f)
                close()
                moveTo(10.0f, 10.877f)
                verticalLineToRelative(-1.7f)
                lineToRelative(1.327f, 0.663f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.346f, 0.0f)
                lineToRelative(1.327f, -0.662f)
                verticalLineToRelative(1.7f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, true, -0.139f, 0.224f)
                lineToRelative(-1.75f, 0.875f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, true, -0.222f, 0.0f)
                lineToRelative(-1.75f, -0.875f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, true, -0.139f, -0.227f)
                close()
                moveTo(18.5f, 21.0f)
                horizontalLineToRelative(-3.74f)
                arcToRelative(5.127f, 5.127f, 0.0f, false, false, 0.9f, -0.693f)
                lineToRelative(3.412f, -3.169f)
                arcToRelative(10.083f, 10.083f, 0.0f, false, false, 0.0f, -14.2f)
                arcToRelative(9.973f, 9.973f, 0.0f, false, false, -14.148f, 0.0f)
                arcToRelative(10.094f, 10.094f, 0.0f, false, false, 0.045f, 14.242f)
                lineToRelative(3.338f, 3.1f)
                arcToRelative(5.194f, 5.194f, 0.0f, false, false, 0.943f, 0.72f)
                horizontalLineToRelative(-3.75f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(7.053f, 15.022f)
                arcToRelative(7.074f, 7.074f, 0.0f, false, true, 0.0f, -9.961f)
                arcToRelative(6.968f, 6.968f, 0.0f, false, true, 9.894f, 0.0f)
                arcToRelative(7.063f, 7.063f, 0.0f, false, true, 0.043f, 9.919f)
                lineToRelative(-3.4f, 3.157f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, -3.211f, -0.03f)
                close()
            }
        }
        .build()
        return _locationAlt!!
    }

private var _locationAlt: ImageVector? = null
