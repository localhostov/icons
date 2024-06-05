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

public val Icons.Filled.HardHat: ImageVector
    get() {
        if (_hardHat != null) {
            return _hardHat!!
        }
        _hardHat = Builder(name = "HardHat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 17.0f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.477f)
                curveToRelative(1.523f, 1.5f, 4.523f, 4.0f, 10.523f, 4.0f)
                reflectiveCurveToRelative(9.0f, -2.5f, 10.523f, -4.0f)
                horizontalLineToRelative(1.477f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(9.0f, 15.0f)
                lineTo(9.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(7.0f, 15.0f)
                lineTo(1.0f, 15.0f)
                verticalLineToRelative(-2.448f)
                curveToRelative(0.0f, -4.094f, 2.384f, -7.769f, 6.0f, -9.579f)
                verticalLineToRelative(12.028f)
                close()
                moveTo(23.0f, 12.552f)
                verticalLineToRelative(2.448f)
                horizontalLineToRelative(-6.0f)
                lineTo(17.0f, 2.972f)
                curveToRelative(3.616f, 1.81f, 6.0f, 5.486f, 6.0f, 9.579f)
                close()
            }
        }
        .build()
        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
