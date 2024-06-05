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

public val Icons.Outline.LightCeiling: ImageVector
    get() {
        if (_lightCeiling != null) {
            return _lightCeiling!!
        }
        _lightCeiling = Builder(name = "LightCeiling", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.763f, 14.458f)
                curveToRelative(-1.6f, -4.58f, -6.025f, -7.985f, -10.763f, -8.411f)
                lineTo(13.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(5.047f)
                curveTo(6.262f, 6.474f, 1.837f, 9.878f, 0.237f, 14.458f)
                curveToRelative(-0.447f, 1.279f, -0.247f, 2.7f, 0.534f, 3.801f)
                curveToRelative(0.785f, 1.106f, 2.014f, 1.741f, 3.371f, 1.741f)
                horizontalLineToRelative(3.857f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                horizontalLineToRelative(3.857f)
                curveToRelative(1.357f, 0.0f, 2.586f, -0.635f, 3.371f, -1.741f)
                curveToRelative(0.781f, -1.101f, 0.981f, -2.522f, 0.534f, -3.8f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(21.598f, 17.102f)
                curveToRelative(-0.405f, 0.571f, -1.04f, 0.898f, -1.74f, 0.898f)
                lineTo(4.143f, 18.0f)
                curveToRelative(-0.7f, 0.0f, -1.335f, -0.328f, -1.74f, -0.898f)
                curveToRelative(-0.413f, -0.583f, -0.514f, -1.305f, -0.276f, -1.984f)
                curveToRelative(1.44f, -4.124f, 5.593f, -7.118f, 9.874f, -7.118f)
                reflectiveCurveToRelative(8.434f, 2.994f, 9.874f, 7.118f)
                curveToRelative(0.237f, 0.678f, 0.137f, 1.401f, -0.276f, 1.983f)
                close()
            }
        }
        .build()
        return _lightCeiling!!
    }

private var _lightCeiling: ImageVector? = null
