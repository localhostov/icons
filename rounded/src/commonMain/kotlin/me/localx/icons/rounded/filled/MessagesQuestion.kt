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

public val Icons.Filled.MessagesQuestion: ImageVector
    get() {
        if (_messagesQuestion != null) {
            return _messagesQuestion!!
        }
        _messagesQuestion = Builder(name = "MessagesQuestion", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 11.996f)
                verticalLineToRelative(-7.0f)
                curveTo(18.0f, 2.239f, 15.757f, -0.004f, 13.0f, -0.004f)
                lineTo(5.0f, -0.004f)
                curveTo(2.243f, -0.004f, 0.0f, 2.239f, 0.0f, 4.996f)
                verticalLineToRelative(12.854f)
                curveToRelative(0.0f, 0.793f, 0.435f, 1.519f, 1.134f, 1.894f)
                curveToRelative(0.318f, 0.171f, 0.667f, 0.255f, 1.015f, 0.255f)
                curveToRelative(0.416f, 0.0f, 0.831f, -0.121f, 1.191f, -0.36f)
                lineToRelative(3.963f, -2.643f)
                horizontalLineToRelative(5.697f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                close()
                moveTo(9.0f, 14.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(10.447f, 9.629f)
                curveToRelative(-0.447f, 0.246f, -0.447f, 0.318f, -0.447f, 0.371f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.308f, 1.038f, -1.879f, 1.481f, -2.123f)
                curveToRelative(0.29f, -0.159f, 0.595f, -0.535f, 0.502f, -1.066f)
                curveToRelative(-0.069f, -0.392f, -0.402f, -0.725f, -0.793f, -0.793f)
                curveToRelative(-0.306f, -0.056f, -0.602f, 0.022f, -0.832f, 0.216f)
                curveToRelative(-0.228f, 0.19f, -0.358f, 0.47f, -0.358f, 0.767f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.889f, 0.391f, -1.727f, 1.072f, -2.299f)
                curveToRelative(0.681f, -0.572f, 1.577f, -0.814f, 2.463f, -0.653f)
                curveToRelative(1.209f, 0.211f, 2.204f, 1.205f, 2.417f, 2.417f)
                curveToRelative(0.223f, 1.272f, -0.382f, 2.543f, -1.506f, 3.164f)
                close()
                moveTo(24.0f, 8.996f)
                verticalLineToRelative(12.854f)
                curveToRelative(0.0f, 0.793f, -0.435f, 1.519f, -1.134f, 1.894f)
                curveToRelative(-0.318f, 0.171f, -0.667f, 0.255f, -1.015f, 0.256f)
                curveToRelative(-0.416f, 0.0f, -0.831f, -0.121f, -1.19f, -0.36f)
                lineToRelative(-3.964f, -2.644f)
                horizontalLineToRelative(-5.697f)
                curveToRelative(-1.45f, 0.0f, -2.747f, -0.631f, -3.661f, -1.62f)
                lineToRelative(0.569f, -0.38f)
                horizontalLineToRelative(5.092f)
                curveToRelative(3.859f, 0.0f, 7.0f, -3.141f, 7.0f, -7.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.308f, -0.027f, -0.608f, -0.065f, -0.906f)
                curveToRelative(2.311f, 0.44f, 4.065f, 2.469f, 4.065f, 4.906f)
                close()
            }
        }
        .build()
        return _messagesQuestion!!
    }

private var _messagesQuestion: ImageVector? = null
