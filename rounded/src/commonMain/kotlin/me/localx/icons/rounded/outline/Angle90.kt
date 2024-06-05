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

public val Icons.Outline.Angle90: ImageVector
    get() {
        if (_angle90 != null) {
            return _angle90!!
        }
        _angle90 = Builder(name = "Angle90", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(0.0f, 1.0f)
                curveTo(0.0f, 0.447f, 0.448f, 0.0f, 1.0f, 0.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(11.562f, 5.508f)
                curveToRelative(0.941f, 0.458f, 1.84f, 1.02f, 2.67f, 1.669f)
                curveToRelative(0.183f, 0.143f, 0.4f, 0.212f, 0.615f, 0.212f)
                curveToRelative(0.297f, 0.0f, 0.591f, -0.132f, 0.789f, -0.385f)
                curveToRelative(0.34f, -0.435f, 0.263f, -1.063f, -0.172f, -1.403f)
                curveToRelative(-0.941f, -0.735f, -1.959f, -1.371f, -3.026f, -1.892f)
                curveToRelative(-0.499f, -0.241f, -1.096f, -0.035f, -1.337f, 0.461f)
                curveToRelative(-0.242f, 0.497f, -0.036f, 1.096f, 0.461f, 1.338f)
                close()
                moveTo(5.0f, 4.0f)
                curveToRelative(1.106f, 0.0f, 2.211f, 0.121f, 3.283f, 0.359f)
                curveToRelative(0.073f, 0.017f, 0.146f, 0.024f, 0.218f, 0.024f)
                curveToRelative(0.458f, 0.0f, 0.871f, -0.316f, 0.975f, -0.782f)
                curveToRelative(0.12f, -0.539f, -0.22f, -1.074f, -0.759f, -1.193f)
                curveToRelative(-1.214f, -0.271f, -2.465f, -0.408f, -3.717f, -0.408f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(18.493f, 12.438f)
                curveToRelative(0.173f, 0.355f, 0.529f, 0.562f, 0.9f, 0.562f)
                curveToRelative(0.147f, 0.0f, 0.296f, -0.032f, 0.437f, -0.102f)
                curveToRelative(0.497f, -0.241f, 0.703f, -0.84f, 0.461f, -1.337f)
                curveToRelative(-0.521f, -1.068f, -1.157f, -2.086f, -1.892f, -3.026f)
                curveToRelative(-0.34f, -0.435f, -0.97f, -0.511f, -1.404f, -0.172f)
                curveToRelative(-0.435f, 0.34f, -0.512f, 0.969f, -0.172f, 1.404f)
                curveToRelative(0.648f, 0.829f, 1.21f, 1.728f, 1.67f, 2.671f)
                close()
                moveTo(19.64f, 15.717f)
                curveToRelative(0.239f, 1.071f, 0.36f, 2.176f, 0.36f, 3.282f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                curveToRelative(0.0f, -1.253f, -0.137f, -2.504f, -0.408f, -3.718f)
                curveToRelative(-0.12f, -0.539f, -0.657f, -0.877f, -1.194f, -0.758f)
                curveToRelative(-0.539f, 0.12f, -0.878f, 0.654f, -0.758f, 1.193f)
                close()
            }
        }
        .build()
        return _angle90!!
    }

private var _angle90: ImageVector? = null
