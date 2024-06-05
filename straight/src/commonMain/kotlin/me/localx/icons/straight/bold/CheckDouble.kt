package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.CheckDouble: ImageVector
    get() {
        if (_checkDouble != null) {
            return _checkDouble!!
        }
        _checkDouble = Builder(name = "CheckDouble", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.01f, 11.26f)
                lineTo(1.923f, 7.044f)
                lineToRelative(2.154f, -2.088f)
                lineToRelative(3.713f, 3.831f)
                lineTo(16.039f, 0.539f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-8.607f, 8.607f)
                curveToRelative(-0.472f, 0.472f, -1.104f, 0.732f, -1.772f, 0.732f)
                curveToRelative(-0.67f, -0.001f, -1.298f, -0.264f, -1.77f, -0.739f)
                close()
                moveTo(21.397f, 6.18f)
                lineToRelative(-13.611f, 13.611f)
                lineToRelative(-5.221f, -5.266f)
                lineToRelative(-2.13f, 2.113f)
                lineToRelative(5.574f, 5.62f)
                curveToRelative(0.472f, 0.476f, 1.1f, 0.738f, 1.77f, 0.74f)
                curveToRelative(0.667f, 0.0f, 1.301f, -0.26f, 1.773f, -0.732f)
                lineToRelative(13.966f, -13.966f)
                lineToRelative(-2.121f, -2.121f)
                close()
            }
        }
        .build()
        return _checkDouble!!
    }

private var _checkDouble: ImageVector? = null
