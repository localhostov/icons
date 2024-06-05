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

public val Icons.Filled.TachometerSlowest: ImageVector
    get() {
        if (_tachometerSlowest != null) {
            return _tachometerSlowest!!
        }
        _tachometerSlowest = Builder(name = "TachometerSlowest", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 13.0f)
                arcToRelative(12.019f, 12.019f, 0.0f, false, false, 5.112f, 9.818f)
                lineToRelative(0.639f, 0.449f)
                lineTo(8.0f, 20.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(2.249f, 3.267f)
                lineToRelative(0.639f, -0.449f)
                curveTo(28.417f, 16.166f, 23.622f, 0.98f, 12.0f, 1.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 13.0f)
                close()
                moveTo(12.8f, 14.831f)
                arcToRelative(1.992f, 1.992f, 0.0f, false, true, -1.98f, -0.223f)
                lineTo(4.16f, 17.532f)
                lineToRelative(-0.8f, -1.831f)
                lineToRelative(6.664f, -2.924f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 12.8f, 14.831f)
                close()
            }
        }
        .build()
        return _tachometerSlowest!!
    }

private var _tachometerSlowest: ImageVector? = null
