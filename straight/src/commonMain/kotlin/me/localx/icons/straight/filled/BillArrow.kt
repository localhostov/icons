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

public val Icons.Filled.BillArrow: ImageVector
    get() {
        if (_billArrow != null) {
            return _billArrow!!
        }
        _billArrow = Builder(name = "BillArrow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 14.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(24.0f, 11.0f)
                verticalLineToRelative(13.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-13.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.092f)
                curveToRelative(-0.056f, 0.157f, -0.092f, 0.324f, -0.092f, 0.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-4.5f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(6.0f, 19.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(6.0f, 12.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(16.0f, 16.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                close()
                moveTo(21.0f, 19.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(20.546f, 4.52f)
                lineToRelative(-1.546f, -1.546f)
                verticalLineToRelative(7.026f)
                horizontalLineToRelative(-2.0f)
                lineTo(17.0f, 2.941f)
                lineToRelative(-1.538f, 1.538f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.449f, -2.449f)
                curveToRelative(0.821f, -0.819f, 2.155f, -0.818f, 2.973f, 0.0f)
                lineToRelative(2.49f, 2.49f)
                lineToRelative(-1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _billArrow!!
    }

private var _billArrow: ImageVector? = null
