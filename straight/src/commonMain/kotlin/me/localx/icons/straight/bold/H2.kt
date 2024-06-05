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

public val Icons.Bold.H2: ImageVector
    get() {
        if (_h2 != null) {
            return _h2!!
        }
        _h2 = Builder(name = "H2", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-7.0f)
                lineTo(3.0f, 13.0f)
                verticalLineToRelative(7.0f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(19.562f, 15.636f)
                curveToRelative(1.978f, -1.585f, 4.438f, -3.558f, 4.438f, -6.636f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                curveToRelative(0.0f, 1.638f, -1.61f, 2.929f, -3.314f, 4.295f)
                curveToRelative(-1.812f, 1.452f, -3.686f, 2.953f, -3.686f, 5.205f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-6.047f)
                curveToRelative(0.462f, -0.445f, 1.04f, -0.908f, 1.609f, -1.364f)
                close()
            }
        }
        .build()
        return _h2!!
    }

private var _h2: ImageVector? = null
