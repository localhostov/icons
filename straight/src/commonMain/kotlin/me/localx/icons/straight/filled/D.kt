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

public val Icons.Filled.D: ImageVector
    get() {
        if (_d != null) {
            return _d!!
        }
        _d = Builder(name = "D", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineTo(3.0f)
                curveTo(2.0f, 1.346f, 3.346f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(5.514f, 0.0f, 10.0f, 4.486f, 10.0f, 10.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 5.514f, -4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(5.0f, 2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineTo(21.0f)
                curveToRelative(0.0f, 0.551f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(4.411f, 0.0f, 8.0f, -3.589f, 8.0f, -8.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -4.411f, -3.589f, -8.0f, -8.0f, -8.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _d!!
    }

private var _d: ImageVector? = null
