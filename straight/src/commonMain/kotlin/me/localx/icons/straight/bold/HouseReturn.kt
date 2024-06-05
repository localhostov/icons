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

public val Icons.Bold.HouseReturn: ImageVector
    get() {
        if (_houseReturn != null) {
            return _houseReturn!!
        }
        _houseReturn = Builder(name = "HouseReturn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(3.0f, 14.0f)
                verticalLineToRelative(-6.515f)
                curveToRelative(0.0f, -0.258f, 0.117f, -0.498f, 0.32f, -0.657f)
                lineToRelative(4.667f, -3.651f)
                curveToRelative(0.302f, -0.237f, 0.725f, -0.237f, 1.027f, 0.0f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(2.986f, 2.337f, 2.986f, 2.337f)
                verticalLineToRelative(-3.014f)
                curveToRelative(0.0f, -0.254f, 0.021f, -0.504f, 0.062f, -0.747f)
                lineToRelative(-1.2f, -0.939f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-1.391f, -1.088f, -3.333f, -1.087f, -4.724f, 0.0f)
                lineTo(1.471f, 4.466f)
                curveToRelative(-0.935f, 0.731f, -1.471f, 1.832f, -1.471f, 3.019f)
                verticalLineToRelative(9.515f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-1.028f)
                lineToRelative(-1.222f, -1.972f)
                lineTo(3.0f, 14.0f)
                close()
                moveTo(19.262f, 6.352f)
                reflectiveCurveToRelative(-0.6f, -0.352f, -1.436f, -0.352f)
                curveToRelative(-1.39f, 0.0f, -2.662f, 0.982f, -3.107f, 2.412f)
                lineToRelative(-0.489f, 1.611f)
                lineToRelative(-4.02f, 2.491f)
                lineToRelative(1.58f, 2.55f)
                lineToRelative(3.21f, -1.989f)
                verticalLineToRelative(2.045f)
                lineToRelative(-3.0f, 2.1f)
                verticalLineToRelative(6.781f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.219f)
                lineToRelative(3.507f, -2.455f)
                curveToRelative(0.935f, -0.654f, 1.493f, -1.727f, 1.493f, -2.868f)
                verticalLineToRelative(-3.19f)
                lineToRelative(1.0f, 0.589f)
                verticalLineToRelative(3.143f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.857f)
                lineToRelative(-4.738f, -2.791f)
                close()
                moveTo(19.576f, 17.986f)
                lineToRelative(-1.841f, 1.304f)
                lineToRelative(1.932f, 4.711f)
                horizontalLineToRelative(3.242f)
                lineToRelative(-2.673f, -6.517f)
                curveToRelative(-0.204f, 0.182f, -0.425f, 0.351f, -0.661f, 0.503f)
                close()
                moveTo(5.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _houseReturn!!
    }

private var _houseReturn: ImageVector? = null
