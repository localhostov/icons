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

public val Icons.Filled.StoreBuyer: ImageVector
    get() {
        if (_storeBuyer != null) {
            return _storeBuyer!!
        }
        _storeBuyer = Builder(name = "StoreBuyer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(14.5f, 15.5f)
                curveToRelative(0.0f, -0.647f, 0.143f, -1.259f, 0.39f, -1.816f)
                curveToRelative(-0.594f, 0.199f, -1.215f, 0.316f, -1.852f, 0.316f)
                horizontalLineToRelative(-2.077f)
                curveToRelative(-1.056f, 0.0f, -2.082f, -0.288f, -2.981f, -0.818f)
                curveToRelative(-0.899f, 0.53f, -1.925f, 0.818f, -2.98f, 0.818f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.093f, 0.0f, -2.116f, -0.297f, -3.0f, -0.807f)
                verticalLineToRelative(7.807f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.023f, 1.209f, -3.771f, 2.941f, -4.557f)
                curveToRelative(-0.283f, -0.588f, -0.441f, -1.248f, -0.441f, -1.943f)
                close()
                moveTo(21.619f, 0.0f)
                horizontalLineToRelative(-4.619f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(7.0f, 0.0f)
                lineTo(2.381f, 0.0f)
                lineTo(0.0f, 6.949f)
                verticalLineToRelative(1.09f)
                curveToRelative(0.0f, 2.185f, 1.794f, 3.961f, 4.0f, 3.961f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.194f, 0.0f, 2.254f, -0.548f, 2.981f, -1.394f)
                curveToRelative(0.727f, 0.847f, 1.786f, 1.394f, 2.981f, 1.394f)
                horizontalLineToRelative(2.077f)
                curveToRelative(1.194f, 0.0f, 2.254f, -0.547f, 2.981f, -1.394f)
                curveToRelative(0.293f, 0.341f, 0.651f, 0.615f, 1.038f, 0.843f)
                curveToRelative(0.589f, -0.283f, 1.245f, -0.449f, 1.943f, -0.449f)
                curveToRelative(0.901f, 0.0f, 1.739f, 0.267f, 2.443f, 0.723f)
                curveToRelative(1.493f, -0.575f, 2.557f, -2.005f, 2.557f, -3.684f)
                verticalLineToRelative(-1.09f)
                lineToRelative(-2.381f, -6.949f)
                close()
                moveTo(16.5f, 15.5f)
                curveToRelative(0.0f, 1.379f, 1.121f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.121f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.121f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.121f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _storeBuyer!!
    }

private var _storeBuyer: ImageVector? = null
