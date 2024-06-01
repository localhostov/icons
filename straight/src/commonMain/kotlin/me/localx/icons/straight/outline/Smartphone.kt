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

public val Icons.Outline.Smartphone: ImageVector
    get() {
        if (_smartphone != null) {
            return _smartphone!!
        }
        _smartphone = Builder(name = "Smartphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(3.9999f, 0.0f)
                    verticalLineTo(21.0f)
                    curveTo(3.9999f, 21.7956f, 4.3159f, 22.5587f, 4.8785f, 23.1213f)
                    curveTo(5.4411f, 23.6839f, 6.2042f, 24.0f, 6.9998f, 24.0f)
                    horizontalLineTo(16.9998f)
                    curveTo(17.7955f, 24.0f, 18.5586f, 23.6839f, 19.1212f, 23.1213f)
                    curveTo(19.6838f, 22.5587f, 19.9998f, 21.7956f, 19.9998f, 21.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(3.9999f)
                    close()
                    moveTo(17.9998f, 2.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(5.9998f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(17.9998f)
                    close()
                    moveTo(16.9998f, 22.0f)
                    horizontalLineTo(6.9998f)
                    curveTo(6.7346f, 22.0f, 6.4803f, 21.8946f, 6.2927f, 21.7071f)
                    curveTo(6.1052f, 21.5196f, 5.9998f, 21.2652f, 5.9998f, 21.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(17.9998f)
                    verticalLineTo(21.0f)
                    curveTo(17.9998f, 21.2652f, 17.8945f, 21.5196f, 17.707f, 21.7071f)
                    curveTo(17.5194f, 21.8946f, 17.2651f, 22.0f, 16.9998f, 22.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.9997f, 18.9994f)
                    horizontalLineTo(10.9997f)
                    verticalLineTo(20.9994f)
                    horizontalLineTo(12.9997f)
                    verticalLineTo(18.9994f)
                    close()
                }
            }
        }
        .build()
        return _smartphone!!
    }

private var _smartphone: ImageVector? = null
