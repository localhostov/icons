package me.localx.icons.rounded.bold

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

public val Icons.Bold.Washer: ImageVector
    get() {
        if (_washer != null) {
            return _washer!!
        }
        _washer = Builder(name = "Washer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 8.0f)
                curveToRelative(2.781f, 0.0f, 5.113f, 1.894f, 5.793f, 4.46f)
                curveToRelative(-0.208f, 0.285f, -1.075f, 1.353f, -2.48f, 1.5f)
                curveToRelative(-0.79f, 0.106f, -1.855f, -0.186f, -3.082f, -0.843f)
                curveToRelative(-1.623f, -0.869f, -3.062f, -1.19f, -4.291f, -1.062f)
                curveToRelative(-0.591f, 0.061f, -1.294f, 0.317f, -1.775f, 0.568f)
                curveToRelative(0.623f, -2.649f, 2.996f, -4.623f, 5.835f, -4.623f)
                close()
                moveTo(10.5f, 7.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(23.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.032f, -2.468f, 5.5f, -5.5f, 5.5f)
                lineTo(6.5f, 24.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                lineTo(1.0f, 5.5f)
                curveTo(1.0f, 2.467f, 3.468f, 0.0f, 6.5f, 0.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                close()
                moveTo(20.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                lineTo(6.5f, 3.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.379f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                lineTo(20.0f, 5.5f)
                close()
                moveTo(15.578f, 15.943f)
                curveToRelative(-1.222f, 0.183f, -2.669f, -0.194f, -4.292f, -1.063f)
                curveToRelative(-1.227f, -0.657f, -2.291f, -0.943f, -3.082f, -0.843f)
                curveToRelative(-0.874f, 0.111f, -1.687f, 0.675f, -2.097f, 1.077f)
                curveToRelative(0.523f, 2.78f, 2.96f, 4.885f, 5.892f, 4.885f)
                curveToRelative(2.956f, 0.0f, 5.406f, -2.139f, 5.903f, -4.952f)
                curveToRelative(-0.587f, 0.393f, -1.426f, 0.761f, -2.325f, 0.895f)
                close()
                moveTo(8.0f, 5.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _washer!!
    }

private var _washer: ImageVector? = null
