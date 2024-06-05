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

public val Icons.Outline.Escalator: ImageVector
    get() {
        if (_escalator != null) {
            return _escalator!!
        }
        _escalator = Builder(name = "Escalator", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-3.634f)
                lineToRelative(-11.603f, 9.817f)
                curveToRelative(-0.9f, 0.763f, -2.048f, 1.183f, -3.229f, 1.183f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(3.634f)
                lineToRelative(1.366f, -1.156f)
                verticalLineToRelative(-5.844f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.628f, 0.0f, 2.957f, 1.304f, 2.998f, 2.923f)
                lineToRelative(3.238f, -2.74f)
                curveToRelative(0.9f, -0.763f, 2.048f, -1.183f, 3.229f, -1.183f)
                horizontalLineToRelative(5.535f)
                close()
                moveTo(7.0f, 13.152f)
                lineToRelative(3.0f, -2.538f)
                verticalLineToRelative(-1.614f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(4.152f)
                close()
                moveTo(22.0f, 7.0f)
                horizontalLineToRelative(-3.535f)
                curveToRelative(-0.708f, 0.0f, -1.396f, 0.252f, -1.937f, 0.709f)
                lineToRelative(-12.162f, 10.291f)
                horizontalLineToRelative(-2.366f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.535f)
                curveToRelative(0.708f, 0.0f, 1.396f, -0.252f, 1.937f, -0.709f)
                lineToRelative(12.162f, -10.291f)
                horizontalLineToRelative(2.366f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _escalator!!
    }

private var _escalator: ImageVector? = null
