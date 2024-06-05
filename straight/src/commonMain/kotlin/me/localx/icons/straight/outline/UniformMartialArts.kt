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

public val Icons.Outline.UniformMartialArts: ImageVector
    get() {
        if (_uniformMartialArts != null) {
            return _uniformMartialArts!!
        }
        _uniformMartialArts = Builder(name = "UniformMartialArts", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 5.424f)
                curveToRelative(0.0f, -1.301f, -0.621f, -2.514f, -1.662f, -3.246f)
                curveToRelative(-1.414f, -0.993f, -3.662f, -2.178f, -6.338f, -2.178f)
                lineTo(8.0f, -0.0f)
                curveTo(5.324f, 0.0f, 3.076f, 1.185f, 1.662f, 2.178f)
                curveToRelative(-1.041f, 0.732f, -1.662f, 1.945f, -1.662f, 3.246f)
                verticalLineToRelative(15.576f)
                lineTo(4.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(20.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                lineTo(24.0f, 5.424f)
                close()
                moveTo(14.29f, 2.0f)
                lineToRelative(-2.265f, 4.028f)
                lineToRelative(-2.302f, -4.028f)
                horizontalLineToRelative(4.567f)
                close()
                moveTo(2.0f, 19.0f)
                lineTo(2.0f, 5.424f)
                curveToRelative(0.0f, -0.65f, 0.304f, -1.252f, 0.812f, -1.609f)
                curveToRelative(1.073f, -0.754f, 2.709f, -1.64f, 4.62f, -1.792f)
                lineToRelative(3.45f, 6.037f)
                lineToRelative(-3.904f, 6.941f)
                horizontalLineToRelative(-0.978f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(13.0f)
                lineTo(2.0f, 19.0f)
                close()
                moveTo(6.0f, 22.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.968f)
                curveToRelative(-0.509f, 0.834f, -0.968f, 1.892f, -0.968f, 3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -0.829f, 0.51f, -1.756f, 1.0f, -2.439f)
                curveToRelative(0.49f, 0.683f, 1.0f, 1.609f, 1.0f, 2.439f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.108f, -0.459f, -2.166f, -0.968f, -3.0f)
                horizontalLineToRelative(3.968f)
                verticalLineToRelative(5.0f)
                lineTo(6.0f, 22.0f)
                close()
                moveTo(22.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(20.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(18.0f, 15.0f)
                lineTo(9.272f, 15.0f)
                lineTo(16.572f, 2.023f)
                curveToRelative(1.909f, 0.152f, 3.543f, 1.037f, 4.615f, 1.791f)
                curveToRelative(0.509f, 0.357f, 0.813f, 0.959f, 0.813f, 1.609f)
                verticalLineToRelative(13.576f)
                close()
            }
        }
        .build()
        return _uniformMartialArts!!
    }

private var _uniformMartialArts: ImageVector? = null
