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

public val Icons.Filled.MehRollingEyes: ImageVector
    get() {
        if (_mehRollingEyes != null) {
            return _mehRollingEyes!!
        }
        _mehRollingEyes = Builder(name = "MehRollingEyes", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.847f, 9.149f)
                curveToRelative(0.49f, 1.106f, -0.234f, 2.9f, -1.347f, 2.851f)
                curveToRelative(-1.113f, 0.045f, -1.838f, -1.745f, -1.347f, -2.851f)
                arcTo(1.505f, 1.505f, 0.0f, false, false, 8.847f, 9.149f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 24.0f)
                curveTo(-3.9f, 23.4f, -3.894f, 0.6f, 12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(7.5f, 14.0f)
                curveToRelative(4.612f, -0.129f, 4.611f, -7.872f, 0.0f, -8.0f)
                curveTo(2.888f, 6.129f, 2.889f, 13.872f, 7.5f, 14.0f)
                close()
                moveTo(16.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(20.0f, 10.0f)
                curveToRelative(-0.128f, -5.278f, -6.872f, -5.277f, -7.0f, 0.0f)
                curveTo(13.128f, 15.278f, 19.872f, 15.277f, 20.0f, 10.0f)
                close()
                moveTo(16.5f, 10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.347f, -0.851f)
                curveToRelative(-0.49f, 1.106f, 0.234f, 2.9f, 1.347f, 2.851f)
                curveToRelative(1.113f, 0.045f, 1.838f, -1.745f, 1.347f, -2.851f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 10.0f)
                close()
            }
        }
        .build()
        return _mehRollingEyes!!
    }

private var _mehRollingEyes: ImageVector? = null
