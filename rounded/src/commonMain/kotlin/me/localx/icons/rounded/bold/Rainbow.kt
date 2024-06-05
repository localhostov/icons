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

public val Icons.Bold.Rainbow: ImageVector
    get() {
        if (_rainbow != null) {
            return _rainbow!!
        }
        _rainbow = Builder(name = "Rainbow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.0f, 19.5f)
                lineTo(21.0f, 15.0f)
                curveTo(20.526f, 3.066f, 3.47f, 3.075f, 3.0f, 15.0f)
                verticalLineToRelative(4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(0.0f, 15.0f)
                curveTo(0.661f, -0.924f, 23.345f, -0.911f, 24.0f, 15.0f)
                verticalLineToRelative(4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 22.5f, 21.0f)
                close()
                moveTo(19.0f, 19.5f)
                lineTo(19.0f, 15.0f)
                curveTo(18.67f, 5.733f, 5.327f, 5.74f, 5.0f, 15.0f)
                verticalLineToRelative(4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(8.0f, 15.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
                moveTo(14.0f, 19.5f)
                lineTo(14.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                verticalLineToRelative(4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 21.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.0f, 19.5f)
                close()
            }
        }
        .build()
        return _rainbow!!
    }

private var _rainbow: ImageVector? = null
