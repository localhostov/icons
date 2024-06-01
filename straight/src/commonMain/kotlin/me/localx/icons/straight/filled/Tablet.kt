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

public val Icons.Filled.Tablet: ImageVector
    get() {
        if (_tablet != null) {
            return _tablet!!
        }
        _tablet = Builder(name = "Tablet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.9997f, 0.0f)
                    horizontalLineTo(1.9997f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(21.9997f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.9997f, 18.9994f)
                    verticalLineTo(20.9994f)
                    horizontalLineTo(10.9997f)
                    verticalLineTo(18.9994f)
                    horizontalLineTo(1.9997f)
                    verticalLineTo(20.9994f)
                    curveTo(1.9997f, 21.795f, 2.3158f, 22.5581f, 2.8784f, 23.1207f)
                    curveTo(3.441f, 23.6833f, 4.2041f, 23.9994f, 4.9997f, 23.9994f)
                    horizontalLineTo(18.9997f)
                    curveTo(19.7953f, 23.9994f, 20.5584f, 23.6833f, 21.121f, 23.1207f)
                    curveTo(21.6836f, 22.5581f, 21.9997f, 21.795f, 21.9997f, 20.9994f)
                    verticalLineTo(18.9994f)
                    horizontalLineTo(12.9997f)
                    close()
                }
            }
        }
        .build()
        return _tablet!!
    }

private var _tablet: ImageVector? = null
