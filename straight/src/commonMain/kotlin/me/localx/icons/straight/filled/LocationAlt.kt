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

public val Icons.Filled.LocationAlt: ImageVector
    get() {
        if (_locationAlt != null) {
            return _locationAlt!!
        }
        _locationAlt = Builder(name = "LocationAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 10.007f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -17.071f, -7.071f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.008f, 14.149f)
                lineToRelative(5.025f, 4.915f)
                horizontalLineToRelative(-4.962f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.962f)
                lineToRelative(5.033f, -4.923f)
                arcToRelative(9.932f, 9.932f, 0.0f, false, false, 2.929f, -7.07f)
                close()
                moveTo(17.0f, 12.618f)
                lineTo(12.0f, 15.118f)
                lineTo(7.0f, 12.618f)
                verticalLineToRelative(-6.236f)
                lineToRelative(5.0f, -2.5f)
                lineToRelative(5.0f, 2.5f)
                close()
                moveTo(12.0f, 9.0f)
                lineTo(15.0f, 7.5f)
                verticalLineToRelative(3.882f)
                lineToRelative(-3.0f, 1.5f)
                lineToRelative(-3.0f, -1.5f)
                verticalLineToRelative(-3.882f)
                close()
            }
        }
        .build()
        return _locationAlt!!
    }

private var _locationAlt: ImageVector? = null
