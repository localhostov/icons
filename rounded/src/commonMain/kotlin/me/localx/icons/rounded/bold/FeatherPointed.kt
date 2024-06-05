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

public val Icons.Bold.FeatherPointed: ImageVector
    get() {
        if (_featherPointed != null) {
            return _featherPointed!!
        }
        _featherPointed = Builder(name = "FeatherPointed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.177f, 0.819f)
                curveToRelative(-0.63f, -0.628f, -1.535f, -0.922f, -2.419f, -0.792f)
                curveToRelative(-3.512f, 0.53f, -10.193f, 2.211f, -15.471f, 7.505f)
                curveToRelative(-1.568f, 1.571f, -2.41f, 3.748f, -2.311f, 5.97f)
                curveToRelative(0.065f, 1.459f, 0.543f, 2.86f, 1.343f, 4.058f)
                lineToRelative(-3.879f, 3.879f)
                curveToRelative(-0.586f, 0.586f, -0.586f, 1.535f, 0.0f, 2.121f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                lineToRelative(3.86f, -3.86f)
                curveToRelative(1.312f, 0.896f, 2.842f, 1.339f, 4.383f, 1.339f)
                curveToRelative(2.147f, 0.0f, 4.313f, -0.855f, 5.933f, -2.528f)
                curveToRelative(5.279f, -5.453f, 6.816f, -12.509f, 7.231f, -15.288f)
                curveToRelative(0.134f, -0.892f, -0.155f, -1.768f, -0.791f, -2.403f)
                close()
                moveTo(5.973f, 13.368f)
                curveToRelative(-0.062f, -1.385f, 0.462f, -2.74f, 1.438f, -3.718f)
                horizontalLineToRelative(0.0f)
                curveToRelative(4.553f, -4.566f, 10.346f, -6.104f, 13.551f, -6.618f)
                curveToRelative(-0.184f, 1.145f, -0.558f, 2.932f, -1.287f, 4.968f)
                horizontalLineToRelative(-3.932f)
                curveToRelative(-1.201f, 0.0f, -2.331f, 0.468f, -3.182f, 1.318f)
                lineToRelative(-6.06f, 6.06f)
                curveToRelative(-0.312f, -0.616f, -0.495f, -1.296f, -0.527f, -2.011f)
                close()
                moveTo(17.255f, 13.0f)
                horizontalLineToRelative(-4.133f)
                lineToRelative(1.56f, -1.56f)
                curveToRelative(0.284f, -0.284f, 0.661f, -0.44f, 1.062f, -0.44f)
                horizontalLineToRelative(2.645f)
                curveToRelative(-0.335f, 0.665f, -0.713f, 1.334f, -1.134f, 2.0f)
                close()
                moveTo(8.609f, 17.513f)
                lineToRelative(1.513f, -1.513f)
                horizontalLineToRelative(4.847f)
                curveToRelative(-0.129f, 0.142f, -0.252f, 0.286f, -0.387f, 0.425f)
                curveToRelative(-1.618f, 1.67f, -4.073f, 2.064f, -5.973f, 1.088f)
                close()
            }
        }
        .build()
        return _featherPointed!!
    }

private var _featherPointed: ImageVector? = null
