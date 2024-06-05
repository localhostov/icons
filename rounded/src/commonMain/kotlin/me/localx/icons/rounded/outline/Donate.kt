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

public val Icons.Outline.Donate: ImageVector
    get() {
        if (_donate != null) {
            return _donate!!
        }
        _donate = Builder(name = "Donate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                curveToRelative(5.514f, 0.0f, 10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(2.0f, 4.486f, 2.0f, 10.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(4.411f, 0.0f, 8.0f, 3.589f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.589f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveTo(4.0f, 14.411f, 4.0f, 10.0f)
                reflectiveCurveTo(7.589f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(24.0f, 20.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(3.5f, 24.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0.0f, -1.094f, 0.522f, -2.139f, 1.396f, -2.797f)
                curveToRelative(0.442f, -0.332f, 1.069f, -0.242f, 1.4f, 0.197f)
                curveToRelative(0.332f, 0.441f, 0.244f, 1.068f, -0.197f, 1.4f)
                curveToRelative(-0.381f, 0.286f, -0.599f, 0.724f, -0.599f, 1.199f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                lineTo(20.5f, 21.999f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.476f, -0.219f, -0.913f, -0.6f, -1.2f)
                curveToRelative(-0.441f, -0.333f, -0.529f, -0.96f, -0.196f, -1.401f)
                curveToRelative(0.331f, -0.439f, 0.959f, -0.529f, 1.4f, -0.196f)
                curveToRelative(0.887f, 0.67f, 1.396f, 1.689f, 1.396f, 2.798f)
                close()
                moveTo(14.0f, 12.0f)
                curveToRelative(0.0f, -0.379f, -0.271f, -0.698f, -0.644f, -0.761f)
                lineToRelative(-3.041f, -0.506f)
                curveToRelative(-1.342f, -0.224f, -2.315f, -1.374f, -2.315f, -2.733f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.268f)
                curveToRelative(1.067f, 0.0f, 2.063f, 0.574f, 2.598f, 1.499f)
                curveToRelative(0.276f, 0.479f, 0.113f, 1.09f, -0.365f, 1.366f)
                curveToRelative(-0.477f, 0.278f, -1.089f, 0.113f, -1.366f, -0.364f)
                curveToRelative(-0.179f, -0.31f, -0.511f, -0.501f, -0.867f, -0.501f)
                horizontalLineToRelative(-2.268f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.379f, 0.271f, 0.698f, 0.644f, 0.761f)
                lineToRelative(3.041f, 0.506f)
                curveToRelative(1.342f, 0.224f, 2.315f, 1.374f, 2.315f, 2.733f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-0.268f)
                curveToRelative(-1.067f, 0.0f, -2.063f, -0.574f, -2.598f, -1.499f)
                curveToRelative(-0.276f, -0.479f, -0.113f, -1.09f, 0.365f, -1.366f)
                curveToRelative(0.476f, -0.278f, 1.089f, -0.113f, 1.366f, 0.364f)
                curveToRelative(0.179f, 0.31f, 0.511f, 0.501f, 0.867f, 0.501f)
                horizontalLineToRelative(2.268f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _donate!!
    }

private var _donate: ImageVector? = null
