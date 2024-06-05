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

public val Icons.Outline.RegistrationPaper: ImageVector
    get() {
        if (_registrationPaper != null) {
            return _registrationPaper!!
        }
        _registrationPaper = Builder(name = "RegistrationPaper", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.339f, 7.724f)
                lineToRelative(1.393f, -1.437f)
                lineToRelative(1.63f, 1.58f)
                lineToRelative(3.228f, -3.174f)
                lineToRelative(1.402f, 1.426f)
                lineToRelative(-3.456f, 3.399f)
                curveToRelative(-0.308f, 0.309f, -0.727f, 0.482f, -1.173f, 0.482f)
                reflectiveCurveToRelative(-0.864f, -0.174f, -1.179f, -0.489f)
                lineToRelative(-1.845f, -1.788f)
                close()
                moveTo(10.0f, 7.0f)
                curveToRelative(0.0f, -3.86f, 3.141f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.141f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.14f, -7.0f, -7.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                reflectiveCurveToRelative(-2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                close()
                moveTo(20.0f, 17.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-11.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(5.0f, 7.0f)
                lineTo(0.0f, 7.0f)
                verticalLineToRelative(-3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                horizontalLineToRelative(7.844f)
                curveToRelative(-0.705f, 0.57f, -1.322f, 1.245f, -1.828f, 2.0f)
                horizontalLineToRelative(-2.854f)
                curveToRelative(0.217f, 0.455f, 0.338f, 0.964f, 0.338f, 1.5f)
                verticalLineToRelative(17.0f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.056f)
                curveToRelative(0.694f, -0.077f, 1.363f, -0.232f, 2.0f, -0.457f)
                verticalLineToRelative(1.513f)
                close()
                moveTo(5.0f, 3.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(12.0f, 19.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.537f, -0.121f, 1.045f, -0.338f, 1.5f)
                horizontalLineToRelative(8.338f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-9.5f)
                close()
            }
        }
        .build()
        return _registrationPaper!!
    }

private var _registrationPaper: ImageVector? = null
