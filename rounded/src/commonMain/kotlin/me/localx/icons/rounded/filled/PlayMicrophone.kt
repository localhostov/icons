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

public val Icons.Filled.PlayMicrophone: ImageVector
    get() {
        if (_playMicrophone != null) {
            return _playMicrophone!!
        }
        _playMicrophone = Builder(name = "PlayMicrophone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.243f, 24.045f)
                curveToRelative(-0.37f, 0.0f, -0.74f, -0.092f, -1.077f, -0.275f)
                curveToRelative(-0.719f, -0.394f, -1.166f, -1.147f, -1.166f, -1.968f)
                verticalLineToRelative(-6.51f)
                curveToRelative(0.0f, -0.82f, 0.446f, -1.574f, 1.166f, -1.968f)
                curveToRelative(0.719f, -0.394f, 1.596f, -0.364f, 2.287f, 0.079f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(5.08f, 3.255f, 5.08f, 3.255f)
                curveToRelative(0.647f, 0.414f, 1.034f, 1.12f, 1.034f, 1.889f)
                reflectiveCurveToRelative(-0.387f, 1.475f, -1.034f, 1.889f)
                lineToRelative(-5.08f, 3.254f)
                curveToRelative(-0.368f, 0.236f, -0.789f, 0.355f, -1.21f, 0.355f)
                close()
                moveTo(12.0f, 15.292f)
                curveToRelative(0.0f, -1.552f, 0.846f, -2.979f, 2.206f, -3.723f)
                curveToRelative(1.361f, -0.745f, 3.018f, -0.688f, 4.326f, 0.149f)
                lineToRelative(1.468f, 0.941f)
                verticalLineToRelative(-3.66f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.931f)
                curveToRelative(-0.495f, -3.94f, -3.859f, -7.0f, -7.931f, -7.0f)
                reflectiveCurveTo(4.564f, 3.06f, 4.069f, 7.0f)
                horizontalLineToRelative(4.931f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(4.0f, 9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(4.069f, 13.0f)
                curveToRelative(0.495f, 3.94f, 3.859f, 7.0f, 7.931f, 7.0f)
                verticalLineToRelative(-4.708f)
                close()
                moveTo(12.013f, 22.0f)
                horizontalLineToRelative(-1.013f)
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.038f, -9.0f, -9.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                curveToRelative(0.0f, 6.065f, 4.935f, 11.0f, 11.0f, 11.0f)
                horizontalLineToRelative(1.616f)
                curveToRelative(-0.362f, -0.597f, -0.569f, -1.282f, -0.603f, -2.0f)
                close()
                moveTo(23.612f, 14.975f)
                curveToRelative(0.063f, 0.04f, 0.12f, 0.088f, 0.18f, 0.132f)
                curveToRelative(0.133f, -0.682f, 0.207f, -1.386f, 0.207f, -2.106f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.308f, -0.016f, 0.612f, -0.046f, 0.912f)
                lineToRelative(1.659f, 1.063f)
                close()
            }
        }
        .build()
        return _playMicrophone!!
    }

private var _playMicrophone: ImageVector? = null
