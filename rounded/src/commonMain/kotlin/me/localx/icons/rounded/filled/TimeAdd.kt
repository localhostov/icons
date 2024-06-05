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

public val Icons.Filled.TimeAdd: ImageVector
    get() {
        if (_timeAdd != null) {
            return _timeAdd!!
        }
        _timeAdd = Builder(name = "TimeAdd", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 20.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
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
        return _timeAdd!!
    }

private var _timeAdd: ImageVector? = null
