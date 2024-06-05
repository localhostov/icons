package me.localx.icons.rounded.filled

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

public val Icons.Filled.HockeySticks: ImageVector
    get() {
        if (_hockeySticks != null) {
            return _hockeySticks!!
        }
        _hockeySticks = Builder(name = "HockeySticks", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.269f, 24.0f)
                lineTo(5.5f, 24.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 0.025f, 17.963f)
                arcTo(5.65f, 5.65f, 0.0f, false, true, 5.693f, 13.0f)
                horizontalLineToRelative(6.538f)
                arcToRelative(3.978f, 3.978f, 0.0f, false, false, 3.827f, -2.838f)
                lineTo(18.63f, 1.569f)
                arcTo(2.234f, 2.234f, 0.0f, false, true, 21.46f, 0.1f)
                horizontalLineToRelative(0.0f)
                arcTo(2.233f, 2.233f, 0.0f, false, true, 22.9f, 2.877f)
                lineToRelative(-4.065f, 14.03f)
                arcTo(9.942f, 9.942f, 0.0f, false, true, 9.269f, 24.0f)
                close()
                moveTo(20.254f, -0.312f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(21.728f, 14.114f)
                lineTo(20.758f, 17.464f)
                arcTo(11.993f, 11.993f, 0.0f, false, true, 15.929f, 24.0f)
                lineTo(18.5f, 24.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 5.475f, -6.037f)
                arcTo(5.425f, 5.425f, 0.0f, false, false, 21.728f, 14.114f)
                close()
                moveTo(3.54f, 11.305f)
                arcTo(7.768f, 7.768f, 0.0f, false, true, 5.693f, 11.0f)
                lineTo(8.3f, 11.0f)
                arcToRelative(4.022f, 4.022f, 0.0f, false, true, -0.361f, -0.838f)
                lineTo(5.37f, 1.569f)
                arcTo(2.234f, 2.234f, 0.0f, false, false, 1.1f, 2.877f)
                close()
            }
        }
        .build()
        return _hockeySticks!!
    }

private var _hockeySticks: ImageVector? = null
