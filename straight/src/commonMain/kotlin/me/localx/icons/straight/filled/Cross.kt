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

public val Icons.Filled.Cross: ImageVector
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
                    moveTo(24.0f, 1.414f)
                    lineTo(22.586f, 0.0f)
                    lineTo(12.0f, 10.586f)
                    lineTo(1.414f, 0.0f)
                    lineTo(0.0f, 1.414f)
                    lineTo(10.586f, 12.0f)
                    lineTo(0.0f, 22.586f)
                    lineTo(1.414f, 24.0f)
                    lineTo(12.0f, 13.414f)
                    lineTo(22.586f, 24.0f)
                    lineTo(24.0f, 22.586f)
                    lineTo(13.414f, 12.0f)
                    lineTo(24.0f, 1.414f)
                    close()
                }
            }
        }
        .build()
        return _cross!!
    }

private var _cross: ImageVector? = null
