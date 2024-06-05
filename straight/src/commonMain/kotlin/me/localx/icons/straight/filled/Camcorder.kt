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

public val Icons.Filled.Camcorder: ImageVector
    get() {
        if (_camcorder != null) {
            return _camcorder!!
        }
        _camcorder = Builder(name = "Camcorder", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                lineTo(5.0f, 11.0f)
                lineTo(14.0f, 11.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(21.0f, 10.244f)
                verticalLineToRelative(9.513f)
                lineToRelative(3.0f, 2.236f)
                lineTo(24.0f, 8.007f)
                lineToRelative(-3.0f, 2.236f)
                close()
                moveTo(19.0f, 9.0f)
                verticalLineToRelative(15.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 9.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                lineTo(12.086f, 6.0f)
                lineToRelative(-3.0f, -3.0f)
                lineTo(0.0f, 3.0f)
                lineTo(0.0f, 1.0f)
                lineTo(9.914f, 1.0f)
                lineToRelative(5.0f, 5.0f)
                horizontalLineToRelative(1.086f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(16.0f, 9.0f)
                lineTo(3.0f, 9.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(13.0f)
                lineTo(16.0f, 9.0f)
                close()
            }
        }
        .build()
        return _camcorder!!
    }

private var _camcorder: ImageVector? = null
