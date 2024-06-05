package me.localx.icons.straight.outline

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

public val Icons.Outline.Mosque: ImageVector
    get() {
        if (_mosque != null) {
            return _mosque!!
        }
        _mosque = Builder(name = "Mosque", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 9.735f)
                curveToRelative(0.0f, -3.876f, -3.331f, -5.559f, -5.764f, -6.787f)
                curveToRelative(-0.41f, -0.207f, -1.064f, -0.539f, -1.561f, -0.847f)
                curveToRelative(0.0f, 0.0f, -0.676f, -0.308f, -0.676f, -2.101f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.851f, -0.726f, 2.132f, -0.726f, 2.132f)
                curveToRelative(-0.49f, 0.3f, -1.115f, 0.617f, -1.51f, 0.816f)
                curveToRelative(-1.244f, 0.628f, -2.72f, 1.377f, -3.868f, 2.474f)
                curveTo(7.373f, 2.927f, 4.947f, 0.834f, 4.641f, 0.578f)
                lineTo(4.0f, 0.044f)
                lineToRelative(-0.641f, 0.534f)
                curveToRelative(-0.344f, 0.287f, -3.359f, 2.883f, -3.359f, 5.768f)
                verticalLineToRelative(17.654f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                curveToRelative(0.579f, 0.0f, 1.0f, 0.469f, 1.0f, 1.115f)
                verticalLineToRelative(3.885f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(-1.175f)
                curveToRelative(0.752f, -1.046f, 1.175f, -2.18f, 1.175f, -3.265f)
                close()
                moveTo(6.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(6.0f, 8.0f)
                lineTo(2.0f, 8.0f)
                verticalLineToRelative(-1.654f)
                curveToRelative(0.0f, -1.283f, 1.143f, -2.748f, 2.0f, -3.629f)
                curveToRelative(0.857f, 0.882f, 2.0f, 2.347f, 2.0f, 3.629f)
                verticalLineToRelative(1.654f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-0.771f, 0.0f, -1.474f, 0.292f, -2.005f, 0.77f)
                curveToRelative(-0.526f, -0.481f, -1.223f, -0.77f, -1.995f, -0.77f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(20.111f, 13.0f)
                horizontalLineToRelative(-10.222f)
                curveToRelative(-1.17f, -0.998f, -1.89f, -2.222f, -1.89f, -3.265f)
                curveToRelative(0.0f, -2.646f, 2.479f, -3.897f, 4.665f, -5.001f)
                curveToRelative(0.869f, -0.439f, 1.713f, -0.865f, 2.335f, -1.381f)
                curveToRelative(0.622f, 0.516f, 1.466f, 0.942f, 2.335f, 1.381f)
                curveToRelative(2.187f, 1.104f, 4.665f, 2.355f, 4.665f, 5.001f)
                curveToRelative(0.0f, 1.045f, -0.718f, 2.266f, -1.889f, 3.265f)
                close()
            }
        }
        .build()
        return _mosque!!
    }

private var _mosque: ImageVector? = null
