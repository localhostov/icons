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

public val Icons.Filled.MugTea: ImageVector
    get() {
        if (_mugTea != null) {
            return _mugTea!!
        }
        _mugTea = Builder(name = "MugTea", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.552f, 12.139f)
                curveTo(21.15f, 9.561f, 21.6f, 6.247f, 18.0f, 6.0f)
                lineTo(10.0f, 6.0f)
                verticalLineToRelative(4.584f)
                curveToRelative(0.872f, 0.857f, 2.1f, 1.887f, 2.0f, 3.243f)
                lineTo(12.0f, 15.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 9.5f, 18.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.0f, 15.5f)
                lineTo(6.0f, 13.829f)
                curveToRelative(-0.1f, -1.353f, 1.127f, -2.39f, 2.0f, -3.243f)
                lineTo(8.0f, 6.0f)
                lineTo(3.0f, 6.0f)
                arcToRelative(3.031f, 3.031f, 0.0f, false, false, -2.245f, 0.981f)
                arcToRelative(2.93f, 2.93f, 0.0f, false, false, -0.747f, 2.28f)
                arcTo(31.916f, 31.916f, 0.0f, false, false, 3.144f, 20.066f)
                arcTo(6.976f, 6.976f, 0.0f, false, false, 9.437f, 24.0f)
                horizontalLineToRelative(2.127f)
                arcTo(6.955f, 6.955f, 0.0f, false, false, 17.3f, 21.0f)
                lineTo(19.0f, 21.0f)
                curveTo(24.091f, 21.162f, 26.377f, 13.16f, 20.552f, 12.139f)
                close()
                moveTo(19.0f, 19.0f)
                horizontalLineToRelative(-0.643f)
                arcTo(32.94f, 32.94f, 0.0f, false, false, 20.1f, 14.09f)
                curveTo(21.991f, 14.415f, 22.0f, 15.547f, 22.0f, 16.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 19.0f)
                close()
                moveTo(9.026f, 3.0f)
                lineTo(9.026f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(11.026f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.026f, 3.0f)
                close()
                moveTo(13.026f, 3.0f)
                lineTo(13.026f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(15.026f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.026f, 3.0f)
                close()
                moveTo(5.026f, 3.0f)
                lineTo(5.026f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(7.026f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.026f, 3.0f)
                close()
                moveTo(8.0f, 13.829f)
                curveToRelative(-0.056f, -0.551f, 0.684f, -1.058f, 1.0f, -1.415f)
                curveToRelative(0.317f, 0.363f, 1.055f, 0.86f, 1.0f, 1.415f)
                lineTo(10.0f, 15.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
            }
        }
        .build()
        return _mugTea!!
    }

private var _mugTea: ImageVector? = null
