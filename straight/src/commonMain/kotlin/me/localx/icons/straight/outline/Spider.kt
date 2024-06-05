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

public val Icons.Outline.Spider: ImageVector
    get() {
        if (_spider != null) {
            return _spider!!
        }
        _spider = Builder(name = "Spider", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.423f)
                lineToRelative(-7.978f, -3.497f)
                lineToRelative(5.978f, -2.79f)
                lineTo(22.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.863f)
                lineToRelative(-4.533f, 2.115f)
                curveToRelative(0.021f, -0.156f, 0.033f, -0.316f, 0.033f, -0.479f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0.0f, 0.162f, 0.011f, 0.322f, 0.033f, 0.479f)
                lineToRelative(-4.533f, -2.115f)
                lineTo(4.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.137f)
                lineToRelative(5.978f, 2.79f)
                lineTo(0.0f, 12.423f)
                verticalLineToRelative(2.231f)
                lineToRelative(5.159f, -2.365f)
                lineTo(0.0f, 19.167f)
                verticalLineToRelative(4.833f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.167f)
                lineToRelative(3.043f, -4.057f)
                curveToRelative(0.387f, 3.496f, 3.359f, 6.224f, 6.957f, 6.224f)
                reflectiveCurveToRelative(6.57f, -2.729f, 6.957f, -6.224f)
                lineToRelative(3.043f, 4.057f)
                verticalLineToRelative(4.167f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.833f)
                lineToRelative(-5.159f, -6.878f)
                lineToRelative(5.159f, 2.365f)
                verticalLineToRelative(-2.231f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _spider!!
    }

private var _spider: ImageVector? = null
