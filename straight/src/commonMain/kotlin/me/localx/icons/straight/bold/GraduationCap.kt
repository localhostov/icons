package me.localx.icons.straight.bold

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

public val Icons.Bold.GraduationCap: ImageVector
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
                    lineTo(5.0f, 11.2247f)
                    verticalLineTo(20.0187f)
                    lineTo(5.32f, 20.4267f)
                    curveTo(5.527f, 20.6897f, 7.473f, 22.9997f, 12.0f, 22.9997f)
                    curveTo(16.527f, 22.9997f, 18.473f, 20.6897f, 18.68f, 20.4267f)
                    lineTo(19.0f, 20.0187f)
                    verticalLineTo(11.2247f)
                    lineTo(21.0f, 9.9347f)
                    verticalLineTo(19.9997f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(7.9997f)
                    lineTo(14.12f, 1.6266f)
                    close()
                    moveTo(11.506f, 4.1476f)
                    curveTo(11.6527f, 4.0513f, 11.8245f, 4.0f, 12.0f, 4.0f)
                    curveTo(12.1755f, 4.0f, 12.3473f, 4.0513f, 12.494f, 4.1476f)
                    lineTo(18.465f, 7.9997f)
                    lineTo(12.494f, 11.8507f)
                    curveTo(12.3476f, 11.9479f, 12.1757f, 11.9997f, 12.0f, 11.9997f)
                    curveTo(11.8243f, 11.9997f, 11.6524f, 11.9479f, 11.506f, 11.8507f)
                    lineTo(5.535f, 7.9997f)
                    lineTo(11.506f, 4.1476f)
                    close()
                    moveTo(16.0f, 18.8577f)
                    curveTo(14.8308f, 19.6725f, 13.4232f, 20.0744f, 12.0f, 19.9997f)
                    curveTo(10.5772f, 20.0743f, 9.17f, 19.6736f, 8.0f, 18.8607f)
                    verticalLineTo(13.1607f)
                    lineTo(9.88f, 14.3737f)
                    curveTo(10.5114f, 14.7826f, 11.2477f, 15.0002f, 12.0f, 15.0002f)
                    curveTo(12.7523f, 15.0002f, 13.4886f, 14.7826f, 14.12f, 14.3737f)
                    lineTo(16.0f, 13.1597f)
                    verticalLineTo(18.8577f)
                    close()
                }
            }
        }
        .build()
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
