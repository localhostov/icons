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

public val Icons.Filled.Flower: ImageVector
    get() {
        if (_flower != null) {
            return _flower!!
        }
        _flower = Builder(name = "Flower", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 12.0f)
                close()
                moveTo(22.909f, 15.762f)
                arcToRelative(4.371f, 4.371f, 0.0f, false, true, -6.558f, 3.752f)
                curveToRelative(-0.007f, 5.933f, -8.7f, 5.93f, -8.7f, 0.0f)
                curveToRelative(-5.155f, 2.827f, -9.325f, -4.652f, -4.266f, -7.57f)
                curveToRelative(-5.054f, -2.916f, -0.9f, -10.384f, 4.254f, -7.576f)
                arcToRelative(4.363f, 4.363f, 0.0f, false, true, 8.726f, 0.0f)
                curveToRelative(5.155f, -2.809f, 9.306f, 4.664f, 4.254f, 7.576f)
                arcTo(4.344f, 4.344f, 0.0f, false, true, 22.909f, 15.762f)
                close()
                moveTo(16.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _flower!!
    }

private var _flower: ImageVector? = null
