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

public val Icons.Outline.BoxHeart: ImageVector
    get() {
        if (_boxHeart != null) {
            return _boxHeart!!
        }
        _boxHeart = Builder(name = "BoxHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.883f, 0.391f, 1.67f, 1.0f, 2.22f)
                verticalLineToRelative(10.78f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-10.78f)
                curveToRelative(0.609f, -0.549f, 1.0f, -1.337f, 1.0f, -2.22f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.551f, -0.449f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 7.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(21.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(6.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(10.787f, 19.703f)
                curveToRelative(0.363f, 0.296f, 0.808f, 0.444f, 1.252f, 0.444f)
                reflectiveCurveToRelative(0.889f, -0.148f, 1.251f, -0.444f)
                curveToRelative(2.522f, -2.056f, 3.748f, -3.832f, 3.748f, -5.43f)
                curveToRelative(0.0f, -1.784f, -1.346f, -3.235f, -3.0f, -3.235f)
                curveToRelative(-0.768f, 0.0f, -1.469f, 0.312f, -2.0f, 0.826f)
                curveToRelative(-0.531f, -0.513f, -1.232f, -0.826f, -2.0f, -0.826f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.451f, -3.0f, 3.235f)
                curveToRelative(0.0f, 1.598f, 1.226f, 3.374f, 3.748f, 5.43f)
                close()
                moveTo(10.039f, 13.038f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.554f, 1.0f, 1.235f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.681f, 0.449f, -1.235f, 1.0f, -1.235f)
                reflectiveCurveToRelative(1.0f, 0.554f, 1.0f, 1.235f)
                curveToRelative(0.0f, 0.428f, -0.293f, 1.664f, -2.988f, 3.88f)
                curveToRelative(-2.718f, -2.216f, -3.012f, -3.452f, -3.012f, -3.88f)
                curveToRelative(0.0f, -0.681f, 0.449f, -1.235f, 1.0f, -1.235f)
                close()
            }
        }
        .build()
        return _boxHeart!!
    }

private var _boxHeart: ImageVector? = null
