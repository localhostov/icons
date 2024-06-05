package me.localx.icons.rounded.outline

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

public val Icons.Outline.ManHead: ImageVector
    get() {
        if (_manHead != null) {
            return _manHead!!
        }
        _manHead = Builder(name = "ManHead", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 16.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 13.0f)
                close()
                moveTo(21.851f, 8.274f)
                arcTo(9.975f, 9.975f, 0.0f, false, false, 12.0f, 0.0f)
                curveTo(5.1f, 0.0f, 3.124f, 4.674f, 1.819f, 7.767f)
                arcTo(6.372f, 6.372f, 0.0f, false, true, 0.5f, 10.136f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.379f, 1.856f)
                arcToRelative(15.806f, 15.806f, 0.0f, false, false, 7.257f, -1.1f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.724f, -0.84f)
                arcToRelative(15.09f, 15.09f, 0.0f, false, false, 4.956f, -4.467f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.626f, -1.162f)
                arcTo(13.357f, 13.357f, 0.0f, false, true, 3.0f, 10.027f)
                curveToRelative(0.227f, -0.453f, 0.438f, -0.956f, 0.662f, -1.483f)
                curveTo(4.892f, 5.628f, 6.423f, 2.0f, 12.0f, 2.0f)
                arcToRelative(7.978f, 7.978f, 0.0f, false, true, 7.954f, 7.15f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.816f, 0.878f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.5f, 13.0f)
                arcToRelative(1.606f, 1.606f, 0.0f, false, true, -0.252f, -0.027f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, false, -1.117f, 0.651f)
                curveTo(18.215f, 16.221f, 15.132f, 19.0f, 12.0f, 19.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-2.9f, 0.0f, -5.6f, -2.283f, -6.766f, -4.539f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.776f, 0.92f)
                arcTo(11.264f, 11.264f, 0.0f, false, false, 8.0f, 19.953f)
                lineTo(8.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(10.0f, 20.738f)
                arcToRelative(7.708f, 7.708f, 0.0f, false, false, 4.0f, 0.0f)
                lineTo(14.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(16.0f, 19.954f)
                arcToRelative(11.037f, 11.037f, 0.0f, false, false, 4.732f, -4.962f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.119f, -6.718f)
                close()
            }
        }
        .build()
        return _manHead!!
    }

private var _manHead: ImageVector? = null
