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

public val Icons.Bold.ComputerClassic: ImageVector
    get() {
        if (_computerClassic != null) {
            return _computerClassic!!
        }
        _computerClassic = Builder(name = "ComputerClassic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.5f, 0.0f)
                lineTo(4.5f, 0.0f)
                curveTo(2.57f, 0.0f, 1.0f, 1.57f, 1.0f, 3.5f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.76f, 1.306f, 3.221f, 3.0f, 3.464f)
                verticalLineToRelative(3.036f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-3.036f)
                curveToRelative(1.694f, -0.243f, 3.0f, -1.704f, 3.0f, -3.464f)
                lineTo(23.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(20.0f, 17.5f)
                curveToRelative(0.0f, 0.275f, -0.224f, 0.5f, -0.5f, 0.5f)
                lineTo(4.5f, 18.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                lineTo(4.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(6.0f, 5.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(6.0f)
                lineTo(6.0f, 11.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(9.0f, 14.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(11.0f, 13.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _computerClassic!!
    }

private var _computerClassic: ImageVector? = null
