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

public val Icons.Outline.Waveform: ImageVector
    get() {
        if (_waveform != null) {
            return _waveform!!
        }
        _waveform = Builder(name = "Waveform", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.162f, 24.009f)
                horizontalLineToRelative(-0.008f)
                curveToRelative(-0.747f, -0.004f, -1.347f, -0.538f, -1.425f, -1.271f)
                lineToRelative(-1.729f, -15.956f)
                lineToRelative(-1.729f, 15.957f)
                curveToRelative(-0.078f, 0.731f, -0.678f, 1.266f, -1.425f, 1.27f)
                horizontalLineToRelative(-0.008f)
                curveToRelative(-0.743f, 0.0f, -1.344f, -0.527f, -1.43f, -1.257f)
                lineToRelative(-1.72f, -13.812f)
                lineToRelative(-1.294f, 9.845f)
                curveToRelative(-0.09f, 0.688f, -0.643f, 1.192f, -1.346f, 1.228f)
                curveToRelative(-0.7f, 0.033f, -1.307f, -0.415f, -1.464f, -1.093f)
                lineTo(0.026f, 12.227f)
                curveToRelative(-0.126f, -0.538f, 0.209f, -1.075f, 0.747f, -1.2f)
                curveToRelative(0.537f, -0.123f, 1.075f, 0.209f, 1.2f, 0.747f)
                lineToRelative(0.848f, 3.638f)
                lineToRelative(1.47f, -11.184f)
                curveToRelative(0.088f, -0.709f, 0.683f, -1.228f, 1.413f, -1.228f)
                horizontalLineToRelative(0.004f)
                curveToRelative(0.732f, 0.003f, 1.326f, 0.524f, 1.411f, 1.241f)
                lineToRelative(1.681f, 13.504f)
                lineTo(10.584f, 1.287f)
                curveToRelative(0.079f, -0.729f, 0.675f, -1.256f, 1.416f, -1.256f)
                reflectiveCurveToRelative(1.337f, 0.527f, 1.416f, 1.255f)
                lineToRelative(1.784f, 16.459f)
                lineToRelative(1.682f, -13.51f)
                curveToRelative(0.084f, -0.711f, 0.678f, -1.232f, 1.41f, -1.235f)
                horizontalLineToRelative(0.004f)
                curveToRelative(0.73f, 0.0f, 1.325f, 0.519f, 1.414f, 1.233f)
                lineToRelative(1.469f, 11.178f)
                lineToRelative(0.848f, -3.638f)
                curveToRelative(0.125f, -0.538f, 0.664f, -0.878f, 1.2f, -0.747f)
                curveToRelative(0.538f, 0.125f, 0.873f, 0.662f, 0.747f, 1.2f)
                lineToRelative(-1.559f, 6.693f)
                curveToRelative(-0.156f, 0.678f, -0.769f, 1.128f, -1.464f, 1.093f)
                curveToRelative(-0.703f, -0.035f, -1.256f, -0.54f, -1.346f, -1.228f)
                lineToRelative(-1.294f, -9.845f)
                lineToRelative(-1.721f, 13.819f)
                curveToRelative(-0.085f, 0.722f, -0.686f, 1.249f, -1.429f, 1.249f)
                close()
            }
        }
        .build()
        return _waveform!!
    }

private var _waveform: ImageVector? = null
