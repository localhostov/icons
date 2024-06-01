package me.localx.icons.straight.outline

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

public val Icons.Outline.Underline: ImageVector
    get() {
        if (_underline != null) {
            return _underline!!
        }
        _underline = Builder(name = "Underline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9998f, 20.0f)
                    curveTo(9.8788f, 19.9976f, 7.8454f, 19.154f, 6.3456f, 17.6542f)
                    curveTo(4.8458f, 16.1544f, 4.0022f, 14.121f, 3.9998f, 12.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(5.9998f)
                    verticalLineTo(12.0f)
                    curveTo(5.9998f, 13.5913f, 6.632f, 15.1174f, 7.7572f, 16.2426f)
                    curveTo(8.8824f, 17.3679f, 10.4085f, 18.0f, 11.9998f, 18.0f)
                    curveTo(13.5911f, 18.0f, 15.1172f, 17.3679f, 16.2425f, 16.2426f)
                    curveTo(17.3677f, 15.1174f, 17.9998f, 13.5913f, 17.9998f, 12.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(19.9998f)
                    verticalLineTo(12.0f)
                    curveTo(19.9974f, 14.121f, 19.1538f, 16.1544f, 17.654f, 17.6542f)
                    curveTo(16.1543f, 19.154f, 14.1208f, 19.9976f, 11.9998f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 21.9994f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(23.9994f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(21.9994f)
                    close()
                }
            }
        }
        .build()
        return _underline!!
    }

private var _underline: ImageVector? = null
