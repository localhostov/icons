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

public val Icons.Bold.BikingMountain: ImageVector
    get() {
        if (_bikingMountain != null) {
            return _bikingMountain!!
        }
        _bikingMountain = Builder(name = "BikingMountain", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 14.0f)
                arcTo(4.5f, 4.5f, 0.0f, true, false, 9.0f, 18.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 4.5f, 14.0f)
                close()
                moveTo(4.5f, 20.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 6.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 20.0f)
                close()
                moveTo(19.5f, 14.0f)
                arcTo(4.5f, 4.5f, 0.0f, true, false, 24.0f, 18.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 19.5f, 14.0f)
                close()
                moveTo(19.5f, 20.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 21.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 20.0f)
                close()
                moveTo(14.0f, 3.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 16.5f, 6.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.0f, 3.5f)
                close()
                moveTo(10.142f, 11.825f)
                lineTo(13.5f, 14.225f)
                lineTo(13.5f, 20.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 15.771f)
                lineTo(8.22f, 14.132f)
                arcTo(3.449f, 3.449f, 0.0f, false, true, 7.4f, 9.9f)
                arcTo(1.994f, 1.994f, 0.0f, false, true, 6.0f, 8.0f)
                curveTo(6.0f, 6.0f, 8.818f, 5.0f, 9.923f, 5.0f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, true, 3.922f, 1.372f)
                curveToRelative(0.068f, 0.049f, 5.217f, 4.5f, 5.217f, 4.5f)
                lineToRelative(-1.969f, 2.262f)
                lineToRelative(-4.369f, -3.8f)
                lineToRelative(-2.607f, 1.826f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.117f, 0.329f)
                arcTo(0.487f, 0.487f, 0.0f, false, false, 10.142f, 11.825f)
                close()
            }
        }
        .build()
        return _bikingMountain!!
    }

private var _bikingMountain: ImageVector? = null
