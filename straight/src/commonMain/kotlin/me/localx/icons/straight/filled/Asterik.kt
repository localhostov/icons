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

public val Icons.Filled.Asterik: ImageVector
    get() {
        if (_asterik != null) {
            return _asterik!!
        }
        _asterik = Builder(name = "Asterik", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.58f, 8.536f)
                    lineTo(20.218f, 3.136f)
                    lineTo(15.273f, 6.216f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(8.727f)
                    verticalLineTo(6.216f)
                    lineTo(3.782f, 3.136f)
                    lineTo(0.42f, 8.536f)
                    lineTo(5.983f, 12.0f)
                    lineTo(0.42f, 15.464f)
                    lineTo(3.782f, 20.864f)
                    lineTo(8.727f, 17.784f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(15.273f)
                    verticalLineTo(17.784f)
                    lineTo(20.218f, 20.864f)
                    lineTo(23.58f, 15.464f)
                    lineTo(18.017f, 12.0f)
                    lineTo(23.58f, 8.536f)
                    close()
                }
            }
        }
        .build()
        return _asterik!!
    }

private var _asterik: ImageVector? = null
