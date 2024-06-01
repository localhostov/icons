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

public val Icons.Outline.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) {
            return _graduationCap!!
        }
        _graduationCap = Builder(name = "GraduationCap", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.12f, 1.6266f)
                    curveTo(13.4886f, 1.2177f, 12.7523f, 1.0001f, 12.0f, 1.0001f)
                    curveTo(11.2477f, 1.0001f, 10.5114f, 1.2177f, 9.88f, 1.6266f)
                    lineTo(0.0f, 7.9997f)
                    lineTo(4.0f, 10.5797f)
                    verticalLineTo(20.4137f)
                    lineTo(4.293f, 20.7067f)
                    curveTo(4.387f, 20.7997f, 6.647f, 22.9997f, 12.0f, 22.9997f)
                    curveTo(17.353f, 22.9997f, 19.613f, 20.7997f, 19.707f, 20.7067f)
                    lineTo(20.0f, 20.4137f)
                    verticalLineTo(10.5797f)
                    lineTo(22.0f, 9.2896f)
                    verticalLineTo(19.9997f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(7.9997f)
                    lineTo(14.12f, 1.6266f)
                    close()
                    moveTo(18.0f, 19.5157f)
                    curveTo(16.1928f, 20.5978f, 14.1033f, 21.1146f, 12.0f, 20.9997f)
                    curveTo(9.8968f, 21.1149f, 7.8073f, 20.5984f, 6.0f, 19.5167f)
                    verticalLineTo(11.8697f)
                    lineTo(9.88f, 14.3697f)
                    curveTo(10.5111f, 14.7796f, 11.2475f, 14.9977f, 12.0f, 14.9977f)
                    curveTo(12.7525f, 14.9977f, 13.4889f, 14.7796f, 14.12f, 14.3697f)
                    lineTo(18.0f, 11.8697f)
                    verticalLineTo(19.5157f)
                    close()
                    moveTo(13.036f, 12.6917f)
                    curveTo(12.7277f, 12.8922f, 12.3678f, 12.9989f, 12.0f, 12.9989f)
                    curveTo(11.6322f, 12.9989f, 11.2723f, 12.8922f, 10.964f, 12.6917f)
                    lineTo(3.69f, 7.9997f)
                    lineTo(10.964f, 3.3077f)
                    curveTo(11.2723f, 3.1071f, 11.6322f, 3.0004f, 12.0f, 3.0004f)
                    curveTo(12.3678f, 3.0004f, 12.7277f, 3.1071f, 13.036f, 3.3077f)
                    lineTo(20.31f, 7.9997f)
                    lineTo(13.036f, 12.6917f)
                    close()
                }
            }
        }
        .build()
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
