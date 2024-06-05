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

public val Icons.Outline.Superscript: ImageVector
    get() {
        if (_superscript != null) {
            return _superscript!!
        }
        _superscript = Builder(name = "Superscript", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 0.0f)
                verticalLineToRelative(11.0f)
                reflectiveCurveToRelative(-2.0f, 0.0f, -2.0f, 0.0f)
                lineTo(22.0f, 3.393f)
                lineToRelative(-1.043f, 1.064f)
                lineToRelative(-1.441f, -1.387f)
                lineToRelative(2.972f, -3.07f)
                horizontalLineToRelative(1.513f)
                close()
                moveTo(13.372f, 6.0f)
                lineToRelative(-5.334f, 7.309f)
                lineTo(2.66f, 6.0f)
                lineTo(0.18f, 6.0f)
                lineToRelative(6.618f, 9.0f)
                lineTo(0.198f, 24.0f)
                horizontalLineToRelative(2.48f)
                lineToRelative(5.359f, -7.309f)
                lineToRelative(5.334f, 7.309f)
                horizontalLineToRelative(2.48f)
                lineToRelative(-6.574f, -9.0f)
                lineToRelative(6.574f, -9.0f)
                horizontalLineToRelative(-2.48f)
                close()
            }
        }
        .build()
        return _superscript!!
    }

private var _superscript: ImageVector? = null
