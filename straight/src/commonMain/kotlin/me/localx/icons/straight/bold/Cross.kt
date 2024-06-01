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

public val Icons.Bold.Cross: ImageVector
    get() {
        if (_cross != null) {
            return _cross!!
        }
        _cross = Builder(name = "Cross", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0609f, 2.061f)
                    lineTo(21.9389f, -0.061f)
                    lineTo(11.9999f, 9.879f)
                    lineTo(2.0609f, -0.061f)
                    lineTo(-0.0611f, 2.061f)
                    lineTo(9.8789f, 12.0f)
                    lineTo(-0.0611f, 21.939f)
                    lineTo(2.0609f, 24.061f)
                    lineTo(11.9999f, 14.121f)
                    lineTo(21.9389f, 24.061f)
                    lineTo(24.0609f, 21.939f)
                    lineTo(14.1209f, 12.0f)
                    lineTo(24.0609f, 2.061f)
                    close()
                }
            }
        }
        .build()
        return _cross!!
    }

private var _cross: ImageVector? = null
