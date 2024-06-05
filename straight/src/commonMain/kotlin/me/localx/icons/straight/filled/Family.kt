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

public val Icons.Filled.Family: ImageVector
    get() {
        if (_family != null) {
            return _family!!
        }
        _family = Builder(name = "Family", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(18.0f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(23.133f, 20.0f)
                lineToRelative(-1.422f, -11.372f)
                curveToRelative(-0.187f, -1.498f, -1.467f, -2.628f, -2.977f, -2.628f)
                horizontalLineToRelative(-1.469f)
                curveToRelative(-0.337f, 0.0f, -0.663f, 0.057f, -0.968f, 0.161f)
                curveToRelative(0.0f, 0.0f, -0.017f, 0.004f, -0.021f, 0.005f)
                curveToRelative(0.132f, 0.424f, 0.224f, 0.866f, 0.224f, 1.334f)
                curveToRelative(0.0f, 0.874f, -0.257f, 1.681f, -0.69f, 2.368f)
                curveToRelative(1.321f, 0.901f, 2.19f, 2.416f, 2.19f, 4.132f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.133f)
                close()
                moveTo(7.5f, 7.5f)
                curveToRelative(0.0f, -0.494f, 0.099f, -0.96f, 0.246f, -1.405f)
                curveToRelative(-0.007f, -0.002f, -0.013f, -0.004f, -0.02f, -0.006f)
                curveToRelative(-0.233f, -0.058f, -0.476f, -0.089f, -0.726f, -0.089f)
                lineTo(3.0f, 6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.715f, 0.87f, -3.23f, 2.19f, -4.131f)
                curveToRelative(-0.432f, -0.688f, -0.69f, -1.496f, -0.69f, -2.369f)
                close()
            }
        }
        .build()
        return _family!!
    }

private var _family: ImageVector? = null
