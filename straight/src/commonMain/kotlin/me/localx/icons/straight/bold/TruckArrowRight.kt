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

public val Icons.Bold.TruckArrowRight: ImageVector
    get() {
        if (_truckArrowRight != null) {
            return _truckArrowRight!!
        }
        _truckArrowRight = Builder(name = "TruckArrowRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.5f)
                curveToRelative(0.0f, -3.033f, -2.468f, -5.5f, -5.5f, -5.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 1.0f)
                curveTo(1.57f, 1.0f, 0.0f, 2.57f, 0.0f, 4.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                lineTo(3.0f, 17.0f)
                verticalLineToRelative(-3.0f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.061f)
                curveToRelative(-0.034f, 0.162f, -0.061f, 0.327f, -0.061f, 0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.173f, -0.027f, -0.338f, -0.061f, -0.5f)
                horizontalLineToRelative(8.122f)
                curveToRelative(-0.034f, 0.162f, -0.061f, 0.327f, -0.061f, 0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.173f, -0.027f, -0.338f, -0.061f, -0.5f)
                horizontalLineToRelative(3.061f)
                verticalLineToRelative(-9.5f)
                close()
                moveTo(18.5f, 8.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(7.0f, 12.0f)
                lineTo(0.0f, 12.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-3.0f)
                lineToRelative(3.707f, 3.793f)
                curveToRelative(0.39f, 0.391f, 0.39f, 1.024f, 0.0f, 1.414f)
                lineToRelative(-3.707f, 3.793f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _truckArrowRight!!
    }

private var _truckArrowRight: ImageVector? = null
