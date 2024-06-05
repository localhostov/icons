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

public val Icons.Filled.CardinalCompass: ImageVector
    get() {
        if (_cardinalCompass != null) {
            return _cardinalCompass!!
        }
        _cardinalCompass = Builder(name = "CardinalCompass", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveToRelative(-0.511f, 0.0f, -0.971f, -0.311f, -1.16f, -0.786f)
                lineToRelative(-2.021f, -8.032f)
                lineTo(0.786f, 13.16f)
                curveToRelative(-0.474f, -0.19f, -0.786f, -0.649f, -0.786f, -1.16f)
                reflectiveCurveToRelative(0.311f, -0.971f, 0.786f, -1.16f)
                lineToRelative(8.032f, -2.021f)
                lineTo(10.84f, 0.786f)
                curveToRelative(0.19f, -0.474f, 0.649f, -0.786f, 1.16f, -0.786f)
                reflectiveCurveToRelative(0.971f, 0.311f, 1.16f, 0.786f)
                lineToRelative(2.021f, 8.032f)
                lineToRelative(8.032f, 2.021f)
                curveToRelative(0.475f, 0.19f, 0.786f, 0.649f, 0.786f, 1.16f)
                reflectiveCurveToRelative(-0.311f, 0.971f, -0.786f, 1.16f)
                lineToRelative(-8.032f, 2.021f)
                lineToRelative(-2.021f, 8.032f)
                curveToRelative(-0.19f, 0.475f, -0.649f, 0.786f, -1.16f, 0.786f)
                close()
                moveTo(5.231f, 7.658f)
                lineToRelative(1.939f, -0.488f)
                lineToRelative(0.491f, -1.933f)
                lineToRelative(-1.843f, -1.132f)
                curveToRelative(-0.489f, -0.21f, -1.06f, -0.101f, -1.437f, 0.277f)
                curveToRelative(-0.377f, 0.377f, -0.487f, 0.946f, -0.277f, 1.437f)
                lineToRelative(1.126f, 1.839f)
                close()
                moveTo(16.829f, 7.17f)
                lineToRelative(1.898f, 0.482f)
                lineToRelative(1.168f, -1.834f)
                curveToRelative(0.21f, -0.491f, 0.1f, -1.06f, -0.277f, -1.437f)
                reflectiveCurveToRelative(-0.947f, -0.486f, -1.437f, -0.277f)
                lineToRelative(-1.844f, 1.108f)
                lineToRelative(0.492f, 1.957f)
                close()
                moveTo(7.17f, 16.829f)
                lineToRelative(-1.949f, -0.495f)
                lineToRelative(-1.117f, 1.847f)
                curveToRelative(-0.21f, 0.49f, -0.1f, 1.06f, 0.277f, 1.437f)
                curveToRelative(0.377f, 0.378f, 0.947f, 0.486f, 1.437f, 0.277f)
                lineToRelative(1.833f, -1.15f)
                lineToRelative(-0.482f, -1.916f)
                close()
                moveTo(18.748f, 16.346f)
                lineToRelative(-1.919f, 0.483f)
                lineToRelative(-0.488f, 1.921f)
                lineToRelative(1.84f, 1.145f)
                curveToRelative(0.166f, 0.07f, 0.341f, 0.105f, 0.514f, 0.105f)
                curveToRelative(0.339f, 0.0f, 0.673f, -0.133f, 0.923f, -0.382f)
                curveToRelative(0.377f, -0.377f, 0.487f, -0.947f, 0.277f, -1.437f)
                lineToRelative(-1.146f, -1.835f)
                close()
            }
        }
        .build()
        return _cardinalCompass!!
    }

private var _cardinalCompass: ImageVector? = null
