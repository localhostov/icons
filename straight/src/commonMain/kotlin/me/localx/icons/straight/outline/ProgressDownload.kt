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

public val Icons.Outline.ProgressDownload: ImageVector
    get() {
        if (_progressDownload != null) {
            return _progressDownload!!
        }
        _progressDownload = Builder(name = "ProgressDownload", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                curveToRelative(-1.167f, 0.0f, -2.32f, -0.167f, -3.428f, -0.497f)
                lineToRelative(0.57f, -1.917f)
                curveToRelative(0.923f, 0.275f, 1.885f, 0.414f, 2.858f, 0.414f)
                curveToRelative(5.514f, 0.0f, 10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                curveToRelative(-0.973f, 0.0f, -1.935f, 0.139f, -2.858f, 0.414f)
                lineToRelative(-0.57f, -1.917f)
                curveToRelative(1.108f, -0.33f, 2.262f, -0.497f, 3.428f, -0.497f)
                curveToRelative(6.617f, 0.0f, 12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(12.002f, 18.0f)
                curveToRelative(0.567f, 0.0f, 1.132f, -0.215f, 1.561f, -0.643f)
                lineToRelative(3.727f, -3.642f)
                lineToRelative(-1.398f, -1.431f)
                lineToRelative(-2.892f, 2.827f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 15.111f)
                lineToRelative(-2.891f, -2.826f)
                lineToRelative(-1.398f, 1.431f)
                lineToRelative(3.718f, 3.634f)
                curveToRelative(0.434f, 0.434f, 1.004f, 0.651f, 1.574f, 0.651f)
                close()
                moveTo(4.409f, 18.511f)
                lineToRelative(-1.518f, 1.303f)
                curveToRelative(0.748f, 0.87f, 1.613f, 1.628f, 2.572f, 2.252f)
                lineToRelative(1.091f, -1.677f)
                curveToRelative(-0.8f, -0.52f, -1.521f, -1.152f, -2.145f, -1.878f)
                close()
                moveTo(0.119f, 13.697f)
                curveToRelative(0.16f, 1.129f, 0.48f, 2.228f, 0.952f, 3.266f)
                lineToRelative(1.82f, -0.827f)
                curveToRelative(-0.393f, -0.864f, -0.659f, -1.779f, -0.792f, -2.719f)
                lineToRelative(-1.98f, 0.28f)
                close()
                moveTo(0.119f, 10.303f)
                lineToRelative(1.98f, 0.28f)
                curveToRelative(0.133f, -0.94f, 0.399f, -1.854f, 0.792f, -2.719f)
                lineToRelative(-1.82f, -0.827f)
                curveToRelative(-0.472f, 1.038f, -0.792f, 2.137f, -0.952f, 3.266f)
                close()
                moveTo(2.902f, 4.175f)
                lineToRelative(1.516f, 1.305f)
                curveToRelative(0.622f, -0.722f, 1.34f, -1.35f, 2.137f, -1.868f)
                lineToRelative(-1.091f, -1.677f)
                curveToRelative(-0.955f, 0.621f, -1.816f, 1.375f, -2.562f, 2.24f)
                close()
            }
        }
        .build()
        return _progressDownload!!
    }

private var _progressDownload: ImageVector? = null
