package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Layers: ImageVector
    get() {
        if (_layers != null) {
            return _layers!!
        }
        _layers = Builder(name = "Layers", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 8.7f)
                    lineTo(12.0f, 1.5f)
                    lineTo(0.0f, 8.7f)
                    verticalLineTo(9.8f)
                    lineTo(12.0f, 17.0f)
                    lineTo(24.0f, 9.8f)
                    verticalLineTo(8.7f)
                    close()
                    moveTo(4.916f, 9.25f)
                    lineTo(12.0f, 5.0f)
                    lineTo(19.084f, 9.251f)
                    lineTo(12.0f, 13.5f)
                    lineTo(4.916f, 9.25f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 11.8016f)
                    lineTo(12.0f, 19.0016f)
                    lineTo(0.0f, 11.8016f)
                    verticalLineTo(15.3006f)
                    lineTo(12.0f, 22.5006f)
                    lineTo(24.0f, 15.3006f)
                    verticalLineTo(11.8016f)
                    close()
                }
            }
        }
        .build()
        return _layers!!
    }

private var _layers: ImageVector? = null
