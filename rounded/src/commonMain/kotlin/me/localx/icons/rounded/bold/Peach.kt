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

public val Icons.Bold.Peach: ImageVector
    get() {
        if (_peach != null) {
            return _peach!!
        }
        _peach = Builder(name = "Peach", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.024f, 7.769f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.619f, 1.462f)
                arcTo(4.711f, 4.711f, 0.0f, false, true, 21.0f, 11.522f)
                curveTo(21.0f, 17.775f, 14.691f, 21.0f, 12.0f, 21.0f)
                reflectiveCurveToRelative(-9.0f, -3.225f, -9.0f, -9.478f)
                arcTo(4.363f, 4.363f, 0.0f, false, true, 7.5f, 7.0f)
                arcTo(4.353f, 4.353f, 0.0f, false, true, 12.0f, 11.5f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -1.561f, 3.939f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, 2.122f)
                arcTo(9.2f, 9.2f, 0.0f, false, false, 15.0f, 11.5f)
                arcToRelative(7.739f, 7.739f, 0.0f, false, false, -0.823f, -3.516f)
                curveToRelative(0.092f, 0.0f, 0.182f, 0.014f, 0.275f, 0.014f)
                curveToRelative(4.986f, 0.0f, 7.108f, -4.387f, 7.531f, -6.706f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.12f, 0.119f)
                arcTo(15.876f, 15.876f, 0.0f, false, false, 19.227f, 0.0f)
                curveToRelative(-3.288f, 0.0f, -5.275f, 1.19f, -6.475f, 2.566f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -0.795f, -1.147f)
                arcTo(4.594f, 4.594f, 0.0f, false, false, 8.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcToRelative(1.581f, 1.581f, 0.0f, false, true, 1.261f, 0.463f)
                arcTo(2.545f, 2.545f, 0.0f, false, true, 10.3f, 4.51f)
                arcTo(7.848f, 7.848f, 0.0f, false, false, 7.5f, 4.0f)
                arcTo(7.347f, 7.347f, 0.0f, false, false, 0.0f, 11.522f)
                curveTo(0.0f, 19.6f, 7.927f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(12.0f, -4.4f, 12.0f, -12.478f)
                arcTo(7.707f, 7.707f, 0.0f, false, false, 23.024f, 7.769f)
                close()
            }
        }
        .build()
        return _peach!!
    }

private var _peach: ImageVector? = null
