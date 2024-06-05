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

public val Icons.Filled.TrashSlash: ImageVector
    get() {
        if (_trashSlash != null) {
            return _trashSlash!!
        }
        _trashSlash = Builder(name = "TrashSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.855f, 23.0f)
                curveToRelative(-0.551f, 0.612f, -1.341f, 1.0f, -2.222f, 1.0f)
                lineTo(7.329f, 24.0f)
                curveToRelative(-1.531f, 0.0f, -2.813f, -1.147f, -2.982f, -2.669f)
                lineToRelative(-1.604f, -14.444f)
                lineToRelative(16.113f, 16.113f)
                close()
                moveTo(23.957f, 22.543f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.043f, 1.457f)
                lineTo(1.457f, 0.043f)
                lineToRelative(3.957f, 3.957f)
                horizontalLineToRelative(1.586f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.682f)
                lineToRelative(-1.39f, 12.513f)
                lineToRelative(4.03f, 4.03f)
                close()
                moveTo(9.0f, 4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _trashSlash!!
    }

private var _trashSlash: ImageVector? = null
