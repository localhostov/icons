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

public val Icons.Outline.Coffin: ImageVector
    get() {
        if (_coffin != null) {
            return _coffin!!
        }
        _coffin = Builder(name = "Coffin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.932f, 1.886f)
                curveToRelative(-0.459f, -1.146f, -1.552f, -1.886f, -2.786f, -1.886f)
                lineTo(7.854f, 0.0f)
                curveToRelative(-1.234f, 0.0f, -2.327f, 0.74f, -2.786f, 1.886f)
                lineToRelative(-2.608f, 6.522f)
                lineToRelative(3.226f, 15.592f)
                horizontalLineToRelative(12.629f)
                lineToRelative(3.226f, -15.592f)
                lineToRelative(-2.608f, -6.522f)
                close()
                moveTo(16.686f, 22.0f)
                lineTo(7.314f, 22.0f)
                lineToRelative(-2.774f, -13.408f)
                lineToRelative(2.386f, -5.963f)
                curveToRelative(0.152f, -0.382f, 0.518f, -0.629f, 0.929f, -0.629f)
                horizontalLineToRelative(8.291f)
                curveToRelative(0.411f, 0.0f, 0.776f, 0.247f, 0.929f, 0.629f)
                lineToRelative(2.386f, 5.963f)
                lineToRelative(-2.774f, 13.408f)
                close()
            }
        }
        .build()
        return _coffin!!
    }

private var _coffin: ImageVector? = null
