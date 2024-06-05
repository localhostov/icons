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

public val Icons.Bold.Lips: ImageVector
    get() {
        if (_lips != null) {
            return _lips!!
        }
        _lips = Builder(name = "Lips", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.814f, 11.757f)
                curveToRelative(-2.239f, -4.071f, -5.008f, -7.046f, -6.76f, -8.19f)
                curveToRelative(-1.375f, -0.898f, -3.218f, -0.704f, -4.383f, 0.46f)
                lineToRelative(-0.671f, 0.671f)
                lineToRelative(-0.671f, -0.671f)
                curveToRelative(-1.165f, -1.165f, -3.008f, -1.359f, -4.383f, -0.46f)
                curveTo(4.944f, 4.874f, 2.168f, 8.223f, 0.194f, 11.713f)
                lineToRelative(-0.194f, 0.382f)
                verticalLineToRelative(0.777f)
                lineToRelative(0.183f, 0.336f)
                curveToRelative(0.173f, 0.318f, 4.331f, 7.792f, 11.817f, 7.792f)
                reflectiveCurveToRelative(11.644f, -7.464f, 11.817f, -7.782f)
                lineToRelative(0.183f, -0.356f)
                verticalLineToRelative(-0.768f)
                lineToRelative(-0.186f, -0.337f)
                close()
                moveTo(8.585f, 6.079f)
                curveToRelative(0.197f, -0.129f, 0.453f, -0.099f, 0.622f, 0.07f)
                lineToRelative(2.792f, 2.792f)
                lineToRelative(2.792f, -2.792f)
                curveToRelative(0.169f, -0.169f, 0.426f, -0.198f, 0.622f, -0.07f)
                curveToRelative(1.269f, 0.829f, 3.324f, 3.069f, 5.089f, 5.95f)
                curveToRelative(-2.056f, -0.44f, -5.39f, -1.029f, -8.503f, -1.029f)
                reflectiveCurveToRelative(-6.437f, 0.58f, -8.494f, 1.015f)
                curveToRelative(1.808f, -2.887f, 3.886f, -5.156f, 5.08f, -5.936f)
                close()
                moveTo(11.999f, 18.0f)
                curveToRelative(-4.079f, 0.0f, -7.012f, -3.17f, -8.358f, -4.986f)
                curveToRelative(2.065f, 0.431f, 5.317f, 0.986f, 8.358f, 0.986f)
                reflectiveCurveToRelative(6.305f, -0.556f, 8.369f, -0.986f)
                curveToRelative(-1.335f, 1.813f, -4.259f, 4.986f, -8.369f, 4.986f)
                close()
            }
        }
        .build()
        return _lips!!
    }

private var _lips: ImageVector? = null
