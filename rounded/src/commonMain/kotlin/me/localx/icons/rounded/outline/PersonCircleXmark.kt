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

public val Icons.Outline.PersonCircleXmark: ImageVector
    get() {
        if (_personCircleXmark != null) {
            return _personCircleXmark!!
        }
        _personCircleXmark = Builder(name = "PersonCircleXmark", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.707f, 15.707f)
                lineToRelative(-1.293f, 1.293f)
                lineToRelative(1.293f, 1.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-1.293f, -1.293f)
                lineToRelative(-1.293f, 1.293f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(1.293f, -1.293f)
                lineToRelative(-1.293f, -1.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(1.293f, 1.293f)
                lineToRelative(1.293f, -1.293f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(24.0f, 17.0f)
                curveToRelative(0.0f, 3.859f, -3.141f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.141f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.141f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.141f, 7.0f, 7.0f)
                close()
                moveTo(22.0f, 17.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                close()
                moveTo(5.0f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveTo(6.381f, 0.0f, 5.0f, 0.0f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(8.0f, 16.463f)
                verticalLineToRelative(6.537f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-6.537f)
                curveToRelative(-1.195f, -0.693f, -2.0f, -1.985f, -2.0f, -3.463f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.478f, -0.805f, 2.771f, -2.0f, 3.463f)
                close()
                moveTo(8.0f, 10.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _personCircleXmark!!
    }

private var _personCircleXmark: ImageVector? = null
