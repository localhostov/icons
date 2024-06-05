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

public val Icons.Bold.MugHotAlt: ImageVector
    get() {
        if (_mugHotAlt != null) {
            return _mugHotAlt!!
        }
        _mugHotAlt = Builder(name = "MugHotAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 2.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                close()
                moveTo(14.5f, 4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.0f, 2.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 4.0f)
                close()
                moveTo(4.5f, 4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 2.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.5f, 4.0f)
                close()
                moveTo(17.5f, 21.0f)
                lineTo(1.5f, 21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(24.0f, 12.643f)
                arcTo(4.49f, 4.49f, 0.0f, false, true, 19.5f, 17.0f)
                lineTo(15.706f, 17.0f)
                arcToRelative(7.189f, 7.189f, 0.0f, false, true, -5.021f, 2.0f)
                lineTo(8.316f, 19.0f)
                arcToRelative(7.1f, 7.1f, 0.0f, false, true, -5.941f, -3.08f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 0.017f, 9.693f)
                arcTo(3.34f, 3.34f, 0.0f, false, true, 0.862f, 7.117f)
                arcTo(3.4f, 3.4f, 0.0f, false, true, 3.386f, 6.0f)
                lineTo(15.614f, 6.0f)
                arcTo(3.4f, 3.4f, 0.0f, false, true, 18.139f, 7.12f)
                arcTo(3.349f, 3.349f, 0.0f, false, true, 18.979f, 9.0f)
                lineTo(19.5f, 9.0f)
                curveTo(22.233f, 9.0f, 24.0f, 10.43f, 24.0f, 12.643f)
                close()
                moveTo(16.0f, 9.39f)
                arcToRelative(0.333f, 0.333f, 0.0f, false, false, -0.086f, -0.261f)
                arcToRelative(0.389f, 0.389f, 0.0f, false, false, -0.3f, -0.126f)
                lineTo(3.386f, 9.0f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, false, -0.3f, 0.127f)
                arcTo(0.328f, 0.328f, 0.0f, false, false, 3.0f, 9.387f)
                arcTo(9.291f, 9.291f, 0.0f, false, false, 4.867f, 14.25f)
                arcTo(4.106f, 4.106f, 0.0f, false, false, 8.316f, 16.0f)
                horizontalLineToRelative(2.369f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.447f, -1.75f)
                arcTo(9.283f, 9.283f, 0.0f, false, false, 16.0f, 9.39f)
                close()
                moveTo(21.0f, 12.643f)
                curveToRelative(0.0f, -0.56f, -0.94f, -0.643f, -1.5f, -0.643f)
                horizontalLineToRelative(-0.925f)
                arcToRelative(9.844f, 9.844f, 0.0f, false, true, -0.75f, 2.0f)
                lineTo(19.5f, 14.0f)
                arcTo(1.491f, 1.491f, 0.0f, false, false, 21.0f, 12.643f)
                close()
            }
        }
        .build()
        return _mugHotAlt!!
    }

private var _mugHotAlt: ImageVector? = null
