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

public val Icons.Filled.Pyramid: ImageVector
    get() {
        if (_pyramid != null) {
            return _pyramid!!
        }
        _pyramid = Builder(name = "Pyramid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.1f, 1.2428f)
                    lineTo(0.0f, 23.9997f)
                    horizontalLineTo(24.0f)
                    lineTo(13.905f, 1.2428f)
                    curveTo(13.7395f, 0.8769f, 13.472f, 0.5664f, 13.1346f, 0.3487f)
                    curveTo(12.7972f, 0.1309f, 12.4041f, 0.0151f, 12.0025f, 0.0151f)
                    curveTo(11.6009f, 0.0151f, 11.2078f, 0.1309f, 10.8704f, 0.3487f)
                    curveTo(10.533f, 0.5664f, 10.2655f, 0.8769f, 10.1f, 1.2428f)
                    close()
                }
            }
        }
        .build()
        return _pyramid!!
    }

private var _pyramid: ImageVector? = null
