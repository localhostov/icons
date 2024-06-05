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

public val Icons.Filled.Elephant: ImageVector
    get() {
        if (_elephant != null) {
            return _elephant!!
        }
        _elephant = Builder(name = "Elephant", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.995f, 17.0f)
                verticalLineToRelative(2.899f)
                curveToRelative(0.0f, 0.537f, -0.364f, 1.015f, -0.829f, 1.087f)
                curveToRelative(-0.297f, 0.044f, -0.584f, -0.031f, -0.804f, -0.219f)
                curveToRelative(-0.221f, -0.189f, -0.348f, -0.469f, -0.348f, -0.768f)
                verticalLineToRelative(-10.547f)
                curveToRelative(0.0f, -1.794f, -0.908f, -3.481f, -2.396f, -4.494f)
                curveToRelative(-0.854f, -2.349f, -3.11f, -3.958f, -5.618f, -3.958f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(-3.859f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f)
                curveToRelative(0.0f, -1.068f, 0.247f, -2.077f, 0.677f, -2.984f)
                curveToRelative(-3.158f, 0.169f, -5.677f, 2.784f, -5.677f, 5.984f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(4.99f)
                lineToRelative(0.01f, -4.0f)
                horizontalLineToRelative(6.5f)
                lineToRelative(-0.009f, 4.0f)
                horizontalLineToRelative(4.528f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.995f)
                verticalLineToRelative(0.998f)
                curveToRelative(0.0f, 0.883f, 0.381f, 1.717f, 1.046f, 2.288f)
                curveToRelative(0.542f, 0.464f, 1.23f, 0.713f, 1.941f, 0.713f)
                curveToRelative(0.156f, 0.0f, 0.313f, -0.012f, 0.471f, -0.036f)
                curveToRelative(1.438f, -0.224f, 2.522f, -1.541f, 2.522f, -3.063f)
                verticalLineToRelative(-2.899f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _elephant!!
    }

private var _elephant: ImageVector? = null
