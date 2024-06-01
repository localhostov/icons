package me.localx.icons.rounded.outline

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
import me.localx.icons.rounded.Icons

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
                    moveTo(12.0001f, 20.0f)
                    curveTo(14.1211f, 19.9976f, 16.1545f, 19.154f, 17.6543f, 17.6542f)
                    curveTo(19.1541f, 16.1544f, 19.9977f, 14.121f, 20.0001f, 12.0f)
                    verticalLineTo(1.0f)
                    curveTo(20.0001f, 0.7348f, 19.8947f, 0.4804f, 19.7072f, 0.2929f)
                    curveTo(19.5196f, 0.1054f, 19.2653f, 0.0f, 19.0001f, 0.0f)
                    curveTo(18.7348f, 0.0f, 18.4805f, 0.1054f, 18.293f, 0.2929f)
                    curveTo(18.1054f, 0.4804f, 18.0001f, 0.7348f, 18.0001f, 1.0f)
                    verticalLineTo(12.0f)
                    curveTo(18.0001f, 13.5913f, 17.3679f, 15.1174f, 16.2427f, 16.2426f)
                    curveTo(15.1175f, 17.3679f, 13.5914f, 18.0f, 12.0001f, 18.0f)
                    curveTo(10.4088f, 18.0f, 8.8826f, 17.3679f, 7.7574f, 16.2426f)
                    curveTo(6.6322f, 15.1174f, 6.0001f, 13.5913f, 6.0001f, 12.0f)
                    verticalLineTo(1.0f)
                    curveTo(6.0001f, 0.7348f, 5.8947f, 0.4804f, 5.7072f, 0.2929f)
                    curveTo(5.5196f, 0.1054f, 5.2653f, 0.0f, 5.0001f, 0.0f)
                    curveTo(4.7348f, 0.0f, 4.4805f, 0.1054f, 4.293f, 0.2929f)
                    curveTo(4.1054f, 0.4804f, 4.0001f, 0.7348f, 4.0001f, 1.0f)
                    verticalLineTo(12.0f)
                    curveTo(4.0024f, 14.121f, 4.8461f, 16.1544f, 6.3458f, 17.6542f)
                    curveTo(7.8456f, 19.154f, 9.8791f, 19.9976f, 12.0001f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.0f, 21.9994f)
                    horizontalLineTo(1.0f)
                    curveTo(0.7348f, 21.9994f, 0.4804f, 22.1047f, 0.2929f, 22.2923f)
                    curveTo(0.1054f, 22.4798f, 0.0f, 22.7342f, 0.0f, 22.9994f)
                    curveTo(0.0f, 23.2646f, 0.1054f, 23.5189f, 0.2929f, 23.7065f)
                    curveTo(0.4804f, 23.894f, 0.7348f, 23.9994f, 1.0f, 23.9994f)
                    horizontalLineTo(23.0f)
                    curveTo(23.2652f, 23.9994f, 23.5196f, 23.894f, 23.7071f, 23.7065f)
                    curveTo(23.8946f, 23.5189f, 24.0f, 23.2646f, 24.0f, 22.9994f)
                    curveTo(24.0f, 22.7342f, 23.8946f, 22.4798f, 23.7071f, 22.2923f)
                    curveTo(23.5196f, 22.1047f, 23.2652f, 21.9994f, 23.0f, 21.9994f)
                    close()
                }
            }
        }
        .build()
        return _underline!!
    }

private var _underline: ImageVector? = null
