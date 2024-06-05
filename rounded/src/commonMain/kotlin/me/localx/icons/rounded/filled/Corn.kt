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

public val Icons.Filled.Corn: ImageVector
    get() {
        if (_corn != null) {
            return _corn!!
        }
        _corn = Builder(name = "Corn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 11.0f)
                horizontalLineToRelative(3.461f)
                arcToRelative(16.076f, 16.076f, 0.0f, false, true, 1.429f, -0.894f)
                curveToRelative(-0.039f, -0.374f, -0.092f, -0.742f, -0.154f, -1.106f)
                lineTo(17.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(1.278f)
                arcToRelative(15.938f, 15.938f, 0.0f, false, false, -0.73f, -2.0f)
                lineTo(14.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(2.464f)
                curveToRelative(-2.5f, -3.941f, -6.429f, -3.94f, -8.928f, 0.0f)
                lineTo(10.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(6.452f, 5.0f)
                arcToRelative(15.938f, 15.938f, 0.0f, false, false, -0.73f, 2.0f)
                lineTo(7.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 9.0f)
                lineTo(5.264f, 9.0f)
                curveToRelative(-0.062f, 0.364f, -0.115f, 0.732f, -0.154f, 1.106f)
                arcTo(16.076f, 16.076f, 0.0f, false, true, 6.539f, 11.0f)
                lineTo(10.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(8.924f, 13.0f)
                arcTo(19.674f, 19.674f, 0.0f, false, true, 12.0f, 17.027f)
                arcTo(19.674f, 19.674f, 0.0f, false, true, 15.076f, 13.0f)
                lineTo(14.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 11.0f)
                close()
                moveTo(11.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
                moveTo(23.0f, 12.217f)
                curveTo(21.66f, 27.952f, 2.343f, 27.959f, 1.0f, 12.217f)
                arcToRelative(1.119f, 1.119f, 0.0f, false, true, 1.5f, -1.144f)
                curveTo(8.591f, 13.443f, 11.282f, 19.4f, 12.0f, 22.0f)
                curveToRelative(0.718f, -2.6f, 3.409f, -8.557f, 9.5f, -10.927f)
                arcTo(1.119f, 1.119f, 0.0f, false, true, 23.0f, 12.217f)
                close()
            }
        }
        .build()
        return _corn!!
    }

private var _corn: ImageVector? = null
