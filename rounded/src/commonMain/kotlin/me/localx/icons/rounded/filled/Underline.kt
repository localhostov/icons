package me.localx.icons.rounded.filled

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

public val Icons.Filled.Underline: ImageVector
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
                    moveTo(11.9999f, 20.0f)
                    curveTo(14.1209f, 19.9976f, 16.1544f, 19.154f, 17.6542f, 17.6542f)
                    curveTo(19.1539f, 16.1544f, 19.9976f, 14.121f, 19.9999f, 12.0f)
                    verticalLineTo(1.0f)
                    curveTo(19.9999f, 0.7348f, 19.8946f, 0.4804f, 19.707f, 0.2929f)
                    curveTo(19.5195f, 0.1054f, 19.2652f, 0.0f, 18.9999f, 0.0f)
                    curveTo(18.7347f, 0.0f, 18.4804f, 0.1054f, 18.2928f, 0.2929f)
                    curveTo(18.1053f, 0.4804f, 17.9999f, 0.7348f, 17.9999f, 1.0f)
                    verticalLineTo(12.0f)
                    curveTo(17.9999f, 13.5913f, 17.3678f, 15.1174f, 16.2426f, 16.2426f)
                    curveTo(15.1174f, 17.3679f, 13.5912f, 18.0f, 11.9999f, 18.0f)
                    curveTo(10.4086f, 18.0f, 8.8825f, 17.3679f, 7.7573f, 16.2426f)
                    curveTo(6.6321f, 15.1174f, 5.9999f, 13.5913f, 5.9999f, 12.0f)
                    verticalLineTo(1.0f)
                    curveTo(5.9999f, 0.7348f, 5.8946f, 0.4804f, 5.707f, 0.2929f)
                    curveTo(5.5195f, 0.1054f, 5.2652f, 0.0f, 4.9999f, 0.0f)
                    curveTo(4.7347f, 0.0f, 4.4804f, 0.1054f, 4.2928f, 0.2929f)
                    curveTo(4.1053f, 0.4804f, 3.9999f, 0.7348f, 3.9999f, 1.0f)
                    verticalLineTo(12.0f)
                    curveTo(4.0023f, 14.121f, 4.8459f, 16.1544f, 6.3457f, 17.6542f)
                    curveTo(7.8455f, 19.154f, 9.8789f, 19.9976f, 11.9999f, 20.0f)
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
