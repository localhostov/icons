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

public val Icons.Filled.CarCrash: ImageVector
    get() {
        if (_carCrash != null) {
            return _carCrash!!
        }
        _carCrash = Builder(name = "CarCrash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.055f, 17.042f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 18.2f, 16.29f)
                lineToRelative(0.33f, -0.812f)
                lineTo(11.883f, 12.82f)
                lineToRelative(-0.328f, 0.81f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.7f, 12.878f)
                lineToRelative(0.325f, -0.8f)
                lineTo(6.51f, 10.672f)
                arcToRelative(9.009f, 9.009f, 0.0f, false, false, -0.853f, 1.59f)
                reflectiveCurveToRelative(-0.428f, 0.77f, -0.445f, 0.811f)
                arcToRelative(3.441f, 3.441f, 0.0f, false, false, 0.087f, 2.58f)
                arcToRelative(3.24f, 3.24f, 0.0f, false, false, 0.728f, 1.053f)
                lineToRelative(-0.035f, 0.089f)
                arcToRelative(2.491f, 2.491f, 0.0f, false, false, 4.58f, 1.958f)
                lineToRelative(4.818f, 1.934f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.678f, 1.735f)
                lineToRelative(0.018f, -0.043f)
                arcTo(2.979f, 2.979f, 0.0f, false, false, 23.0f, 20.5f)
                lineToRelative(0.412f, -1.04f)
                arcToRelative(8.914f, 8.914f, 0.0f, false, false, 0.5f, -1.828f)
                lineToRelative(-3.526f, -1.41f)
                close()
                moveTo(11.628f, 6.253f)
                arcTo(4.933f, 4.933f, 0.0f, false, true, 16.7f, 5.378f)
                lineToRelative(3.965f, 1.541f)
                arcTo(4.473f, 4.473f, 0.0f, false, true, 23.5f, 11.0f)
                reflectiveCurveToRelative(0.514f, 4.455f, 0.518f, 4.517f)
                lineTo(7.871f, 9.062f)
                curveTo(7.9f, 9.036f, 11.628f, 6.253f, 11.628f, 6.253f)
                close()
                moveTo(6.508f, 7.6f)
                arcTo(20.432f, 20.432f, 0.0f, false, false, 4.845f, 9.564f)
                arcToRelative(11.015f, 11.015f, 0.0f, false, false, -0.991f, 1.826f)
                curveToRelative(-0.164f, 0.294f, -0.268f, 0.482f, -0.337f, 0.61f)
                horizontalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.768f, -1.64f)
                lineTo(1.823f, 8.451f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, 0.0f, -0.9f)
                lineTo(0.232f, 5.64f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 1.0f, 4.0f)
                horizontalLineTo(3.3f)
                arcTo(0.705f, 0.705f, 0.0f, false, false, 4.0f, 3.3f)
                verticalLineTo(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.64f, 0.232f)
                lineTo(7.549f, 1.823f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, 0.9f, 0.0f)
                lineTo(10.36f, 0.232f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 1.0f)
                verticalLineTo(3.659f)
                arcTo(6.643f, 6.643f, 0.0f, false, false, 10.368f, 4.7f)
                lineTo(6.507f, 7.6f)
                close()
            }
        }
        .build()
        return _carCrash!!
    }

private var _carCrash: ImageVector? = null
