package me.localx.icons.straight.filled

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

public val Icons.Filled.GraduationCap: ImageVector
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
                    moveTo(24.0f, 7.9997f)
                    verticalLineTo(19.9997f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(9.2896f)
                    lineTo(14.12f, 14.3717f)
                    curveTo(13.4889f, 14.7816f, 12.7525f, 14.9997f, 12.0f, 14.9997f)
                    curveTo(11.2475f, 14.9997f, 10.5111f, 14.7816f, 9.88f, 14.3717f)
                    lineTo(0.0f, 7.9997f)
                    lineTo(9.88f, 1.6266f)
                    curveTo(10.5114f, 1.2177f, 11.2477f, 1.0001f, 12.0f, 1.0001f)
                    curveTo(12.7523f, 1.0001f, 13.4886f, 1.2177f, 14.12f, 1.6266f)
                    lineTo(24.0f, 7.9997f)
                    close()
                    moveTo(12.0f, 16.9997f)
                    curveTo(10.8644f, 16.9989f, 9.7532f, 16.67f, 8.8f, 16.0527f)
                    lineTo(4.0f, 12.9597f)
                    verticalLineTo(20.4137f)
                    lineTo(4.293f, 20.7067f)
                    curveTo(4.387f, 20.7997f, 6.647f, 22.9997f, 12.0f, 22.9997f)
                    curveTo(17.353f, 22.9997f, 19.613f, 20.7997f, 19.707f, 20.7067f)
                    lineTo(20.0f, 20.4137f)
                    verticalLineTo(12.9597f)
                    lineTo(15.2f, 16.0527f)
                    curveTo(14.2468f, 16.67f, 13.1356f, 16.9989f, 12.0f, 16.9997f)
                    close()
                }
            }
        }
        .build()
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
