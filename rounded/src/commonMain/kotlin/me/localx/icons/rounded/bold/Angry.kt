package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

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
                moveTo(17.056f, 14.934f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.1f, 2.142f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, false, -5.911f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.1f, -2.143f)
                curveTo(9.436f, 12.4f, 14.587f, 12.415f, 17.056f, 14.934f)
                close()
                moveTo(18.0f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.0f, 1.415f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 12.0f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(0.0f, -0.018f)
                horizontalLineToRelative(-0.034f)
                curveTo(11.514f, 11.616f, 13.362f, 6.759f, 16.5f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 8.5f)
                close()
                moveTo(7.0f, 9.915f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 7.0f)
                curveToRelative(3.163f, -0.242f, 4.99f, 4.668f, 2.0f, 5.0f)
                lineTo(9.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 9.915f)
                close()
            }
        }
        .build()
        return _angry!!
    }

private var _angry: ImageVector? = null
