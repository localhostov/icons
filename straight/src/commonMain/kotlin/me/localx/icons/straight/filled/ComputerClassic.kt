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

public val Icons.Filled.ComputerClassic: ImageVector
    get() {
        if (_computerClassic != null) {
            return _computerClassic!!
        }
        _computerClassic = Builder(name = "ComputerClassic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 24.0f)
                lineTo(3.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(23.0f, 3.0f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(4.0f, 19.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(1.0f, 3.0f)
                curveTo(1.0f, 1.346f, 2.346f, 0.0f, 4.0f, 0.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(8.0f, 15.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(19.0f, 14.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(19.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 3.0f)
                close()
                moveTo(17.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _computerClassic!!
    }

private var _computerClassic: ImageVector? = null
