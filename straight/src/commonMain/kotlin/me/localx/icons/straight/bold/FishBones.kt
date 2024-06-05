package me.localx.icons.straight.bold

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
                lineToRelative(-2.439f, -2.439f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(2.439f, 2.439f)
                lineToRelative(-1.379f, 1.379f)
                lineToRelative(-2.939f, -2.939f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(2.939f, 2.939f)
                lineToRelative(-1.379f, 1.379f)
                lineToRelative(-4.049f, -4.048f)
                curveToRelative(-0.584f, 0.807f, -1.055f, 1.743f, -1.416f, 2.826f)
                curveToRelative(-0.723f, 2.166f, -1.035f, 4.903f, -1.035f, 8.344f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(3.44f, 0.0f, 6.177f, -0.313f, 8.343f, -1.035f)
                curveToRelative(1.084f, -0.362f, 2.019f, -0.832f, 2.827f, -1.417f)
                lineToRelative(-4.049f, -4.049f)
                lineToRelative(1.378f, -1.378f)
                lineToRelative(2.939f, 2.939f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-2.939f, -2.939f)
                lineToRelative(1.379f, -1.379f)
                lineToRelative(2.439f, 2.439f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-2.439f, -2.439f)
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
