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

public val Icons.Filled.HoldingHandGear: ImageVector
    get() {
        if (_holdingHandGear != null) {
            return _holdingHandGear!!
        }
        _holdingHandGear = Builder(name = "HoldingHandGear", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.15f, 8.681f)
                curveToRelative(-0.515f, -0.469f, -1.186f, -0.712f, -1.878f, -0.678f)
                curveToRelative(-0.697f, 0.032f, -1.339f, 0.334f, -1.794f, 0.835f)
                lineToRelative(-3.541f, 3.737f)
                curveToRelative(0.032f, 0.21f, 0.065f, 0.42f, 0.065f, 0.638f)
                curveToRelative(0.0f, 2.083f, -1.555f, 3.876f, -3.617f, 4.17f)
                lineToRelative(-4.241f, 0.606f)
                lineToRelative(-0.283f, -1.979f)
                lineToRelative(4.241f, -0.606f)
                curveToRelative(1.084f, -0.155f, 1.9f, -1.097f, 1.9f, -2.191f)
                curveToRelative(0.0f, -1.22f, -0.993f, -2.213f, -2.213f, -2.213f)
                horizontalLineToRelative(-2.789f)
                verticalLineToRelative(-1.642f)
                curveToRelative(0.713f, -0.185f, 1.352f, -0.551f, 1.853f, -1.062f)
                lineToRelative(1.414f, 0.815f)
                lineToRelative(0.998f, -1.732f)
                lineToRelative(-1.425f, -0.821f)
                curveToRelative(0.094f, -0.339f, 0.16f, -0.689f, 0.16f, -1.058f)
                reflectiveCurveToRelative(-0.066f, -0.719f, -0.16f, -1.058f)
                lineToRelative(1.425f, -0.821f)
                lineToRelative(-0.998f, -1.732f)
                lineToRelative(-1.414f, 0.815f)
                curveToRelative(-0.501f, -0.511f, -1.14f, -0.876f, -1.853f, -1.062f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(1.642f)
                curveToRelative(-0.713f, 0.185f, -1.352f, 0.551f, -1.853f, 1.062f)
                lineToRelative(-1.414f, -0.815f)
                lineToRelative(-0.998f, 1.732f)
                lineToRelative(1.425f, 0.821f)
                curveToRelative(-0.094f, 0.339f, -0.16f, 0.689f, -0.16f, 1.058f)
                reflectiveCurveToRelative(0.066f, 0.719f, 0.16f, 1.058f)
                lineToRelative(-1.425f, 0.821f)
                lineToRelative(0.998f, 1.732f)
                lineToRelative(1.414f, -0.815f)
                curveToRelative(0.501f, 0.511f, 1.14f, 0.876f, 1.853f, 1.062f)
                verticalLineToRelative(1.642f)
                horizontalLineTo(3.002f)
                curveTo(1.347f, 11.0f, 0.002f, 12.346f, 0.002f, 14.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(12.665f)
                lineToRelative(10.674f, -11.655f)
                curveToRelative(0.948f, -1.062f, 0.862f, -2.707f, -0.189f, -3.665f)
                close()
                moveTo(6.0f, 5.5f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _holdingHandGear!!
    }

private var _holdingHandGear: ImageVector? = null
