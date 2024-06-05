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

public val Icons.Filled.Poo: ImageVector
    get() {
        if (_poo != null) {
            return _poo!!
        }
        _poo = Builder(name = "Poo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.113f, 14.484f)
                arcToRelative(4.007f, 4.007f, 0.0f, false, false, -1.457f, -6.116f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 17.0f, 4.0f)
                lineTo(15.855f, 4.0f)
                curveTo(15.368f, 2.132f, 13.686f, 0.0f, 12.0f, 0.0f)
                arcToRelative(5.42f, 5.42f, 0.0f, false, true, -1.5f, 4.0f)
                lineTo(7.0f, 4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 4.344f, 8.368f)
                arcToRelative(4.007f, 4.007f, 0.0f, false, false, -1.457f, 6.116f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 5.0f, 24.0f)
                lineTo(19.0f, 24.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 21.113f, 14.484f)
                close()
                moveTo(14.5f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 11.0f)
                close()
                moveTo(9.5f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 11.0f)
                close()
                moveTo(12.0f, 19.0f)
                arcToRelative(9.454f, 9.454f, 0.0f, false, true, -5.666f, -2.254f)
                lineToRelative(1.332f, -1.492f)
                arcToRelative(6.359f, 6.359f, 0.0f, false, false, 8.67f, 0.0f)
                lineToRelative(1.33f, 1.493f)
                arcTo(9.454f, 9.454f, 0.0f, false, true, 12.0f, 19.0f)
                close()
            }
        }
        .build()
        return _poo!!
    }

private var _poo: ImageVector? = null
