package me.localx.icons.rounded.filled

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

public val Icons.Filled.CameraCctv: ImageVector
    get() {
        if (_cameraCctv != null) {
            return _cameraCctv!!
        }
        _cameraCctv = Builder(name = "CameraCctv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.3f, 11.077f)
                lineToRelative(1.312f, -1.018f)
                curveToRelative(0.263f, -0.204f, 0.408f, -0.526f, 0.385f, -0.858f)
                reflectiveCurveToRelative(-0.209f, -0.632f, -0.499f, -0.798f)
                lineTo(8.797f, 0.51f)
                curveTo(7.857f, -0.016f, 6.771f, -0.142f, 5.734f, 0.158f)
                curveToRelative(-1.035f, 0.299f, -1.889f, 0.985f, -2.403f, 1.932f)
                lineToRelative(-0.844f, 1.552f)
                curveToRelative(-1.034f, 1.9f, -0.345f, 4.317f, 1.526f, 5.382f)
                lineToRelative(5.658f, 3.299f)
                lineToRelative(-1.209f, 3.626f)
                curveToRelative(-0.409f, 1.227f, -1.553f, 2.051f, -2.846f, 2.051f)
                horizontalLineToRelative(-3.617f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.617f)
                curveToRelative(2.155f, 0.0f, 4.062f, -1.374f, 4.743f, -3.418f)
                lineToRelative(1.077f, -3.229f)
                lineToRelative(2.878f, 1.678f)
                curveToRelative(0.612f, 0.348f, 1.288f, 0.525f, 1.972f, 0.525f)
                curveToRelative(0.367f, 0.0f, 0.737f, -0.051f, 1.101f, -0.154f)
                curveToRelative(0.357f, -0.102f, 0.693f, -0.249f, 1.001f, -0.437f)
                lineToRelative(1.592f, 0.883f)
                curveToRelative(0.591f, 0.328f, 1.336f, 0.111f, 1.66f, -0.482f)
                lineToRelative(0.844f, -1.547f)
                curveToRelative(0.321f, -0.588f, 0.107f, -1.324f, -0.479f, -1.649f)
                lineToRelative(-1.137f, -0.63f)
                curveToRelative(0.118f, -0.176f, 0.263f, -0.33f, 0.431f, -0.461f)
                close()
            }
        }
        .build()
        return _cameraCctv!!
    }

private var _cameraCctv: ImageVector? = null
