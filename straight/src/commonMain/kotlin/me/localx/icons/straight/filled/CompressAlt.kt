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

public val Icons.Filled.CompressAlt: ImageVector
    get() {
        if (_compressAlt != null) {
            return _compressAlt!!
        }
        _compressAlt = Builder(name = "CompressAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(1.414f, 0.0f)
                    lineTo(0.0f, 1.414f)
                    lineTo(4.293f, 5.707f)
                    lineTo(2.0f, 8.0f)
                    horizontalLineTo(7.0f)
                    curveTo(7.2652f, 8.0f, 7.5196f, 7.8946f, 7.7071f, 7.7071f)
                    curveTo(7.8946f, 7.5196f, 8.0f, 7.2652f, 8.0f, 7.0f)
                    verticalLineTo(2.0f)
                    lineTo(5.707f, 4.293f)
                    lineTo(1.414f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.9998f, 15.9999f)
                    horizontalLineTo(16.9998f)
                    curveTo(16.7346f, 15.9999f, 16.4803f, 16.1052f, 16.2927f, 16.2928f)
                    curveTo(16.1052f, 16.4803f, 15.9998f, 16.7347f, 15.9998f, 16.9999f)
                    verticalLineTo(21.9999f)
                    lineTo(18.2928f, 19.7069f)
                    lineTo(22.5858f, 23.9999f)
                    lineTo(23.9998f, 22.5859f)
                    lineTo(19.7068f, 18.2929f)
                    lineTo(21.9998f, 15.9999f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.9998f, 8.0f)
                    horizontalLineTo(21.9998f)
                    lineTo(19.7068f, 5.707f)
                    lineTo(23.9998f, 1.414f)
                    lineTo(22.5858f, 0.0f)
                    lineTo(18.2928f, 4.293f)
                    lineTo(15.9998f, 2.0f)
                    verticalLineTo(7.0f)
                    curveTo(15.9998f, 7.2652f, 16.1052f, 7.5196f, 16.2927f, 7.7071f)
                    curveTo(16.4803f, 7.8946f, 16.7346f, 8.0f, 16.9998f, 8.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.0f, 15.9999f)
                    horizontalLineTo(2.0f)
                    lineTo(4.293f, 18.2929f)
                    lineTo(-0.0f, 22.5859f)
                    lineTo(1.414f, 23.9999f)
                    lineTo(5.707f, 19.7069f)
                    lineTo(8.0f, 21.9999f)
                    verticalLineTo(16.9999f)
                    curveTo(8.0f, 16.7347f, 7.8946f, 16.4803f, 7.7071f, 16.2928f)
                    curveTo(7.5196f, 16.1052f, 7.2652f, 15.9999f, 7.0f, 15.9999f)
                    close()
                }
            }
        }
        .build()
        return _compressAlt!!
    }

private var _compressAlt: ImageVector? = null
