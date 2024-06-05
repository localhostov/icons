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

public val Icons.Filled.CirclePhoneHangup: ImageVector
    get() {
        if (_circlePhoneHangup != null) {
            return _circlePhoneHangup!!
        }
        _circlePhoneHangup = Builder(name = "CirclePhoneHangup", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(20.0f, 14.0f)
                horizontalLineToRelative(-4.571f)
                verticalLineToRelative(-3.216f)
                curveToRelative(-1.221f, -0.521f, -2.339f, -0.777f, -3.429f, -0.784f)
                curveToRelative(-1.146f, -0.007f, -2.26f, 0.261f, -3.429f, 0.784f)
                verticalLineToRelative(3.216f)
                lineTo(4.0f, 14.0f)
                verticalLineToRelative(-2.455f)
                curveToRelative(0.0f, -0.878f, 0.37f, -1.664f, 0.946f, -2.24f)
                curveToRelative(1.494f, -1.494f, 4.266f, -2.292f, 7.054f, -2.305f)
                curveToRelative(2.731f, -0.012f, 5.478f, 0.728f, 7.055f, 2.305f)
                curveToRelative(0.576f, 0.576f, 0.946f, 1.362f, 0.945f, 2.24f)
                verticalLineToRelative(2.455f)
                close()
            }
        }
        .build()
        return _circlePhoneHangup!!
    }

private var _circlePhoneHangup: ImageVector? = null
