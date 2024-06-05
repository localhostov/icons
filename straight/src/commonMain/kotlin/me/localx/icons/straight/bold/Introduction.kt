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

public val Icons.Bold.Introduction: ImageVector
    get() {
        if (_introduction != null) {
            return _introduction!!
        }
        _introduction = Builder(name = "Introduction", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.999f, 0.0f)
                lineToRelative(-6.0f, 0.002f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.901f, -1.999f, 2.001f)
                lineToRelative(0.002f, 7.772f)
                curveToRelative(0.0f, 0.858f, 0.949f, 1.378f, 1.672f, 0.915f)
                lineToRelative(2.454f, -1.689f)
                horizontalLineToRelative(5.872f)
                lineTo(24.0f, 2.0f)
                curveTo(24.0f, 0.895f, 23.104f, 0.0f, 21.999f, 0.0f)
                close()
                moveTo(5.0f, 8.5f)
                curveToRelative(0.0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.567f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.567f, -3.5f, -3.5f)
                close()
                moveTo(15.0f, 18.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                lineTo(0.0f, 17.0f)
                lineTo(0.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                close()
                moveTo(4.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _introduction!!
    }

private var _introduction: ImageVector? = null
