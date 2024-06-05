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

public val Icons.Filled.Escalator: ImageVector
    get() {
        if (_escalator != null) {
            return _escalator!!
        }
        _escalator = Builder(name = "Escalator", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.5f, 0.0f)
                curveTo(9.881f, 0.0f, 11.0f, 1.119f, 11.0f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveTo(7.119f, 0.0f, 8.5f, 0.0f)
                close()
                moveTo(8.764f, 22.817f)
                lineToRelative(11.603f, -9.817f)
                horizontalLineToRelative(3.634f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-5.535f)
                curveToRelative(-1.181f, 0.0f, -2.328f, 0.42f, -3.229f, 1.183f)
                lineTo(3.634f, 17.0f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(5.535f)
                curveToRelative(1.181f, 0.0f, 2.328f, -0.42f, 3.229f, -1.183f)
                close()
                moveTo(11.651f, 7.597f)
                curveToRelative(-0.504f, -0.949f, -1.503f, -1.597f, -2.651f, -1.597f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 2.997f)
                lineToRelative(-0.014f, 4.239f)
                lineToRelative(6.664f, -5.639f)
                close()
            }
        }
        .build()
        return _escalator!!
    }

private var _escalator: ImageVector? = null
