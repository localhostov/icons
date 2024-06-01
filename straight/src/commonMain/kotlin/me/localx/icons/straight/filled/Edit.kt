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

public val Icons.Filled.Edit: ImageVector
    get() {
        if (_edit != null) {
            return _edit!!
        }
        _edit = Builder(name = "Edit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.828f, 20.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(14.172f)
                    lineTo(4.586f, 13.586f)
                    lineTo(18.172f, 0.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 0.0f, 1.4413f, 0.3161f, 0.8787f, 0.8787f)
                    curveTo(0.3161f, 1.4413f, 0.0f, 2.2043f, 0.0f, 3.0f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(5.828f)
                    lineTo(9.828f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.9998f, 23.4144f)
                    lineTo(23.4138f, 19.0004f)
                    horizontalLineTo(18.9998f)
                    verticalLineTo(23.4144f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.0f, 18.0f)
                    horizontalLineTo(9.0f)
                    lineTo(23.379f, 3.6209f)
                    curveTo(23.7768f, 3.2231f, 24.0003f, 2.6836f, 24.0003f, 2.1209f)
                    curveTo(24.0003f, 1.5583f, 23.7768f, 1.0188f, 23.379f, 0.621f)
                    curveTo(22.9812f, 0.2231f, 22.4416f, -4.0E-4f, 21.879f, -4.0E-4f)
                    curveTo(21.3164f, -4.0E-4f, 20.7768f, 0.2231f, 20.379f, 0.621f)
                    lineTo(6.0f, 15.0f)
                    verticalLineTo(18.0f)
                    close()
                }
            }
        }
        .build()
        return _edit!!
    }

private var _edit: ImageVector? = null
