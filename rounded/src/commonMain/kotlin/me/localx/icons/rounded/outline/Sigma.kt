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

public val Icons.Outline.Sigma: ImageVector
    get() {
        if (_sigma != null) {
            return _sigma!!
        }
        _sigma = Builder(name = "Sigma", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 24.0f)
                horizontalLineTo(4.872f)
                curveToRelative(-1.15f, 0.0f, -2.155f, -0.653f, -2.622f, -1.705f)
                curveToRelative(-0.467f, -1.051f, -0.277f, -2.234f, 0.495f, -3.087f)
                curveToRelative(0.032f, -0.036f, 8.688f, -7.208f, 8.688f, -7.208f)
                curveToRelative(0.0f, 0.0f, -8.655f, -7.172f, -8.688f, -7.208f)
                curveToRelative(-0.772f, -0.853f, -0.962f, -2.036f, -0.495f, -3.087f)
                curveToRelative(0.467f, -1.052f, 1.472f, -1.705f, 2.622f, -1.705f)
                horizontalLineToRelative(13.128f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(4.872f)
                curveToRelative(-0.524f, 0.0f, -0.74f, 0.395f, -0.794f, 0.516f)
                curveToRelative(-0.052f, 0.116f, -0.19f, 0.514f, 0.111f, 0.889f)
                lineToRelative(9.448f, 7.825f)
                curveToRelative(0.229f, 0.19f, 0.362f, 0.472f, 0.362f, 0.77f)
                reflectiveCurveToRelative(-0.133f, 0.58f, -0.362f, 0.77f)
                lineToRelative(-9.448f, 7.825f)
                curveToRelative(-0.302f, 0.375f, -0.163f, 0.773f, -0.111f, 0.889f)
                curveToRelative(0.054f, 0.121f, 0.27f, 0.516f, 0.794f, 0.516f)
                horizontalLineToRelative(13.128f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _sigma!!
    }

private var _sigma: ImageVector? = null
