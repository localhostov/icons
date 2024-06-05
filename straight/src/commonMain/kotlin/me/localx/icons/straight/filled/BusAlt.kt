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

public val Icons.Filled.BusAlt: ImageVector
    get() {
        if (_busAlt != null) {
            return _busAlt!!
        }
        _busAlt = Builder(name = "BusAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 9.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(2.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(0.0f, 9.0f)
                lineTo(2.0f, 9.0f)
                lineTo(2.0f, 6.0f)
                lineTo(22.0f, 6.0f)
                lineTo(22.0f, 9.0f)
                close()
                moveTo(2.0f, 16.0f)
                lineTo(22.0f, 16.0f)
                verticalLineToRelative(6.0f)
                lineTo(20.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(15.0f, 24.0f)
                lineTo(15.0f, 22.0f)
                lineTo(9.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 24.0f)
                lineTo(4.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                close()
                moveTo(17.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 20.0f)
                close()
                moveTo(7.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 20.0f)
                close()
                moveTo(9.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 4.0f)
                horizontalLineToRelative(6.983f)
                arcToRelative(2.978f, 2.978f, 0.0f, false, false, -1.8f, -2.531f)
                curveToRelative(-3.673f, -1.9f, -12.695f, -1.893f, -16.358f, 0.0f)
                arcTo(2.978f, 2.978f, 0.0f, false, false, 2.017f, 4.0f)
                lineTo(9.0f, 4.0f)
                close()
            }
        }
        .build()
        return _busAlt!!
    }

private var _busAlt: ImageVector? = null
