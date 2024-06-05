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

public val Icons.Outline.Coin: ImageVector
    get() {
        if (_coin != null) {
            return _coin!!
        }
        _coin = Builder(name = "Coin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(5.271f, 2.0f, 0.0f, 4.855f, 0.0f, 8.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 3.645f, 5.271f, 6.5f, 12.0f, 6.5f)
                reflectiveCurveToRelative(12.0f, -2.855f, 12.0f, -6.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -3.645f, -5.271f, -6.5f, -12.0f, -6.5f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(5.893f, 0.0f, 10.0f, 2.372f, 10.0f, 4.5f)
                reflectiveCurveToRelative(-4.107f, 4.5f, -10.0f, 4.5f)
                reflectiveCurveTo(2.0f, 10.628f, 2.0f, 8.5f)
                reflectiveCurveTo(6.107f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(7.0f, 14.423f)
                verticalLineToRelative(4.941f)
                curveToRelative(-0.739f, -0.203f, -1.406f, -0.449f, -2.0f, -0.723f)
                verticalLineToRelative(-4.836f)
                curveToRelative(0.624f, 0.239f, 1.292f, 0.446f, 2.0f, 0.618f)
                close()
                moveTo(9.0f, 14.795f)
                curveToRelative(0.647f, 0.087f, 1.313f, 0.149f, 2.0f, 0.179f)
                verticalLineToRelative(5.001f)
                curveToRelative(-0.697f, -0.033f, -1.365f, -0.099f, -2.0f, -0.194f)
                verticalLineToRelative(-4.986f)
                close()
                moveTo(13.0f, 14.974f)
                curveToRelative(0.687f, -0.029f, 1.353f, -0.091f, 2.0f, -0.179f)
                verticalLineToRelative(4.986f)
                curveToRelative(-0.635f, 0.095f, -1.303f, 0.161f, -2.0f, 0.194f)
                verticalLineToRelative(-5.001f)
                close()
                moveTo(17.0f, 14.424f)
                curveToRelative(0.708f, -0.172f, 1.376f, -0.379f, 2.0f, -0.618f)
                verticalLineToRelative(4.836f)
                curveToRelative(-0.594f, 0.274f, -1.261f, 0.52f, -2.0f, 0.723f)
                verticalLineToRelative(-4.941f)
                close()
                moveTo(2.0f, 15.501f)
                verticalLineToRelative(-3.362f)
                curveToRelative(0.301f, 0.246f, 0.641f, 0.475f, 1.0f, 0.694f)
                verticalLineToRelative(4.526f)
                curveToRelative(-0.641f, -0.597f, -1.0f, -1.238f, -1.0f, -1.859f)
                close()
                moveTo(21.0f, 17.36f)
                verticalLineToRelative(-4.526f)
                curveToRelative(0.359f, -0.22f, 0.699f, -0.449f, 1.0f, -0.694f)
                verticalLineToRelative(3.362f)
                curveToRelative(0.0f, 0.621f, -0.359f, 1.261f, -1.0f, 1.859f)
                close()
            }
        }
        .build()
        return _coin!!
    }

private var _coin: ImageVector? = null
