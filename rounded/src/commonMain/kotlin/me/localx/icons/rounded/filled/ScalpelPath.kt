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

public val Icons.Filled.ScalpelPath: ImageVector
    get() {
        if (_scalpelPath != null) {
            return _scalpelPath!!
        }
        _scalpelPath = Builder(name = "ScalpelPath", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 24.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(12.0f, 23.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                close()
                moveTo(24.0f, 23.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                close()
                moveTo(23.182f, 0.791f)
                curveToRelative(-1.055f, -1.056f, -2.902f, -1.053f, -3.951f, -0.004f)
                lineToRelative(-9.127f, 9.037f)
                lineToRelative(4.03f, 3.957f)
                lineToRelative(9.048f, -9.034f)
                curveToRelative(0.528f, -0.528f, 0.819f, -1.23f, 0.819f, -1.978f)
                reflectiveCurveToRelative(-0.291f, -1.45f, -0.818f, -1.978f)
                close()
                moveTo(12.662f, 15.138f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.73f, 2.495f, -2.724f, 4.695f, -5.106f, 5.748f)
                curveToRelative(-1.497f, 0.661f, -3.083f, 1.03f, -4.715f, 1.096f)
                curveToRelative(-0.215f, 0.009f, -0.586f, 0.0f, -1.007f, 0.0f)
                curveToRelative(-0.773f, 0.0f, -1.213f, -0.324f, -1.446f, -0.596f)
                curveToRelative(-0.357f, -0.417f, -0.426f, -0.946f, -0.371f, -1.302f)
                curveToRelative(0.033f, -0.211f, 0.133f, -0.406f, 0.285f, -0.558f)
                lineToRelative(8.38f, -8.297f)
                lineToRelative(3.979f, 3.908f)
                close()
            }
        }
        .build()
        return _scalpelPath!!
    }

private var _scalpelPath: ImageVector? = null
