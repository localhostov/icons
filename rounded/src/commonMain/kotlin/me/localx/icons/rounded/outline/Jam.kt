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

public val Icons.Outline.Jam: ImageVector
    get() {
        if (_jam != null) {
            return _jam!!
        }
        _jam = Builder(name = "Jam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.818f, 7.1f)
                arcTo(4.782f, 4.782f, 0.0f, false, false, 20.0f, 4.078f)
                lineTo(20.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(7.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 4.0f, 3.0f)
                lineTo(4.0f, 4.078f)
                curveToRelative(-3.776f, 0.457f, -5.682f, 5.347f, -2.0f, 6.79f)
                lineTo(2.0f, 18.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(22.0f, 10.87f)
                arcTo(2.91f, 2.91f, 0.0f, false, false, 23.818f, 7.1f)
                close()
                moveTo(20.0f, 18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(8.0f, 22.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(4.0f, 10.861f)
                curveToRelative(0.895f, -0.068f, 1.658f, -1.313f, 2.556f, -0.7f)
                arcToRelative(4.058f, 4.058f, 0.0f, false, false, 4.889f, 0.0f)
                arcToRelative(0.947f, 0.947f, 0.0f, false, true, 1.111f, 0.0f)
                arcToRelative(4.058f, 4.058f, 0.0f, false, false, 4.889f, 0.0f)
                curveToRelative(0.9f, -0.619f, 1.658f, 0.627f, 2.555f, 0.7f)
                close()
                moveTo(21.831f, 8.654f)
                curveToRelative(-0.37f, 0.618f, -1.556f, 0.281f, -2.052f, -0.07f)
                arcToRelative(2.945f, 2.945f, 0.0f, false, false, -3.557f, 0.0f)
                arcToRelative(2.03f, 2.03f, 0.0f, false, true, -2.443f, 0.0f)
                arcToRelative(2.945f, 2.945f, 0.0f, false, false, -3.557f, 0.0f)
                arcToRelative(2.03f, 2.03f, 0.0f, false, true, -2.443f, 0.0f)
                arcToRelative(2.945f, 2.945f, 0.0f, false, false, -3.557f, 0.0f)
                curveToRelative(-0.84f, 0.616f, -2.535f, 0.654f, -2.165f, -0.791f)
                arcTo(2.86f, 2.86f, 0.0f, false, true, 5.0f, 6.0f)
                lineTo(15.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(6.0f, 4.0f)
                lineTo(6.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 2.0f)
                lineTo(17.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                lineTo(18.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                curveTo(21.217f, 6.008f, 22.413f, 7.651f, 21.831f, 8.654f)
                close()
            }
        }
        .build()
        return _jam!!
    }

private var _jam: ImageVector? = null
