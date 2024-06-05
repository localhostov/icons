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

public val Icons.Filled.Cheese: ImageVector
    get() {
        if (_cheese != null) {
            return _cheese!!
        }
        _cheese = Builder(name = "Cheese", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.143f, 8.039f)
                arcTo(20.211f, 20.211f, 0.0f, false, true, 8.043f, 0.96f)
                arcTo(4.962f, 4.962f, 0.0f, false, true, 13.751f, 0.849f)
                lineTo(23.332f, 8.0f)
                lineTo(2.673f, 8.0f)
                arcTo(4.031f, 4.031f, 0.0f, false, false, 2.143f, 8.039f)
                close()
                moveTo(24.0f, 10.0f)
                lineTo(24.0f, 24.0f)
                lineTo(15.0f, 24.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, 0.0f)
                lineTo(4.833f, 24.0f)
                curveTo(-0.529f, 23.922f, -0.648f, 14.842f, 0.884f, 11.131f)
                arcTo(1.977f, 1.977f, 0.0f, false, true, 2.673f, 10.0f)
                close()
                moveTo(9.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 15.0f)
                close()
                moveTo(20.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 18.0f)
                close()
            }
        }
        .build()
        return _cheese!!
    }

private var _cheese: ImageVector? = null
