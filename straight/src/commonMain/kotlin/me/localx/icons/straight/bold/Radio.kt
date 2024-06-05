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

public val Icons.Bold.Radio: ImageVector
    get() {
        if (_radio != null) {
            return _radio!!
        }
        _radio = Builder(name = "Radio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 11.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(5.0f, 19.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(24.0f, 9.5f)
                verticalLineToRelative(14.5f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-14.5f)
                curveToRelative(0.0f, -1.703f, 1.223f, -3.126f, 2.838f, -3.437f)
                lineTo(20.067f, 0.002f)
                lineToRelative(0.995f, 2.83f)
                lineToRelative(-9.005f, 3.168f)
                horizontalLineToRelative(8.443f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21.0f, 9.5f)
                curveToRelative(0.0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
                lineTo(3.529f, 9.0f)
                lineToRelative(-0.361f, 0.127f)
                curveToRelative(-0.103f, 0.092f, -0.168f, 0.225f, -0.168f, 0.373f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-11.5f)
                close()
                moveTo(15.5f, 11.5f)
                curveToRelative(-1.933f, 0.0f, -3.5f, 1.567f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.567f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.567f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _radio!!
    }

private var _radio: ImageVector? = null
