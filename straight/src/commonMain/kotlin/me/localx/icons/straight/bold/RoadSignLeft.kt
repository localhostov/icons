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

public val Icons.Bold.RoadSignLeft: ImageVector
    get() {
        if (_roadSignLeft != null) {
            return _roadSignLeft!!
        }
        _roadSignLeft = Builder(name = "RoadSignLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.018f, 13.511f)
                verticalLineToRelative(0.86f)
                lineToRelative(-3.011f, 3.013f)
                verticalLineToRelative(-3.872f)
                curveToRelative(0.0f, -0.276f, -0.226f, -0.502f, -0.502f, -0.502f)
                horizontalLineToRelative(-2.506f)
                verticalLineToRelative(2.542f)
                lineToRelative(-3.17f, -3.243f)
                curveToRelative(-0.458f, -0.458f, -0.458f, -1.198f, 0.0f, -1.656f)
                lineToRelative(3.17f, -3.243f)
                verticalLineToRelative(2.589f)
                horizontalLineToRelative(2.506f)
                curveToRelative(1.936f, 0.0f, 3.512f, 1.575f, 3.513f, 3.511f)
                close()
                moveTo(22.932f, 14.575f)
                lineToRelative(-8.356f, 8.357f)
                curveToRelative(-0.688f, 0.688f, -1.603f, 1.067f, -2.576f, 1.067f)
                reflectiveCurveToRelative(-1.889f, -0.379f, -2.576f, -1.067f)
                lineTo(1.067f, 14.575f)
                curveToRelative(-1.42f, -1.421f, -1.42f, -3.732f, 0.0f, -5.153f)
                lineTo(9.422f, 1.065f)
                curveToRelative(1.419f, -1.42f, 3.732f, -1.421f, 5.153f, 0.0f)
                lineToRelative(8.356f, 8.357f)
                curveToRelative(1.421f, 1.42f, 1.421f, 3.732f, 0.0f, 5.153f)
                close()
                moveTo(20.811f, 11.543f)
                lineTo(12.455f, 3.186f)
                curveToRelative(-0.249f, -0.248f, -0.664f, -0.247f, -0.911f, 0.0f)
                lineTo(3.188f, 11.543f)
                curveToRelative(-0.251f, 0.251f, -0.251f, 0.66f, 0.0f, 0.911f)
                lineToRelative(8.356f, 8.358f)
                curveToRelative(0.164f, 0.164f, 0.355f, 0.188f, 0.455f, 0.188f)
                reflectiveCurveToRelative(0.291f, -0.024f, 0.455f, -0.188f)
                lineToRelative(8.356f, -8.357f)
                curveToRelative(0.251f, -0.251f, 0.251f, -0.66f, 0.0f, -0.911f)
                close()
            }
        }
        .build()
        return _roadSignLeft!!
    }

private var _roadSignLeft: ImageVector? = null
