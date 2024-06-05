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

public val Icons.Bold.CircleC: ImageVector
    get() {
        if (_circleC != null) {
            return _circleC!!
        }
        _circleC = Builder(name = "CircleC", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.038f, -9.0f, -9.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(9.75f, 10.932f)
                verticalLineToRelative(2.137f)
                curveToRelative(0.0f, 1.223f, 0.941f, 2.182f, 2.144f, 2.182f)
                horizontalLineToRelative(0.409f)
                curveToRelative(0.535f, 0.0f, 1.051f, -0.196f, 1.45f, -0.551f)
                curveToRelative(0.618f, -0.553f, 1.567f, -0.496f, 2.117f, 0.123f)
                curveToRelative(0.551f, 0.619f, 0.496f, 1.567f, -0.123f, 2.118f)
                curveToRelative(-0.949f, 0.846f, -2.172f, 1.311f, -3.444f, 1.311f)
                horizontalLineToRelative(-0.409f)
                curveToRelative(-2.836f, 0.0f, -5.144f, -2.325f, -5.144f, -5.182f)
                verticalLineToRelative(-2.137f)
                curveToRelative(0.0f, -2.857f, 2.308f, -5.182f, 5.144f, -5.182f)
                horizontalLineToRelative(0.409f)
                curveToRelative(1.324f, 0.0f, 2.585f, 0.5f, 3.55f, 1.407f)
                curveToRelative(0.604f, 0.567f, 0.633f, 1.517f, 0.065f, 2.12f)
                curveToRelative(-0.567f, 0.604f, -1.517f, 0.632f, -2.12f, 0.065f)
                curveToRelative(-0.406f, -0.382f, -0.938f, -0.592f, -1.495f, -0.592f)
                horizontalLineToRelative(-0.409f)
                curveToRelative(-1.202f, 0.0f, -2.144f, 0.958f, -2.144f, 2.182f)
                close()
            }
        }
        .build()
        return _circleC!!
    }

private var _circleC: ImageVector? = null
