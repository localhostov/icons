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

public val Icons.Outline.MessagesQuestion: ImageVector
    get() {
        if (_messagesQuestion != null) {
            return _messagesQuestion!!
        }
        _messagesQuestion = Builder(name = "MessagesQuestion", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(14.854f)
                curveToRelative(0.0f, 0.794f, 0.435f, 1.52f, 1.134f, 1.894f)
                curveToRelative(0.318f, 0.171f, 0.667f, 0.255f, 1.015f, 0.255f)
                curveToRelative(0.416f, 0.0f, 0.831f, -0.121f, 1.19f, -0.36f)
                lineToRelative(2.661f, -1.774f)
                verticalLineToRelative(3.131f)
                horizontalLineToRelative(10.697f)
                lineToRelative(3.964f, 2.644f)
                curveToRelative(0.359f, 0.239f, 0.774f, 0.36f, 1.19f, 0.36f)
                curveToRelative(0.348f, 0.0f, 0.696f, -0.085f, 1.015f, -0.256f)
                curveToRelative(0.699f, -0.375f, 1.134f, -1.101f, 1.134f, -1.894f)
                lineTo(24.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(2.23f, 17.979f)
                curveToRelative(-0.019f, 0.012f, -0.074f, 0.048f, -0.152f, 0.007f)
                curveToRelative(-0.079f, -0.042f, -0.079f, -0.109f, -0.079f, -0.131f)
                lineTo(1.999f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                lineTo(6.697f, 15.0f)
                lineToRelative(-4.467f, 2.979f)
                close()
                moveTo(22.0f, 21.855f)
                curveToRelative(0.0f, 0.021f, 0.0f, 0.089f, -0.078f, 0.131f)
                curveToRelative(-0.08f, 0.043f, -0.134f, 0.006f, -0.152f, -0.007f)
                lineToRelative(-4.467f, -2.979f)
                horizontalLineToRelative(-9.303f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(14.854f)
                close()
                moveTo(8.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.889f, 0.391f, -1.727f, 1.072f, -2.299f)
                curveToRelative(0.681f, -0.572f, 1.577f, -0.814f, 2.463f, -0.653f)
                curveToRelative(1.209f, 0.211f, 2.204f, 1.205f, 2.417f, 2.417f)
                curveToRelative(0.223f, 1.272f, -0.382f, 2.543f, -1.506f, 3.164f)
                curveToRelative(-0.447f, 0.246f, -0.447f, 0.318f, -0.447f, 0.371f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.308f, 1.038f, -1.879f, 1.481f, -2.123f)
                curveToRelative(0.29f, -0.159f, 0.595f, -0.535f, 0.502f, -1.066f)
                curveToRelative(-0.069f, -0.392f, -0.402f, -0.725f, -0.793f, -0.793f)
                curveToRelative(-0.306f, -0.056f, -0.602f, 0.022f, -0.832f, 0.216f)
                curveToRelative(-0.228f, 0.19f, -0.358f, 0.47f, -0.358f, 0.767f)
                close()
                moveTo(8.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _messagesQuestion!!
    }

private var _messagesQuestion: ImageVector? = null
