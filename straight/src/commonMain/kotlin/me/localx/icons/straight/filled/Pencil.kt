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

public val Icons.Filled.Pencil: ImageVector
    get() {
        if (_pencil != null) {
            return _pencil!!
        }
        _pencil = Builder(name = "Pencil", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.604f, 5.6874f)
                    lineTo(0.0f, 20.2904f)
                    verticalLineTo(24.0004f)
                    horizontalLineTo(3.71f)
                    lineTo(18.313f, 9.3964f)
                    lineTo(14.604f, 5.6874f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.232f, 0.7677f)
                    curveTo(22.7399f, 0.2759f, 22.0727f, -4.0E-4f, 21.377f, -4.0E-4f)
                    curveTo(20.6813f, -4.0E-4f, 20.014f, 0.2759f, 19.522f, 0.7677f)
                    lineTo(16.022f, 4.2727f)
                    lineTo(19.731f, 7.9817f)
                    lineTo(23.231f, 4.4817f)
                    curveTo(23.4752f, 4.2381f, 23.6689f, 3.9487f, 23.8011f, 3.6301f)
                    curveTo(23.9334f, 3.3115f, 24.0015f, 2.9699f, 24.0016f, 2.6249f)
                    curveTo(24.0017f, 2.28f, 23.9337f, 1.9384f, 23.8017f, 1.6197f)
                    curveTo(23.6696f, 1.301f, 23.476f, 1.0115f, 23.232f, 0.7677f)
                    close()
                }
            }
        }
        .build()
        return _pencil!!
    }

private var _pencil: ImageVector? = null
