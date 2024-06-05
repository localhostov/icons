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

public val Icons.Bold.OctagonPlus: ImageVector
    get() {
        if (_octagonPlus != null) {
            return _octagonPlus!!
        }
        _octagonPlus = Builder(name = "OctagonPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.389f, 5.418f)
                lineToRelative(-3.808f, -3.808f)
                curveToRelative(-1.04f, -1.039f, -2.42f, -1.61f, -3.889f, -1.61f)
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
                curveToRelative(1.039f, -1.04f, 1.61f, -2.42f, 1.61f, -3.889f)
                verticalLineToRelative(-5.385f)
                curveToRelative(0.0f, -1.469f, -0.572f, -2.85f, -1.611f, -3.889f)
                close()
                moveTo(21.0f, 14.692f)
                curveToRelative(0.0f, 0.667f, -0.26f, 1.296f, -0.732f, 1.768f)
                lineToRelative(-3.808f, 3.807f)
                curveToRelative(-0.472f, 0.472f, -1.101f, 0.732f, -1.768f, 0.732f)
                horizontalLineToRelative(-5.385f)
                curveToRelative(-0.667f, 0.0f, -1.296f, -0.26f, -1.768f, -0.732f)
                lineToRelative(-3.807f, -3.808f)
                curveToRelative(-0.472f, -0.472f, -0.732f, -1.101f, -0.732f, -1.768f)
                verticalLineToRelative(-5.385f)
                curveToRelative(0.0f, -0.667f, 0.26f, -1.296f, 0.732f, -1.768f)
                lineToRelative(3.808f, -3.807f)
                curveToRelative(0.472f, -0.472f, 1.101f, -0.732f, 1.768f, -0.732f)
                horizontalLineToRelative(5.385f)
                curveToRelative(0.667f, 0.0f, 1.296f, 0.26f, 1.768f, 0.732f)
                lineToRelative(3.807f, 3.808f)
                curveToRelative(0.472f, 0.472f, 0.732f, 1.101f, 0.732f, 1.768f)
                verticalLineToRelative(5.385f)
                close()
                moveTo(17.0f, 12.0f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _octagonPlus!!
    }

private var _octagonPlus: ImageVector? = null
