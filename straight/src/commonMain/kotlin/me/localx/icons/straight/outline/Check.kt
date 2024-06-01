package me.localx.icons.straight.outline

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

public val Icons.Outline.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = Builder(name = "Check", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.8002f, 20.5299f)
                curveTo(7.4063f, 20.5306f, 7.0162f, 20.4535f, 6.6522f, 20.303f)
                curveTo(6.2882f, 20.1525f, 5.9575f, 19.9315f, 5.6792f, 19.6529f)
                lineTo(0.0862f, 14.0609f)
                lineTo(1.5002f, 12.6459f)
                lineTo(7.0932f, 18.2389f)
                curveTo(7.2807f, 18.4263f, 7.535f, 18.5316f, 7.8002f, 18.5316f)
                curveTo(8.0653f, 18.5316f, 8.3196f, 18.4263f, 8.5072f, 18.2389f)
                lineTo(22.5002f, 4.2459f)
                lineTo(23.9142f, 5.6599f)
                lineTo(9.9212f, 19.6529f)
                curveTo(9.6428f, 19.9315f, 9.3122f, 20.1525f, 8.9482f, 20.303f)
                curveTo(8.5842f, 20.4535f, 8.1941f, 20.5306f, 7.8002f, 20.5299f)
                close()
            }
        }
        .build()
        return _check!!
    }

private var _check: ImageVector? = null
