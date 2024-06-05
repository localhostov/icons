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

public val Icons.Bold.WatchSmart: ImageVector
    get() {
        if (_watchSmart != null) {
            return _watchSmart!!
        }
        _watchSmart = Builder(name = "WatchSmart", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 2.338f)
                lineTo(19.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.338f)
                curveToRelative(-1.181f, 0.563f, -2.0f, 1.769f, -2.0f, 3.162f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.393f, 0.819f, 2.599f, 2.0f, 3.162f)
                verticalLineToRelative(2.338f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.338f)
                curveToRelative(1.181f, -0.563f, 2.0f, -1.769f, 2.0f, -3.162f)
                lineTo(21.0f, 5.5f)
                curveToRelative(0.0f, -1.393f, -0.819f, -2.599f, -2.0f, -3.162f)
                close()
                moveTo(18.0f, 18.5f)
                curveToRelative(0.0f, 0.275f, -0.225f, 0.5f, -0.5f, 0.5f)
                lineTo(6.5f, 19.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                lineTo(6.0f, 5.5f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(13.5f, 11.379f)
                lineToRelative(2.561f, 2.561f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-3.439f, -3.439f)
                verticalLineToRelative(-5.621f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.379f)
                close()
            }
        }
        .build()
        return _watchSmart!!
    }

private var _watchSmart: ImageVector? = null
