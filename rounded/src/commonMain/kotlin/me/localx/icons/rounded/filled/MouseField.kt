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

public val Icons.Filled.MouseField: ImageVector
    get() {
        if (_mouseField != null) {
            return _mouseField!!
        }
        _mouseField = Builder(name = "MouseField", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 19.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 20.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.449f, 1.0f, 1.0f, 1.0f)
                lineTo(12.0f, 22.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(3.118f, 24.0f)
                curveToRelative(-1.451f, 0.0f, -2.784f, -0.978f, -3.06f, -2.402f)
                curveToRelative(-0.372f, -1.915f, 1.092f, -3.598f, 2.942f, -3.598f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, -0.079f, 0.076f, -6.266f, 4.974f, -8.866f)
                curveToRelative(0.492f, 0.477f, 1.055f, 0.888f, 1.691f, 1.195f)
                curveToRelative(0.027f, 0.064f, 0.152f, 0.357f, 0.152f, 0.357f)
                curveToRelative(1.308f, 2.622f, 4.133f, 4.315f, 7.197f, 4.315f)
                horizontalLineToRelative(0.985f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(24.0f, 9.188f)
                verticalLineToRelative(2.259f)
                curveToRelative(0.0f, 0.858f, -0.696f, 1.554f, -1.554f, 1.554f)
                horizontalLineToRelative(-4.432f)
                curveToRelative(-2.336f, 0.0f, -4.44f, -1.269f, -5.408f, -3.208f)
                curveToRelative(-0.163f, -0.412f, -0.323f, -0.743f, -0.476f, -1.027f)
                curveToRelative(-1.811f, -0.582f, -3.131f, -2.26f, -3.131f, -4.265f)
                curveToRelative(0.0f, -2.485f, 2.015f, -4.5f, 4.5f, -4.5f)
                curveToRelative(1.978f, 0.0f, 3.638f, 1.284f, 4.242f, 3.057f)
                curveToRelative(0.032f, 0.063f, 0.241f, 0.724f, 0.253f, 0.99f)
                curveToRelative(0.025f, 0.536f, 0.475f, 0.953f, 1.005f, 0.953f)
                curveToRelative(0.612f, 0.007f, 1.019f, -0.495f, 0.993f, -1.046f)
                curveToRelative(-0.028f, -0.598f, -0.142f, -1.171f, -0.324f, -1.712f)
                curveToRelative(0.099f, 0.041f, 0.205f, 0.086f, 0.324f, 0.134f)
                curveToRelative(2.542f, 1.019f, 4.008f, 3.953f, 4.008f, 6.811f)
                close()
                moveTo(22.0f, 8.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _mouseField!!
    }

private var _mouseField: ImageVector? = null
