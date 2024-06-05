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

public val Icons.Outline.Banjo: ImageVector
    get() {
        if (_banjo != null) {
            return _banjo!!
        }
        _banjo = Builder(name = "Banjo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.051f, 6.0f)
                lineToRelative(2.949f, -2.942f)
                lineToRelative(-3.051f, -3.058f)
                lineToRelative(-2.949f, 2.942f)
                verticalLineToRelative(1.644f)
                lineToRelative(-5.097f, 5.097f)
                curveToRelative(-1.355f, -1.054f, -3.057f, -1.683f, -4.903f, -1.683f)
                curveTo(3.589f, 8.0f, 0.0f, 11.589f, 0.0f, 16.0f)
                reflectiveCurveToRelative(3.589f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.589f, 8.0f, -8.0f)
                curveToRelative(0.0f, -1.846f, -0.629f, -3.548f, -1.683f, -4.903f)
                lineToRelative(5.097f, -5.097f)
                horizontalLineToRelative(1.637f)
                close()
                moveTo(8.0f, 22.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(5.707f, 14.293f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _banjo!!
    }

private var _banjo: ImageVector? = null
