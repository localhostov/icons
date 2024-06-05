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

public val Icons.Filled.AngleDown: ImageVector
    get() {
        if (_angleDown != null) {
            return _angleDown!!
        }
        _angleDown = Builder(name = "AngleDown", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.586f, 5.929f)
                lineToRelative(-9.879f, 9.879f)
                arcToRelative(1.021f, 1.021f, 0.0f, false, true, -1.414f, 0.0f)
                lineTo(1.42f, 5.934f)
                lineTo(0.006f, 7.348f)
                lineToRelative(9.873f, 9.874f)
                arcToRelative(3.075f, 3.075f, 0.0f, false, false, 4.243f, 0.0f)
                lineTo(24.0f, 7.343f)
                close()
            }
        }
        .build()
        return _angleDown!!
    }

private var _angleDown: ImageVector? = null
