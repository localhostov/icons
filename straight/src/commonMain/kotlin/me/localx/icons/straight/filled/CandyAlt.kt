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

public val Icons.Filled.CandyAlt: ImageVector
    get() {
        if (_candyAlt != null) {
            return _candyAlt!!
        }
        _candyAlt = Builder(name = "CandyAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.276f, 1.724f)
                arcTo(8.942f, 8.942f, 0.0f, false, true, 22.0f, 7.0f)
                arcToRelative(7.013f, 7.013f, 0.0f, false, true, -5.569f, 6.853f)
                arcTo(5.23f, 5.23f, 0.0f, false, true, 10.0f, 9.048f)
                arcToRelative(5.009f, 5.009f, 0.0f, false, true, 4.149f, -4.975f)
                arcToRelative(3.169f, 3.169f, 0.0f, false, true, 3.833f, 2.594f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 10.0f)
                verticalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                arcToRelative(1.069f, 1.069f, 0.0f, false, false, -1.0f, -1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.978f, 3.364f)
                arcToRelative(3.165f, 3.165f, 0.0f, false, false, 3.613f, 2.6f)
                arcTo(5.008f, 5.008f, 0.0f, false, false, 20.0f, 7.0f)
                quadToRelative(0.0f, -0.332f, -0.031f, -0.657f)
                curveTo(19.446f, 0.748f, 12.368f, -1.268f, 8.488f, 2.8f)
                arcTo(8.9f, 8.9f, 0.0f, false, false, 8.0f, 14.587f)
                lineTo(0.043f, 22.543f)
                lineToRelative(1.414f, 1.414f)
                lineTo(9.416f, 16.0f)
                arcToRelative(8.877f, 8.877f, 0.0f, false, false, 5.308f, 2.0f)
                arcTo(8.99f, 8.99f, 0.0f, false, false, 20.276f, 1.724f)
                close()
            }
        }
        .build()
        return _candyAlt!!
    }

private var _candyAlt: ImageVector? = null
