package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.TimeDelete: ImageVector
    get() {
        if (_timeDelete != null) {
            return _timeDelete!!
        }
        _timeDelete = Builder(name = "TimeDelete", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.707f, 22.707f)
                curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0.0f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-1.415f, 1.414f)
                curveToRelative(-0.384f, 0.397f, -1.017f, 0.408f, -1.414f, 0.025f)
                curveToRelative(-0.397f, -0.384f, -0.408f, -1.017f, -0.025f, -1.414f)
                curveToRelative(0.008f, -0.008f, 0.016f, -0.017f, 0.025f, -0.025f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-1.414f, -1.415f)
                curveToRelative(-0.397f, -0.384f, -0.408f, -1.017f, -0.025f, -1.414f)
                curveToRelative(0.384f, -0.397f, 1.017f, -0.408f, 1.414f, -0.025f)
                curveToRelative(0.008f, 0.008f, 0.017f, 0.016f, 0.025f, 0.025f)
                lineToRelative(1.415f, 1.414f)
                lineToRelative(1.414f, -1.414f)
                curveToRelative(0.384f, -0.397f, 1.017f, -0.408f, 1.414f, -0.025f)
                curveToRelative(0.397f, 0.384f, 0.408f, 1.017f, 0.025f, 1.414f)
                curveToRelative(-0.008f, 0.008f, -0.016f, 0.017f, -0.025f, 0.025f)
                lineToRelative(-1.414f, 1.415f)
                lineToRelative(1.414f, 1.414f)
                curveToRelative(0.392f, 0.389f, 0.397f, 1.019f, 0.008f, 1.411f)
                curveToRelative(-0.002f, 0.002f, -0.003f, 0.004f, -0.008f, 0.003f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.035f, 20.015f)
                curveToRelative(-0.004f, -3.297f, 2.665f, -5.973f, 5.961f, -5.978f)
                curveToRelative(1.283f, -0.002f, 2.533f, 0.41f, 3.563f, 1.175f)
                curveToRelative(1.773f, -6.385f, -1.966f, -12.998f, -8.35f, -14.771f)
                reflectiveCurveToRelative(-12.996f, 1.965f, -14.769f, 8.35f)
                reflectiveCurveToRelative(1.966f, 12.999f, 8.35f, 14.772f)
                curveToRelative(2.1f, 0.583f, 4.319f, 0.583f, 6.419f, 0.0f)
                curveToRelative(-0.762f, -1.026f, -1.174f, -2.27f, -1.174f, -3.548f)
                close()
                moveTo(13.0f, 12.022f)
                curveToRelative(0.0f, 0.266f, -0.106f, 0.52f, -0.294f, 0.708f)
                lineToRelative(-3.005f, 3.006f)
                curveToRelative(-0.398f, 0.384f, -1.032f, 0.373f, -1.416f, -0.025f)
                curveToRelative(-0.375f, -0.388f, -0.375f, -1.004f, 0.0f, -1.392f)
                lineToRelative(2.712f, -2.712f)
                verticalLineToRelative(-4.594f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.002f, 1.002f, -1.002f)
                curveToRelative(0.553f, 0.0f, 1.001f, 0.449f, 1.001f, 1.002f)
                close()
            }
        }
        .build()
        return _timeDelete!!
    }

private var _timeDelete: ImageVector? = null
