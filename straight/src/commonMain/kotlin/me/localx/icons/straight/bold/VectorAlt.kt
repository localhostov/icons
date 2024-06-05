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

public val Icons.Bold.VectorAlt: ImageVector
    get() {
        if (_vectorAlt != null) {
            return _vectorAlt!!
        }
        _vectorAlt = Builder(name = "VectorAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 15.0f)
                lineTo(21.5f, 12.0f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, -5.092f, -8.408f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -8.816f, 0.0f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 2.5f, 12.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 15.0f)
                verticalLineToRelative(6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 2.5f, 24.0f)
                lineTo(9.0f, 24.0f)
                lineTo(9.0f, 15.0f)
                lineTo(5.5f, 15.0f)
                lineTo(5.5f, 12.0f)
                arcTo(6.485f, 6.485f, 0.0f, false, true, 8.143f, 6.781f)
                arcToRelative(4.462f, 4.462f, 0.0f, false, false, 7.714f, 0.0f)
                arcTo(6.485f, 6.485f, 0.0f, false, true, 18.5f, 12.0f)
                verticalLineToRelative(3.0f)
                lineTo(15.0f, 15.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 24.0f, 21.5f)
                lineTo(24.0f, 15.0f)
                close()
                moveTo(6.0f, 18.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 18.0f)
                close()
                moveTo(12.0f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.5f, -1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 6.0f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(18.0f, 21.0f)
                lineTo(18.0f, 18.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _vectorAlt!!
    }

private var _vectorAlt: ImageVector? = null
