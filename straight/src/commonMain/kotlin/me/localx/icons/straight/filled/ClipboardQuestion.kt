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

public val Icons.Filled.ClipboardQuestion: ImageVector
    get() {
        if (_clipboardQuestion != null) {
            return _clipboardQuestion!!
        }
        _clipboardQuestion = Builder(name = "ClipboardQuestion", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.829f, 2.0f)
                curveToRelative(-0.413f, -1.164f, -1.525f, -2.0f, -2.829f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.304f, 0.0f, -2.416f, 0.836f, -2.829f, 2.0f)
                lineTo(3.0f, 2.0f)
                lineTo(3.0f, 21.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                lineTo(21.0f, 2.0f)
                horizontalLineToRelative(-5.171f)
                close()
                moveTo(13.0f, 19.013f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.013f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.013f)
                close()
                moveTo(13.47f, 13.19f)
                curveToRelative(-0.281f, 0.13f, -0.47f, 0.472f, -0.47f, 0.852f)
                verticalLineToRelative(0.958f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.958f)
                curveToRelative(0.0f, -1.162f, 0.64f, -2.208f, 1.629f, -2.666f)
                curveToRelative(0.548f, -0.254f, 1.038f, -0.919f, 0.816f, -1.778f)
                curveToRelative(-0.126f, -0.49f, -0.54f, -0.904f, -1.03f, -1.03f)
                curveToRelative(-0.483f, -0.127f, -0.956f, -0.034f, -1.333f, 0.258f)
                curveToRelative(-0.371f, 0.287f, -0.583f, 0.72f, -0.583f, 1.188f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.091f, 0.495f, -2.1f, 1.358f, -2.769f)
                curveToRelative(0.863f, -0.67f, 1.978f, -0.894f, 3.059f, -0.614f)
                curveToRelative(1.19f, 0.308f, 2.158f, 1.276f, 2.465f, 2.467f)
                curveToRelative(0.429f, 1.66f, -0.376f, 3.381f, -1.913f, 4.092f)
                close()
            }
        }
        .build()
        return _clipboardQuestion!!
    }

private var _clipboardQuestion: ImageVector? = null
