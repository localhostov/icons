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

public val Icons.Filled.Scythe: ImageVector
    get() {
        if (_scythe != null) {
            return _scythe!!
        }
        _scythe = Builder(name = "Scythe", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.483f, 1.041f)
                curveToRelative(-0.494f, -0.662f, -1.251f, -1.041f, -2.077f, -1.041f)
                horizontalLineToRelative(-5.561f)
                curveTo(9.722f, 0.0f, 4.516f, 2.496f, 0.372f, 7.419f)
                curveToRelative(-0.462f, 0.548f, -0.498f, 1.312f, -0.091f, 1.902f)
                curveToRelative(0.407f, 0.588f, 1.134f, 0.824f, 1.812f, 0.587f)
                curveToRelative(0.29f, -0.103f, 0.605f, -0.22f, 0.941f, -0.345f)
                curveToRelative(1.768f, -0.66f, 4.189f, -1.563f, 6.709f, -1.563f)
                horizontalLineToRelative(10.674f)
                lineToRelative(-1.487f, 5.0f)
                horizontalLineToRelative(-5.93f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(5.335f)
                lineToRelative(-2.294f, 7.715f)
                curveToRelative(-0.157f, 0.529f, 0.145f, 1.086f, 0.674f, 1.244f)
                curveToRelative(0.096f, 0.028f, 0.191f, 0.042f, 0.285f, 0.042f)
                curveToRelative(0.432f, 0.0f, 0.829f, -0.281f, 0.959f, -0.715f)
                lineTo(23.893f, 3.328f)
                curveToRelative(0.234f, -0.792f, 0.085f, -1.625f, -0.409f, -2.287f)
                close()
            }
        }
        .build()
        return _scythe!!
    }

private var _scythe: ImageVector? = null
