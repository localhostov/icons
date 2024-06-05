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

public val Icons.Filled.UniformMartialArts: ImageVector
    get() {
        if (_uniformMartialArts != null) {
            return _uniformMartialArts!!
        }
        _uniformMartialArts = Builder(name = "UniformMartialArts", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.416f, 0.0f)
                lineToRelative(-3.391f, 6.028f)
                lineTo(8.58f, 0.0f)
                horizontalLineToRelative(6.835f)
                close()
                moveTo(3.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(1.978f)
                lineToRelative(3.904f, -6.941f)
                lineTo(6.366f, 0.156f)
                curveToRelative(-1.952f, 0.347f, -3.589f, 1.239f, -4.704f, 2.022f)
                curveToRelative(-1.041f, 0.732f, -1.662f, 1.945f, -1.662f, 3.246f)
                verticalLineToRelative(15.576f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(22.338f, 2.178f)
                curveToRelative(-1.117f, -0.784f, -2.758f, -1.679f, -4.715f, -2.024f)
                lineTo(9.272f, 15.0f)
                horizontalLineToRelative(9.728f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(5.424f)
                curveToRelative(0.0f, -1.301f, -0.621f, -2.514f, -1.662f, -3.246f)
                close()
                moveTo(5.0f, 17.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-4.975f)
                curveToRelative(0.511f, 0.835f, 0.975f, 1.889f, 0.975f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.83f, -0.51f, -1.753f, -1.0f, -2.436f)
                curveToRelative(-0.49f, 0.683f, -1.0f, 1.607f, -1.0f, 2.436f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.111f, 0.464f, -2.165f, 0.975f, -3.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _uniformMartialArts!!
    }

private var _uniformMartialArts: ImageVector? = null
