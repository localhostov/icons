package me.localx.icons.straight.filled

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

public val Icons.Filled.CloudHailMixed: ImageVector
    get() {
        if (_cloudHailMixed != null) {
            return _cloudHailMixed!!
        }
        _cloudHailMixed = Builder(name = "CloudHailMixed", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 15.0f)
                close()
                moveTo(6.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 22.0f)
                close()
                moveTo(9.22f, 14.242f)
                lineTo(7.28f, 13.758f)
                lineTo(5.78f, 19.758f)
                lineTo(7.72f, 20.242f)
                close()
                moveTo(14.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 22.0f)
                close()
                moveTo(17.22f, 14.242f)
                lineTo(15.28f, 13.758f)
                lineTo(13.78f, 19.758f)
                lineTo(15.72f, 20.242f)
                close()
                moveTo(12.286f, 18.012f)
                lineTo(10.346f, 17.527f)
                lineTo(8.846f, 23.527f)
                lineTo(10.786f, 24.012f)
                close()
                moveTo(17.441f, 5.059f)
                curveTo(13.61f, -4.045f, -0.07f, 0.209f, 2.265f, 10.05f)
                arcToRelative(5.524f, 5.524f, 0.0f, false, false, 1.47f, 9.643f)
                lineTo(5.327f, 13.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.264f, 12.0f)
                horizontalLineToRelative(9.978f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.944f, 2.472f)
                lineToRelative(-1.3f, 5.353f)
                lineToRelative(0.114f, 0.024f)
                curveTo(26.22f, 18.075f, 25.826f, 6.193f, 17.441f, 5.059f)
                close()
            }
        }
        .build()
        return _cloudHailMixed!!
    }

private var _cloudHailMixed: ImageVector? = null
