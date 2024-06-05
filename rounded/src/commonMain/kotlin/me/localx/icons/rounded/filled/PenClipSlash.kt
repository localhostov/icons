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

public val Icons.Filled.PenClipSlash: ImageVector
    get() {
        if (_penClipSlash != null) {
            return _penClipSlash!!
        }
        _penClipSlash = Builder(name = "PenClipSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 22.293f)
                lineToRelative(-8.885f, -8.885f)
                lineToRelative(5.418f, -5.455f)
                reflectiveCurveToRelative(-3.774f, -3.754f, -3.81f, -3.76f)
                curveToRelative(-0.898f, -0.753f, -2.007f, -1.183f, -3.193f, -1.183f)
                curveToRelative(-1.336f, 0.0f, -2.591f, 0.52f, -3.536f, 1.465f)
                lineToRelative(-1.907f, 1.907f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineToRelative(22.0f, 22.0f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(11.116f, 5.888f)
                curveToRelative(0.855f, -0.855f, 2.187f, -1.064f, 3.278f, -0.629f)
                lineToRelative(-3.851f, 3.869f)
                lineToRelative(-1.334f, -1.334f)
                lineToRelative(1.907f, -1.907f)
                close()
                moveTo(21.655f, 6.539f)
                lineToRelative(-4.269f, -4.269f)
                lineToRelative(1.329f, -1.327f)
                curveToRelative(1.133f, -1.133f, 2.947f, -1.262f, 4.129f, -0.296f)
                curveToRelative(0.663f, 0.542f, 1.067f, 1.341f, 1.11f, 2.191f)
                curveToRelative(0.042f, 0.851f, -0.279f, 1.684f, -0.881f, 2.286f)
                lineToRelative(-1.417f, 1.415f)
                close()
                moveTo(7.75f, 11.933f)
                lineToRelative(4.282f, 4.282f)
                lineToRelative(-5.857f, 5.897f)
                curveToRelative(-0.935f, 0.934f, -2.323f, 1.118f, -3.451f, 0.577f)
                lineToRelative(-1.017f, 1.017f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(1.017f, -1.017f)
                curveToRelative(-0.542f, -1.13f, -0.356f, -2.522f, 0.582f, -3.456f)
                lineToRelative(5.858f, -5.886f)
                close()
            }
        }
        .build()
        return _penClipSlash!!
    }

private var _penClipSlash: ImageVector? = null
