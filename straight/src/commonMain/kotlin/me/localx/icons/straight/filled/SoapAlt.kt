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

public val Icons.Filled.SoapAlt: ImageVector
    get() {
        if (_soapAlt != null) {
            return _soapAlt!!
        }
        _soapAlt = Builder(name = "SoapAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(22.5f, 3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(17.0f, 3.0f)
                curveToRelative(-2.209f, 0.0f, -4.0f, 1.791f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.791f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.791f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.791f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(24.0f, 15.562f)
                verticalLineToRelative(1.875f)
                curveToRelative(0.0f, 3.624f, -2.938f, 6.562f, -6.562f, 6.562f)
                lineTo(6.562f, 23.999f)
                curveToRelative(-3.624f, 0.0f, -6.562f, -2.938f, -6.562f, -6.562f)
                verticalLineToRelative(-1.875f)
                curveToRelative(0.0f, -3.624f, 2.938f, -6.562f, 6.562f, -6.562f)
                horizontalLineToRelative(4.786f)
                curveToRelative(0.825f, 2.329f, 3.04f, 4.0f, 5.651f, 4.0f)
                curveToRelative(1.945f, 0.0f, 3.668f, -0.929f, 4.764f, -2.363f)
                curveToRelative(1.368f, 1.203f, 2.236f, 2.961f, 2.236f, 4.926f)
                close()
                moveTo(13.0f, 13.0f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _soapAlt!!
    }

private var _soapAlt: ImageVector? = null
