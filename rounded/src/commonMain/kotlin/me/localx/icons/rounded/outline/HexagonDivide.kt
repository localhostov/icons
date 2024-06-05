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

public val Icons.Outline.HexagonDivide: ImageVector
    get() {
        if (_hexagonDivide != null) {
            return _hexagonDivide!!
        }
        _hexagonDivide = Builder(name = "HexagonDivide", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 16.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(12.0f, 9.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(23.396f, 14.364f)
                lineToRelative(-3.282f, 6.0f)
                curveToRelative(-0.889f, 1.625f, -2.609f, 2.636f, -4.49f, 2.636f)
                horizontalLineToRelative(-7.231f)
                curveToRelative(-1.877f, 0.0f, -3.595f, -1.007f, -4.485f, -2.627f)
                lineTo(0.612f, 14.377f)
                curveToRelative(-0.817f, -1.485f, -0.817f, -3.259f, -0.002f, -4.746f)
                lineTo(3.907f, 3.628f)
                curveToRelative(0.892f, -1.621f, 2.61f, -2.628f, 4.487f, -2.628f)
                horizontalLineToRelative(7.229f)
                curveToRelative(1.881f, 0.0f, 3.602f, 1.01f, 4.491f, 2.636f)
                lineToRelative(3.28f, 6.0f)
                curveToRelative(0.81f, 1.48f, 0.81f, 3.248f, 0.0f, 4.728f)
                close()
                moveTo(21.64f, 10.595f)
                lineToRelative(-3.28f, -6.0f)
                curveToRelative(-0.538f, -0.984f, -1.587f, -1.596f, -2.736f, -1.596f)
                horizontalLineToRelative(-7.229f)
                curveToRelative(-1.147f, 0.0f, -2.194f, 0.61f, -2.734f, 1.591f)
                lineToRelative(-3.296f, 6.004f)
                curveToRelative(-0.485f, 0.883f, -0.485f, 1.937f, 0.0f, 2.819f)
                lineToRelative(3.296f, 5.996f)
                curveToRelative(0.539f, 0.981f, 1.586f, 1.59f, 2.732f, 1.59f)
                horizontalLineToRelative(7.231f)
                curveToRelative(1.149f, 0.0f, 2.198f, -0.611f, 2.735f, -1.595f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(3.281f, -6.0f)
                curveToRelative(0.48f, -0.879f, 0.48f, -1.929f, 0.0f, -2.809f)
                close()
                moveTo(16.999f, 11.0f)
                lineTo(7.0f, 11.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _hexagonDivide!!
    }

private var _hexagonDivide: ImageVector? = null
