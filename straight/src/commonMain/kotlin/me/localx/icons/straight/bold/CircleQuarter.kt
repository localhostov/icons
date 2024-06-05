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

public val Icons.Bold.CircleQuarter: ImageVector
    get() {
        if (_circleQuarter != null) {
            return _circleQuarter!!
        }
        _circleQuarter = Builder(name = "CircleQuarter", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 13.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-1.5f)
                curveTo(0.0f, 5.16f, 5.16f, 0.0f, 11.5f, 0.0f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(13.0f)
                close()
                moveTo(3.13f, 10.0f)
                horizontalLineToRelative(6.87f)
                verticalLineTo(3.13f)
                curveToRelative(-3.49f, 0.62f, -6.24f, 3.38f, -6.87f, 6.87f)
                close()
            }
        }
        .build()
        return _circleQuarter!!
    }

private var _circleQuarter: ImageVector? = null
