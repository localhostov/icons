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

public val Icons.Outline.BookCircleArrowRight: ImageVector
    get() {
        if (_bookCircleArrowRight != null) {
            return _bookCircleArrowRight!!
        }
        _bookCircleArrowRight = Builder(name = "BookCircleArrowRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 22.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(6.0f, 2.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(4.0f, 2.172f)
                verticalLineToRelative(13.828f)
                curveToRelative(-0.728f, 0.0f, -1.411f, 0.196f, -2.0f, 0.537f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.304f, 0.836f, -2.415f, 2.0f, -2.828f)
                close()
                moveTo(17.0f, 10.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.141f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(17.0f, 22.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(19.998f, 15.758f)
                curveToRelative(0.685f, 0.685f, 0.685f, 1.8f, 0.0f, 2.485f)
                lineToRelative(-1.5f, 1.5f)
                curveToRelative(-0.168f, 0.168f, -0.393f, 0.257f, -0.621f, 0.257f)
                curveToRelative(-0.113f, 0.0f, -0.227f, -0.021f, -0.336f, -0.067f)
                curveToRelative(-0.328f, -0.136f, -0.541f, -0.456f, -0.541f, -0.812f)
                verticalLineToRelative(-1.121f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.121f)
                curveToRelative(0.0f, -0.355f, 0.213f, -0.676f, 0.541f, -0.812f)
                curveToRelative(0.329f, -0.138f, 0.706f, -0.062f, 0.957f, 0.19f)
                lineToRelative(1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _bookCircleArrowRight!!
    }

private var _bookCircleArrowRight: ImageVector? = null
