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

public val Icons.Bold.CowbellCirclePlus: ImageVector
    get() {
        if (_cowbellCirclePlus != null) {
            return _cowbellCirclePlus!!
        }
        _cowbellCirclePlus = Builder(name = "CowbellCirclePlus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(22.0f, 19.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(10.0f, 18.0f)
                lineTo(3.816f, 18.0f)
                lineToRelative(1.688f, -8.783f)
                curveToRelative(0.136f, -0.705f, 0.756f, -1.217f, 1.474f, -1.217f)
                horizontalLineToRelative(10.043f)
                curveToRelative(0.718f, 0.0f, 1.338f, 0.512f, 1.474f, 1.217f)
                lineToRelative(0.157f, 0.816f)
                curveToRelative(1.171f, 0.095f, 2.269f, 0.438f, 3.243f, 0.983f)
                lineToRelative(-0.455f, -2.365f)
                curveToRelative(-0.406f, -2.115f, -2.265f, -3.65f, -4.419f, -3.65f)
                horizontalLineToRelative(-0.148f)
                curveToRelative(0.083f, -0.32f, 0.127f, -0.655f, 0.127f, -1.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                curveToRelative(0.0f, 0.345f, 0.044f, 0.68f, 0.127f, 1.0f)
                horizontalLineToRelative(-0.148f)
                curveToRelative(-2.154f, 0.0f, -4.013f, 1.535f, -4.419f, 3.65f)
                lineTo(0.184f, 21.0f)
                horizontalLineToRelative(7.958f)
                curveToRelative(0.447f, 1.721f, 2.0f, 3.0f, 3.858f, 3.0f)
                curveToRelative(0.222f, 0.0f, 0.436f, -0.029f, 0.646f, -0.068f)
                curveToRelative(-1.621f, -1.464f, -2.646f, -3.576f, -2.646f, -5.932f)
                close()
                moveTo(10.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _cowbellCirclePlus!!
    }

private var _cowbellCirclePlus: ImageVector? = null
