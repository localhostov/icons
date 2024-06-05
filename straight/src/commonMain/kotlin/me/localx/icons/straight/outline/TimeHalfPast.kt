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

public val Icons.Outline.TimeHalfPast: ImageVector
    get() {
        if (_timeHalfPast != null) {
            return _timeHalfPast!!
        }
        _timeHalfPast = Builder(name = "TimeHalfPast", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.333f, 14.574f)
                lineToRelative(-1.933f, 0.515f)
                arcToRelative(11.934f, 11.934f, 0.0f, false, true, -0.357f, -2.056f)
                lineToRelative(1.992f, -0.169f)
                arcToRelative(10.092f, 10.092f, 0.0f, false, false, 0.298f, 1.71f)
                close()
                moveTo(3.489f, 20.458f)
                arcToRelative(11.94f, 11.94f, 0.0f, false, false, 1.593f, 1.347f)
                lineToRelative(1.152f, -1.634f)
                arcToRelative(10.1f, 10.1f, 0.0f, false, true, -1.327f, -1.122f)
                close()
                moveTo(2.925f, 16.208f)
                lineTo(1.112f, 17.051f)
                arcToRelative(11.949f, 11.949f, 0.0f, false, false, 1.039f, 1.807f)
                lineToRelative(1.641f, -1.143f)
                arcToRelative(10.2f, 10.2f, 0.0f, false, true, -0.867f, -1.507f)
                close()
                moveTo(2.337f, 9.408f)
                lineTo(0.405f, 8.9f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, false, -0.36f, 2.054f)
                lineToRelative(1.992f, 0.175f)
                arcToRelative(10.143f, 10.143f, 0.0f, false, true, 0.3f, -1.718f)
                close()
                moveTo(3.8f, 6.274f)
                lineTo(2.162f, 5.128f)
                arcToRelative(11.943f, 11.943f, 0.0f, false, false, -1.042f, 1.807f)
                lineToRelative(1.813f, 0.844f)
                arcToRelative(10.109f, 10.109f, 0.0f, false, true, 0.867f, -1.505f)
                close()
                moveTo(6.9f, 1.137f)
                lineTo(7.752f, 2.946f)
                arcToRelative(9.993f, 9.993f, 0.0f, false, true, 1.631f, -0.6f)
                lineToRelative(-0.528f, -1.929f)
                arcToRelative(11.96f, 11.96f, 0.0f, false, false, -1.955f, 0.72f)
                close()
                moveTo(3.5f, 3.531f)
                lineTo(4.917f, 4.94f)
                arcToRelative(10.115f, 10.115f, 0.0f, false, true, 1.328f, -1.12f)
                lineToRelative(-1.152f, -1.634f)
                arcToRelative(11.878f, 11.878f, 0.0f, false, false, -1.593f, 1.345f)
                close()
                moveTo(6.881f, 22.857f)
                arcToRelative(11.868f, 11.868f, 0.0f, false, false, 1.96f, 0.722f)
                lineToRelative(0.523f, -1.93f)
                arcToRelative(9.877f, 9.877f, 0.0f, false, true, -1.628f, -0.6f)
                close()
                moveTo(12.0f, 0.0f)
                curveToRelative(-0.367f, 0.0f, -0.73f, 0.017f, -1.089f, 0.049f)
                lineToRelative(0.18f, 1.992f)
                curveToRelative(0.3f, -0.027f, 0.6f, -0.041f, 0.909f, -0.041f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, 20.0f)
                curveToRelative(-0.307f, 0.0f, -0.609f, -0.014f, -0.909f, -0.041f)
                lineToRelative(-0.18f, 1.992f)
                curveToRelative(0.359f, 0.032f, 0.722f, 0.049f, 1.089f, 0.049f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(11.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.277f)
                arcToRelative(1.984f, 1.984f, 0.0f, false, false, 0.0f, -3.446f)
                verticalLineToRelative(-4.277f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.277f)
                arcToRelative(1.984f, 1.984f, 0.0f, false, false, 0.0f, 3.446f)
                close()
            }
        }
        .build()
        return _timeHalfPast!!
    }

private var _timeHalfPast: ImageVector? = null
