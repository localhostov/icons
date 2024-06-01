package me.localx.icons.straight.outline

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

public val Icons.Outline.Asterik: ImageVector
    get() {
        if (_asterik != null) {
            return _asterik!!
        }
        _asterik = Builder(name = "Asterik", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.9998f, 24.0f)
                    horizontalLineTo(7.9998f)
                    verticalLineTo(19.1f)
                    lineTo(4.1458f, 21.5f)
                    lineTo(0.0078f, 14.855f)
                    lineTo(4.5928f, 12.0f)
                    lineTo(0.0078f, 9.145f)
                    lineTo(4.1458f, 2.5f)
                    lineTo(7.9998f, 4.9f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(15.9998f)
                    verticalLineTo(4.9f)
                    lineTo(19.8538f, 2.5f)
                    lineTo(23.9918f, 9.148f)
                    lineTo(19.4068f, 12.0f)
                    lineTo(23.9918f, 14.855f)
                    lineTo(19.8538f, 21.5f)
                    lineTo(15.9998f, 19.1f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(9.9998f, 22.0f)
                    horizontalLineTo(13.9998f)
                    verticalLineTo(15.5f)
                    lineTo(19.2128f, 18.747f)
                    lineTo(21.2378f, 15.5f)
                    lineTo(15.6238f, 12.0f)
                    lineTo(21.2378f, 8.5f)
                    lineTo(19.2128f, 5.252f)
                    lineTo(13.9998f, 8.5f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(9.9998f)
                    verticalLineTo(8.5f)
                    lineTo(4.7867f, 5.252f)
                    lineTo(2.7617f, 8.5f)
                    lineTo(8.3757f, 12.0f)
                    lineTo(2.7617f, 15.5f)
                    lineTo(4.7867f, 18.752f)
                    lineTo(9.9998f, 15.5f)
                    verticalLineTo(22.0f)
                    close()
                }
            }
        }
        .build()
        return _asterik!!
    }

private var _asterik: ImageVector? = null
