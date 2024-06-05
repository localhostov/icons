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

public val Icons.Outline.BootHeeled: ImageVector
    get() {
        if (_bootHeeled != null) {
            return _bootHeeled!!
        }
        _bootHeeled = Builder(name = "BootHeeled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.684f, 15.224f)
                lineToRelative(-6.13f, -3.065f)
                curveToRelative(-0.341f, -0.17f, -0.553f, -0.513f, -0.553f, -0.895f)
                lineTo(14.001f, 3.0f)
                curveToRelative(0.0f, -0.939f, -0.385f, -1.766f, -1.085f, -2.327f)
                curveToRelative(-0.72f, -0.578f, -1.686f, -0.803f, -2.558f, -0.608f)
                lineTo(0.0f, 2.075f)
                verticalLineToRelative(21.925f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-3.32f)
                lineToRelative(2.78f, 2.224f)
                curveToRelative(0.883f, 0.707f, 1.992f, 1.096f, 3.124f, 1.096f)
                horizontalLineToRelative(9.097f)
                verticalLineToRelative(-3.41f)
                curveToRelative(0.0f, -2.288f, -1.271f, -4.344f, -3.316f, -5.367f)
                close()
                moveTo(2.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 22.0f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineToRelative(-7.097f)
                curveToRelative(-0.679f, 0.0f, -1.344f, -0.233f, -1.874f, -0.657f)
                lineToRelative(-2.809f, -2.247f)
                curveToRelative(-0.883f, -0.707f, -1.992f, -1.096f, -3.124f, -1.096f)
                lineTo(2.0f, 18.0f)
                lineTo(2.0f, 3.724f)
                lineToRelative(4.0f, -0.777f)
                verticalLineToRelative(9.053f)
                horizontalLineToRelative(2.0f)
                lineTo(8.0f, 2.559f)
                lineToRelative(2.764f, -0.537f)
                curveToRelative(0.305f, -0.069f, 0.656f, 0.016f, 0.9f, 0.211f)
                curveToRelative(0.223f, 0.179f, 0.336f, 0.437f, 0.336f, 0.767f)
                verticalLineToRelative(8.264f)
                curveToRelative(0.0f, 1.144f, 0.636f, 2.172f, 1.659f, 2.684f)
                lineToRelative(6.13f, 3.065f)
                curveToRelative(1.364f, 0.682f, 2.211f, 2.052f, 2.211f, 3.578f)
                verticalLineToRelative(1.41f)
                close()
            }
        }
        .build()
        return _bootHeeled!!
    }

private var _bootHeeled: ImageVector? = null
