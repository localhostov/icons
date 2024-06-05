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

public val Icons.Bold.LocationAlt: ImageVector
    get() {
        if (_locationAlt != null) {
            return _locationAlt!!
        }
        _locationAlt = Builder(name = "LocationAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.071f, 2.936f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -14.131f, 14.153f)
                lineToRelative(4.0f, 3.911f)
                horizontalLineToRelative(-3.94f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.939f)
                lineToRelative(4.01f, -3.923f)
                arcToRelative(10.008f, 10.008f, 0.0f, false, false, 0.0f, -14.141f)
                close()
                moveTo(16.962f, 14.944f)
                lineTo(12.0f, 19.8f)
                lineTo(7.05f, 14.956f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 9.912f, -0.012f)
                close()
                moveTo(7.0f, 7.084f)
                verticalLineToRelative(6.229f)
                lineToRelative(5.0f, 2.5f)
                lineToRelative(5.0f, -2.5f)
                verticalLineToRelative(-6.229f)
                lineToRelative(-5.0f, -2.5f)
                close()
                moveTo(12.0f, 12.459f)
                lineTo(10.0f, 11.459f)
                verticalLineToRelative(-2.7f)
                lineToRelative(2.0f, 1.0f)
                lineToRelative(2.0f, -1.0f)
                verticalLineToRelative(2.7f)
                close()
            }
        }
        .build()
        return _locationAlt!!
    }

private var _locationAlt: ImageVector? = null
