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

public val Icons.Outline.ArrowComparison: ImageVector
    get() {
        if (_arrowComparison != null) {
            return _arrowComparison!!
        }
        _arrowComparison = Builder(name = "ArrowComparison", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 10.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-6.327f, 6.327f)
                curveToRelative(-1.312f, 1.312f, -3.447f, 1.312f, -4.76f, 0.0f)
                lineToRelative(-1.654f, -1.654f)
                curveToRelative(-0.532f, -0.532f, -1.399f, -0.532f, -1.932f, 0.0f)
                lineToRelative(-5.62f, 5.62f)
                horizontalLineToRelative(2.586f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(2.0f, 24.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.586f)
                lineToRelative(5.62f, -5.62f)
                curveToRelative(1.271f, -1.271f, 3.488f, -1.271f, 4.76f, 0.0f)
                lineToRelative(1.654f, 1.654f)
                curveToRelative(0.516f, 0.516f, 1.416f, 0.516f, 1.932f, 0.0f)
                lineToRelative(6.327f, -6.327f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                close()
                moveTo(22.0f, 0.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.586f)
                lineToRelative(-5.62f, 5.62f)
                curveToRelative(-0.533f, 0.532f, -1.398f, 0.532f, -1.932f, 0.0f)
                lineToRelative(-1.654f, -1.654f)
                curveToRelative(-1.312f, -1.312f, -3.447f, -1.312f, -4.76f, 0.0f)
                lineTo(0.293f, 12.293f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(6.327f, -6.327f)
                curveToRelative(0.516f, -0.516f, 1.416f, -0.516f, 1.932f, 0.0f)
                lineToRelative(1.654f, 1.654f)
                curveToRelative(1.271f, 1.271f, 3.488f, 1.271f, 4.76f, 0.0f)
                lineToRelative(5.62f, -5.62f)
                verticalLineToRelative(2.586f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(24.0f, 2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _arrowComparison!!
    }

private var _arrowComparison: ImageVector? = null
