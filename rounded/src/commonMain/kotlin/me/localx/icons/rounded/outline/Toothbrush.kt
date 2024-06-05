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

public val Icons.Outline.Toothbrush: ImageVector
    get() {
        if (_toothbrush != null) {
            return _toothbrush!!
        }
        _toothbrush = Builder(name = "Toothbrush", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.0f)
                verticalLineToRelative(-0.412f)
                curveToRelative(0.0f, -0.627f, -0.373f, -1.191f, -0.951f, -1.439f)
                curveToRelative(-0.568f, -0.241f, -1.222f, -0.126f, -1.669f, 0.299f)
                curveToRelative(-0.372f, 0.356f, -0.862f, 0.553f, -1.38f, 0.553f)
                lineTo(6.693f, 2.001f)
                curveTo(3.801f, 2.0f, 1.244f, 3.738f, 0.181f, 6.43f)
                curveToRelative(-0.314f, 0.794f, -0.212f, 1.693f, 0.273f, 2.406f)
                curveToRelative(0.495f, 0.729f, 1.315f, 1.164f, 2.194f, 1.164f)
                horizontalLineToRelative(0.352f)
                verticalLineToRelative(8.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(20.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(20.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-9.259f)
                curveToRelative(1.812f, -1.266f, 3.0f, -3.368f, 3.0f, -5.741f)
                close()
                moveTo(2.107f, 7.711f)
                curveToRelative(-0.066f, -0.098f, -0.164f, -0.3f, -0.067f, -0.547f)
                curveToRelative(0.76f, -1.922f, 2.587f, -3.164f, 4.653f, -3.164f)
                horizontalLineToRelative(13.307f)
                curveToRelative(0.703f, 0.0f, 1.381f, -0.182f, 1.978f, -0.521f)
                curveToRelative(-0.242f, 2.533f, -2.381f, 4.521f, -4.976f, 4.521f)
                lineTo(2.648f, 8.0f)
                curveToRelative(-0.311f, 0.0f, -0.481f, -0.202f, -0.541f, -0.289f)
                close()
                moveTo(11.0f, 10.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(5.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(19.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(0.002f)
                curveToRelative(0.694f, 0.0f, 1.365f, -0.102f, 1.998f, -0.291f)
                verticalLineToRelative(8.291f)
                close()
            }
        }
        .build()
        return _toothbrush!!
    }

private var _toothbrush: ImageVector? = null
