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

public val Icons.Filled.Lungs: ImageVector
    get() {
        if (_lungs != null) {
            return _lungs!!
        }
        _lungs = Builder(name = "Lungs", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 14.848f)
                verticalLineToRelative(4.152f)
                curveToRelative(0.0f, 1.926f, -1.295f, 3.612f, -3.156f, 4.107f)
                lineToRelative(-2.637f, 0.703f)
                curveToRelative(-0.352f, 0.12f, -0.777f, 0.189f, -1.204f, 0.19f)
                horizontalLineToRelative(-0.006f)
                curveToRelative(-1.049f, 0.0f, -2.078f, -0.428f, -2.826f, -1.176f)
                curveToRelative(-0.755f, -0.753f, -1.17f, -1.757f, -1.17f, -2.827f)
                curveToRelative(0.0f, -1.402f, 0.16f, -2.805f, 0.475f, -4.169f)
                lineToRelative(1.656f, -7.177f)
                curveToRelative(0.628f, -2.723f, 3.053f, -4.651f, 5.847f, -4.651f)
                horizontalLineToRelative(3.022f)
                verticalLineToRelative(6.396f)
                curveToRelative(0.0f, 1.725f, -1.1f, 3.25f, -2.735f, 3.795f)
                lineToRelative(-2.581f, 0.86f)
                curveToRelative(-0.523f, 0.175f, -0.807f, 0.741f, -0.632f, 1.265f)
                curveToRelative(0.14f, 0.419f, 0.529f, 0.684f, 0.948f, 0.684f)
                curveToRelative(0.104f, 0.0f, 0.211f, -0.017f, 0.316f, -0.052f)
                lineToRelative(2.581f, -0.86f)
                curveToRelative(0.8f, -0.267f, 1.503f, -0.702f, 2.103f, -1.241f)
                close()
                moveTo(23.525f, 15.829f)
                lineToRelative(-1.656f, -7.177f)
                curveToRelative(-0.628f, -2.723f, -3.053f, -4.651f, -5.847f, -4.651f)
                horizontalLineToRelative(-3.022f)
                verticalLineToRelative(6.396f)
                curveToRelative(0.0f, 1.725f, 1.1f, 3.25f, 2.735f, 3.795f)
                lineToRelative(2.581f, 0.86f)
                curveToRelative(0.523f, 0.175f, 0.807f, 0.741f, 0.632f, 1.265f)
                curveToRelative(-0.14f, 0.419f, -0.529f, 0.684f, -0.948f, 0.684f)
                curveToRelative(-0.104f, 0.0f, -0.211f, -0.017f, -0.316f, -0.052f)
                lineToRelative(-2.581f, -0.86f)
                curveToRelative(-0.8f, -0.267f, -1.503f, -0.702f, -2.103f, -1.241f)
                verticalLineToRelative(4.155f)
                curveToRelative(0.0f, 1.926f, 1.296f, 3.611f, 3.157f, 4.105f)
                lineToRelative(2.578f, 0.685f)
                curveToRelative(0.412f, 0.138f, 0.872f, 0.234f, 1.269f, 0.208f)
                curveToRelative(1.049f, 0.0f, 2.078f, -0.428f, 2.826f, -1.176f)
                curveToRelative(0.755f, -0.753f, 1.17f, -1.757f, 1.17f, -2.827f)
                curveToRelative(0.0f, -1.402f, -0.16f, -2.805f, -0.475f, -4.169f)
                close()
                moveTo(13.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 1.0f)
                close()
            }
        }
        .build()
        return _lungs!!
    }

private var _lungs: ImageVector? = null
