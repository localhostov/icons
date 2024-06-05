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

public val Icons.Filled.PlaneProp: ImageVector
    get() {
        if (_planeProp != null) {
            return _planeProp!!
        }
        _planeProp = Builder(name = "PlaneProp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.272f, 13.942f)
                curveToRelative(-0.571f, 0.672f, -1.404f, 1.058f, -2.286f, 1.058f)
                horizontalLineToRelative(-5.486f)
                lineToRelative(-0.88f, 4.0f)
                horizontalLineToRelative(1.379f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.821f)
                lineToRelative(-0.146f, 0.662f)
                curveToRelative(-0.301f, 1.363f, -1.533f, 2.338f, -2.929f, 2.338f)
                horizontalLineToRelative(-1.104f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(4.346f)
                lineToRelative(-1.081f, 1.646f)
                curveToRelative(-0.556f, 0.848f, -1.224f, 1.354f, -2.239f, 1.354f)
                horizontalLineTo(0.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(1.014f)
                curveToRelative(1.01f, 0.0f, 1.676f, 0.502f, 2.232f, 1.344f)
                lineToRelative(1.097f, 1.656f)
                horizontalLineToRelative(5.657f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(1.115f)
                curveToRelative(1.408f, 0.0f, 2.613f, 0.982f, 2.918f, 2.369f)
                lineToRelative(0.139f, 0.631f)
                horizontalLineToRelative(1.828f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.386f)
                lineToRelative(0.886f, 4.013f)
                lineToRelative(5.377f, -0.013f)
                curveToRelative(1.519f, 0.0f, 2.837f, 1.076f, 3.069f, 2.504f)
                curveToRelative(0.143f, 0.878f, -0.103f, 1.768f, -0.674f, 2.438f)
                close()
            }
        }
        .build()
        return _planeProp!!
    }

private var _planeProp: ImageVector? = null
