package me.localx.icons.straight.filled

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
                moveToRelative(18.0f, 17.0f)
                lineTo(18.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(14.854f)
                curveToRelative(0.0f, 0.793f, 0.435f, 1.519f, 1.134f, 1.894f)
                curveToRelative(0.318f, 0.171f, 0.667f, 0.255f, 1.015f, 0.255f)
                curveToRelative(0.416f, 0.0f, 0.831f, -0.121f, 1.191f, -0.36f)
                lineToRelative(3.963f, -2.643f)
                horizontalLineToRelative(10.697f)
                close()
                moveTo(10.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(7.072f, 3.701f)
                curveToRelative(0.681f, -0.572f, 1.577f, -0.814f, 2.463f, -0.653f)
                curveToRelative(1.209f, 0.211f, 2.204f, 1.205f, 2.417f, 2.417f)
                curveToRelative(0.223f, 1.272f, -0.382f, 2.543f, -1.506f, 3.164f)
                curveToRelative(-0.447f, 0.246f, -0.447f, 0.486f, -0.447f, 0.871f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.308f, 1.038f, -1.879f, 1.481f, -2.123f)
                curveToRelative(0.29f, -0.159f, 0.595f, -0.535f, 0.502f, -1.066f)
                curveToRelative(-0.069f, -0.392f, -0.402f, -0.725f, -0.793f, -0.793f)
                curveToRelative(-0.306f, -0.056f, -0.602f, 0.022f, -0.832f, 0.216f)
                curveToRelative(-0.228f, 0.19f, -0.358f, 0.47f, -0.358f, 0.767f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.889f, 0.391f, -1.727f, 1.072f, -2.299f)
                close()
                moveTo(24.0f, 7.0f)
                verticalLineToRelative(14.854f)
                curveToRelative(0.0f, 0.793f, -0.435f, 1.519f, -1.134f, 1.894f)
                curveToRelative(-0.318f, 0.171f, -0.667f, 0.255f, -1.015f, 0.256f)
                curveToRelative(-0.416f, 0.0f, -0.831f, -0.121f, -1.19f, -0.36f)
                lineToRelative(-3.964f, -2.644f)
                lineTo(6.0f, 21.0f)
                verticalLineToRelative(-0.727f)
                lineToRelative(1.908f, -1.273f)
                horizontalLineToRelative(12.092f)
                lineTo(20.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _messagesQuestion!!
    }

private var _messagesQuestion: ImageVector? = null
