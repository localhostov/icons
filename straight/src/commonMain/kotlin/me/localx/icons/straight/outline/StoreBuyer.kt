package me.localx.icons.straight.outline

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

public val Icons.Outline.StoreBuyer: ImageVector
    get() {
        if (_storeBuyer != null) {
            return _storeBuyer!!
        }
        _storeBuyer = Builder(name = "StoreBuyer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.5f, 15.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.121f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.121f, -2.5f, -2.5f)
                close()
                moveTo(21.0f, 19.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(21.7f, 0.0f)
                lineTo(2.299f, 0.0f)
                lineTo(0.025f, 9.891f)
                lineToRelative(-0.025f, 1.147f)
                curveToRelative(0.0f, 0.996f, 0.385f, 1.896f, 1.0f, 2.592f)
                verticalLineToRelative(7.369f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                lineTo(4.0f, 21.999f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-6.141f)
                curveToRelative(0.322f, 0.083f, 0.653f, 0.141f, 1.0f, 0.141f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.194f, 0.0f, 2.254f, -0.548f, 2.981f, -1.394f)
                curveToRelative(0.727f, 0.847f, 1.786f, 1.394f, 2.981f, 1.394f)
                horizontalLineToRelative(2.077f)
                curveToRelative(0.548f, 0.0f, 1.069f, -0.113f, 1.544f, -0.317f)
                curveToRelative(0.255f, -1.388f, 1.151f, -2.539f, 2.366f, -3.167f)
                curveToRelative(0.022f, -0.171f, 0.052f, -0.34f, 0.052f, -0.517f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.122f, -0.861f, 2.0f, -1.962f, 2.0f)
                horizontalLineToRelative(-2.077f)
                curveToRelative(-1.1f, 0.0f, -1.961f, -0.878f, -1.961f, -2.0f)
                horizontalLineToRelative(-2.039f)
                curveToRelative(0.0f, 1.122f, -0.861f, 2.0f, -1.961f, 2.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.122f, 0.0f, -2.0f, -0.861f, -2.0f, -1.961f)
                verticalLineToRelative(-0.81f)
                lineTo(3.892f, 2.0f)
                horizontalLineToRelative(3.108f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                lineTo(9.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                lineTo(17.0f, 2.0f)
                horizontalLineToRelative(3.108f)
                lineToRelative(1.892f, 8.229f)
                verticalLineToRelative(0.81f)
                curveToRelative(0.0f, 0.341f, -0.092f, 0.653f, -0.242f, 0.93f)
                curveToRelative(0.546f, 0.427f, 0.99f, 0.971f, 1.292f, 1.603f)
                curveToRelative(0.584f, -0.689f, 0.95f, -1.565f, 0.95f, -2.533f)
                verticalLineToRelative(-0.923f)
                lineTo(21.7f, 0.0f)
                close()
            }
        }
        .build()
        return _storeBuyer!!
    }

private var _storeBuyer: ImageVector? = null
