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

public val Icons.Filled.LightCeiling: ImageVector
    get() {
        if (_lightCeiling != null) {
            return _lightCeiling!!
        }
        _lightCeiling = Builder(name = "LightCeiling", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.763f, 13.411f)
                curveToRelative(-1.6f, -4.58f, -6.025f, -7.985f, -10.763f, -8.411f)
                lineTo(13.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveTo(6.262f, 5.427f, 1.837f, 8.831f, 0.237f, 13.411f)
                curveToRelative(-0.447f, 1.279f, -0.247f, 2.7f, 0.534f, 3.801f)
                curveToRelative(0.785f, 1.106f, 2.014f, 1.741f, 3.371f, 1.741f)
                horizontalLineToRelative(15.715f)
                curveToRelative(1.357f, 0.0f, 2.586f, -0.635f, 3.371f, -1.741f)
                curveToRelative(0.781f, -1.101f, 0.981f, -2.522f, 0.534f, -3.8f)
                close()
                moveTo(15.858f, 21.0f)
                curveToRelative(-0.447f, 1.72f, -1.999f, 3.0f, -3.858f, 3.0f)
                reflectiveCurveToRelative(-3.411f, -1.28f, -3.858f, -3.0f)
                horizontalLineToRelative(7.716f)
                close()
            }
        }
        .build()
        return _lightCeiling!!
    }

private var _lightCeiling: ImageVector? = null
