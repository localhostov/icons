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

public val Icons.Filled.FireBurner: ImageVector
    get() {
        if (_fireBurner != null) {
            return _fireBurner!!
        }
        _fireBurner = Builder(name = "FireBurner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 19.0f)
                verticalLineToRelative(5.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(0.763f)
                curveToRelative(0.651f, 0.811f, 1.454f, 1.492f, 2.369f, 2.0f)
                horizontalLineToRelative(-3.132f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.132f)
                curveToRelative(0.915f, -0.508f, 1.718f, -1.189f, 2.369f, -2.0f)
                horizontalLineToRelative(0.763f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(6.0f, 8.0f)
                curveToRelative(0.0f, -1.725f, 1.0f, -3.06f, 1.995f, -4.087f)
                curveToRelative(0.0f, 0.0f, 0.681f, 2.087f, 1.287f, 2.087f)
                curveToRelative(1.263f, 0.0f, 0.897f, -3.898f, 2.718f, -6.0f)
                curveToRelative(1.895f, 1.895f, 6.0f, 4.526f, 6.0f, 8.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                close()
                moveTo(10.585f, 11.414f)
                curveToRelative(0.781f, 0.781f, 2.048f, 0.781f, 2.829f, 0.0f)
                reflectiveCurveToRelative(0.781f, -2.048f, 0.0f, -2.829f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-1.415f, -1.415f)
                lineToRelative(-1.415f, 1.415f)
                curveToRelative(-0.781f, 0.781f, -0.781f, 2.048f, 0.0f, 2.829f)
                close()
            }
        }
        .build()
        return _fireBurner!!
    }

private var _fireBurner: ImageVector? = null
