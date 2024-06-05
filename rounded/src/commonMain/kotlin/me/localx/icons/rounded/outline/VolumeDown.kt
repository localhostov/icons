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

public val Icons.Outline.VolumeDown: ImageVector
    get() {
        if (_volumeDown != null) {
            return _volumeDown!!
        }
        _volumeDown = Builder(name = "VolumeDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.644f, 0.418f)
                curveToRelative(-0.229f, -0.19f, -0.527f, -0.268f, -0.821f, -0.215f)
                curveToRelative(-3.001f, 0.555f, -5.754f, 2.302f, -7.554f, 4.794f)
                horizontalLineToRelative(-1.271f)
                curveTo(2.241f, 4.998f, -0.002f, 7.241f, -0.002f, 9.998f)
                verticalLineToRelative(4.005f)
                curveTo(-0.002f, 16.76f, 2.241f, 19.003f, 4.998f, 19.003f)
                horizontalLineToRelative(1.271f)
                curveToRelative(1.802f, 2.495f, 4.555f, 4.243f, 7.554f, 4.794f)
                curveToRelative(0.06f, 0.011f, 0.121f, 0.017f, 0.181f, 0.017f)
                curveToRelative(0.232f, 0.0f, 0.459f, -0.081f, 0.64f, -0.231f)
                curveToRelative(0.228f, -0.19f, 0.36f, -0.472f, 0.36f, -0.769f)
                lineTo(15.004f, 1.187f)
                curveToRelative(0.0f, -0.297f, -0.131f, -0.579f, -0.36f, -0.769f)
                close()
                moveTo(13.004f, 21.535f)
                curveToRelative(-2.03f, -0.646f, -3.851f, -1.954f, -5.113f, -3.703f)
                lineToRelative(-0.299f, -0.415f)
                curveToRelative(-0.188f, -0.26f, -0.489f, -0.415f, -0.811f, -0.415f)
                horizontalLineToRelative(-1.782f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-4.005f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(1.782f)
                curveToRelative(0.321f, 0.0f, 0.623f, -0.154f, 0.811f, -0.415f)
                lineToRelative(0.299f, -0.415f)
                curveToRelative(1.261f, -1.747f, 3.083f, -3.054f, 5.114f, -3.702f)
                verticalLineToRelative(19.068f)
                close()
                moveTo(18.023f, 16.772f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                curveToRelative(1.852f, -1.852f, 1.852f, -4.866f, 0.0f, -6.718f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                curveToRelative(2.632f, 2.632f, 2.632f, 6.914f, 0.0f, 9.546f)
                close()
            }
        }
        .build()
        return _volumeDown!!
    }

private var _volumeDown: ImageVector? = null
