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

public val Icons.Outline.SummaryCheck: ImageVector
    get() {
        if (_summaryCheck != null) {
            return _summaryCheck!!
        }
        _summaryCheck = Builder(name = "SummaryCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 9.0f)
                lineTo(5.0f, 9.0f)
                verticalLineToRelative(-2.0f)
                lineTo(15.0f, 7.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 17.0f)
                curveToRelative(0.0f, 3.86f, -3.141f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.14f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.141f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f)
                close()
                moveTo(22.0f, 17.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                close()
                moveTo(19.589f, 14.693f)
                lineToRelative(-3.228f, 3.174f)
                lineToRelative(-1.63f, -1.58f)
                lineToRelative(-1.393f, 1.437f)
                lineToRelative(1.845f, 1.788f)
                curveToRelative(0.314f, 0.315f, 0.733f, 0.489f, 1.179f, 0.489f)
                reflectiveCurveToRelative(0.865f, -0.174f, 1.173f, -0.482f)
                lineToRelative(3.456f, -3.399f)
                lineToRelative(-1.402f, -1.426f)
                close()
                moveTo(5.0f, 13.0f)
                horizontalLineToRelative(3.947f)
                curveToRelative(0.363f, -0.729f, 0.82f, -1.4f, 1.359f, -2.0f)
                lineTo(5.0f, 11.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(9.536f, 22.0f)
                lineTo(3.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                lineTo(18.0f, 4.0f)
                verticalLineToRelative(4.064f)
                curveToRelative(0.693f, 0.08f, 1.363f, 0.233f, 2.0f, 0.459f)
                lineTo(20.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(17.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(9.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(7.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(5.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                lineTo(3.0f, 2.0f)
                lineTo(0.0f, 2.0f)
                lineTo(0.0f, 21.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                lineTo(11.349f, 24.0f)
                curveToRelative(-0.703f, -0.569f, -1.31f, -1.247f, -1.813f, -2.0f)
                close()
            }
        }
        .build()
        return _summaryCheck!!
    }

private var _summaryCheck: ImageVector? = null
