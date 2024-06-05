package me.localx.icons.rounded.filled

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

public val Icons.Filled.Tap: ImageVector
    get() {
        if (_tap != null) {
            return _tap!!
        }
        _tap = Builder(name = "Tap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 19.697f)
                verticalLineToRelative(2.803f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(4.686f)
                curveToRelative(-0.539f, 0.0f, -1.055f, -0.217f, -1.431f, -0.603f)
                lineToRelative(-1.543f, -1.58f)
                curveToRelative(-0.787f, -0.789f, -0.972f, -2.064f, -0.305f, -2.958f)
                curveToRelative(0.695f, -0.933f, 1.922f, -1.138f, 2.853f, -0.619f)
                curveToRelative(0.222f, 0.145f, 0.39f, 0.271f, 0.487f, 0.367f)
                lineToRelative(2.252f, 2.292f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.215f, 1.083f, -2.176f, 2.336f, -1.973f)
                curveToRelative(0.983f, 0.16f, 1.664f, 1.083f, 1.664f, 2.08f)
                verticalLineToRelative(7.393f)
                reflectiveCurveToRelative(8.115f, 2.355f, 8.115f, 2.355f)
                curveToRelative(1.709f, 0.496f, 2.885f, 2.062f, 2.885f, 3.842f)
                close()
                moveTo(4.71f, 11.312f)
                curveToRelative(0.448f, -0.323f, 0.55f, -0.948f, 0.228f, -1.396f)
                curveToRelative(-0.614f, -0.853f, -0.938f, -1.861f, -0.938f, -2.916f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                curveToRelative(0.0f, 1.056f, -0.324f, 2.064f, -0.938f, 2.916f)
                curveToRelative(-0.323f, 0.448f, -0.221f, 1.073f, 0.228f, 1.396f)
                curveToRelative(0.177f, 0.127f, 0.381f, 0.188f, 0.583f, 0.188f)
                curveToRelative(0.311f, 0.0f, 0.617f, -0.145f, 0.812f, -0.416f)
                curveToRelative(0.86f, -1.195f, 1.314f, -2.607f, 1.314f, -4.084f)
                curveToRelative(0.0f, -3.86f, -3.14f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveTo(2.0f, 3.14f, 2.0f, 7.0f)
                curveToRelative(0.0f, 1.477f, 0.455f, 2.889f, 1.314f, 4.084f)
                curveToRelative(0.322f, 0.448f, 0.946f, 0.55f, 1.396f, 0.228f)
                close()
            }
        }
        .build()
        return _tap!!
    }

private var _tap: ImageVector? = null
