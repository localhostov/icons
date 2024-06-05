package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Films: ImageVector
    get() {
        if (_films != null) {
            return _films!!
        }
        _films = Builder(name = "Films", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 22.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(5.0f, 23.0f)
                curveToRelative(-2.761f, 0.0f, -5.0f, -2.239f, -5.0f, -5.0f)
                verticalLineToRelative(-7.764f)
                curveToRelative(0.0f, -1.136f, 0.486f, -2.223f, 1.333f, -2.981f)
                curveToRelative(0.293f, -0.263f, 0.715f, -0.329f, 1.075f, -0.168f)
                curveToRelative(0.36f, 0.161f, 0.592f, 0.519f, 0.592f, 0.913f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 3.59f, 2.91f, 6.5f, 6.5f, 6.5f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(24.0f, 5.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-10.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                lineTo(5.0f, 5.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                close()
                moveTo(22.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(20.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(20.0f, 3.05f)
                verticalLineToRelative(1.95f)
                horizontalLineToRelative(1.95f)
                curveToRelative(-0.199f, -0.978f, -0.972f, -1.75f, -1.95f, -1.95f)
                close()
                moveTo(7.0f, 7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(7.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(7.05f, 5.0f)
                horizontalLineToRelative(1.95f)
                verticalLineToRelative(-1.95f)
                curveToRelative(-0.978f, 0.199f, -1.75f, 0.971f, -1.95f, 1.95f)
                close()
                moveTo(9.0f, 16.95f)
                verticalLineToRelative(-1.95f)
                horizontalLineToRelative(-1.95f)
                curveToRelative(0.199f, 0.978f, 0.972f, 1.75f, 1.95f, 1.95f)
                close()
                moveTo(21.95f, 15.0f)
                horizontalLineToRelative(-1.95f)
                verticalLineToRelative(1.95f)
                curveToRelative(0.978f, -0.199f, 1.75f, -0.971f, 1.95f, -1.95f)
                close()
            }
        }
        .build()
        return _films!!
    }

private var _films: ImageVector? = null
