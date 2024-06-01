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

public val Icons.Outline.Indent: ImageVector
    get() {
        if (_indent != null) {
            return _indent!!
        }
        _indent = Builder(name = "Indent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 4.0002f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.0002f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(4.0002f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0002f, 9.0f)
                    horizontalLineTo(8.0001f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(24.0002f)
                    verticalLineTo(9.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 19.0002f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(21.0003f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(19.0002f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0002f, 14.0005f)
                    horizontalLineTo(8.0001f)
                    verticalLineTo(16.0005f)
                    horizontalLineTo(24.0002f)
                    verticalLineTo(14.0005f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 8.0005f)
                    verticalLineTo(16.9675f)
                    lineTo(4.17f, 13.2285f)
                    curveTo(4.2746f, 13.1347f, 4.3582f, 13.0199f, 4.4155f, 12.8917f)
                    curveTo(4.4728f, 12.7634f, 4.5024f, 12.6245f, 4.5024f, 12.484f)
                    curveTo(4.5024f, 12.3435f, 4.4728f, 12.2046f, 4.4155f, 12.0763f)
                    curveTo(4.3582f, 11.948f, 4.2746f, 11.8333f, 4.17f, 11.7395f)
                    lineTo(0.0f, 8.0005f)
                    close()
                }
            }
        }
        .build()
        return _indent!!
    }

private var _indent: ImageVector? = null
