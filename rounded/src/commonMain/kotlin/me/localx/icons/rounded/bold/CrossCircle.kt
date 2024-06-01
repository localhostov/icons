package me.localx.icons.rounded.bold

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

public val Icons.Bold.CrossCircle: ImageVector
    get() {
        if (_crossCircle != null) {
            return _crossCircle!!
        }
        _crossCircle = Builder(name = "CrossCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.061f, 7.9389f)
                    curveTo(15.4754f, 7.353f, 14.5257f, 7.3527f, 13.9397f, 7.9383f)
                    curveTo(13.9395f, 7.9385f, 13.9392f, 7.9388f, 13.939f, 7.9389f)
                    lineTo(12.0f, 9.879f)
                    lineTo(10.061f, 7.9389f)
                    curveTo(9.475f, 7.353f, 8.525f, 7.353f, 7.9391f, 7.9389f)
                    curveTo(7.3531f, 8.5249f, 7.3531f, 9.475f, 7.9391f, 10.0609f)
                    lineTo(9.879f, 12.0f)
                    lineTo(7.939f, 13.9389f)
                    curveTo(7.353f, 14.5249f, 7.353f, 15.475f, 7.939f, 16.0609f)
                    curveTo(8.525f, 16.6469f, 9.475f, 16.6469f, 10.061f, 16.0609f)
                    lineTo(12.0f, 14.121f)
                    lineTo(13.939f, 16.061f)
                    curveTo(14.525f, 16.647f, 15.475f, 16.647f, 16.061f, 16.061f)
                    curveTo(16.647f, 15.475f, 16.647f, 14.5249f, 16.061f, 13.939f)
                    lineTo(14.121f, 12.0f)
                    lineTo(16.061f, 10.061f)
                    curveTo(16.647f, 9.4754f, 16.6473f, 8.5256f, 16.0617f, 7.9397f)
                    curveTo(16.0614f, 7.9394f, 16.0613f, 7.9392f, 16.061f, 7.9389f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 0.0f)
                    curveTo(5.3726f, 0.0f, 0.0f, 5.3726f, 0.0f, 12.0f)
                    curveTo(0.0f, 18.6274f, 5.3726f, 24.0f, 12.0f, 24.0f)
                    curveTo(18.6274f, 24.0f, 24.0f, 18.6274f, 24.0f, 12.0f)
                    curveTo(23.9928f, 5.3755f, 18.6245f, 0.0072f, 12.0f, 0.0f)
                    close()
                    moveTo(12.0f, 21.0f)
                    curveTo(7.0294f, 21.0f, 3.0f, 16.9706f, 3.0f, 12.0f)
                    curveTo(3.0f, 7.0294f, 7.0294f, 3.0f, 12.0f, 3.0f)
                    curveTo(16.9706f, 3.0f, 21.0f, 7.0294f, 21.0f, 12.0f)
                    curveTo(20.9945f, 16.9683f, 16.9683f, 20.9945f, 12.0f, 21.0f)
                    close()
                }
            }
        }
        .build()
        return _crossCircle!!
    }

private var _crossCircle: ImageVector? = null
