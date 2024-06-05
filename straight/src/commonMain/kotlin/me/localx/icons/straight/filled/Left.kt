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

public val Icons.Filled.Left: ImageVector
    get() {
        if (_left != null) {
            return _left!!
        }
        _left = Builder(name = "Left", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 23.94f)
                lineTo(0.89f, 14.13f)
                curveTo(0.31f, 13.55f, 0.0f, 12.79f, 0.0f, 11.99f)
                curveTo(0.0f, 11.19f, 0.31f, 10.43f, 0.88f, 9.87f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveTo(11.0f, 0.06f, 11.0f, 0.06f)
                verticalLineTo(6.99f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(10.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(6.95f)
                close()
            }
        }
        .build()
        return _left!!
    }

private var _left: ImageVector? = null
