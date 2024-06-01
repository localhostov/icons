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

public val Icons.Filled.LayoutFluid: ImageVector
    get() {
        if (_layoutFluid != null) {
            return _layoutFluid!!
        }
        _layoutFluid = Builder(name = "LayoutFluid", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.0f, 0.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 0.0f, 1.4413f, 0.3161f, 0.8787f, 0.8787f)
                    curveTo(0.3161f, 1.4413f, 0.0f, 2.2043f, 0.0f, 3.0f)
                    lineTo(0.0f, 11.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.9996f, 0.0f)
                    horizontalLineTo(16.9996f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(23.9996f)
                    verticalLineTo(3.0f)
                    curveTo(23.9996f, 2.2043f, 23.6835f, 1.4413f, 23.1209f, 0.8787f)
                    curveTo(22.5583f, 0.3161f, 21.7953f, 0.0f, 20.9996f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.0f, 13.0004f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(21.0004f)
                    curveTo(0.0f, 21.796f, 0.3161f, 22.5591f, 0.8787f, 23.1217f)
                    curveTo(1.4413f, 23.6843f, 2.2043f, 24.0004f, 3.0f, 24.0004f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(13.0004f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 13.0004f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(24.0004f)
                    horizontalLineTo(21.0f)
                    curveTo(21.7956f, 24.0004f, 22.5587f, 23.6843f, 23.1213f, 23.1217f)
                    curveTo(23.6839f, 22.5591f, 24.0f, 21.796f, 24.0f, 21.0004f)
                    verticalLineTo(13.0004f)
                    close()
                }
            }
        }
        .build()
        return _layoutFluid!!
    }

private var _layoutFluid: ImageVector? = null
