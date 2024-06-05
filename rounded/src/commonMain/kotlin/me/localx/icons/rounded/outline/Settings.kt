package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Settings: ImageVector
    get() {
        if (_settings != null) {
            return _settings!!
        }
        _settings = Builder(name = "Settings", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 8.0f)
                close()
                moveTo(12.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.294f, 13.9f)
                lineToRelative(-0.444f, -0.256f)
                arcToRelative(9.1f, 9.1f, 0.0f, false, false, 0.0f, -3.29f)
                lineToRelative(0.444f, -0.256f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -3.0f, -5.2f)
                lineToRelative(-0.445f, 0.257f)
                arcTo(8.977f, 8.977f, 0.0f, false, false, 15.0f, 3.513f)
                lineTo(15.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 3.0f)
                verticalLineToRelative(0.513f)
                arcTo(8.977f, 8.977f, 0.0f, false, false, 6.152f, 5.159f)
                lineTo(5.705f, 4.9f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 5.2f)
                lineToRelative(0.444f, 0.256f)
                arcToRelative(9.1f, 9.1f, 0.0f, false, false, 0.0f, 3.29f)
                lineToRelative(-0.444f, 0.256f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 3.0f, 5.2f)
                lineToRelative(0.445f, -0.257f)
                arcTo(8.977f, 8.977f, 0.0f, false, false, 9.0f, 20.487f)
                lineTo(9.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                verticalLineToRelative(-0.513f)
                arcToRelative(8.977f, 8.977f, 0.0f, false, false, 2.848f, -1.646f)
                lineToRelative(0.447f, 0.258f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -5.2f)
                close()
                moveTo(18.746f, 10.124f)
                arcToRelative(7.048f, 7.048f, 0.0f, false, true, 0.0f, 3.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.464f, 1.133f)
                lineToRelative(1.084f, 0.626f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.733f)
                lineToRelative(-1.086f, -0.628f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.215f, 0.165f)
                arcToRelative(6.984f, 6.984f, 0.0f, false, true, -3.243f, 1.875f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.751f, 0.969f)
                lineTo(12.999f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(10.999f, 19.748f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.751f, -0.969f)
                arcTo(6.984f, 6.984f, 0.0f, false, true, 7.006f, 16.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.215f, -0.165f)
                lineToRelative(-1.084f, 0.627f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.732f)
                lineToRelative(1.084f, -0.626f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.464f, -1.133f)
                arcToRelative(7.048f, 7.048f, 0.0f, false, true, 0.0f, -3.75f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.79f, 8.992f)
                lineTo(3.706f, 8.366f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.733f)
                lineToRelative(1.086f, 0.628f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.006f, 7.1f)
                arcToRelative(6.984f, 6.984f, 0.0f, false, true, 3.243f, -1.875f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 4.252f)
                lineTo(11.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(13.0f, 4.252f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.751f, 0.969f)
                arcTo(6.984f, 6.984f, 0.0f, false, true, 16.994f, 7.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.215f, 0.165f)
                lineToRelative(1.084f, -0.627f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, 1.732f)
                lineToRelative(-1.084f, 0.626f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.746f, 10.125f)
                close()
            }
        }
        .build()
        return _settings!!
    }

private var _settings: ImageVector? = null
