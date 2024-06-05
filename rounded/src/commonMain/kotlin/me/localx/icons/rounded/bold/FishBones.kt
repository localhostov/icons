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

public val Icons.Bold.FishBones: ImageVector
    get() {
        if (_fishBones != null) {
            return _fishBones!!
        }
        _fishBones = Builder(name = "FishBones", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.143f, 3.857f)
                curveToRelative(0.0f, -2.858f, -2.571f, -3.857f, -3.857f, -3.857f)
                curveToRelative(-0.771f, 0.0f, -1.286f, 0.384f, -1.286f, 1.155f)
                verticalLineToRelative(5.724f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-1.939f, -1.939f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                reflectiveCurveToRelative(-0.586f, 1.535f, 0.0f, 2.121f)
                lineToRelative(1.939f, 1.939f)
                lineToRelative(-1.379f, 1.379f)
                lineToRelative(-2.439f, -2.439f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                reflectiveCurveToRelative(-0.586f, 1.535f, 0.0f, 2.121f)
                lineToRelative(2.439f, 2.439f)
                lineToRelative(-1.379f, 1.379f)
                lineToRelative(-1.662f, -1.662f)
                curveToRelative(-1.265f, -1.265f, -3.467f, -0.756f, -3.964f, 0.963f)
                curveTo(0.359f, 16.455f, 0.07f, 18.62f, 0.001f, 21.175f)
                curveToRelative(-0.043f, 1.597f, 1.225f, 2.866f, 2.822f, 2.824f)
                curveToRelative(2.571f, -0.067f, 4.73f, -0.353f, 6.511f, -0.875f)
                curveToRelative(1.712f, -0.501f, 2.22f, -2.692f, 0.959f, -3.953f)
                lineToRelative(-1.671f, -1.671f)
                lineToRelative(1.378f, -1.378f)
                lineToRelative(2.439f, 2.439f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                lineToRelative(-2.439f, -2.439f)
                lineToRelative(1.379f, -1.379f)
                lineToRelative(1.939f, 1.939f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                lineToRelative(-1.939f, -1.939f)
                lineToRelative(1.5f, -1.5f)
                horizontalLineToRelative(5.724f)
                curveToRelative(0.771f, 0.0f, 1.155f, -0.515f, 1.155f, -1.286f)
                curveToRelative(0.0f, -1.286f, -0.999f, -3.857f, -3.857f, -3.857f)
                close()
                moveTo(3.0f, 21.0f)
                curveToRelative(0.047f, -1.725f, 0.193f, -3.178f, 0.455f, -4.424f)
                lineToRelative(3.968f, 3.968f)
                curveToRelative(-1.245f, 0.262f, -2.699f, 0.408f, -4.423f, 0.455f)
                close()
            }
        }
        .build()
        return _fishBones!!
    }

private var _fishBones: ImageVector? = null
