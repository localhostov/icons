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

public val Icons.Filled.InsertArrows: ImageVector
    get() {
        if (_insertArrows != null) {
            return _insertArrows!!
        }
        _insertArrows = Builder(name = "InsertArrows", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.256f, 1.668f)
                curveTo(-0.113f, 1.257f, -0.079f, 0.625f, 0.332f, 0.256f)
                curveTo(0.742f, -0.113f, 1.374f, -0.081f, 1.744f, 0.332f)
                lineToRelative(4.474f, 4.985f)
                curveToRelative(1.149f, 1.286f, 1.782f, 2.942f, 1.782f, 4.666f)
                verticalLineToRelative(6.047f)
                lineToRelative(1.307f, -1.25f)
                curveToRelative(0.399f, -0.383f, 1.032f, -0.371f, 1.414f, 0.028f)
                curveToRelative(0.383f, 0.398f, 0.37f, 1.031f, -0.027f, 1.414f)
                lineToRelative(-2.301f, 2.212f)
                curveToRelative(-0.38f, 0.378f, -0.883f, 0.569f, -1.388f, 0.569f)
                curveToRelative(-0.51f, 0.0f, -1.021f, -0.193f, -1.41f, -0.582f)
                lineToRelative(-2.288f, -2.199f)
                curveToRelative(-0.397f, -0.383f, -0.41f, -1.016f, -0.027f, -1.414f)
                curveToRelative(0.383f, -0.399f, 1.015f, -0.411f, 1.414f, -0.028f)
                lineToRelative(1.307f, 1.256f)
                verticalLineToRelative(-6.053f)
                curveToRelative(0.0f, -1.231f, -0.451f, -2.414f, -1.271f, -3.331f)
                lineTo(0.256f, 1.668f)
                close()
                moveTo(23.0f, 12.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(15.595f, 18.42f)
                curveToRelative(0.389f, 0.388f, 0.9f, 0.582f, 1.41f, 0.582f)
                curveToRelative(0.505f, 0.0f, 1.008f, -0.19f, 1.388f, -0.569f)
                lineToRelative(2.301f, -2.212f)
                curveToRelative(0.397f, -0.383f, 0.41f, -1.016f, 0.027f, -1.414f)
                curveToRelative(-0.383f, -0.399f, -1.015f, -0.411f, -1.414f, -0.028f)
                lineToRelative(-1.307f, 1.25f)
                verticalLineToRelative(-6.047f)
                curveToRelative(0.0f, -1.231f, 0.451f, -2.414f, 1.271f, -3.33f)
                lineToRelative(4.474f, -4.985f)
                curveToRelative(0.369f, -0.411f, 0.335f, -1.043f, -0.076f, -1.412f)
                curveToRelative(-0.41f, -0.368f, -1.042f, -0.336f, -1.412f, 0.076f)
                lineToRelative(-4.475f, 4.986f)
                curveToRelative(-1.148f, 1.284f, -1.781f, 2.94f, -1.781f, 4.664f)
                verticalLineToRelative(6.053f)
                lineToRelative(-1.307f, -1.256f)
                curveToRelative(-0.399f, -0.383f, -1.031f, -0.371f, -1.414f, 0.028f)
                curveToRelative(-0.383f, 0.398f, -0.37f, 1.031f, 0.027f, 1.414f)
                lineToRelative(2.288f, 2.199f)
                close()
            }
        }
        .build()
        return _insertArrows!!
    }

private var _insertArrows: ImageVector? = null
