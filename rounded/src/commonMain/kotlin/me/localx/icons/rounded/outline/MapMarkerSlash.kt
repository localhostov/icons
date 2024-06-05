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

public val Icons.Outline.MapMarkerSlash: ImageVector
    get() {
        if (_mapMarkerSlash != null) {
            return _mapMarkerSlash!!
        }
        _mapMarkerSlash = Builder(name = "MapMarkerSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.635f, 20.321f)
                curveToRelative(0.375f, 0.406f, 0.35f, 1.038f, -0.056f, 1.413f)
                lineToRelative(-0.793f, 0.733f)
                curveToRelative(-1.003f, 0.981f, -2.355f, 1.533f, -3.787f, 1.533f)
                reflectiveCurveToRelative(-2.783f, -0.551f, -3.807f, -1.552f)
                lineToRelative(-3.943f, -3.643f)
                curveTo(1.314f, 15.871f, 0.273f, 11.626f, 1.504f, 7.701f)
                curveToRelative(0.165f, -0.527f, 0.725f, -0.821f, 1.253f, -0.655f)
                curveToRelative(0.527f, 0.165f, 0.82f, 0.726f, 0.655f, 1.253f)
                curveToRelative(-1.007f, 3.212f, -0.155f, 6.686f, 2.224f, 9.064f)
                lineToRelative(3.935f, 3.635f)
                curveToRelative(1.336f, 1.306f, 3.542f, 1.286f, 4.837f, 0.02f)
                lineToRelative(0.813f, -0.752f)
                curveToRelative(0.405f, -0.375f, 1.037f, -0.352f, 1.413f, 0.056f)
                close()
                moveTo(23.707f, 23.707f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.098f, 1.316f, -0.098f, 0.684f, 0.293f, 0.293f)
                reflectiveCurveTo(1.316f, -0.098f, 1.707f, 0.293f)
                lineToRelative(2.725f, 2.725f)
                curveTo(6.483f, 1.07f, 9.159f, 0.0f, 12.0f, 0.0f)
                curveToRelative(2.938f, 0.0f, 5.7f, 1.145f, 7.778f, 3.222f)
                curveToRelative(2.078f, 2.077f, 3.222f, 4.839f, 3.222f, 7.778f)
                curveToRelative(0.0f, 2.84f, -1.069f, 5.516f, -3.018f, 7.568f)
                lineToRelative(3.725f, 3.725f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(5.847f, 4.433f)
                lineToRelative(12.722f, 12.722f)
                curveToRelative(1.561f, -1.653f, 2.431f, -3.837f, 2.431f, -6.154f)
                curveToRelative(0.0f, -2.404f, -0.936f, -4.664f, -2.636f, -6.364f)
                reflectiveCurveToRelative(-3.96f, -2.636f, -6.364f, -2.636f)
                curveToRelative(-2.306f, 0.0f, -4.48f, 0.862f, -6.153f, 2.433f)
                close()
            }
        }
        .build()
        return _mapMarkerSlash!!
    }

private var _mapMarkerSlash: ImageVector? = null
