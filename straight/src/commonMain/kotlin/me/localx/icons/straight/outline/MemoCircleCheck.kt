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

public val Icons.Outline.MemoCircleCheck: ImageVector
    get() {
        if (_memoCircleCheck != null) {
            return _memoCircleCheck!!
        }
        _memoCircleCheck = Builder(name = "MemoCircleCheck", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.349f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(5.059f)
                curveToRelative(-0.329f, -0.036f, -0.662f, -0.059f, -1.0f, -0.059f)
                reflectiveCurveToRelative(-0.671f, 0.022f, -1.0f, 0.059f)
                lineTo(16.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(7.518f)
                curveToRelative(0.506f, 0.756f, 1.125f, 1.429f, 1.831f, 2.0f)
                close()
                moveTo(11.349f, 10.0f)
                horizontalLineToRelative(-7.349f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.518f)
                curveToRelative(0.506f, -0.756f, 1.125f, -1.429f, 1.831f, -2.0f)
                close()
                moveTo(4.0f, 17.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.0f, -0.688f, 0.084f, -1.356f, 0.231f, -2.0f)
                horizontalLineToRelative(-4.231f)
                verticalLineToRelative(2.0f)
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
                moveTo(14.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(19.589f, 14.692f)
                lineToRelative(-3.228f, 3.175f)
                lineToRelative(-1.63f, -1.58f)
                lineToRelative(-1.393f, 1.436f)
                lineToRelative(1.845f, 1.788f)
                curveToRelative(0.314f, 0.315f, 0.733f, 0.489f, 1.179f, 0.489f)
                reflectiveCurveToRelative(0.865f, -0.174f, 1.173f, -0.482f)
                lineToRelative(3.456f, -3.399f)
                lineToRelative(-1.402f, -1.426f)
                close()
            }
        }
        .build()
        return _memoCircleCheck!!
    }

private var _memoCircleCheck: ImageVector? = null
