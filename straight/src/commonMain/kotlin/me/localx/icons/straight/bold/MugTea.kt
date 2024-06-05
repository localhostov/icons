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

public val Icons.Bold.MugTea: ImageVector
    get() {
        if (_mugTea != null) {
            return _mugTea!!
        }
        _mugTea = Builder(name = "MugTea", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                lineTo(9.0f, 4.0f)
                lineTo(9.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(17.0f, 0.0f)
                lineTo(14.0f, 0.0f)
                lineTo(14.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(7.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                lineTo(4.0f, 4.0f)
                lineTo(7.0f, 4.0f)
                close()
                moveTo(24.0f, 16.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, -5.5f, 5.5f)
                lineTo(16.166f, 21.5f)
                arcToRelative(21.285f, 21.285f, 0.0f, false, true, -1.2f, 1.894f)
                lineToRelative(-0.45f, 0.606f)
                lineTo(5.482f, 24.0f)
                lineToRelative(-0.45f, -0.605f)
                arcTo(29.829f, 29.829f, 0.0f, false, true, 0.017f, 9.741f)
                arcTo(3.4f, 3.4f, 0.0f, false, true, 3.4f, 6.0f)
                lineTo(16.6f, 6.0f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, 3.378f, 3.741f)
                curveToRelative(-0.064f, 0.629f, -0.154f, 1.237f, -0.255f, 1.834f)
                curveTo(22.426f, 11.939f, 24.0f, 13.535f, 24.0f, 16.0f)
                close()
                moveTo(17.0f, 9.443f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.1f, -0.311f)
                arcTo(0.379f, 0.379f, 0.0f, false, false, 16.6f, 9.0f)
                lineTo(11.0f, 9.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                lineTo(7.0f, 17.0f)
                lineTo(7.0f, 13.0f)
                lineToRelative(1.0f, -1.0f)
                lineTo(8.0f, 9.0f)
                lineTo(3.4f, 9.0f)
                arcToRelative(0.383f, 0.383f, 0.0f, false, false, -0.292f, 0.129f)
                arcTo(0.4f, 0.4f, 0.0f, false, false, 3.0f, 9.44f)
                arcTo(27.58f, 27.58f, 0.0f, false, false, 7.035f, 21.0f)
                horizontalLineToRelative(5.93f)
                arcTo(27.6f, 27.6f, 0.0f, false, false, 17.0f, 9.443f)
                close()
                moveTo(21.0f, 16.0f)
                curveToRelative(0.0f, -0.411f, -0.006f, -1.327f, -1.932f, -1.477f)
                arcToRelative(31.051f, 31.051f, 0.0f, false, true, -1.4f, 3.977f)
                lineTo(18.5f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.0f, 16.0f)
                close()
            }
        }
        .build()
        return _mugTea!!
    }

private var _mugTea: ImageVector? = null
