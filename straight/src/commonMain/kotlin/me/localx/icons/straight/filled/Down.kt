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

public val Icons.Filled.Down: ImageVector
    get() {
        if (_down != null) {
            return _down!!
        }
        _down = Builder(name = "Down", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.8f, 0.0f, -1.56f, -0.31f, -2.12f, -0.88f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveTo(0.07f, 13.0f, 0.07f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(10.0f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(6.95f)
                lineToRelative(-9.82f, 10.11f)
                curveToRelative(-0.58f, 0.58f, -1.33f, 0.89f, -2.13f, 0.89f)
                close()
            }
        }
        .build()
        return _down!!
    }

private var _down: ImageVector? = null
