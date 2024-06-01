package me.localx.icons.straight.filled

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

public val Icons.Filled.Layers: ImageVector
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
                    moveTo(23.9439f, 7.6616f)
                    lineTo(11.9999f, 0.4996f)
                    lineTo(0.0559f, 7.6616f)
                    lineTo(11.9999f, 14.8276f)
                    lineTo(23.9439f, 7.6616f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 13.9651f)
                    lineTo(12.0f, 21.1651f)
                    lineTo(0.0f, 13.9651f)
                    verticalLineTo(16.2981f)
                    lineTo(12.0f, 23.4971f)
                    lineTo(24.0f, 16.2981f)
                    verticalLineTo(13.9651f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 9.6339f)
                    lineTo(21.485f, 11.1429f)
                    lineTo(12.0f, 16.8339f)
                    lineTo(2.515f, 11.1429f)
                    lineTo(0.0f, 9.6339f)
                    verticalLineTo(11.9659f)
                    lineTo(12.0f, 19.1659f)
                    lineTo(24.0f, 11.9659f)
                    verticalLineTo(9.6339f)
                    close()
                }
            }
        }
        .build()
        return _layers!!
    }

private var _layers: ImageVector? = null
