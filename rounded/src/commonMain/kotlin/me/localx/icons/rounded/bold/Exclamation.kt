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

public val Icons.Bold.Exclamation: ImageVector
    get() {
        if (_exclamation != null) {
            return _exclamation!!
        }
        _exclamation = Builder(name = "Exclamation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
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
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 15.091f)
                    curveTo(12.8284f, 15.091f, 13.5f, 14.4195f, 13.5f, 13.591f)
                    verticalLineTo(6.5911f)
                    curveTo(13.5f, 5.7626f, 12.8284f, 5.0911f, 12.0f, 5.0911f)
                    curveTo(11.1716f, 5.0911f, 10.5f, 5.7626f, 10.5f, 6.5911f)
                    verticalLineTo(13.591f)
                    curveTo(10.5f, 14.4195f, 11.1716f, 15.091f, 12.0f, 15.091f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0051f, 19.0f)
                    curveTo(12.8335f, 19.0f, 13.5051f, 18.3284f, 13.5051f, 17.5f)
                    curveTo(13.5051f, 16.6716f, 12.8335f, 16.0f, 12.0051f, 16.0f)
                    curveTo(11.1766f, 16.0f, 10.5051f, 16.6716f, 10.5051f, 17.5f)
                    curveTo(10.5051f, 18.3284f, 11.1766f, 19.0f, 12.0051f, 19.0f)
                    close()
                }
            }
        }
        .build()
        return _exclamation!!
    }

private var _exclamation: ImageVector? = null
