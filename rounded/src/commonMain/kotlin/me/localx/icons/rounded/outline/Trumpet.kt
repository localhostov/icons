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

public val Icons.Outline.Trumpet: ImageVector
    get() {
        if (_trumpet != null) {
            return _trumpet!!
        }
        _trumpet = Builder(name = "Trumpet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.614f, 3.072f)
                curveToRelative(-0.805f, -0.179f, -1.585f, 0.194f, -1.937f, 0.936f)
                curveToRelative(-1.827f, 3.858f, -4.574f, 5.588f, -6.678f, 6.363f)
                verticalLineToRelative(-0.371f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(0.9f)
                curveToRelative(-0.571f, 0.092f, -0.941f, 0.1f, -1.003f, 0.1f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(-0.005f, 0.0f, -0.007f, 0.0f)
                horizontalLineToRelative(-0.989f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(1.0f, 11.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.003f)
                curveToRelative(-0.629f, 0.836f, -1.003f, 1.875f, -1.003f, 3.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                curveToRelative(0.0f, -0.532f, -0.084f, -1.044f, -0.238f, -1.526f)
                curveToRelative(1.736f, 1.016f, 3.608f, 2.733f, 4.987f, 5.634f)
                curveToRelative(0.287f, 0.604f, 0.863f, 0.96f, 1.504f, 0.96f)
                curveToRelative(0.13f, 0.0f, 0.262f, -0.015f, 0.395f, -0.045f)
                curveToRelative(0.796f, -0.18f, 1.352f, -0.871f, 1.352f, -1.681f)
                lineTo(24.0f, 4.791f)
                curveToRelative(0.0f, -0.828f, -0.57f, -1.535f, -1.386f, -1.719f)
                close()
                moveTo(14.0f, 16.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                curveToRelative(0.0f, 0.0f, 4.209f, -0.008f, 4.311f, 0.0f)
                curveToRelative(1.509f, 0.156f, 2.689f, 1.451f, 2.689f, 3.0f)
                close()
                moveTo(22.0f, 18.177f)
                curveToRelative(-1.938f, -3.449f, -4.523f, -5.241f, -6.701f, -6.172f)
                curveToRelative(2.192f, -0.929f, 4.789f, -2.723f, 6.701f, -6.192f)
                verticalLineToRelative(12.364f)
                close()
            }
        }
        .build()
        return _trumpet!!
    }

private var _trumpet: ImageVector? = null
