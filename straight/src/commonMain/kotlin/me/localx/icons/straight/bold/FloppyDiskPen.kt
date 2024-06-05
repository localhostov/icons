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

public val Icons.Bold.FloppyDiskPen: ImageVector
    get() {
        if (_floppyDiskPen != null) {
            return _floppyDiskPen!!
        }
        _floppyDiskPen = Builder(name = "FloppyDiskPen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 19.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                horizontalLineToRelative(12.742f)
                lineToRelative(5.758f, 5.758f)
                verticalLineToRelative(5.262f)
                curveToRelative(-1.074f, -0.047f, -2.155f, 0.317f, -3.0f, 1.092f)
                verticalLineToRelative(-5.112f)
                lineToRelative(-4.0f, -4.0f)
                verticalLineToRelative(4.0f)
                lineTo(5.0f, 7.0f)
                lineTo(5.0f, 3.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(15.5f)
                close()
                moveTo(10.5f, 9.0f)
                curveToRelative(-1.933f, 0.0f, -3.5f, 1.567f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.567f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.567f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(23.361f, 13.639f)
                curveToRelative(-0.852f, -0.852f, -2.234f, -0.852f, -3.086f, 0.0f)
                lineToRelative(-7.275f, 7.275f)
                verticalLineToRelative(3.086f)
                horizontalLineToRelative(3.086f)
                lineToRelative(7.275f, -7.275f)
                curveToRelative(0.852f, -0.852f, 0.852f, -2.234f, 0.0f, -3.086f)
                close()
            }
        }
        .build()
        return _floppyDiskPen!!
    }

private var _floppyDiskPen: ImageVector? = null
