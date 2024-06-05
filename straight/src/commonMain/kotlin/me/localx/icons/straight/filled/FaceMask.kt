package me.localx.icons.straight.filled

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

public val Icons.Filled.FaceMask: ImageVector
    get() {
        if (_faceMask != null) {
            return _faceMask!!
        }
        _faceMask = Builder(name = "FaceMask", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.508f, 12.0f)
                horizontalLineToRelative(12.985f)
                lineToRelative(4.113f, -5.597f)
                curveTo(20.592f, 2.6f, 16.596f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(3.426f, 2.587f, 1.406f, 6.376f)
                lineToRelative(4.102f, 5.624f)
                close()
                moveTo(14.196f, 6.02f)
                curveToRelative(1.494f, 0.299f, 2.99f, 1.07f, 4.447f, 2.295f)
                lineToRelative(-1.287f, 1.531f)
                curveToRelative(-1.196f, -1.006f, -2.392f, -1.633f, -3.553f, -1.865f)
                lineToRelative(0.393f, -1.961f)
                close()
                moveTo(9.803f, 6.02f)
                lineToRelative(0.393f, 1.961f)
                curveToRelative(-1.161f, 0.232f, -2.356f, 0.859f, -3.553f, 1.865f)
                lineToRelative(-1.287f, -1.531f)
                curveToRelative(1.457f, -1.225f, 2.953f, -1.996f, 4.447f, -2.295f)
                close()
                moveTo(18.999f, 14.0f)
                verticalLineToRelative(5.08f)
                curveToRelative(0.0f, 0.937f, -0.423f, 1.801f, -1.16f, 2.371f)
                curveToRelative(-1.227f, 0.951f, -2.749f, 2.549f, -5.84f, 2.549f)
                reflectiveCurveToRelative(-4.613f, -1.598f, -5.841f, -2.55f)
                curveToRelative(-0.736f, -0.569f, -1.159f, -1.434f, -1.159f, -2.37f)
                verticalLineToRelative(-5.08f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(23.454f, 8.625f)
                curveToRelative(0.332f, 1.097f, 0.528f, 2.251f, 0.528f, 3.457f)
                curveToRelative(0.0f, 3.038f, -1.138f, 5.805f, -3.0f, 7.919f)
                lineTo(20.982f, 11.874f)
                lineToRelative(2.472f, -3.25f)
                close()
                moveTo(3.0f, 11.874f)
                verticalLineToRelative(8.126f)
                curveTo(1.138f, 17.886f, 0.0f, 15.119f, 0.0f, 12.081f)
                curveToRelative(0.0f, -1.205f, 0.197f, -2.36f, 0.528f, -3.457f)
                lineToRelative(2.472f, 3.25f)
                close()
            }
        }
        .build()
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
