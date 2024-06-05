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

public val Icons.Filled.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) {
            return _microphoneSlash!!
        }
        _microphoneSlash = Builder(name = "MicrophoneSlash", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.154f, 19.74f)
                curveToRelative(1.833f, -2.165f, 2.846f, -4.883f, 2.846f, -7.74f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                curveToRelative(0.0f, 2.324f, -0.804f, 4.54f, -2.263f, 6.323f)
                lineToRelative(-1.421f, -1.421f)
                curveToRelative(0.883f, -1.134f, 1.422f, -2.477f, 1.601f, -3.902f)
                horizontalLineToRelative(-3.917f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.931f)
                curveToRelative(-0.495f, -3.94f, -3.859f, -7.0f, -7.931f, -7.0f)
                curveToRelative(-2.819f, 0.0f, -5.355f, 1.456f, -6.795f, 3.791f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineToRelative(22.0f, 22.0f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(-2.553f, -2.553f)
                close()
                moveTo(16.172f, 21.092f)
                curveToRelative(-1.312f, 0.603f, -2.715f, 0.909f, -4.171f, 0.909f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                curveToRelative(0.0f, 6.617f, 5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(1.747f, 0.0f, 3.431f, -0.367f, 5.006f, -1.091f)
                curveToRelative(0.502f, -0.231f, 0.722f, -0.825f, 0.491f, -1.326f)
                curveToRelative(-0.23f, -0.502f, -0.825f, -0.723f, -1.326f, -0.491f)
                close()
                moveTo(15.125f, 19.367f)
                curveToRelative(-0.96f, 0.408f, -2.016f, 0.634f, -3.124f, 0.634f)
                curveToRelative(-4.418f, 0.0f, -8.0f, -3.582f, -8.0f, -8.0f)
                verticalLineToRelative(-3.758f)
                lineToRelative(11.124f, 11.124f)
                close()
            }
        }
        .build()
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
