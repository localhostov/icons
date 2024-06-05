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

public val Icons.Filled.Builder: ImageVector
    get() {
        if (_builder != null) {
            return _builder!!
        }
        _builder = Builder(name = "Builder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.761f, 2.239f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(24.0f, 21.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(24.0f, 11.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(17.0f, 21.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(20.0f, 16.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(24.0f, 16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(14.977f, 4.977f)
                curveToRelative(-0.239f, -2.635f, -2.343f, -4.739f, -4.977f, -4.977f)
                verticalLineToRelative(3.977f)
                horizontalLineToRelative(-2.0f)
                lineTo(8.0f, 0.0f)
                curveTo(5.366f, 0.239f, 3.262f, 2.343f, 3.023f, 4.977f)
                horizontalLineToRelative(-1.023f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.023f)
                close()
                moveTo(3.0f, 8.977f)
                horizontalLineToRelative(12.0f)
                lineToRelative(-0.002f, 0.146f)
                curveToRelative(-0.078f, 3.241f, -2.738f, 5.854f, -5.998f, 5.854f)
                reflectiveCurveToRelative(-5.92f, -2.613f, -5.998f, -5.854f)
                lineToRelative(-0.002f, -0.146f)
                close()
            }
        }
        .build()
        return _builder!!
    }

private var _builder: ImageVector? = null
