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

public val Icons.Outline.CircleK: ImageVector
    get() {
        if (_circleK != null) {
            return _circleK!!
        }
        _circleK = Builder(name = "CircleK", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(17.75f, 6.0f)
                lineToRelative(-4.0f, 5.808f)
                lineToRelative(3.5f, 6.192f)
                horizontalLineToRelative(-2.37f)
                lineToRelative(-2.835f, -5.0f)
                horizontalLineToRelative(-3.045f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(7.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.853f)
                lineToRelative(3.446f, -5.0f)
                horizontalLineToRelative(2.451f)
                close()
            }
        }
        .build()
        return _circleK!!
    }

private var _circleK: ImageVector? = null
