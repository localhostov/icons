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

public val Icons.Filled.Treadmill: ImageVector
    get() {
        if (_treadmill != null) {
            return _treadmill!!
        }
        _treadmill = Builder(name = "Treadmill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.092f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(23.896f, 12.633f)
                lineToRelative(-2.992f, 8.101f)
                curveToRelative(-0.723f, 1.954f, -2.607f, 3.267f, -4.69f, 3.267f)
                lineTo(1.0f, 24.001f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-4.429f)
                lineToRelative(-3.577f, -2.107f)
                curveToRelative(-1.259f, -0.797f, -1.752f, -2.342f, -1.199f, -3.69f)
                lineToRelative(1.548f, -3.773f)
                horizontalLineToRelative(-1.917f)
                lineToRelative(-1.434f, 3.39f)
                curveToRelative(-0.161f, 0.382f, -0.532f, 0.61f, -0.921f, 0.61f)
                curveToRelative(-0.13f, 0.0f, -0.262f, -0.025f, -0.389f, -0.079f)
                curveToRelative(-0.509f, -0.215f, -0.747f, -0.802f, -0.531f, -1.311f)
                lineToRelative(1.434f, -3.39f)
                curveToRelative(0.314f, -0.741f, 1.037f, -1.221f, 1.842f, -1.221f)
                horizontalLineToRelative(4.24f)
                curveToRelative(1.19f, 0.0f, 2.311f, 0.524f, 3.073f, 1.438f)
                lineToRelative(2.281f, 2.562f)
                horizontalLineToRelative(2.552f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.552f)
                curveToRelative(-0.569f, 0.0f, -1.113f, -0.244f, -1.493f, -0.669f)
                lineToRelative(-1.679f, -1.886f)
                lineToRelative(-2.106f, 5.317f)
                lineToRelative(1.845f, 1.087f)
                curveToRelative(0.607f, 0.357f, 0.984f, 1.018f, 0.984f, 1.723f)
                verticalLineToRelative(4.429f)
                horizontalLineToRelative(5.214f)
                curveToRelative(1.25f, 0.0f, 2.381f, -0.787f, 2.813f, -1.96f)
                lineToRelative(2.982f, -8.07f)
                lineToRelative(-3.01f, 0.03f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.641f, 0.0f, 1.247f, 0.311f, 1.622f, 0.83f)
                curveToRelative(0.375f, 0.521f, 0.478f, 1.194f, 0.274f, 1.803f)
                close()
                moveTo(1.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(1.0f, 17.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _treadmill!!
    }

private var _treadmill: ImageVector? = null
