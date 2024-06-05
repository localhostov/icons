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

public val Icons.Bold.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) {
            return _bellSlash!!
        }
        _bellSlash = Builder(name = "BellSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.01f, 16.981f)
                lineToRelative(4.414f, 4.414f)
                curveToRelative(-0.943f, 1.512f, -2.562f, 2.605f, -4.429f, 2.605f)
                curveToRelative(-2.413f, 0.0f, -4.426f, -1.818f, -5.077f, -4.019f)
                lineTo(2.774f, 19.981f)
                curveToRelative(-0.763f, 0.0f, -1.473f, -0.341f, -1.95f, -0.936f)
                curveToRelative(-0.477f, -0.594f, -0.656f, -1.362f, -0.491f, -2.106f)
                lineTo(2.485f, 7.456f)
                lineToRelative(2.507f, 2.507f)
                lineToRelative(-1.594f, 7.018f)
                horizontalLineToRelative(8.612f)
                close()
                moveTo(21.84f, 23.961f)
                lineTo(0.04f, 2.161f)
                lineTo(2.161f, 0.04f)
                lineToRelative(2.797f, 2.797f)
                curveToRelative(1.722f, -1.771f, 4.122f, -2.837f, 6.759f, -2.837f)
                curveToRelative(4.226f, 0.0f, 7.968f, 2.844f, 9.099f, 6.916f)
                lineToRelative(2.805f, 9.896f)
                curveToRelative(0.211f, 0.759f, 0.059f, 1.555f, -0.418f, 2.182f)
                curveToRelative(-0.316f, 0.416f, -0.741f, 0.714f, -1.221f, 0.868f)
                lineToRelative(1.978f, 1.978f)
                lineToRelative(-2.121f, 2.121f)
                close()
                moveTo(19.103f, 16.981f)
                horizontalLineToRelative(1.452f)
                lineToRelative(-2.628f, -9.262f)
                curveToRelative(-0.771f, -2.778f, -3.325f, -4.719f, -6.208f, -4.719f)
                curveToRelative(-1.813f, 0.0f, -3.457f, 0.74f, -4.629f, 1.967f)
                lineToRelative(12.014f, 12.014f)
                close()
            }
        }
        .build()
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
