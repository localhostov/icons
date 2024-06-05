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

public val Icons.Filled.HoneyPot: ImageVector
    get() {
        if (_honeyPot != null) {
            return _honeyPot!!
        }
        _honeyPot = Builder(name = "HoneyPot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 2.0f)
                lineTo(2.0f, 2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(20.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(15.5f, 4.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                lineTo(1.959f, 4.0f)
                curveToRelative(-1.05f, 1.724f, -1.959f, 3.818f, -1.959f, 5.905f)
                curveToRelative(0.0f, 4.213f, 2.637f, 9.206f, 3.771f, 11.156f)
                curveToRelative(1.053f, 1.813f, 3.032f, 2.939f, 5.163f, 2.939f)
                horizontalLineToRelative(6.134f)
                curveToRelative(2.131f, 0.0f, 4.109f, -1.126f, 5.163f, -2.938f)
                curveToRelative(1.134f, -1.951f, 3.771f, -6.943f, 3.771f, -11.157f)
                curveToRelative(0.0f, -2.087f, -0.909f, -4.181f, -1.959f, -5.905f)
                horizontalLineToRelative(-6.541f)
                close()
            }
        }
        .build()
        return _honeyPot!!
    }

private var _honeyPot: ImageVector? = null
