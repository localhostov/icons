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

public val Icons.Bold.MehRollingEyes: ImageVector
    get() {
        if (_mehRollingEyes != null) {
            return _mehRollingEyes!!
        }
        _mehRollingEyes = Builder(name = "MehRollingEyes", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 18.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.5f, 18.0f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                curveTo(-3.9f, 0.6f, -3.893f, 23.4f, 12.0f, 24.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 24.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, true, -9.0f, 9.0f)
                curveTo(0.076f, 20.548f, 0.081f, 3.45f, 12.0f, 3.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, true, 21.0f, 12.0f)
                close()
                moveTo(16.5f, 6.0f)
                curveToRelative(-4.612f, 0.129f, -4.611f, 7.872f, 0.0f, 8.0f)
                curveTo(21.112f, 13.871f, 21.111f, 6.128f, 16.5f, 6.0f)
                close()
                moveTo(16.5f, 12.0f)
                curveToRelative(-1.114f, 0.045f, -1.833f, -1.743f, -1.352f, -2.85f)
                arcToRelative(1.514f, 1.514f, 0.0f, false, false, 2.7f, 0.0f)
                curveTo(18.333f, 10.257f, 17.614f, 12.045f, 16.5f, 12.0f)
                close()
                moveTo(11.0f, 10.0f)
                curveToRelative(-0.128f, -5.278f, -6.872f, -5.277f, -7.0f, 0.0f)
                curveTo(4.128f, 15.278f, 10.872f, 15.277f, 11.0f, 10.0f)
                close()
                moveTo(6.0f, 10.0f)
                arcToRelative(2.479f, 2.479f, 0.0f, false, true, 0.148f, -0.85f)
                arcToRelative(1.514f, 1.514f, 0.0f, false, false, 2.7f, 0.0f)
                curveTo(9.772f, 11.956f, 6.265f, 13.4f, 6.0f, 10.0f)
                close()
            }
        }
        .build()
        return _mehRollingEyes!!
    }

private var _mehRollingEyes: ImageVector? = null
