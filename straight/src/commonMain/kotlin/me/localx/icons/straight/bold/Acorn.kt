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

public val Icons.Bold.Acorn: ImageVector
    get() {
        if (_acorn != null) {
            return _acorn!!
        }
        _acorn = Builder(name = "Acorn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 8.5f)
                curveToRelative(0.0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                horizontalLineToRelative(-3.0f)
                lineTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 2.0f)
                horizontalLineToRelative(-3.0f)
                curveTo(3.92f, 2.0f, 1.0f, 4.92f, 1.0f, 8.5f)
                verticalLineToRelative(2.5f)
                lineTo(3.0f, 11.0f)
                verticalLineToRelative(2.93f)
                curveToRelative(0.0f, 6.68f, 8.14f, 9.72f, 8.49f, 9.85f)
                lineToRelative(0.51f, 0.19f)
                lineToRelative(0.51f, -0.19f)
                curveToRelative(0.35f, -0.13f, 8.49f, -3.17f, 8.49f, -9.85f)
                verticalLineToRelative(-2.93f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(7.5f, 5.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.76f, 0.0f, 3.22f, 1.31f, 3.46f, 3.0f)
                lineTo(4.04f, 8.0f)
                curveToRelative(0.24f, -1.69f, 1.7f, -3.0f, 3.46f, -3.0f)
                close()
                moveTo(18.0f, 13.93f)
                curveToRelative(0.0f, 3.81f, -4.46f, 6.13f, -6.0f, 6.81f)
                curveToRelative(-1.54f, -0.69f, -6.0f, -3.01f, -6.0f, -6.81f)
                verticalLineToRelative(-2.93f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.93f)
                close()
            }
        }
        .build()
        return _acorn!!
    }

private var _acorn: ImageVector? = null
