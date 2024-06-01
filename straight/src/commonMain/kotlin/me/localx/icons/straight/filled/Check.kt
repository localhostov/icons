package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = Builder(name = "Check", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.77f, 20.5889f)
                    curveTo(7.3732f, 20.5897f, 6.9801f, 20.5122f, 6.6134f, 20.3606f)
                    curveTo(6.2467f, 20.2091f, 5.9135f, 19.9866f, 5.633f, 19.7059f)
                    lineTo(0.0f, 14.0729f)
                    lineTo(1.424f, 12.6479f)
                    lineTo(7.057f, 18.2809f)
                    curveTo(7.246f, 18.4698f, 7.5023f, 18.5759f, 7.7695f, 18.5759f)
                    curveTo(8.0367f, 18.5759f, 8.293f, 18.4698f, 8.482f, 18.2809f)
                    lineTo(22.576f, 4.1869f)
                    lineTo(24.0f, 5.6119f)
                    lineTo(9.906f, 19.7059f)
                    curveTo(9.6257f, 19.9866f, 9.2927f, 20.209f, 8.9261f, 20.3606f)
                    curveTo(8.5596f, 20.5121f, 8.1667f, 20.5897f, 7.77f, 20.5889f)
                    close()
                }
            }
        }
        .build()
        return _check!!
    }

private var _check: ImageVector? = null
