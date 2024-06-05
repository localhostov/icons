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

public val Icons.Filled.GlassCitrus: ImageVector
    get() {
        if (_glassCitrus != null) {
            return _glassCitrus!!
        }
        _glassCitrus = Builder(name = "GlassCitrus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 5.002f)
                lineToRelative(0.918f, 5.998f)
                horizontalLineToRelative(9.384f)
                curveToRelative(0.472f, 0.753f, 1.055f, 1.43f, 1.732f, 2.0f)
                lineTo(1.186f, 13.0f)
                lineToRelative(1.125f, 8.398f)
                curveToRelative(0.2f, 1.49f, 1.471f, 2.602f, 2.973f, 2.602f)
                horizontalLineToRelative(8.984f)
                curveToRelative(1.503f, 0.0f, 2.774f, -1.112f, 2.974f, -2.602f)
                lineToRelative(2.193f, -16.397f)
                lineToRelative(-19.435f, 0.002f)
                close()
                moveTo(11.024f, 6.976f)
                horizontalLineToRelative(2.002f)
                curveToRelative(0.208f, 1.969f, 1.691f, 3.562f, 3.605f, 3.938f)
                lineToRelative(-0.264f, 1.974f)
                curveToRelative(-2.89f, -0.511f, -5.126f, -2.931f, -5.343f, -5.912f)
                close()
                moveTo(24.0f, 6.502f)
                curveToRelative(0.0f, 2.514f, -1.43f, 4.691f, -3.519f, 5.772f)
                lineToRelative(1.24f, -9.274f)
                horizontalLineToRelative(-9.691f)
                curveTo(13.185f, 1.199f, 15.201f, 0.002f, 17.5f, 0.002f)
                curveTo(21.09f, 0.002f, 24.0f, 2.912f, 24.0f, 6.502f)
                close()
            }
        }
        .build()
        return _glassCitrus!!
    }

private var _glassCitrus: ImageVector? = null
