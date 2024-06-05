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

public val Icons.Filled.PlaneAlt: ImageVector
    get() {
        if (_planeAlt != null) {
            return _planeAlt!!
        }
        _planeAlt = Builder(name = "PlaneAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.812f, 24.0f)
                horizontalLineTo(8.0f)
                lineToRelative(3.038f, -9.0f)
                horizontalLineTo(6.0f)
                lineTo(4.915f, 16.653f)
                arcTo(2.993f, 2.993f, 0.0f, false, true, 2.412f, 18.0f)
                horizontalLineTo(0.043f)
                lineToRelative(2.2f, -6.0f)
                lineTo(0.027f, 6.0f)
                horizontalLineTo(2.4f)
                arcTo(2.991f, 2.991f, 0.0f, false, true, 4.9f, 7.343f)
                lineTo(6.0f, 9.0f)
                horizontalLineToRelative(5.041f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(2.812f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.634f, 1.563f)
                lineTo(17.588f, 9.0f)
                horizontalLineToRelative(3.305f)
                arcToRelative(3.084f, 3.084f, 0.0f, false, true, 3.067f, 2.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 21.0f, 15.0f)
                horizontalLineTo(17.588f)
                lineToRelative(-4.146f, 7.444f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 10.812f, 24.0f)
                close()
            }
        }
        .build()
        return _planeAlt!!
    }

private var _planeAlt: ImageVector? = null
