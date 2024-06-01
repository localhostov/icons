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

public val Icons.Filled.StarOctogram: ImageVector
    get() {
        if (_starOctogram != null) {
            return _starOctogram!!
        }
        _starOctogram = Builder(name = "StarOctogram", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 0.0f)
                    lineTo(15.515f, 3.515f)
                    horizontalLineTo(20.485f)
                    verticalLineTo(8.485f)
                    lineTo(24.0f, 12.0f)
                    lineTo(20.485f, 15.515f)
                    verticalLineTo(20.485f)
                    horizontalLineTo(15.515f)
                    lineTo(12.0f, 24.0f)
                    lineTo(8.485f, 20.485f)
                    horizontalLineTo(3.515f)
                    verticalLineTo(15.515f)
                    lineTo(0.0f, 12.0f)
                    lineTo(3.515f, 8.485f)
                    verticalLineTo(3.515f)
                    horizontalLineTo(8.485f)
                    lineTo(12.0f, 0.0f)
                    close()
                }
            }
        }
        .build()
        return _starOctogram!!
    }

private var _starOctogram: ImageVector? = null
