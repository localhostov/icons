package me.localx.icons.straight.bold

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

public val Icons.Bold.Cheeseburger: ImageVector
    get() {
        if (_cheeseburger != null) {
            return _cheeseburger!!
        }
        _cheeseburger = Builder(name = "Cheeseburger", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.086f, 16.0f)
                lineTo(0.998f, 16.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.084f)
                lineToRelative(-3.414f, 3.414f)
                lineToRelative(-3.414f, -3.414f)
                close()
                moveTo(15.5f, 22.243f)
                lineToRelative(-4.242f, -4.243f)
                lineTo(0.998f, 18.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-3.256f)
                lineToRelative(-4.242f, 4.243f)
                close()
                moveTo(23.11f, 11.0f)
                lineTo(0.884f, 11.0f)
                lineToRelative(0.177f, -1.659f)
                curveTo(1.638f, 3.929f, 6.237f, 0.0f, 11.998f, 0.0f)
                reflectiveCurveToRelative(10.373f, 3.93f, 10.938f, 9.344f)
                lineToRelative(0.173f, 1.656f)
                close()
                moveTo(19.589f, 8.0f)
                curveToRelative(-1.036f, -3.013f, -3.949f, -5.0f, -7.591f, -5.0f)
                curveToRelative(-3.568f, 0.0f, -6.52f, 2.023f, -7.578f, 5.0f)
                horizontalLineToRelative(15.169f)
                close()
            }
        }
        .build()
        return _cheeseburger!!
    }

private var _cheeseburger: ImageVector? = null
