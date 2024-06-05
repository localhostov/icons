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

public val Icons.Filled.Right: ImageVector
    get() {
        if (_right != null) {
            return _right!!
        }
        _right = Builder(name = "Right", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 23.94f)
                verticalLineToRelative(-6.93f)
                horizontalLineTo(0.0f)
                verticalLineTo(7.01f)
                horizontalLineTo(13.0f)
                verticalLineTo(0.06f)
                lineToRelative(10.11f, 9.82f)
                curveToRelative(0.58f, 0.58f, 0.89f, 1.33f, 0.89f, 2.13f)
                reflectiveCurveToRelative(-0.31f, 1.56f, -0.88f, 2.13f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(-10.11f, 9.8f, -10.11f, 9.8f)
                close()
            }
        }
        .build()
        return _right!!
    }

private var _right: ImageVector? = null
