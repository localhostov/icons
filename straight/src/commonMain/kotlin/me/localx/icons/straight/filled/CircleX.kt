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

public val Icons.Filled.CircleX: ImageVector
    get() {
        if (_circleX != null) {
            return _circleX!!
        }
        _circleX = Builder(name = "CircleX", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(15.029f, 17.75f)
                lineToRelative(-3.002f, -4.059f)
                lineToRelative(-2.987f, 4.059f)
                horizontalLineToRelative(-2.482f)
                lineToRelative(4.229f, -5.75f)
                lineToRelative(-4.182f, -5.75f)
                horizontalLineToRelative(2.481f)
                lineToRelative(2.942f, 4.059f)
                lineToRelative(2.962f, -4.059f)
                horizontalLineToRelative(2.482f)
                lineToRelative(-4.204f, 5.75f)
                lineToRelative(4.246f, 5.75f)
                horizontalLineToRelative(-2.484f)
                close()
            }
        }
        .build()
        return _circleX!!
    }

private var _circleX: ImageVector? = null
