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

public val Icons.Filled.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) {
            return _bellSlash!!
        }
        _bellSlash = Builder(name = "BellSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.682f, 20.0f)
                lineToRelative(0.93f, 0.93f)
                curveToRelative(-0.757f, 1.802f, -2.539f, 3.07f, -4.612f, 3.07f)
                curveToRelative(-2.414f, 0.0f, -4.435f, -1.721f, -4.899f, -4.0f)
                horizontalLineToRelative(8.582f)
                close()
                moveTo(3.232f, 7.55f)
                lineToRelative(-2.03f, 6.564f)
                curveToRelative(-0.597f, 1.93f, 0.846f, 3.886f, 2.866f, 3.886f)
                horizontalLineToRelative(9.614f)
                lineTo(3.232f, 7.55f)
                close()
                moveTo(19.414f, 18.0f)
                horizontalLineToRelative(0.31f)
                curveToRelative(2.08f, 0.0f, 3.529f, -2.065f, 2.821f, -4.021f)
                lineToRelative(-2.853f, -7.885f)
                curveTo(18.692f, 2.493f, 15.413f, 0.0f, 11.675f, 0.0f)
                curveToRelative(-2.755f, 0.0f, -5.248f, 1.352f, -6.774f, 3.487f)
                lineTo(1.433f, 0.019f)
                lineTo(0.019f, 1.433f)
                lineToRelative(22.548f, 22.548f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-4.567f, -4.567f)
                close()
            }
        }
        .build()
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
