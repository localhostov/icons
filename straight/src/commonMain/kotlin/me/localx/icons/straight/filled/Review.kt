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

public val Icons.Filled.Review: ImageVector
    get() {
        if (_review != null) {
            return _review!!
        }
        _review = Builder(name = "Review", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 12.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveTo(4.691f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(19.826f, 16.0f)
                horizontalLineToRelative(4.174f)
                verticalLineToRelative(1.0f)
                lineToRelative(-3.054f, 2.083f)
                lineToRelative(1.271f, 3.982f)
                lineToRelative(-0.818f, 0.571f)
                lineToRelative(-3.382f, -2.338f)
                lineToRelative(-3.331f, 2.338f)
                lineToRelative(-0.787f, -0.593f)
                lineToRelative(1.181f, -4.022f)
                lineToRelative(-3.079f, -2.016f)
                verticalLineToRelative(-1.006f)
                horizontalLineToRelative(4.2f)
                lineToRelative(1.285f, -4.363f)
                horizontalLineToRelative(1.059f)
                lineToRelative(1.283f, 4.363f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(10.0f, 18.0f)
                curveToRelative(0.0f, -1.457f, 0.39f, -2.823f, 1.071f, -4.0f)
                horizontalLineToRelative(-6.071f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(12.709f)
                curveToRelative(-1.661f, -1.466f, -2.709f, -3.61f, -2.709f, -6.0f)
                close()
            }
        }
        .build()
        return _review!!
    }

private var _review: ImageVector? = null
