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

public val Icons.Outline.Lamp: ImageVector
    get() {
        if (_lamp != null) {
            return _lamp!!
        }
        _lamp = Builder(name = "Lamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.105f, 18.002f)
                curveToRelative(-0.364f, -0.078f, -2.105f, -0.527f, -2.105f, -2.002f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.996f)
                lineToRelative(-2.033f, -12.482f)
                curveToRelative(-0.237f, -1.458f, -1.482f, -2.518f, -2.961f, -2.518f)
                lineTo(4.998f, -0.0f)
                curveToRelative(-1.479f, 0.0f, -2.724f, 1.059f, -2.961f, 2.518f)
                lineTo(0.004f, 15.0f)
                horizontalLineToRelative(10.996f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.827f, -1.536f, 1.993f, -2.0f, 2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.619f, -1.289f, -2.942f, -2.895f, -2.998f)
                close()
                moveTo(4.012f, 2.839f)
                curveToRelative(0.079f, -0.486f, 0.493f, -0.839f, 0.986f, -0.839f)
                horizontalLineToRelative(14.004f)
                curveToRelative(0.493f, 0.0f, 0.907f, 0.353f, 0.986f, 0.839f)
                lineToRelative(1.656f, 10.161f)
                lineTo(2.355f, 13.0f)
                lineToRelative(1.656f, -10.161f)
                close()
                moveTo(15.0f, 22.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                curveToRelative(0.983f, 0.0f, 2.26f, -0.398f, 3.103f, -1.378f)
                curveToRelative(0.841f, 0.823f, 1.979f, 1.239f, 2.733f, 1.365f)
                lineToRelative(0.164f, 0.014f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _lamp!!
    }

private var _lamp: ImageVector? = null
