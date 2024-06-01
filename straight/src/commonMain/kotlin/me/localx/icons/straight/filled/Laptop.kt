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

public val Icons.Filled.Laptop: ImageVector
    get() {
        if (_laptop != null) {
            return _laptop!!
        }
        _laptop = Builder(name = "Laptop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.991f, 17.9996f)
                    lineTo(8.145f, 16.9996f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(17.9996f)
                    curveTo(0.0f, 18.7953f, 0.3161f, 19.5583f, 0.8787f, 20.1209f)
                    curveTo(1.4413f, 20.6836f, 2.2043f, 20.9996f, 3.0f, 20.9996f)
                    horizontalLineTo(21.0f)
                    curveTo(21.7956f, 20.9996f, 22.5587f, 20.6836f, 23.1213f, 20.1209f)
                    curveTo(23.6839f, 19.5583f, 24.0f, 18.7953f, 24.0f, 17.9996f)
                    verticalLineTo(16.9996f)
                    horizontalLineTo(15.86f)
                    lineTo(15.013f, 17.9996f)
                    horizontalLineTo(8.991f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.0821f, 15.0f)
                    lineTo(9.9291f, 16.0f)
                    horizontalLineTo(14.0861f)
                    lineTo(14.9321f, 15.0f)
                    horizontalLineTo(22.0001f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(2.0001f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(9.0821f)
                    close()
                }
            }
        }
        .build()
        return _laptop!!
    }

private var _laptop: ImageVector? = null
