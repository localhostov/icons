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

public val Icons.Bold.EyeCrossed: ImageVector
    get() {
        if (_eyeCrossed != null) {
            return _eyeCrossed!!
        }
        _eyeCrossed = Builder(name = "EyeCrossed", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.8f, 11.478f)
                arcToRelative(15.436f, 15.436f, 0.0f, false, false, -3.763f, -5.4f)
                lineToRelative(3.02f, -3.019f)
                lineTo(20.939f, 0.939f)
                lineTo(17.565f, 4.314f)
                arcTo(11.585f, 11.585f, 0.0f, false, false, 12.0f, 2.941f)
                curveTo(3.5f, 2.941f, 0.327f, 11.129f, 0.2f, 11.478f)
                lineTo(0.0f, 12.0f)
                lineToRelative(0.2f, 0.522f)
                arcToRelative(15.436f, 15.436f, 0.0f, false, false, 3.763f, 5.4f)
                lineTo(0.939f, 20.939f)
                lineToRelative(2.122f, 2.122f)
                lineToRelative(3.374f, -3.375f)
                arcTo(11.585f, 11.585f, 0.0f, false, false, 12.0f, 21.059f)
                curveToRelative(8.5f, 0.0f, 11.673f, -8.188f, 11.8f, -8.537f)
                lineTo(24.0f, 12.0f)
                close()
                moveTo(3.212f, 12.0f)
                curveTo(3.965f, 10.445f, 6.619f, 5.916f, 12.0f, 5.916f)
                arcToRelative(8.743f, 8.743f, 0.0f, false, true, 3.322f, 0.641f)
                lineToRelative(-1.76f, 1.76f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.245f, 5.245f)
                lineTo(6.065f, 15.813f)
                arcTo(12.293f, 12.293f, 0.0f, false, true, 3.212f, 12.0f)
                close()
                moveTo(12.0f, 18.084f)
                arcToRelative(8.743f, 8.743f, 0.0f, false, true, -3.322f, -0.641f)
                lineToRelative(1.76f, -1.76f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.245f, -5.245f)
                lineToRelative(2.252f, -2.251f)
                arcTo(12.281f, 12.281f, 0.0f, false, true, 20.788f, 12.0f)
                curveTo(20.035f, 13.555f, 17.381f, 18.084f, 12.0f, 18.084f)
                close()
            }
        }
        .build()
        return _eyeCrossed!!
    }

private var _eyeCrossed: ImageVector? = null
