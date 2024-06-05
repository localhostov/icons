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

public val Icons.Bold.ErrorCamera: ImageVector
    get() {
        if (_errorCamera != null) {
            return _errorCamera!!
        }
        _errorCamera = Builder(name = "ErrorCamera", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.539f, 11.0f)
                horizontalLineToRelative(8.461f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(23.0f, 3.0f)
                horizontalLineToRelative(-1.073f)
                lineToRelative(1.5f, -3.0f)
                lineTo(5.5f, 0.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                lineTo(2.0f, 7.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(3.836f)
                lineToRelative(-1.753f, 4.675f)
                curveToRelative(-0.073f, 0.194f, -0.261f, 0.325f, -0.469f, 0.325f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-3.0f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(9.0f)
                lineTo(3.0f, 22.0f)
                verticalLineToRelative(-3.0f)
                lineTo(7.114f, 19.0f)
                curveToRelative(1.45f, 0.0f, 2.768f, -0.912f, 3.277f, -2.271f)
                lineToRelative(2.148f, -5.729f)
                close()
                moveTo(5.0f, 7.5f)
                lineTo(5.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(13.073f)
                lineToRelative(-0.573f, 1.146f)
                verticalLineToRelative(3.854f)
                lineTo(5.5f, 8.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                close()
                moveTo(17.0f, 12.0f)
                lineToRelative(-7.0f, 12.0f)
                horizontalLineToRelative(14.0f)
                lineToRelative(-7.0f, -12.0f)
                close()
                moveTo(18.0f, 23.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 20.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _errorCamera!!
    }

private var _errorCamera: ImageVector? = null
