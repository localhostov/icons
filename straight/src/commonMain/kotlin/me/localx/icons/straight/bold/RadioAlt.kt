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

public val Icons.Bold.RadioAlt: ImageVector
    get() {
        if (_radioAlt != null) {
            return _radioAlt!!
        }
        _radioAlt = Builder(name = "RadioAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 6.0f)
                horizontalLineToRelative(-8.443f)
                lineToRelative(9.005f, -3.168f)
                lineTo(20.066f, 0.002f)
                lineTo(2.836f, 6.063f)
                curveToRelative(-1.614f, 0.311f, -2.836f, 1.734f, -2.836f, 3.437f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-14.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3.0f, 21.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(9.0f)
                lineTo(3.0f, 21.0f)
                close()
                moveTo(5.0f, 15.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(19.0f, 16.5f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _radioAlt!!
    }

private var _radioAlt: ImageVector? = null
