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

public val Icons.Bold.CirclePhoneHangup: ImageVector
    get() {
        if (_circlePhoneHangup != null) {
            return _circlePhoneHangup!!
        }
        _circlePhoneHangup = Builder(name = "CirclePhoneHangup", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.383f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(7.038f, 3.0f, 3.0f, 7.038f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.038f, 9.0f, -9.0f)
                reflectiveCurveTo(16.962f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(16.293f, 13.795f)
                lineToRelative(1.56f, 0.205f)
                curveToRelative(0.605f, 0.0f, 1.095f, -0.49f, 1.095f, -1.095f)
                lineToRelative(0.053f, -1.038f)
                curveToRelative(0.0f, -0.747f, -0.314f, -1.416f, -0.804f, -1.906f)
                curveToRelative(-2.517f, -2.517f, -9.681f, -2.711f, -12.391f, 0.0f)
                curveToRelative(-0.49f, 0.49f, -0.805f, 1.159f, -0.804f, 1.906f)
                lineToRelative(0.053f, 1.038f)
                curveToRelative(0.0f, 0.605f, 0.49f, 1.095f, 1.095f, 1.095f)
                lineToRelative(1.56f, -0.205f)
                curveToRelative(0.605f, 0.0f, 1.095f, -0.49f, 1.095f, -1.095f)
                lineToRelative(0.148f, -1.578f)
                curveToRelative(2.131f, -0.91f, 4.16f, -0.868f, 6.099f, 0.0f)
                lineToRelative(0.148f, 1.578f)
                curveToRelative(0.0f, 0.605f, 0.49f, 1.095f, 1.095f, 1.095f)
                close()
            }
        }
        .build()
        return _circlePhoneHangup!!
    }

private var _circlePhoneHangup: ImageVector? = null
