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

public val Icons.Bold.Bonus: ImageVector
    get() {
        if (_bonus != null) {
            return _bonus!!
        }
        _bonus = Builder(name = "Bonus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.613f, 9.472f)
                curveToRelative(0.246f, -0.435f, 0.387f, -0.937f, 0.387f, -1.472f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.061f, -0.554f, -1.995f, -1.387f, -2.528f)
                close()
                moveTo(11.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(13.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(23.58f, 18.58f)
                lineToRelative(-3.178f, -3.178f)
                curveToRelative(1.006f, -1.56f, 1.598f, -3.412f, 1.598f, -5.402f)
                curveTo(22.0f, 4.486f, 17.514f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(2.0f, 4.486f, 2.0f, 10.0f)
                curveToRelative(0.0f, 1.99f, 0.591f, 3.842f, 1.598f, 5.402f)
                lineToRelative(-3.178f, 3.178f)
                curveToRelative(-0.897f, 0.897f, -0.262f, 2.431f, 1.007f, 2.431f)
                horizontalLineToRelative(1.562f)
                verticalLineToRelative(1.562f)
                curveToRelative(0.0f, 1.269f, 1.534f, 1.904f, 2.431f, 1.007f)
                lineToRelative(3.944f, -3.944f)
                curveToRelative(0.841f, 0.231f, 1.722f, 0.364f, 2.636f, 0.364f)
                reflectiveCurveToRelative(1.794f, -0.134f, 2.636f, -0.364f)
                lineToRelative(3.944f, 3.944f)
                curveToRelative(0.897f, 0.897f, 2.431f, 0.262f, 2.431f, -1.007f)
                verticalLineToRelative(-1.562f)
                horizontalLineToRelative(1.562f)
                curveToRelative(1.269f, 0.0f, 1.904f, -1.534f, 1.007f, -2.431f)
                close()
                moveTo(5.0f, 10.0f)
                curveToRelative(0.0f, -3.86f, 3.141f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.141f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.14f, -7.0f, -7.0f)
                close()
            }
        }
        .build()
        return _bonus!!
    }

private var _bonus: ImageVector? = null
