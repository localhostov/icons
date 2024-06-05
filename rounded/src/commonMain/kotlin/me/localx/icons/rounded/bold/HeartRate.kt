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
                moveToRelative(24.0f, 11.5f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.226f, 0.0f, -0.425f, 0.152f, -0.482f, 0.37f)
                curveToRelative(0.0f, 0.0f, -1.682f, 7.262f, -1.692f, 7.297f)
                curveToRelative(-0.248f, 0.8f, -0.997f, 1.333f, -1.833f, 1.333f)
                curveToRelative(-0.846f, -0.011f, -1.568f, -0.565f, -1.798f, -1.378f)
                lineToRelative(-2.82f, -12.129f)
                lineToRelative(-2.661f, 10.117f)
                curveToRelative(-0.271f, 0.845f, -0.95f, 1.358f, -1.752f, 1.389f)
                curveToRelative(-0.82f, 0.043f, -1.518f, -0.43f, -1.823f, -1.171f)
                curveToRelative(-0.021f, -0.049f, -1.638f, -5.581f, -1.638f, -5.581f)
                curveToRelative(-0.043f, -0.113f, -0.231f, -0.247f, -0.442f, -0.247f)
                horizontalLineTo(1.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.058f)
                curveToRelative(1.475f, 0.0f, 2.799f, 0.933f, 3.295f, 2.322f)
                lineToRelative(0.481f, 1.647f)
                lineToRelative(2.782f, -10.578f)
                curveToRelative(0.282f, -0.881f, 1.021f, -1.403f, 1.862f, -1.39f)
                curveToRelative(0.839f, 0.017f, 1.557f, 0.57f, 1.784f, 1.378f)
                lineToRelative(2.751f, 11.829f)
                lineToRelative(0.594f, -2.564f)
                curveToRelative(0.422f, -1.577f, 1.812f, -2.643f, 3.393f, -2.643f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _heartRate!!
    }

private var _heartRate: ImageVector? = null
