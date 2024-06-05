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

public val Icons.Filled.ArrowUpLeftFromCircle: ImageVector
    get() {
        if (_arrowUpLeftFromCircle != null) {
            return _arrowUpLeftFromCircle!!
        }
        _arrowUpLeftFromCircle = Builder(name = "ArrowUpLeftFromCircle", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.414f)
                verticalLineToRelative(6.586f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineTo(3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(3.414f)
                lineTo(15.707f, 14.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(2.0f, 3.414f)
                close()
                moveTo(23.951f, 12.997f)
                curveToRelative(-0.453f, -4.628f, -4.186f, -8.423f, -8.808f, -8.933f)
                curveToRelative(-1.537f, -0.17f, -3.053f, 0.003f, -4.477f, 0.506f)
                curveToRelative(-0.324f, 0.114f, -0.566f, 0.387f, -0.642f, 0.722f)
                curveToRelative(-0.076f, 0.335f, 0.025f, 0.686f, 0.268f, 0.928f)
                lineToRelative(6.87f, 6.87f)
                curveToRelative(1.125f, 1.125f, 1.125f, 2.949f, 0.0f, 4.073f)
                curveToRelative(-1.125f, 1.125f, -2.949f, 1.125f, -4.074f, 0.0f)
                lineToRelative(-6.87f, -6.87f)
                curveToRelative(-0.243f, -0.243f, -0.591f, -0.343f, -0.928f, -0.268f)
                curveToRelative(-0.334f, 0.076f, -0.607f, 0.318f, -0.722f, 0.642f)
                curveToRelative(-0.503f, 1.424f, -0.676f, 2.939f, -0.506f, 4.476f)
                curveToRelative(0.51f, 4.622f, 4.304f, 8.354f, 8.931f, 8.808f)
                curveToRelative(6.301f, 0.619f, 11.574f, -4.653f, 10.956f, -10.954f)
                close()
            }
        }
        .build()
        return _arrowUpLeftFromCircle!!
    }

private var _arrowUpLeftFromCircle: ImageVector? = null
