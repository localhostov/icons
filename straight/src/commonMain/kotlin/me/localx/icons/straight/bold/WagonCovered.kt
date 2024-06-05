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

public val Icons.Bold.WagonCovered: ImageVector
    get() {
        if (_wagonCovered != null) {
            return _wagonCovered!!
        }
        _wagonCovered = Builder(name = "WagonCovered", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 8.0f, 21.0f)
                close()
                moveTo(19.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 3.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.0f, 18.0f)
                close()
                moveTo(23.919f, 4.371f)
                lineTo(22.0f, 12.671f)
                verticalLineToRelative(4.352f)
                arcTo(4.954f, 4.954f, 0.0f, false, false, 19.0f, 16.0f)
                lineTo(19.0f, 14.0f)
                lineTo(5.0f, 14.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(4.956f, 4.956f, 0.0f, false, false, -3.0f, 1.023f)
                lineTo(2.0f, 12.671f)
                lineTo(0.081f, 4.345f)
                arcToRelative(3.141f, 3.141f, 0.0f, false, true, 0.8f, -2.888f)
                arcTo(3.107f, 3.107f, 0.0f, false, true, 3.693f, 0.551f)
                arcToRelative(5.784f, 5.784f, 0.0f, false, true, 0.749f, 0.22f)
                arcTo(3.317f, 3.317f, 0.0f, false, false, 5.319f, 1.0f)
                arcTo(6.08f, 6.08f, 0.0f, false, false, 7.781f, 0.363f)
                lineTo(8.406f, 0.021f)
                lineToRelative(0.662f, 0.27f)
                arcTo(9.8f, 9.8f, 0.0f, false, false, 12.0f, 1.0f)
                arcTo(6.594f, 6.594f, 0.0f, false, false, 14.788f, 0.359f)
                lineTo(15.5f, -0.02f)
                lineToRelative(0.718f, 0.383f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 18.682f, 1.0f)
                arcTo(3.3f, 3.3f, 0.0f, false, false, 19.6f, 0.779f)
                arcToRelative(5.76f, 5.76f, 0.0f, false, true, 0.713f, -0.2f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, 2.812f, 0.906f)
                arcTo(3.141f, 3.141f, 0.0f, false, true, 23.919f, 4.371f)
                close()
                moveTo(19.307f, 11.0f)
                lineTo(21.0f, 3.7f)
                arcToRelative(0.138f, 0.138f, 0.0f, false, false, -0.039f, -0.135f)
                arcToRelative(0.092f, 0.092f, 0.0f, false, false, -0.1f, -0.035f)
                curveToRelative(-0.085f, 0.019f, -0.189f, 0.058f, -0.308f, 0.1f)
                arcTo(5.783f, 5.783f, 0.0f, false, true, 18.682f, 4.0f)
                arcTo(7.637f, 7.637f, 0.0f, false, true, 17.0f, 3.8f)
                lineTo(17.0f, 9.0f)
                lineTo(14.0f, 9.0f)
                lineTo(14.0f, 3.779f)
                arcTo(9.373f, 9.373f, 0.0f, false, true, 12.0f, 4.0f)
                arcToRelative(8.778f, 8.778f, 0.0f, false, true, -2.0f, -0.275f)
                lineTo(10.0f, 9.0f)
                lineTo(7.0f, 9.0f)
                lineTo(7.0f, 3.8f)
                arcTo(7.625f, 7.625f, 0.0f, false, true, 5.319f, 4.0f)
                arcTo(5.611f, 5.611f, 0.0f, false, true, 3.45f, 3.6f)
                curveToRelative(-0.122f, -0.043f, -0.23f, -0.085f, -0.319f, -0.106f)
                curveToRelative(-0.011f, 0.0f, -0.045f, -0.009f, -0.088f, 0.036f)
                arcToRelative(0.142f, 0.142f, 0.0f, false, false, -0.038f, 0.137f)
                lineTo(4.694f, 11.0f)
                close()
                moveTo(10.0f, 21.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(4.956f, 4.956f, 0.0f, false, true, 1.023f, -3.0f)
                lineTo(8.978f, 18.0f)
                arcTo(4.955f, 4.955f, 0.0f, false, true, 10.0f, 21.0f)
                close()
            }
        }
        .build()
        return _wagonCovered!!
    }

private var _wagonCovered: ImageVector? = null
