package me.localx.icons.straight.bold

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

public val Icons.Bold.Comet: ImageVector
    get() {
        if (_comet != null) {
            return _comet!!
        }
        _comet = Builder(name = "Comet", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.495f, 24.0f)
                curveToRelative(-2.27f, 0.0f, -4.402f, -0.884f, -6.007f, -2.488f)
                reflectiveCurveTo(0.0f, 17.774f, 0.0f, 15.505f)
                curveTo(0.0f, 8.43f, 6.177f, 4.444f, 10.687f, 1.534f)
                lineTo(13.0f, 0.042f)
                lineTo(13.0f, 4.146f)
                curveTo(17.231f, 2.047f, 21.09f, 0.918f, 21.279f, 0.863f)
                lineTo(23.895f, 0.105f)
                lineToRelative(-0.758f, 2.615f)
                curveToRelative(-0.055f, 0.189f, -1.184f, 4.048f, -3.283f, 8.279f)
                horizontalLineToRelative(4.157f)
                lineToRelative(-1.493f, 2.313f)
                curveToRelative(-2.747f, 4.256f, -6.897f, 10.687f, -14.022f, 10.687f)
                close()
                moveTo(10.0f, 5.594f)
                curveToRelative(-3.998f, 2.774f, -7.0f, 5.667f, -7.0f, 9.911f)
                curveToRelative(0.0f, 1.468f, 0.571f, 2.848f, 1.609f, 3.886f)
                reflectiveCurveToRelative(2.418f, 1.609f, 3.886f, 1.609f)
                curveToRelative(4.255f, 0.0f, 7.237f, -3.103f, 9.958f, -7.0f)
                horizontalLineToRelative(-3.684f)
                lineToRelative(1.285f, -2.245f)
                curveToRelative(1.437f, -2.511f, 2.533f, -5.141f, 3.245f, -7.054f)
                curveToRelative(-1.916f, 0.713f, -4.549f, 1.811f, -7.055f, 3.244f)
                lineToRelative(-2.245f, 1.285f)
                verticalLineToRelative(-3.637f)
                close()
                moveTo(9.0f, 18.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _comet!!
    }

private var _comet: ImageVector? = null
