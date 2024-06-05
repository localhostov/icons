package me.localx.icons.rounded.outline

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

public val Icons.Outline.TimerClockCall: ImageVector
    get() {
        if (_timerClockCall != null) {
            return _timerClockCall!!
        }
        _timerClockCall = Builder(name = "TimerClockCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(21.309f, 0.0f, 18.0f, 0.0f)
                reflectiveCurveToRelative(-6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(18.0f, 2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(17.293f, 6.707f)
                curveToRelative(-0.188f, -0.188f, -0.293f, -0.442f, -0.293f, -0.707f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.586f)
                lineToRelative(0.707f, 0.707f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-1.0f, -1.0f)
                close()
                moveTo(20.656f, 14.856f)
                curveToRelative(-1.195f, -1.142f, -3.089f, -1.141f, -4.282f, 0.007f)
                lineToRelative(-1.464f, 1.165f)
                curveToRelative(-3.198f, -1.357f, -5.474f, -3.638f, -6.932f, -6.947f)
                lineToRelative(1.159f, -1.456f)
                curveToRelative(1.146f, -1.192f, 1.147f, -3.085f, 0.006f, -4.281f)
                curveToRelative(0.0f, 0.0f, -1.852f, -2.407f, -1.883f, -2.438f)
                curveToRelative(-1.206f, -1.208f, -3.172f, -1.207f, -4.327f, -0.047f)
                lineToRelative(-1.149f, 1.003f)
                curveTo(0.634f, 3.012f, 0.0f, 4.565f, 0.0f, 6.238f)
                curveToRelative(0.0f, 7.636f, 10.126f, 17.762f, 17.762f, 17.762f)
                curveToRelative(1.673f, 0.0f, 3.227f, -0.633f, 4.421f, -1.833f)
                lineToRelative(0.912f, -1.05f)
                curveToRelative(1.205f, -1.207f, 1.205f, -3.17f, 0.0f, -4.376f)
                curveToRelative(-0.03f, -0.031f, -2.438f, -1.883f, -2.438f, -1.883f)
                close()
                moveTo(21.633f, 19.752f)
                lineToRelative(-0.912f, 1.05f)
                curveToRelative(-0.771f, 0.772f, -1.821f, 1.197f, -2.959f, 1.197f)
                curveToRelative(-5.989f, 0.0f, -15.762f, -8.805f, -15.762f, -15.762f)
                curveToRelative(0.0f, -1.138f, 0.425f, -2.189f, 1.146f, -2.913f)
                lineToRelative(1.15f, -1.005f)
                curveToRelative(0.214f, -0.213f, 0.494f, -0.32f, 0.775f, -0.32f)
                curveToRelative(0.263f, 0.0f, 0.526f, 0.094f, 0.734f, 0.283f)
                curveToRelative(0.0f, 0.0f, 1.842f, 2.393f, 1.872f, 2.423f)
                curveToRelative(0.428f, 0.427f, 0.428f, 1.123f, 0.0f, 1.549f)
                curveToRelative(-0.027f, 0.027f, -1.635f, 2.044f, -1.635f, 2.044f)
                curveToRelative(-0.225f, 0.281f, -0.279f, 0.661f, -0.146f, 0.995f)
                curveToRelative(1.713f, 4.268f, 4.681f, 7.232f, 8.821f, 8.812f)
                curveToRelative(0.328f, 0.126f, 0.703f, 0.068f, 0.979f, -0.151f)
                curveToRelative(0.0f, 0.0f, 2.018f, -1.608f, 2.044f, -1.635f)
                curveToRelative(0.414f, -0.414f, 1.135f, -0.414f, 1.549f, 0.0f)
                curveToRelative(0.03f, 0.031f, 2.425f, 1.873f, 2.425f, 1.873f)
                curveToRelative(0.388f, 0.43f, 0.374f, 1.097f, -0.085f, 1.56f)
                close()
            }
        }
        .build()
        return _timerClockCall!!
    }

private var _timerClockCall: ImageVector? = null
