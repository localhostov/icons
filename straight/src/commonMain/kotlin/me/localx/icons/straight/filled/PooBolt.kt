package me.localx.icons.straight.filled

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

public val Icons.Filled.PooBolt: ImageVector
    get() {
        if (_pooBolt != null) {
            return _pooBolt!!
        }
        _pooBolt = Builder(name = "PooBolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.113f, 14.484f)
                curveToRelative(0.547f, -0.684f, 0.887f, -1.54f, 0.887f, -2.484f)
                curveToRelative(0.0f, -1.617f, -0.964f, -3.002f, -2.344f, -3.632f)
                curveToRelative(0.213f, -0.412f, 0.344f, -0.872f, 0.344f, -1.368f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-1.145f)
                curveToRelative(-0.487f, -1.868f, -2.169f, -4.0f, -3.855f, -4.0f)
                curveToRelative(0.0f, 2.0f, -0.75f, 3.25f, -1.5f, 4.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.496f, 0.132f, 0.956f, 0.344f, 1.368f)
                curveToRelative(-1.38f, 0.631f, -2.344f, 2.015f, -2.344f, 3.632f)
                curveToRelative(0.0f, 0.944f, 0.34f, 1.799f, 0.887f, 2.484f)
                curveToRelative(-1.701f, 0.798f, -2.887f, 2.513f, -2.887f, 4.516f)
                curveToRelative(0.0f, 2.761f, 2.239f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, -2.239f, 5.0f, -5.0f)
                curveToRelative(0.0f, -2.003f, -1.186f, -3.719f, -2.887f, -4.516f)
                close()
                moveTo(16.447f, 15.406f)
                lineToRelative(-4.794f, 6.594f)
                horizontalLineToRelative(-1.199f)
                lineToRelative(0.972f, -4.0f)
                horizontalLineToRelative(-3.199f)
                curveToRelative(-0.619f, 0.0f, -1.062f, -0.597f, -0.883f, -1.19f)
                lineToRelative(2.352f, -6.81f)
                horizontalLineToRelative(4.303f)
                lineToRelative(-1.536f, 4.0f)
                horizontalLineToRelative(3.23f)
                curveToRelative(0.722f, 0.0f, 1.153f, 0.804f, 0.754f, 1.406f)
                close()
            }
        }
        .build()
        return _pooBolt!!
    }

private var _pooBolt: ImageVector? = null
