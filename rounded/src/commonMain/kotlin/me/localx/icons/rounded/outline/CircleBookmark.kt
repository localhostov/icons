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

public val Icons.Outline.CircleBookmark: ImageVector
    get() {
        if (_circleBookmark != null) {
            return _circleBookmark!!
        }
        _circleBookmark = Builder(name = "CircleBookmark", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(14.0f, 6.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(7.271f)
                curveToRelative(0.0f, 0.701f, 0.418f, 1.327f, 1.066f, 1.595f)
                curveToRelative(0.647f, 0.271f, 1.386f, 0.121f, 1.882f, -0.374f)
                lineToRelative(2.052f, -2.052f)
                lineToRelative(2.052f, 2.052f)
                curveToRelative(0.331f, 0.331f, 0.771f, 0.507f, 1.22f, 0.507f)
                curveToRelative(0.223f, 0.0f, 0.447f, -0.043f, 0.662f, -0.133f)
                curveToRelative(0.648f, -0.268f, 1.066f, -0.894f, 1.066f, -1.595f)
                verticalLineToRelative(-7.271f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(15.0f, 15.612f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(-3.0f, 3.0f)
                verticalLineToRelative(-6.612f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(6.612f)
                close()
            }
        }
        .build()
        return _circleBookmark!!
    }

private var _circleBookmark: ImageVector? = null
