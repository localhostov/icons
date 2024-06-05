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

public val Icons.Filled.LandLayers: ImageVector
    get() {
        if (_landLayers != null) {
            return _landLayers!!
        }
        _landLayers = Builder(name = "LandLayers", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 18.838f)
                curveToRelative(-0.572f, 0.0f, -1.143f, -0.153f, -1.653f, -0.459f)
                lineTo(0.485f, 12.462f)
                curveToRelative(-0.474f, -0.284f, -0.627f, -0.898f, -0.343f, -1.372f)
                curveToRelative(0.283f, -0.475f, 0.897f, -0.627f, 1.372f, -0.343f)
                lineToRelative(9.861f, 5.917f)
                curveToRelative(0.385f, 0.23f, 0.864f, 0.23f, 1.249f, 0.0f)
                lineToRelative(9.861f, -5.917f)
                curveToRelative(0.474f, -0.284f, 1.088f, -0.131f, 1.372f, 0.343f)
                reflectiveCurveToRelative(0.131f, 1.088f, -0.343f, 1.372f)
                lineToRelative(-9.861f, 5.917f)
                curveToRelative(-0.51f, 0.306f, -1.082f, 0.459f, -1.653f, 0.459f)
                close()
                moveTo(13.653f, 22.674f)
                lineToRelative(9.861f, -5.917f)
                curveToRelative(0.474f, -0.284f, 0.627f, -0.898f, 0.343f, -1.372f)
                reflectiveCurveToRelative(-0.898f, -0.627f, -1.372f, -0.343f)
                lineToRelative(-9.862f, 5.917f)
                curveToRelative(-0.384f, 0.23f, -0.863f, 0.23f, -1.248f, 0.0f)
                lineTo(1.515f, 15.042f)
                curveToRelative(-0.475f, -0.285f, -1.089f, -0.131f, -1.372f, 0.343f)
                curveToRelative(-0.284f, 0.474f, -0.131f, 1.088f, 0.343f, 1.372f)
                lineToRelative(9.861f, 5.917f)
                curveToRelative(0.51f, 0.307f, 1.082f, 0.459f, 1.654f, 0.459f)
                reflectiveCurveToRelative(1.144f, -0.152f, 1.653f, -0.459f)
                close()
                moveTo(12.0f, 5.834f)
                lineToRelative(5.308f, -3.185f)
                lineTo(13.653f, 0.456f)
                curveToRelative(-1.02f, -0.612f, -2.287f, -0.612f, -3.307f, 0.0f)
                lineToRelative(-3.655f, 2.193f)
                lineToRelative(5.308f, 3.185f)
                close()
                moveTo(23.515f, 6.373f)
                lineToRelative(-4.263f, -2.558f)
                lineToRelative(-5.308f, 3.185f)
                lineToRelative(5.692f, 3.415f)
                lineToRelative(3.879f, -2.327f)
                curveToRelative(0.301f, -0.181f, 0.485f, -0.506f, 0.485f, -0.857f)
                reflectiveCurveToRelative(-0.184f, -0.677f, -0.485f, -0.857f)
                close()
                moveTo(10.056f, 7.0f)
                lineToRelative(-5.308f, -3.185f)
                lineTo(0.485f, 6.373f)
                curveToRelative(-0.301f, 0.181f, -0.485f, 0.506f, -0.485f, 0.857f)
                reflectiveCurveToRelative(0.184f, 0.677f, 0.485f, 0.857f)
                lineToRelative(3.879f, 2.327f)
                lineToRelative(5.692f, -3.415f)
                close()
                moveTo(12.0f, 8.166f)
                lineToRelative(-5.692f, 3.415f)
                lineToRelative(4.039f, 2.423f)
                curveToRelative(0.51f, 0.306f, 1.081f, 0.459f, 1.653f, 0.459f)
                reflectiveCurveToRelative(1.143f, -0.153f, 1.653f, -0.459f)
                lineToRelative(4.039f, -2.423f)
                lineToRelative(-5.692f, -3.415f)
                close()
            }
        }
        .build()
        return _landLayers!!
    }

private var _landLayers: ImageVector? = null
