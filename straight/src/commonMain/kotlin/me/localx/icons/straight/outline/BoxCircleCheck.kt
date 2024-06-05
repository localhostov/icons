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

public val Icons.Outline.BoxCircleCheck: ImageVector
    get() {
        if (_boxCircleCheck != null) {
            return _boxCircleCheck!!
        }
        _boxCircleCheck = Builder(name = "BoxCircleCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(10.344f)
                curveToRelative(-0.705f, -0.57f, -1.322f, -1.245f, -1.828f, -2.0f)
                lineTo(3.0f, 22.0f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(0.936f)
                curveToRelative(0.728f, 0.362f, 1.4f, 0.819f, 2.0f, 1.356f)
                verticalLineToRelative(-2.292f)
                horizontalLineToRelative(1.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 6.0f)
                lineTo(2.0f, 6.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(19.589f, 14.693f)
                lineToRelative(1.402f, 1.426f)
                lineToRelative(-3.457f, 3.399f)
                curveToRelative(-0.321f, 0.321f, -0.745f, 0.482f, -1.17f, 0.482f)
                reflectiveCurveToRelative(-0.854f, -0.162f, -1.18f, -0.487f)
                lineToRelative(-1.846f, -1.789f)
                lineToRelative(1.392f, -1.437f)
                lineToRelative(1.63f, 1.58f)
                lineToRelative(3.229f, -3.174f)
                close()
                moveTo(17.0f, 10.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.14f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(17.0f, 22.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _boxCircleCheck!!
    }

private var _boxCircleCheck: ImageVector? = null
