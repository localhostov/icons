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

public val Icons.Outline.TachometerSlowest: ImageVector
    get() {
        if (_tachometerSlowest != null) {
            return _tachometerSlowest!!
        }
        _tachometerSlowest = Builder(name = "TachometerSlowest", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 13.0f)
                arcToRelative(2.013f, 2.013f, 0.0f, false, true, -3.184f, 1.612f)
                lineToRelative(-5.537f, 2.43f)
                lineToRelative(-0.8f, -1.832f)
                lineToRelative(5.536f, -2.43f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 13.0f)
                close()
                moveTo(12.0f, 1.0f)
                curveTo(0.374f, 0.982f, -4.414f, 16.17f, 5.112f, 22.818f)
                lineToRelative(0.639f, 0.449f)
                lineToRelative(2.9f, -2.51f)
                lineTo(7.346f, 19.243f)
                lineToRelative(-1.7f, 1.47f)
                curveTo(-1.55f, 14.848f, 2.7f, 2.965f, 12.0f, 3.0f)
                curveToRelative(9.3f, -0.035f, 13.551f, 11.849f, 6.353f, 17.713f)
                lineToRelative(-1.7f, -1.47f)
                lineToRelative(-1.308f, 1.514f)
                lineToRelative(2.9f, 2.51f)
                lineToRelative(0.639f, -0.449f)
                curveTo(28.418f, 16.166f, 23.621f, 0.98f, 12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _tachometerSlowest!!
    }

private var _tachometerSlowest: ImageVector? = null
