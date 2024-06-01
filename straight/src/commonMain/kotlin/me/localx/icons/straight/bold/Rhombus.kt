package me.localx.icons.straight.bold

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

public val Icons.Bold.Rhombus: ImageVector
    get() {
        if (_rhombus != null) {
            return _rhombus!!
        }
        _rhombus = Builder(name = "Rhombus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 4.243f)
                    lineTo(19.757f, 12.0f)
                    lineTo(12.0f, 19.757f)
                    lineTo(4.243f, 12.0f)
                    lineTo(12.0f, 4.243f)
                    close()
                    moveTo(12.0f, 0.0f)
                    lineTo(0.0f, 12.0f)
                    lineTo(12.0f, 24.0f)
                    lineTo(24.0f, 12.0f)
                    lineTo(12.0f, 0.0f)
                    close()
                }
            }
        }
        .build()
        return _rhombus!!
    }

private var _rhombus: ImageVector? = null
