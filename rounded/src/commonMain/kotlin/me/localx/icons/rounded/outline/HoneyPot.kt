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

public val Icons.Outline.HoneyPot: ImageVector
    get() {
        if (_honeyPot != null) {
            return _honeyPot!!
        }
        _honeyPot = Builder(name = "HoneyPot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.618f, 2.0f)
                horizontalLineToRelative(0.382f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(2.0f, 0.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.382f)
                curveTo(0.907f, 4.278f, 0.0f, 7.184f, 0.0f, 9.905f)
                curveToRelative(0.0f, 4.213f, 2.637f, 9.206f, 3.771f, 11.156f)
                curveToRelative(1.053f, 1.813f, 3.032f, 2.939f, 5.163f, 2.939f)
                horizontalLineToRelative(6.134f)
                curveToRelative(2.131f, 0.0f, 4.109f, -1.126f, 5.163f, -2.938f)
                curveToRelative(1.134f, -1.951f, 3.771f, -6.943f, 3.771f, -11.157f)
                curveToRelative(0.0f, -2.721f, -0.907f, -5.627f, -2.382f, -7.905f)
                close()
                moveTo(18.5f, 20.057f)
                curveToRelative(-0.697f, 1.198f, -2.012f, 1.943f, -3.433f, 1.943f)
                horizontalLineToRelative(-6.134f)
                curveToRelative(-1.421f, 0.0f, -2.736f, -0.745f, -3.433f, -1.944f)
                curveToRelative(-2.191f, -3.771f, -3.5f, -7.565f, -3.5f, -10.151f)
                curveToRelative(0.0f, -2.772f, 1.133f, -5.889f, 2.85f, -7.905f)
                horizontalLineToRelative(0.65f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(9.0f, 3.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.65f)
                curveToRelative(1.717f, 2.016f, 2.85f, 5.132f, 2.85f, 7.905f)
                curveToRelative(0.0f, 2.585f, -1.309f, 6.38f, -3.5f, 10.152f)
                close()
            }
        }
        .build()
        return _honeyPot!!
    }

private var _honeyPot: ImageVector? = null
