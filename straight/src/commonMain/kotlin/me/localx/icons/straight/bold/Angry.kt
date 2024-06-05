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

public val Icons.Bold.Angry: ImageVector
    get() {
        if (_angry != null) {
            return _angry!!
        }
        _angry = Builder(name = "Angry", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.893f, 24.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                arcToRelative(9.011f, 9.011f, 0.0f, false, true, -9.0f, -9.0f)
                curveTo(3.453f, 0.077f, 20.549f, 0.08f, 21.0f, 12.0f)
                arcTo(9.011f, 9.011f, 0.0f, false, true, 12.0f, 21.0f)
                close()
                moveTo(12.0f, 13.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 6.0f, 2.381f)
                lineToRelative(-2.0f, 2.242f)
                arcToRelative(5.861f, 5.861f, 0.0f, false, false, -8.01f, 0.0f)
                lineTo(6.0f, 15.381f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 13.0f)
                close()
                moveTo(13.0f, 10.5f)
                arcTo(3.638f, 3.638f, 0.0f, false, true, 17.0f, 7.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(-0.928f, 0.0f, -1.0f, 0.383f, -1.0f, 0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.0f, 10.5f)
                close()
                moveTo(7.0f, 10.0f)
                lineTo(7.0f, 7.0f)
                arcToRelative(3.638f, 3.638f, 0.0f, false, true, 4.0f, 3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                curveTo(7.99f, 10.4f, 7.959f, 10.0f, 7.0f, 10.0f)
                close()
            }
        }
        .build()
        return _angry!!
    }

private var _angry: ImageVector? = null
