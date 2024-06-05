package me.localx.icons.rounded.outline

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

public val Icons.Outline.WalkieTalkie: ImageVector
    get() {
        if (_walkieTalkie != null) {
            return _walkieTalkie!!
        }
        _walkieTalkie = Builder(name = "WalkieTalkie", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(7.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(2.418f)
                curveToRelative(-1.764f, 0.773f, -3.0f, 2.536f, -3.0f, 4.582f)
                verticalLineToRelative(3.597f)
                curveToRelative(0.0f, 1.131f, 0.389f, 2.24f, 1.096f, 3.124f)
                lineToRelative(0.685f, 0.857f)
                curveToRelative(0.142f, 0.176f, 0.219f, 0.398f, 0.219f, 0.625f)
                verticalLineToRelative(2.798f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-2.798f)
                curveToRelative(0.0f, -0.226f, 0.078f, -0.448f, 0.219f, -0.625f)
                lineToRelative(0.685f, -0.856f)
                curveToRelative(0.707f, -0.883f, 1.096f, -1.993f, 1.096f, -3.124f)
                verticalLineToRelative(-3.597f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(20.0f, 11.597f)
                curveToRelative(0.0f, 0.679f, -0.233f, 1.344f, -0.657f, 1.875f)
                lineToRelative(-0.685f, 0.856f)
                curveToRelative(-0.424f, 0.53f, -0.658f, 1.196f, -0.658f, 1.875f)
                verticalLineToRelative(2.798f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-2.798f)
                curveToRelative(0.0f, -0.679f, -0.233f, -1.344f, -0.658f, -1.874f)
                lineToRelative(-0.685f, -0.856f)
                curveToRelative(-0.424f, -0.53f, -0.657f, -1.196f, -0.657f, -1.875f)
                verticalLineToRelative(-3.597f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(3.597f)
                close()
                moveTo(16.0f, 7.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(8.0f, 11.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                reflectiveCurveToRelative(-8.0f, 0.0f, -8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _walkieTalkie!!
    }

private var _walkieTalkie: ImageVector? = null
