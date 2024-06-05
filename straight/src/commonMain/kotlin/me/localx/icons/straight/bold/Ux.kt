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

public val Icons.Bold.Ux: ImageVector
    get() {
        if (_ux != null) {
            return _ux!!
        }
        _ux = Builder(name = "Ux", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(8.5f, 7.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(6.333f)
                curveToRelative(0.0f, 0.643f, 0.357f, 1.167f, 1.0f, 1.167f)
                reflectiveCurveToRelative(1.0f, -0.523f, 1.0f, -1.167f)
                verticalLineToRelative(-6.333f)
                close()
                moveTo(17.468f, 11.988f)
                lineToRelative(-0.006f, 0.012f)
                lineToRelative(2.526f, 5.0f)
                horizontalLineToRelative(-2.935f)
                lineToRelative(-1.059f, -2.095f)
                lineToRelative(-1.059f, 2.095f)
                horizontalLineToRelative(-2.935f)
                lineToRelative(2.526f, -5.0f)
                lineToRelative(-0.006f, -0.012f)
                lineToRelative(-2.52f, -4.988f)
                horizontalLineToRelative(2.935f)
                lineToRelative(1.053f, 2.083f)
                lineToRelative(0.006f, 0.012f)
                lineToRelative(0.006f, -0.012f)
                lineToRelative(1.053f, -2.083f)
                horizontalLineToRelative(2.935f)
                lineToRelative(-2.52f, 4.988f)
                close()
            }
        }
        .build()
        return _ux!!
    }

private var _ux: ImageVector? = null
