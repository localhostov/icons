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

public val Icons.Filled.Scarf: ImageVector
    get() {
        if (_scarf != null) {
            return _scarf!!
        }
        _scarf = Builder(name = "Scarf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.609f, 22.309f)
                lineToRelative(-1.644f, 1.644f)
                lineToRelative(-3.935f, -3.935f)
                lineToRelative(1.597f, -1.587f)
                lineToRelative(3.983f, 3.877f)
                close()
                moveTo(6.703f, 15.375f)
                lineToRelative(-1.657f, 1.647f)
                lineToRelative(3.978f, 3.873f)
                lineToRelative(1.599f, -1.599f)
                lineToRelative(-3.92f, -3.92f)
                close()
                moveTo(10.662f, 8.855f)
                lineToRelative(-4.149f, -4.368f)
                reflectiveCurveToRelative(0.444f, -0.995f, 1.083f, -1.737f)
                lineToRelative(4.404f, 4.654f)
                lineToRelative(4.462f, -4.615f)
                curveToRelative(0.639f, 0.742f, 1.026f, 1.699f, 1.026f, 1.699f)
                curveToRelative(0.0f, 0.0f, -3.354f, 3.662f, -4.113f, 4.322f)
                lineToRelative(3.887f, 3.784f)
                lineToRelative(-0.006f, 0.033f)
                lineToRelative(0.689f, -0.689f)
                curveToRelative(1.374f, -1.374f, 3.055f, -3.437f, 3.055f, -3.437f)
                curveToRelative(0.0f, 0.0f, -0.82f, -4.269f, -3.0f, -7.0f)
                curveTo(16.974f, 0.769f, 15.14f, 0.008f, 12.0f, 0.0f)
                curveToRelative(-3.14f, 0.008f, -4.974f, 0.769f, -6.0f, 1.5f)
                curveToRelative(-2.18f, 2.731f, -3.0f, 7.0f, -3.0f, 7.0f)
                curveToRelative(0.0f, 0.0f, 1.681f, 2.063f, 3.055f, 3.437f)
                lineToRelative(0.689f, 0.689f)
                lineToRelative(8.287f, 8.26f)
                lineToRelative(3.909f, -3.805f)
                lineToRelative(-8.277f, -8.225f)
                horizontalLineToRelative(-0.002f)
                close()
                moveTo(20.36f, 18.49f)
                lineToRelative(-3.911f, 3.807f)
                lineToRelative(1.662f, 1.656f)
                lineToRelative(3.917f, -3.806f)
                lineToRelative(-1.668f, -1.657f)
                close()
            }
        }
        .build()
        return _scarf!!
    }

private var _scarf: ImageVector? = null
