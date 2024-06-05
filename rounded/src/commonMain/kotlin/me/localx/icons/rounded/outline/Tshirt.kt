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

public val Icons.Outline.Tshirt: ImageVector
    get() {
        if (_tshirt != null) {
            return _tshirt!!
        }
        _tshirt = Builder(name = "Tshirt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.815f, 1.195f)
                curveToRelative(-1.477f, -0.793f, -3.032f, -1.195f, -4.625f, -1.195f)
                lineTo(7.81f, 0.0f)
                curveToRelative(-1.592f, 0.0f, -3.148f, 0.402f, -4.625f, 1.195f)
                curveTo(1.221f, 2.25f, 0.0f, 4.335f, 0.0f, 6.636f)
                verticalLineToRelative(2.388f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.976f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-2.364f)
                curveToRelative(0.0f, -2.301f, -1.221f, -4.386f, -3.185f, -5.44f)
                close()
                moveTo(14.894f, 2.0f)
                curveToRelative(-0.455f, 1.194f, -1.587f, 2.0f, -2.893f, 2.0f)
                reflectiveCurveToRelative(-2.438f, -0.806f, -2.893f, -2.0f)
                horizontalLineToRelative(5.787f)
                close()
                moveTo(22.001f, 9.0f)
                curveToRelative(0.0f, 0.551f, -0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(6.001f, 7.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(3.024f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-2.388f)
                curveToRelative(0.0f, -1.563f, 0.817f, -2.973f, 2.131f, -3.679f)
                curveToRelative(0.937f, -0.503f, 1.908f, -0.801f, 2.897f, -0.907f)
                curveToRelative(0.544f, 2.326f, 2.588f, 3.95f, 4.972f, 3.95f)
                reflectiveCurveToRelative(4.428f, -1.624f, 4.972f, -3.95f)
                curveToRelative(0.988f, 0.106f, 1.96f, 0.404f, 2.897f, 0.907f)
                curveToRelative(1.314f, 0.706f, 2.131f, 2.116f, 2.131f, 3.679f)
                verticalLineToRelative(2.364f)
                close()
            }
        }
        .build()
        return _tshirt!!
    }

private var _tshirt: ImageVector? = null
