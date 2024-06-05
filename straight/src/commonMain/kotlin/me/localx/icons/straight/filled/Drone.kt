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

public val Icons.Filled.Drone: ImageVector
    get() {
        if (_drone != null) {
            return _drone!!
        }
        _drone = Builder(name = "Drone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.293f, 19.707f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-3.586f, -3.585f)
                curveToRelative(-0.723f, -0.723f, -1.121f, -1.685f, -1.121f, -2.708f)
                reflectiveCurveToRelative(0.398f, -1.984f, 1.121f, -2.707f)
                lineToRelative(3.586f, -3.586f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-3.586f, 3.586f)
                curveToRelative(-1.446f, 1.447f, -3.968f, 1.446f, -5.415f, 0.0f)
                lineToRelative(-3.585f, -3.586f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(3.585f, 3.586f)
                curveToRelative(0.723f, 0.724f, 1.122f, 1.685f, 1.122f, 2.707f)
                reflectiveCurveToRelative(-0.398f, 1.984f, -1.122f, 2.708f)
                lineToRelative(-3.585f, 3.585f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(3.585f, -3.585f)
                curveToRelative(1.447f, -1.446f, 3.967f, -1.446f, 5.415f, 0.0f)
                lineToRelative(3.586f, 3.585f)
                close()
                moveTo(14.06f, 5.572f)
                curveToRelative(-0.169f, -1.465f, 0.286f, -2.989f, 1.407f, -4.11f)
                curveToRelative(1.949f, -1.949f, 5.122f, -1.949f, 7.071f, 0.0f)
                curveToRelative(1.949f, 1.949f, 1.949f, 5.122f, 0.0f, 7.071f)
                curveToRelative(-1.231f, 1.231f, -2.948f, 1.68f, -4.538f, 1.357f)
                curveToRelative(1.226f, -1.047f, 2.558f, -2.205f, 3.124f, -2.771f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.073f, 0.0f, -4.243f)
                curveToRelative(-1.17f, -1.17f, -3.073f, -1.17f, -4.243f, 0.0f)
                curveToRelative(-0.575f, 0.575f, -1.762f, 1.7f, -2.821f, 2.696f)
                close()
                moveTo(1.462f, 8.533f)
                curveTo(-0.487f, 6.584f, -0.487f, 3.411f, 1.462f, 1.462f)
                curveTo(3.411f, -0.487f, 6.584f, -0.487f, 8.533f, 1.462f)
                curveToRelative(1.231f, 1.231f, 1.68f, 2.948f, 1.357f, 4.538f)
                curveToRelative(-1.047f, -1.226f, -2.205f, -2.558f, -2.771f, -3.124f)
                curveToRelative(-1.17f, -1.17f, -3.073f, -1.17f, -4.243f, 0.0f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.073f, 0.0f, 4.243f)
                curveToRelative(0.575f, 0.575f, 1.7f, 1.762f, 2.696f, 2.821f)
                curveToRelative(-1.465f, 0.169f, -2.989f, -0.286f, -4.11f, -1.407f)
                close()
                moveTo(22.538f, 15.467f)
                curveToRelative(1.949f, 1.949f, 1.949f, 5.122f, 0.0f, 7.071f)
                curveToRelative(-1.949f, 1.949f, -5.122f, 1.949f, -7.071f, 0.0f)
                curveToRelative(-1.121f, -1.121f, -1.576f, -2.645f, -1.407f, -4.11f)
                curveToRelative(1.06f, 0.996f, 2.247f, 2.121f, 2.821f, 2.696f)
                curveToRelative(1.17f, 1.17f, 3.073f, 1.17f, 4.243f, 0.0f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.073f, 0.0f, -4.243f)
                curveToRelative(-0.566f, -0.566f, -1.898f, -1.724f, -3.124f, -2.771f)
                curveToRelative(1.59f, -0.323f, 3.308f, 0.126f, 4.538f, 1.357f)
                close()
                moveTo(9.89f, 18.0f)
                curveToRelative(0.323f, 1.59f, -0.126f, 3.308f, -1.357f, 4.538f)
                curveToRelative(-1.949f, 1.949f, -5.122f, 1.949f, -7.071f, 0.0f)
                curveToRelative(-1.949f, -1.949f, -1.949f, -5.122f, 0.0f, -7.071f)
                curveToRelative(1.121f, -1.121f, 2.645f, -1.576f, 4.11f, -1.407f)
                curveToRelative(-0.996f, 1.06f, -2.121f, 2.247f, -2.696f, 2.821f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.073f, 0.0f, 4.243f)
                curveToRelative(1.17f, 1.17f, 3.073f, 1.17f, 4.243f, 0.0f)
                curveToRelative(0.566f, -0.566f, 1.724f, -1.898f, 2.771f, -3.124f)
                close()
            }
        }
        .build()
        return _drone!!
    }

private var _drone: ImageVector? = null
