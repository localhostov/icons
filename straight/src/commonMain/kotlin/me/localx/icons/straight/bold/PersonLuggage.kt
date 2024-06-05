package me.localx.icons.straight.bold

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

public val Icons.Bold.PersonLuggage: ImageVector
    get() {
        if (_personLuggage != null) {
            return _personLuggage!!
        }
        _personLuggage = Builder(name = "PersonLuggage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(20.612f, 16.678f)
                lineToRelative(-2.541f, -1.649f)
                lineToRelative(0.305f, -2.443f)
                lineToRelative(3.005f, 1.717f)
                lineToRelative(1.488f, -2.605f)
                lineToRelative(-4.14f, -2.366f)
                curveToRelative(-0.019f, -0.798f, -0.301f, -1.572f, -0.836f, -2.178f)
                curveToRelative(-0.647f, -0.733f, -1.579f, -1.153f, -2.556f, -1.153f)
                curveToRelative(-0.949f, 0.0f, -1.862f, 0.399f, -2.505f, 1.097f)
                lineToRelative(-3.745f, 4.788f)
                lineToRelative(2.365f, 1.846f)
                lineToRelative(2.011f, -2.576f)
                lineToRelative(-0.583f, 4.082f)
                lineToRelative(5.489f, 3.562f)
                lineToRelative(2.917f, 5.1f)
                lineToRelative(2.604f, -1.49f)
                lineToRelative(-3.278f, -5.73f)
                close()
                moveTo(11.452f, 24.0f)
                horizontalLineToRelative(3.051f)
                lineToRelative(0.804f, -4.916f)
                lineToRelative(-2.708f, -1.807f)
                lineToRelative(-1.148f, 6.723f)
                close()
                moveTo(5.0f, 20.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(4.125f, 12.793f)
                lineTo(0.406f, 17.552f)
                curveToRelative(-0.661f, 0.874f, -0.497f, 2.117f, 0.37f, 2.788f)
                lineToRelative(0.461f, 0.357f)
                curveToRelative(0.544f, -1.565f, 2.017f, -2.697f, 3.764f, -2.697f)
                curveToRelative(0.986f, 0.0f, 1.877f, 0.372f, 2.575f, 0.965f)
                lineToRelative(2.963f, -3.76f)
                lineToRelative(-3.594f, -2.786f)
                curveToRelative(-0.88f, -0.682f, -2.148f, -0.514f, -2.82f, 0.374f)
                close()
            }
        }
        .build()
        return _personLuggage!!
    }

private var _personLuggage: ImageVector? = null
