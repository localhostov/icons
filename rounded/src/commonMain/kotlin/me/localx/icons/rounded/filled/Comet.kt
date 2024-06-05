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

public val Icons.Filled.Comet: ImageVector
    get() {
        if (_comet != null) {
            return _comet!!
        }
        _comet = Builder(name = "Comet", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 15.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.121f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.121f, 2.5f, 2.5f)
                close()
                moveTo(20.637f, 9.605f)
                curveToRelative(-0.302f, 0.481f, -0.597f, 0.951f, -0.87f, 1.395f)
                horizontalLineToRelative(0.729f)
                curveToRelative(0.916f, 0.0f, 1.758f, 0.5f, 2.196f, 1.304f)
                curveToRelative(0.439f, 0.806f, 0.404f, 1.784f, -0.093f, 2.556f)
                curveToRelative(-2.841f, 4.419f, -8.036f, 9.141f, -14.099f, 9.141f)
                curveToRelative(-2.27f, 0.0f, -4.404f, -0.884f, -6.011f, -2.489f)
                curveToRelative(-1.605f, -1.606f, -2.489f, -3.741f, -2.489f, -6.011f)
                curveTo(0.0f, 9.438f, 4.722f, 4.242f, 9.141f, 1.4f)
                curveToRelative(0.771f, -0.495f, 1.751f, -0.531f, 2.556f, -0.092f)
                curveToRelative(0.804f, 0.438f, 1.304f, 1.28f, 1.304f, 2.196f)
                verticalLineToRelative(0.729f)
                curveToRelative(0.443f, -0.273f, 0.913f, -0.568f, 1.395f, -0.87f)
                curveToRelative(2.076f, -1.301f, 4.224f, -2.646f, 5.516f, -3.152f)
                curveToRelative(1.123f, -0.441f, 2.351f, -0.182f, 3.206f, 0.673f)
                curveToRelative(0.855f, 0.855f, 1.113f, 2.084f, 0.673f, 3.206f)
                curveToRelative(-0.506f, 1.292f, -1.852f, 3.438f, -3.152f, 5.516f)
                close()
                moveTo(13.0f, 15.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.019f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                close()
            }
        }
        .build()
        return _comet!!
    }

private var _comet: ImageVector? = null
