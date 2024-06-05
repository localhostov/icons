package me.localx.icons.straight.outline

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

public val Icons.Outline.Acorn: ImageVector
    get() {
        if (_acorn != null) {
            return _acorn!!
        }
        _acorn = Builder(name = "Acorn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 8.0f)
                curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 2.0f)
                lineTo(7.0f, 2.0f)
                curveTo(3.69f, 2.0f, 1.0f, 4.69f, 1.0f, 8.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 10.0f)
                verticalLineToRelative(3.91f)
                curveToRelative(0.0f, 6.71f, 8.3f, 9.81f, 8.66f, 9.94f)
                lineToRelative(0.34f, 0.12f)
                lineToRelative(0.34f, -0.12f)
                curveToRelative(0.35f, -0.13f, 8.66f, -3.23f, 8.66f, -9.94f)
                verticalLineToRelative(-3.91f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(19.0f, 13.91f)
                curveToRelative(0.0f, 4.64f, -5.55f, 7.31f, -7.0f, 7.92f)
                curveToRelative(-1.45f, -0.61f, -7.0f, -3.27f, -7.0f, -7.92f)
                verticalLineToRelative(-3.91f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(3.91f)
                close()
                moveTo(3.0f, 8.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                lineTo(3.0f, 8.0f)
                close()
            }
        }
        .build()
        return _acorn!!
    }

private var _acorn: ImageVector? = null
