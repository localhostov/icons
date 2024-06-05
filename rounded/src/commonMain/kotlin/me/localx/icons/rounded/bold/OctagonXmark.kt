package me.localx.icons.rounded.bold

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

public val Icons.Bold.OctagonXmark: ImageVector
    get() {
        if (_octagonXmark != null) {
            return _octagonXmark!!
        }
        _octagonXmark = Builder(name = "OctagonXmark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.389f, 5.418f)
                lineToRelative(-3.808f, -3.808f)
                curveToRelative(-1.039f, -1.039f, -2.42f, -1.611f, -3.889f, -1.611f)
                horizontalLineToRelative(-5.385f)
                curveToRelative(-1.469f, 0.0f, -2.85f, 0.572f, -3.889f, 1.611f)
                lineToRelative(-3.808f, 3.808f)
                curveToRelative(-1.039f, 1.04f, -1.61f, 2.42f, -1.61f, 3.889f)
                verticalLineToRelative(5.385f)
                curveToRelative(0.0f, 1.469f, 0.572f, 2.85f, 1.611f, 3.889f)
                lineToRelative(3.808f, 3.808f)
                curveToRelative(1.04f, 1.039f, 2.42f, 1.61f, 3.889f, 1.61f)
                horizontalLineToRelative(5.385f)
                curveToRelative(1.469f, 0.0f, 2.85f, -0.572f, 3.889f, -1.611f)
                lineToRelative(3.808f, -3.808f)
                curveToRelative(1.039f, -1.04f, 1.611f, -2.421f, 1.611f, -3.889f)
                verticalLineToRelative(-5.385f)
                curveToRelative(0.0f, -1.468f, -0.572f, -2.85f, -1.611f, -3.889f)
                close()
                moveTo(21.0f, 14.692f)
                curveToRelative(0.0f, 0.667f, -0.261f, 1.295f, -0.732f, 1.768f)
                lineToRelative(-3.808f, 3.808f)
                curveToRelative(-0.466f, 0.465f, -1.109f, 0.732f, -1.768f, 0.732f)
                horizontalLineToRelative(-5.385f)
                curveToRelative(-0.667f, 0.0f, -1.296f, -0.26f, -1.768f, -0.732f)
                lineToRelative(-3.807f, -3.808f)
                curveToRelative(-0.472f, -0.472f, -0.732f, -1.101f, -0.732f, -1.768f)
                verticalLineToRelative(-5.385f)
                curveToRelative(0.0f, -0.667f, 0.26f, -1.296f, 0.732f, -1.768f)
                lineToRelative(3.808f, -3.807f)
                curveToRelative(0.472f, -0.472f, 1.101f, -0.732f, 1.768f, -0.732f)
                horizontalLineToRelative(5.385f)
                curveToRelative(0.658f, 0.0f, 1.302f, 0.267f, 1.768f, 0.732f)
                lineToRelative(3.808f, 3.808f)
                curveToRelative(0.472f, 0.473f, 0.732f, 1.101f, 0.732f, 1.768f)
                verticalLineToRelative(5.385f)
                close()
                moveTo(16.061f, 10.06f)
                lineToRelative(-1.939f, 1.939f)
                lineToRelative(1.939f, 1.939f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineToRelative(-1.939f, -1.939f)
                lineToRelative(-1.939f, 1.939f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                curveToRelative(-0.586f, -0.585f, -0.586f, -1.536f, 0.0f, -2.121f)
                lineToRelative(1.939f, -1.939f)
                lineToRelative(-1.939f, -1.939f)
                curveToRelative(-0.586f, -0.585f, -0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                lineToRelative(1.939f, 1.939f)
                lineToRelative(1.939f, -1.939f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                close()
            }
        }
        .build()
        return _octagonXmark!!
    }

private var _octagonXmark: ImageVector? = null
