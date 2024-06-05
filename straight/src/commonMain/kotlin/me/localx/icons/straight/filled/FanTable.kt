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

public val Icons.Filled.FanTable: ImageVector
    get() {
        if (_fanTable != null) {
            return _fanTable!!
        }
        _fanTable = Builder(name = "FanTable", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 22.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.072f)
                curveToRelative(-1.454f, -0.156f, -2.814f, -0.627f, -3.999f, -1.365f)
                curveToRelative(1.552f, -1.491f, 3.73f, -4.326f, 4.999f, -6.13f)
                curveToRelative(1.268f, 1.805f, 3.446f, 4.639f, 4.999f, 6.13f)
                curveToRelative(-1.185f, 0.737f, -2.545f, 1.209f, -3.999f, 1.365f)
                verticalLineToRelative(3.072f)
                close()
                moveTo(7.948f, 0.92f)
                curveToRelative(-3.215f, 1.524f, -5.448f, 4.792f, -5.448f, 8.58f)
                curveToRelative(0.0f, 0.476f, 0.047f, 0.939f, 0.114f, 1.396f)
                curveToRelative(1.883f, -0.762f, 5.551f, -1.734f, 7.883f, -2.107f)
                curveToRelative(-0.92f, -2.142f, -2.226f, -5.818f, -2.549f, -7.869f)
                close()
                moveTo(14.122f, 0.247f)
                curveToRelative(-0.683f, -0.157f, -1.392f, -0.247f, -2.122f, -0.247f)
                reflectiveCurveToRelative(-1.438f, 0.091f, -2.122f, 0.247f)
                curveToRelative(0.074f, 1.238f, 1.189f, 4.636f, 2.122f, 6.964f)
                curveToRelative(0.933f, -2.327f, 2.048f, -5.724f, 2.122f, -6.964f)
                close()
                moveTo(3.121f, 12.849f)
                curveToRelative(0.501f, 1.324f, 1.284f, 2.507f, 2.284f, 3.474f)
                curveToRelative(1.202f, -1.069f, 3.166f, -3.55f, 4.503f, -5.394f)
                curveToRelative(-2.281f, 0.456f, -5.485f, 1.338f, -6.787f, 1.92f)
                close()
                moveTo(16.052f, 0.92f)
                curveToRelative(-0.324f, 2.052f, -1.63f, 5.727f, -2.549f, 7.869f)
                curveToRelative(2.332f, 0.373f, 6.001f, 1.345f, 7.883f, 2.107f)
                curveToRelative(0.068f, -0.457f, 0.114f, -0.921f, 0.114f, -1.396f)
                curveToRelative(0.0f, -3.788f, -2.234f, -7.055f, -5.448f, -8.58f)
                close()
                moveTo(18.595f, 16.323f)
                curveToRelative(1.0f, -0.967f, 1.783f, -2.15f, 2.284f, -3.474f)
                curveToRelative(-1.302f, -0.582f, -4.506f, -1.465f, -6.787f, -1.92f)
                curveToRelative(1.337f, 1.844f, 3.301f, 4.325f, 4.503f, 5.394f)
                close()
            }
        }
        .build()
        return _fanTable!!
    }

private var _fanTable: ImageVector? = null
