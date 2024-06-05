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

public val Icons.Filled.Pig: ImageVector
    get() {
        if (_pig != null) {
            return _pig!!
        }
        _pig = Builder(name = "Pig", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 10.0f)
                horizontalLineToRelative(-0.257f)
                curveToRelative(-0.728f, -2.737f, -2.957f, -4.91f, -5.743f, -5.689f)
                lineTo(17.0f, 1.939f)
                curveToRelative(0.0f, -0.613f, -0.587f, -1.071f, -1.176f, -0.904f)
                curveToRelative(-1.327f, 0.378f, -2.36f, 1.568f, -2.702f, 2.965f)
                horizontalLineToRelative(-4.856f)
                curveToRelative(-2.277f, 0.0f, -4.354f, 0.898f, -5.857f, 2.353f)
                curveToRelative(-0.213f, -0.425f, -0.352f, -0.915f, -0.416f, -1.469f)
                curveToRelative(-0.062f, -0.548f, -0.556f, -0.945f, -1.108f, -0.878f)
                curveTo(0.336f, 4.07f, -0.057f, 4.566f, 0.007f, 5.115f)
                curveToRelative(0.131f, 1.134f, 0.494f, 2.107f, 1.082f, 2.905f)
                curveTo(0.479f, 9.047f, 0.098f, 10.218f, 0.017f, 11.47f)
                curveToRelative(-0.199f, 3.075f, 1.349f, 5.933f, 3.983f, 7.451f)
                verticalLineToRelative(0.079f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                curveToRelative(1.304f, 0.0f, 2.416f, -0.836f, 2.829f, -2.0f)
                horizontalLineToRelative(2.343f)
                curveToRelative(0.413f, 1.164f, 1.525f, 2.0f, 2.829f, 2.0f)
                curveToRelative(1.51f, 0.0f, 2.762f, -1.121f, 2.97f, -2.573f)
                curveToRelative(2.053f, -0.821f, 3.633f, -2.447f, 4.438f, -4.427f)
                horizontalLineToRelative(0.592f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(16.5f, 12.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _pig!!
    }

private var _pig: ImageVector? = null
